/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlInterface;

//import dato.Usuario;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import modelo.Caja;


/**
 *
 * @author Universidad Felipe
 */
public class ActBanco extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        int tiempodemivariable = 30;
        
        Caja cajero1 = new Caja(tiempodemivariable);
        
        

        
        
        
        

        Timer timer = new Timer();

        TimerTask agregarauto = new TimerTask() {
            int tiempoestado = 0;
            @Override
            public void run() {

                System.out.println("YA?");
                ++tiempoestado;
                System.out.println(cajero1.estado(tiempoestado));
//                System.out.println(cajero1.estado());
            }
        };
        timer.schedule(agregarauto, 1000, 1000);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

//       
    
//    
    }}