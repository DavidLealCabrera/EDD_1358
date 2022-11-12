
package com.mycompany.priorityqueue;

public class Nodo<T> {
    T dato;
    int prio;
    Nodo<T> siguiente;
    
    public Nodo() {
    }

    public Nodo(T valor) {
        this.dato = valor;
    }

    public Nodo(T dato, Nodo<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(int p, T dato) {
        this.dato = dato;
        this.prio = p;
    }

    @Override
    public String toString() {
        
        return "["+prio+"]|"+dato+"| -->"; 
    }
    public String printAll(){
        return "[Dato = " + dato + "] -> [Siguiente : " + this.getSiguiente() + "]";
    }

}