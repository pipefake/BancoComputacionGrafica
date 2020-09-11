/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.time.LocalDateTime;

/**
 *
 * @author Universidad Felipe
 */
public class Cajero {

        private int tiempo;

    private int contadordeusuarios;

    /**
     * Get the value of contadordeusuarios
     *
     * @return the value of contadordeusuarios
     */
    public int getContadordeusuarios() {
        return contadordeusuarios;
    }

    /**
     * Set the value of contadordeusuarios
     *
     * @param contadordeusuarios new value of contadordeusuarios
     */
    public void setContadordeusuarios(int contadordeusuarios) {
        this.contadordeusuarios = contadordeusuarios;
    }

    private String tiempoacumulado;

    /**
     * Get the value of tiempoacumulado
     *
     * @return the value of tiempoacumulado
     */
    public String getTiempoacumulado() {
        return tiempoacumulado;
    }

    /**
     * Set the value of tiempoacumulado
     *
     * @param tiempoacumulado new value of tiempoacumulado
     */
    public void setTiempoacumulado(String tiempoacumulado) {
        this.tiempoacumulado = tiempoacumulado;
    }

    /**
     * Get the value of tiempo
     *
     * @return the value of tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * Set the value of tiempo
     *
     * @param tiempo new value of tiempo
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Cajero() {
    }

    public Cajero(int tiempo) {
        this.tiempo = tiempo;
    }


    public boolean estado(int tiempoestado) {

        boolean Aux = true;
        
        do {
            Aux = false;
        } while (tiempoestado < tiempo);

        return Aux;
    }
    
}
