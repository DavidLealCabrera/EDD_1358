package com.mycompany.stackejem;

import java.util.Stack;

public class StackEjem {

    public static void main(String[] args) {
        Stack<String> pila1 = new Stack<String>();
        
        //Inserta elementos en la pila
        pila1.push("a");
        pila1.push("b");
        pila1.push("c");
        
        //tamaño de la pila
        System.out.println("Tamaño: " + pila1.size());
        
        //elimina el ultimo elemento agregado a la pila
        System.out.println("Extraer elemento: " + pila1.pop());
        System.out.println("Tamaño: " + pila1.size());
        
        //consulta el primer elemento de la pila
        System.out.println("Primer elemento: " + pila1.peek());
        System.out.println("Tamaño: " + pila1.size());
        System.out.println("Extrae uno a un cada elemento de la pila mientras no este vacía:");
        while (!pila1.isEmpty())
            System.out.print(pila1.pop() + "-");
        System.out.println();

        Stack<Integer> pila2 = new Stack<Integer>();
        pila2.push(14);
        pila2.push(1234);
        pila2.push(78);
        //Borra todos los elementos de la pila
        pila2.clear();
        System.out.println("Tamaño: " + pila2.size());
    }
}
