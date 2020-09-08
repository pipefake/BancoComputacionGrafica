/**
* Estructura de la cola con metodos: encolar, desencolar y si esta vacia la cola …
* @author Jonathan.rojas@uao.edu.co Jonathan Rojas Ibanez 2190039
* @author andrea.perez@uao.edu.co Andrea Perez 2190936
* @author juan_felipe.jimenez@uao.edu.co Juan Felipe Jimenez Salazar 2190038
* @date 03 Septiembre 2020si
* @version 1.0
*/
package core;

import java.util.LinkedList;

/**
 *
 * @author Universidad Felipe
 * @param <T>
 */
public class Cola <T extends Base> {
    private LinkedList<T> tope;
    public Cola(){
        tope = new LinkedList<>();
    }       
    public void encolar(T elem){
        tope.addLast(elem);
    }
    public T desencolar(){
        return tope.removeFirst();
    }
    public boolean estaVacia(){
        return tope.isEmpty();
    }

    @Override
    public String toString() {
        String cad = "(";
        for(T e : tope){
            cad += " " + e.toString() + "\n";
        }
        return cad + ")";
    }
    
}
