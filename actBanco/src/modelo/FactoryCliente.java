/**
 
* FactoryCliente
* @author Jonathan.rojas@uao.edu.co Jonathan Rojas Ibanez 2190039
 
* @author andrea.perez@uao.edu.co Andrea Lucia Perez Marquinez 2190527
 
* @author juan_felipe.jimenez@uao.edu.co Juan Felipe Jimenez Salazar 2190038
 
* @date 03 Septiembre 2020si
 
* @version 1.0
 
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import dato.Usuario;


/**
 *
 * @author asus
 */
public class FactoryCliente {

    public static Usuario create() {
        
        int edad = (int) (Math.random()*(45-18)+18);
        int tiempoTranscurrido = (int) (Math.random()*(60-1)+1);
        
        return new Usuario(edad, tiempoTranscurrido);
    }
    
}