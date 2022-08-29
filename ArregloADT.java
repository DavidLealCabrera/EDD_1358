package com.mycompany.arregloadt;

import java.util.ArrayList;

public class ArregloADT {
    int longitud;
    int tamanio;
    int t;
    private T elemento;
    private ArrayList <T> datos;
 

    public static void main(String[] args) {

        
    }
    public ArregloADT (int t){
        this.tamanio = t;
        datos= new ArrayList();
        for(int i = 0; i<t; i++){
        datos.add((T) new Object());
        
        
    }
        datos.toString();

    }

    private void setElemento(int indice, String y) {
        if(indice>= 0 && indice<this.tamanio){
            datos.set(indice, elemento);
        }
        
    }

    private T getElemento(int indice) {
        if(indice>=0 && indice<this.tamanio){
            return datos.get(indice);
        }
        return null;
    }

    private void limpiar(String string) {
        for(int i = 0; i<t; i++){
        datos.set(i, null);
    }
    }    
        

    private int getLongitud() {
        return datos.size();
    }
    
    

        
}
