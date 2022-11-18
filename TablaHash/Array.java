package com.mycompany.tablashash;

import java.util.ArrayList;

public class Array <T>{
    int taman;
    ArrayList<T> datos;

    public Array(int tam) {
        this.taman = tam;
        datos = new ArrayList(this.taman+1);
        for (int i = 0; i < this.taman; i++) {
            this.datos.add(null);
        }
    }

    public T getElemento(int index) {
        if (comprobacion(index)) {
            return this.datos.get(index);
        } else {
           // System.out.println("Fuera del rango");
        }
        return null;
    }
    public void setElemento(int index, T dato) {
        if (comprobacion(index)) {
            this.datos.set(index, dato);
        } else {
          //  System.out.println("Fuera del rango");
        }
    }    

    private boolean comprobacion(int index) {
        return index >= 0 && index < this.taman;
    }


    public int getLongitud() {
        return this.taman;
    }

    public void limpiar(T dato) {
        for (int i = 0; i < this.taman; i++) {
            this.datos.set(i, dato);
        }
    }
    public void añadir(T dato){
        this.datos.add(dato);
    }
    
    public String toString(){
        String estado = "-------- "+this.taman+" --------\n";
        for (T dato : datos) {
            if(dato != null){
                estado += dato.toString()+"\n";
            }
        }
        return estado;
}}
