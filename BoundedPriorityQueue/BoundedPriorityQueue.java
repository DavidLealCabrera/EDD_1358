
package com.mycompany.priorityqueue;

public class BoundedPriorityQueue<T> {
    Nodo<T> head;
    Nodo<T> cola;
    int tam;
    int prio;
    
    public BoundedPriorityQueue(int level){
        this.head = null;
        this.cola = null;
        this.prio = level;
        this.tam = 0;
    }
    
    public boolean estaVacia() {
        return this.head == null;
    }  
    
    public int longitud(){
        return tam;
    }
    
    public void enqueue(int p, String elem){
        Nodo<T> nodo = new Nodo<T>();
        nodo.setDato(p, (T) elem);
        nodo.setSiguiente(null);
        if (tam == 0)
            head = nodo;
        else
        cola.setSiguiente(nodo);
        cola = nodo;
        tam++;
    }
    
    public T dequeue(){
         T dato = head.dato;  
         head = head.siguiente;
         if (estaVacia()){           
            cola = null;      
         }
         tam--;
         System.out.println("Elemento " + dato+ " removido de la cola");
         return dato;
     }
    
    public void transversal() {
        Nodo curr_node = this.head;
        while (curr_node != null) {
            System.out.print(curr_node);
            curr_node = curr_node.getSiguiente();
        }
        System.out.println("");
    }  
    
}
