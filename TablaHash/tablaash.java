
package com.mycompany.tablashash;



import java.util.ArrayList;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class tablaash<T> {

    private Array tabla;
    private int table_size;

    public tablaash(int table_size) {
        Scanner lector = new Scanner(System.in);
        while (table_size <= 7 || !primos(table_size)) {
            System.out.println("Ese numero no es valido");
            table_size = lector.nextInt();
        }
        this.table_size = table_size;
        this.tabla = new Array(table_size + 1);
        for (int i = 0; i < table_size + 2; i++) {
            tabla.setElemento(i, new ArrayList<T>());
        }
    }

    public boolean primos(int num) {

        if (num % 2 == 0) {
            return false;
        }
        for (int i =3; i < num;  ++i) {
             
            if (num%i == 0) {
                return false;
            }

        }
        return true;
    }

    public void Add(String valor) {
        ArrayList aux = new ArrayList();
        byte[] bytes = valor.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes[0] % table_size);
        aux = (ArrayList) tabla.getElemento(bytes[0] % table_size);
        aux.add(valor);
    }
    
    public void Add(int key, T value) {
        ArrayList aux = new ArrayList();
        aux = (ArrayList) tabla.getElemento(key % table_size);
        aux.add(value);

    }

    public int valueOf(String key) {
        byte[] bytes = key.getBytes(StandardCharsets.US_ASCII);
        return bytes[0] % table_size;
    }

    public void Remove(int key) {
        ArrayList aux = new ArrayList();
        if (table_size > key) {
            aux = (ArrayList) tabla.getElemento(key);
            if (!aux.isEmpty()) {
                aux.remove(0);
            }else{
                System.out.println("Ya esta vacio");
            }

        }else{
            System.out.println("Ese valor es demasiado grande");
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < table_size + 1; i++) {
            System.out.println("{" + i + "}" + tabla.getElemento(i));
        }
        return "";
    }

}
