
package com.mycompany.queue;


public class ADTQueue<E> {
    Nodo<E> head;
    Nodo<E> cola;
    int tam;
    
    public ADTQueue(){
        this.head = null;
        this.cola = null;
        this .tam = 0;
    }
    
    public boolean estaVacia() {
        return this.head == null;
    }    
    
    public int longitud(){
        return tam;
    }
        
    public void enqueue(E elem){
        Nodo<E> nodo = new Nodo<E>();
        nodo.setDato(elem);
        nodo.setSiguiente(null);
        if (tam == 0)
            head = nodo;
        else
        cola.setSiguiente(nodo);
        cola = nodo;
        tam++;
    }
    

    public E dequeue(){
         E dato = head.dato;  
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
