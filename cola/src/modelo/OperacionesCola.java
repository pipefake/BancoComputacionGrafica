/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import core.Base;
import core.Cola;

/**
 *
 * @author Universidad Felipe
 */
public class OperacionesCola {
    public static <T extends Base> Cola<T> duplicar (Cola<T> ColaOriginal){
        Cola<T> AuxPila = new Cola<>();
        Cola<T> ColaDuplicada = new Cola<>();
        
        
        while(!ColaOriginal.estaVacia()){
            AuxPila.encolar( ColaOriginal.desencolar());
        }
        while(!AuxPila.estaVacia()){
            T e = AuxPila.desencolar();
            T c = (T) e.copy();
            ColaOriginal.encolar(e);
            ColaDuplicada.encolar(c);
                    
        }
        
        return ColaDuplicada;
    }
    
    public static <T extends Base> Cola<T> concatenarCola (Cola<T> c1, Cola<T> c2){
        
        
        Cola<T> ColaConcatenada = new Cola<>();
        
        
        
        return ColaConcatenada;
    }
}
