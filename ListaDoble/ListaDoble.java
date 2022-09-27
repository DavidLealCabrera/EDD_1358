
package com.mycompany.listadoble;


public class ListaDoble {

    public static void main(String[] args) {
        ListaDobleADT<Integer> ldl = new ListaDobleADT();
        ldl.agregarAlFinal(70);
        ldl.agregarAlFinal(4);
        ldl.agregarAlFinal(23);
        ldl.agregarAlFinal(67);
        ldl.agregarAlFinal(79);
        ldl.agregarAlFinal(33);
        ldl.agregarAlFinal(99);
        ldl.agregarAlFinal(588);
        ldl.agregarAlFinal(999);
        ldl.agregarAlFinal(100);
        ldl.transversal();
        ldl.agregarAlInicio(250);
        ldl.transversal();
        ldl.agregarAlInicio(12);
        ldl.agregarDespuesDe(7,3);
        ldl.transversal();
        ldl.eliminar(5);
        ldl.transversal();
        ldl.eliminarElPrimero();
        ldl.transversal();
        ldl.eliminarElFinal();
        ldl.transversal();
        System.out.println(ldl.buscar(70));
        System.out.println(ldl.buscar(250));
        System.out.println(ldl.buscar(33));
        ldl.actualizar(50, 8);
        ldl.transversal();
    }
}
