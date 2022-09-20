

package com.mycompany.gameoflife;


import java.util.Random;
import java.util.Scanner;
 
 
public class GameOfLife {
    public static void main(String[] args) {

        String[][] tablero = new String[10][10];
 
        tabla me = new tabla();
 
        for (int i = 0; i <10; i++) {
            for (int j = 0; j < 10; j++) {
 
                int num = new Random().nextInt(2);
                if (num == 1)
                    tablero[i][j] = "x";
                else if (num == 0)
                    tablero[i][j] = "o";
            }
        }

                 System.out.println ("El estado inicial es:");
        me.printTablero1(tablero);
        System.out.println("===========");
 
        int n = 0;
                 int num = 0; 
        while (n == 0) {
            int[] point = me.comprobar(tablero, new int[100]);

            tablero = me.getSiguiente(tablero, point).clone();
 
                         System.out.println (" " + (++ num) + "Cambios:");
            me.printTablero2(tablero);
            System.out.println("===========");
 
                         System.out.println ("Ingrese 0 para continuar con el siguiente paso, ingrese otros números para salir.");
            n = new Scanner(System.in).nextInt();
        }
    }
}
