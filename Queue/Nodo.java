
package com.mycompany.queue;

public class Nodo<E> {
    E dato;
    Nodo<E> siguiente;
    
    public Nodo() {
    }

    public Nodo(E valor) {
        this.dato = valor;
    }

    public Nodo(E dato, Nodo<E> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Nodo<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        
        return "|"+dato+"| -->"; 
    }
    public String printAll(){
        return "[Dato = " + dato + "] -> [Siguiente : " + this.getSiguiente() + "]";
    }

}
