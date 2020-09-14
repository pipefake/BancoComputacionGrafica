/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Universidad Felipe
 */
public class Caja {
    
    private boolean estado;
    
    private int tiempoTransaccion;
    private int numeroClientes;

    /**
     * Get the value of numeroClientes
     *
     * @return the value of numeroClientes
     */
    public int getNumeroClientes() {
        return numeroClientes;
    }

    /**
     * Set the value of numeroClientes
     *
     * @param numeroClientes new value of numeroClientes
     */
    public void setNumeroClientes(int numeroClientes) {
        this.numeroClientes = numeroClientes;
    }

    

    /**
     * Get the value of tiempoTransaccion
     *
     * @return the value of tiempoTransaccion
     */
    public int getTiempoTransaccion() {
        return tiempoTransaccion;
    }

    /**
     * Set the value of tiempoTransaccion
     *
     * @param tiempoTransaccion new value of tiempoTransaccion
     */
    public void setTiempoTransaccion(int tiempoTransaccion) {
        this.tiempoTransaccion = tiempoTransaccion;
    }


    /**
     * Get the value of estado
     *
     * @return the value of estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Set the value of estado
     *
     * @param estado new value of estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Caja() {
        this.estado = true;
        this.tiempoTransaccion = 0;
        this.numeroClientes = 0;
    }

    public Caja(boolean estado, int tiempoTransaccion, int numeroClientes) {
        this.estado = estado;
        this.tiempoTransaccion = tiempoTransaccion;
        this.numeroClientes = numeroClientes;
    }

    @Override
    public String toString() {
        return "Cajero: " + "estado= " + estado + ", tiempoTransaccion= " + tiempoTransaccion + ", numeroClientes= " + numeroClientes + "\n";
    }

}