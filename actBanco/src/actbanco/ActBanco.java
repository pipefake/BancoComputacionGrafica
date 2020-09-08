/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actbanco;

//import dato.Usuario;
import java.lang.reflect.Array;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author Universidad Felipe
 */
public class ActBanco extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

//       
    }
//    Cajero[] cajeros = new Cajero[4];
////       cajeros[0] = new Cajero();
////       cajeros[1] = new Cajero();
////       cajeros[2] = new Cajero();
////       cajeros[3] = new Cajero();
////       cajeros[4] = new Cajero();
//        Cajero aux = new Cajero();
//        Usuario ver = new Usuario();

//////////        boolean prueba = aux.estado(ver.tiempoAleatoria());
//////////
//////////        System.out.println(", lo logré!");
//////////
//////////        boolean ABC = aux.estado(3);
//////////        System.out.println(ABC);
//////////
//////////        Timer timer = new Timer();
//////////
//////////        TimerTask pruebadeimprimir = new TimerTask() {
//////////            @Override
//////////            public void run() {
//////////
//////////                System.out.println(ABC);
//////////            }
//////////        };
//////////        timer.schedule(pruebadeimprimir, 4000, 5000);

//    String cajeros[] = new String[4];
//    
//    cajeros[0] = "CajeroA";
//    cajeros[1] = "CajeroB";
//    cajeros[2] = "CajeroC";
//    cajeros[3] = "CajeroD";
//    cajeros[4] = "CajeroE";
//    }
}
