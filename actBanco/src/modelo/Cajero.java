/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import core.Base;
import dato.Usuario;
import java.util.Timer;

/**
 *
 * @author Universidad Felipe
 */
public class Cajero extends Base {

    private double tiempo;

    /**
     * Get the value of tiempo
     *
     * @return the value of tiempo
     */
    public double getTiempo() {
        return tiempo;
    }

    /**
     * Set the value of tiempo
     *
     * @param tiempo new value of tiempo
     */
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    

    

    @Override
    public Base copy() {
        return new Cajero();
    }
    
    public boolean estado (double tiempo)
    {       
          boolean estado = true;
         
         Timer A = Timer.class.cast(tiempo*1000);
         Timer timeraux = new Timer ();
         
         
         do{
         estado = false;
         }while(timeraux != A);
         
//         if (timeraux == A)
//         {
//               estado = true;
//         }
//         else if (timeraux != A)
//         {
//             estado = false;
//         }
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
//    public static void AcumularUsuarios() {
//		int contador = 0;
//		int acumulador = 0;
//		while (contador < 1000) {
//			contador = contador + 1;
//			acumulador = acumulador + 
//		}
//		JOptionPane.showMessageDialog(null, "Usuarios atendidos: " + acumulador);
//	}

    public Cajero() {
    }

    public Cajero(double tiempo, int Edad, Usuario Usuario) {
        this.tiempo = tiempo;
        this.Edad = Edad;
        this.Usuario = Usuario;
    }
    
}

