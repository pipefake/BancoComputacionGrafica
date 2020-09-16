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