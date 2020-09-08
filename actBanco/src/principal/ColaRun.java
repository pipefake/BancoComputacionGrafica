/**
* Main de la cola …
* @author Jonathan.rojas@uao.edu.co Jonathan Rojas Ibanez 2190039
* @author andrea.perez@uao.edu.co Andrea Perez 2190936
* @author juan_felipe.jimenez@uao.edu.co Juan Felipe Jimenez Salazar 2190038
* @date 03 Septiembre 2020si
* @version 1.0
*/
package principal;

import dato.Usuario;
import core.Cola;
import java.util.TimerTask;
import java.util.Timer;
/**
 *
 * @author Universidad Felipe
 */
public class ColaRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola<Usuario> colaUsuario = new Cola<>();
//        Usuario elem = new Usuario();
//        
//        System.out.println(elem.edadAleatoria());
//        
//        System.out.println(elem.tiempoAleatoria());
//        
//        colaUsuario.encolar(elem);
        
        Timer timer = new Timer ();
        
        TimerTask agregarauto = new TimerTask() {
            @Override
            public void run() {
                
                Usuario aux = new Usuario();
                colaUsuario.encolar(aux);
                System.out.println("Puta, lo logré!");
                System.out.println(colaUsuario.toString());
            }
        };
        timer.schedule(agregarauto, 5000, 5000);
        
    }
    
}
