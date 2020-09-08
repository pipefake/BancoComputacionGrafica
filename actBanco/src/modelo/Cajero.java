/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import core.Base;

/**
 *
 * @author Universidad Felipe
 */
public class Cajero extends Base {

    @Override
    public Base copy() {
        return new Cajero();
    }
    
    public boolean estado ()
    {
          boolean estado = true;
         String A = ",";
         
         if (A == "Libre")
         {
               estado = true;
         }
         else if (A != "Libre")
         {
             estado = false;
         }
        return estado;    
    }
    
    public double promedioTiempo()
    {
        double tiempo = 0;
        double promedio=0.0;
        double total=0;
        
         tiempo = 0+Math.random()*1;
        
        promedio = tiempo*100/total;
        return promedio;
    }
    public double apromedioTiempo()
    {
        double tiempo = 0;
        double promedio=0.0;
        double total=0;
        
         tiempo = 0+Math.random()*1;
        
        promedio = tiempo*100/total;
        return promedio;
    }
}

