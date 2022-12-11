package com.mycompany.arraylistejemp;
import java.util.*;
 
public class ArrayListEjemp {
 
    public static void main(String args[]) {
        //Crea un lista
        ArrayList<String> lista = new ArrayList<String>();           
         
 
        // Agrega elementos a la lista
        lista.add("a");
        lista.add("b");
        lista.add(2, "c"); // agrega el c en la posición 2
        lista.add("d");
     
        // Despliega los elementos de la lista
        System.out.println("La lista contiene: " + lista);
         
        // Despliega los elementos de la lista con interator
         Iterator<String> a=lista.iterator();
         while(a.hasNext()){
             System.out.println(a.next());
         }
               
         // El último indice de un elemento
         int ultimo = lista.lastIndexOf("b");
         System.out.println("El valor índice b es: " + ultimo);
 
         // Se clona el objeto lista 
         Object listClone = lista.clone();        
         System.out.println("Objeto clonado: " + listClone);
           
                  
        //Obtiene el indice de un elemento
        int pos = lista.indexOf("b");
        System.out.println("El índice de b es: " + pos);
 
        // Verifica si el arreglo está vacío
        boolean check = lista.isEmpty();
        System.out.println("¿Está vacío el arreglo list?: " + check);
 
        // Obtiene el tamaño del arreglo
        int size = lista.size();
        System.out.println("El tamaño de list es: " + size);
 
        // Revisa si un elemento esta en la lista
        boolean element = lista.contains("e");
        System.out.println("Revisa si un elemento esta en la lista e: " + element);
 
        // Obtener un elemento con una posición dada
        String item = lista.get(0);
        System.out.println("El elemento en el índice 0 es: " + item);
 
        // Obtener los elementos de una arreglo
 
        // Obtener el tamaño de la lista
        System.out.println("Se obtienen lo elementos con un loop usando un ídice y el tamaño de la lista");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Índice: " + i + " - Elemento: " + lista.get(i));
        }
 
        // Obtener los elementos por un loop
        System.out.println("Obteniendo los elementos por un loop");
        for (String str : lista) {
            System.out.println("El elemento es: " + str);
        }
 
        // Usando Iterator
        // hasNext(): obtiene todos los elementos de la lista
        // next(): obtene un elemento tras otro
        System.out.println("Obteniendo los elementos con iterator");
        for (Iterator<String> it = lista.iterator(); it.hasNext();) {
            System.out.println("Item is: " + it.next());
        }
 
        // Reemplazando un elemento
        lista.set(1, "Siguiete elemento");
        System.out.println("El arraylist después del reemplazo es: " + lista);
 
        // Borrando el elemento 0
        lista.remove(0);
 
        // Borraando el Elemento3 como primera ocurrencia de arraylist"
        lista.remove("Elemento3");
 
        System.out.println("El contenido de arraylist es: " + lista);
 
        // Convertir ArrayList a Array
        String[] simpleArray = lista.toArray(new String[lista.size()]);
        System.out.println("El array ceado despues de convertir a arraylist es: " + Arrays.toString(simpleArray));
         
        //List
        List<Comparable> listA = new ArrayList<Comparable>();
         
        listA.add(1);
        listA.add("uno");
        listA.add(new Date());
         
        System.out.println("El arraylist tiene los siguintes elementos: " + listA);
        
        //Borra los elementos de la lista
        lista.clear();
          
        System.out.println("La lista tiene los siguientes elementos despues de clear: " + lista);        
    }
}