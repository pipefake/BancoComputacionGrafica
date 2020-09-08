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
    public double TiempoRestante()
    {
        
        double restante=0;
      
        return restante;
    }
    
    public double TiempoCajero()
    {
        double tiempo = 0;
       
        return tiempo;
    }
    public static void AcumularUsuarios(String[] args) {
		int contador = 0;
		int acumulador = 0;
		while (contador < 1000) {
			contador = contador + 1;
			acumulador = acumulador + 
		}
		JOptionPane.showMessageDialog(null, "Usuarios atendidos: " + acumulador);
	}
}

