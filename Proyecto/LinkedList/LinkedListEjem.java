package com.mycompany.linkedlistejem;

import java.util.*;
public class LinkedListEjem {
     public static void main(String args[]) {
 
         // Declaración Linked List  
         LinkedList<String> ll = new LinkedList<String>();
 
         //add(String Element) agrega un elemento en la lista
         ll.add("a");
         ll.add("b");
         ll.add("c");
         ll.add("d");
         ll.add("e");
 
         //Despliega el contenido  
         System.out.println("Cotenido: " +ll);
 
         //Agregar al prinicipio y final un Elemento
         ll.addFirst("Primer Elemento");
         ll.addLast("Último Elemento");
         System.out.println("Despues de agregar elementos: " +ll);
          
         System.out.println("Tamaño: " + ll.size() );
         // Comprueba si hay un elemento en la lista 
         if (ll.contains("a"))
             System.out.println("El elmento a está en la linkedlist");
         else
             System.out.println("El elemento a no existe en la linkedlist");
 
         //Obtención y recuperacion de elementos
         Object f = ll.get(0);
         System.out.println("Primer elemento: " +f);
         ll.set(0, "Cambiar el primer elemento");
         Object f2 = ll.get(0);
         System.out.println("Primer elemento despues de actualiza por el método  set: " + f2);
 
         //Borrar el primer y último elemento
         ll.removeFirst();
         ll.removeLast();
         System.out.println("Despues de borrar el primer y último elemento: " +ll);
 
         // Agregar en un posición y eliminar por posición
         ll.add(0, "Nuevo elemento");
         ll.remove(2);
         System.out.println("Final del contenido: " +ll); 
     }
}
