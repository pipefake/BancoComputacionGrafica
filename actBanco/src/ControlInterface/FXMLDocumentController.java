/**
 *
 * FXMLDocumentController
 *
 * @author Jonathan.rojas@uao.edu.co Jonathan Rojas Ibanez 2190039
 *
 * @author andrea.perez@uao.edu.co Andrea Lucia Perez Marquinez 2190527
 *
 * @author juan_felipe.jimenez@uao.edu.co Juan Felipe Jimenez Salazar 2190038
 *
 * @date 03 Septiembre 2020si
 *
 * @version 1.0
 *
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlInterface;

import core.Base;
import modelo.FactoryCliente;

import core.Cola;
import dato.Usuario;
import java.awt.BorderLayout;
import java.net.URL;
import java.time.Clock;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.util.Duration;
import modelo.Caja;
import modelo.OperacionesCola;

/**
 *
 * @author Universidad Felipe
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField TextFieldTiempo;
    @FXML
    private TextArea TextAreaReporte;
    @FXML
    private WebView webViewCola;
    @FXML
    private WebEngine webEngineCola;
    @FXML
    private WebEngine webEngineCajeros;
    @FXML
    private WebView webViewCajeros;
    //private Cola<Cliente> cola;
    //private LinkedList<Caja> cajeros;
    //private Timer timer;
    private int TiempoTotal;
    private String htmlCola;
    private String htmlCajeros;
    private int SumaCaja1;
    private int SumaCaja2;
    private int SumaCaja3;
    private int SumaCaja4;
    private int SumaCaja5;
    private int SumaCaja6;

    private Timeline x;

    Cola<Usuario> cola;
    LinkedList<Caja> cajeros;

    public void initialize(URL url, ResourceBundle rb) {
        cola = new Cola<>();
        cajeros = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            cajeros.add(new Caja());
        }

//        este for lo podemos cambiar por add cada uno
        System.out.println(cajeros.toString());

        x = new Timeline(new KeyFrame(Duration.millis(1000), (ActionEvent event) -> {
            TodoEnFuncion();
        }));
        x.setCycleCount(Animation.INDEFINITE);

        webEngineCola = webViewCola.getEngine();
        webEngineCajeros = webViewCajeros.getEngine();

        htmlCajeros = "<,>";
        htmlCola = "<,>";
        SumaCaja1 = 0;
        SumaCaja2 = 0;
        SumaCaja3 = 0;
        SumaCaja4 = 0;
        SumaCaja5 = 0;
        SumaCaja6 = 0;
    }

    @FXML
    private void handleBottonIniciar(ActionEvent event) {
        x.play();
    }

    @FXML
    private void handleBottonTerminar(ActionEvent event) {
        x.stop();

        TextFieldTiempo.setText(TiempoTotal + "segundos");
        TextAreaReporte.setText(escribirReporte());
    }

    private void TodoEnFuncion() {
        crearClientes();
        revisarCajerosLibres();
        TiempoTotal++;
        webEngineCola.loadContent(htmlCola);
        webEngineCajeros.loadContent(htmlCajeros);
    }

    private String escribirReporte() {
        String respuestaclientes = "El número de clientes atendidos en la fila fue de: ";
        String respuestapromedio = "El promedio de atención de cada caja es de: " + "\n";
        String respuesta = "";
        int suma = 0;
        int promedio = 0;
        int sumadepromedio = 0;
        
        suma=SumaCaja1+SumaCaja2+SumaCaja3+SumaCaja4+SumaCaja5+SumaCaja6;
                
        respuesta = respuestaclientes + suma + "\n";
        
        for(int n = 0; n<cajeros.size();n++){
        for(int i = 0; i<cajeros.get(n).getNumeroClientes();i++){
            sumadepromedio += cajeros.get(i).getTiempoTransaccion();
            promedio = sumadepromedio/cajeros.get(i).getNumeroClientes();
            respuestapromedio += promedio+ "\n";
        }
        }
        
        respuesta +=  respuestapromedio;
        
        return respuesta;
    }

    private void crearClientes() {
        int numeroClientes = (int) (Math.random() * 2);
        System.out.print("Se crearon " + numeroClientes + "clientes");
        for (int i = 0; i < numeroClientes; i++) {
            Usuario u = FactoryCliente.create();
            cola.encolar(u);
        }

    }

    private void revisarCajerosLibres() {
        System.out.println("Atender cliente");
        for (Iterator<Caja> itCaja = cajeros.iterator(); itCaja.hasNext();) {
            Caja caja = itCaja.next();
            if (caja.isEstado() && !cola.estaVacia()) {
                Usuario u = cola.desencolar();

                caja.setEstado(false);
                caja.setTiempoTransaccion(u.getTiempoespera());

                caja.setNumeroClientes(caja.getNumeroClientes() + 1);
            } else {
                if (caja.getTiempoTransaccion() > 0) {
                    caja.setTiempoTransaccion(caja.getTiempoTransaccion() - 1);
                    if (caja == cajeros.get(0)) {
                        SumaCaja1++;
                    } else if (caja == cajeros.get(1)) {
                        SumaCaja2++;
                    } else if (caja == cajeros.get(2)) {
                        SumaCaja3++;
                    } else if (caja == cajeros.get(3)) {
                        SumaCaja4++;
                    } else if (caja == cajeros.get(4)) {
                        SumaCaja5++;
                    }
                    System.out.println(SumaCaja1 + " " + SumaCaja2 + " "
                            + SumaCaja3 + " " + SumaCaja4 + " " + SumaCaja5 + " ");
                }

                if (caja.getTiempoTransaccion() == 0) {
                    caja.setEstado(true);
                }
            }
        }
    }

    private String HacerHtmlCola() {
        String html = "<html><table border=1 width=100%>";
        html += OperacionesCola.generarHtml(cola) + "</table></html>";
        return null;
    }

    private String HacerHtmlCajeros() {
        String html = "<table border=1 width=100%><tr>";
        String estado;
        int contador = 0;

        for (int i = 0; 1 < 6; i++) {
            if (contador == 0) {
                html += "<th>Caja</th>";
            }
            if (cajeros.get(i).isEstado()) {
                html += "<th bgcolor=\"green\">" + (i + 1) + "</th>";
            } else {
                html += "<th bgcolor=\"red\">" + (i + 1) + "</th>";
            }
            contador++;
        }
        
        contador = 0;

        for (Caja caja : cajeros) {
            if (contador == 0) {
                html += "<th>Estado</th>";
            }
            if (caja.isEstado()) {
                estado = "bgcolor= \"green\">Disponible";
            } else {
                estado = "bgcolor= \"red\">No disponible";
            }
            html += "<td" + estado + "</td>";
            contador++;
        }
        html += "</tr><tr>";
        contador = 0;

        for (Caja caja : cajeros) {
            if (contador == 0) {
                html += "<th>Tiempo de transacción</th>";
            }
            if (caja.isEstado()) {
                html += "<td bgcolor= \"green\">";
            } else {
                html += "<td bgcolor= \"red\">";
            }
            html += caja.getTiempoTransaccion() + "</td>";
            contador++;
        }
        html += "</tr><tr>";
        contador = 0;

        for (Caja caja : cajeros) {
            if (contador == 0) {
                html += "<th>Número de clientes</th>";
            }
            if (caja.isEstado()) {
                html += "<td bgcolor= \"green\">";
            } else {
                html += "<td bgcolor= \"red\">";
            }
            html += caja.getNumeroClientes() + "</td>";
            contador++;
        }
        html += "</tr>";
        html += "</table>";
        return html;
    }

}
