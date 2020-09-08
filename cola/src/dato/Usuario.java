/**
* El tipo de cola que haremos es de Usuario, tiene atributos edad y tiempo de transaccion …
* @author Jonathan.rojas@uao.edu.co Jonathan Rojas Ibanez 2190039
* @author andrea.perez@uao.edu.co Andrea Perez 2190936
* @author juan_felipe.jimenez@uao.edu.co Juan Felipe Jimenez Salazar 2190038
* @date 03 Septiembre 2020si
* @version 1.0
*/
package dato;

import core.Base;
import java.util.Random;






/**
 *
 * @author Universidad Felipe
 */
public class Usuario extends Base{

    @Override
    public Base copy() {
        return new Usuario();
    }
    
    public int edadAleatoria(){
        
        
        Random auxAzar = new Random ();
        int edad = auxAzar.nextInt(70-18+1)+18;
        return edad;
    }
    public double tiempoAleatoria(){
        
        
        Random auxAzar = new Random ();
        double tiempo = auxAzar.nextInt(15-5+1)+5;
        return tiempo;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario: " + "la edad es: " + edadAleatoria() + " el tiempo es: " + tiempoAleatoria() + "\n";
    }
    

    
     
    
}
