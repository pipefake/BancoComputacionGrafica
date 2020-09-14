/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlInterface;

import modelo.FactoryCliente;
import modelo.Cliente;
import core.Cola;
import java.awt.BorderLayout;
import java.net.URL;
import java.time.Clock;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
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

    private TimeLine x;

    public void initialize(URL url, ResourceBundle rb) {
        cola = new Cola<>();
        LinkedList<Object> cajeros = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            cajeros.add(new Caja());
        }

        System.out.println(cajeros.toString());

        x = new TimeLine(new KeyFrame(Duration.millis(1000), (ActionEvent event) -> {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void crearClientes() {
        int numeroClientes = (int) (Math.random() * 2);
        System.out.print("Se crearon " + numeroClientes + "clientes");
        for (int i = 0; i < numeroClientes; i++) {
            Cliente u = FactoryCliente.create();
            cola.encolar(u);
        }

    }

    private void revisarCajerosLibres() {
        System.out.println("Atender cliente");
        for (Iterator<Caja> itCaja = cajeros.iterator();
                itCaja.hasNext();) {
            Caja caja = itCaja.next();
            if (caja.isEstado() && cola.estaVacia()) 
            {
                Cliente u cola.desencolar();
                
                caja.setEstado(false);
                caja.setTiempoTransaccion(u.getTiempoTransaccion());
                caja.setEdadCliente(u.getEdad());
                caja.setNumeroClientes(caja.getNumeroClientes());
            } else {
                if (caja.getTiempoTransaccion() > 0) {
                    caja.setTiempoTransaccion(caja.getTiempoTransaccion() - 1);
                    if (caja == cajeros.get(0)) {
                        SumaCaja1++;
                    } else if (caja == cajeros.get(1)) {
                        SumaCaja2++;
                    }
                }
            }

        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
