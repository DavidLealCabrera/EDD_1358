
package com.mycompany.gameoflife;
public class tabla {
 
    public tabla() {}
 
    public int[] comprobar(String[][] tablero, int[] point) {
 
        int n = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
 

                int vida = 0;
 
                if (i + 1 < 4 && tablero[i + 1][j].equals("x")) {
                    vida++;
                }
 
                if (i + 1 < 4 && j + 1 < 4 && tablero[i + 1][j + 1].equals("x")) {
                    vida++;
                }
 
                if (i + 1 < 4 && j - 1 >= 0 && tablero[i + 1][j - 1].equals("x")) {
                    vida++;
                }
 
                if (j + 1 < 4 && tablero[i][j + 1].equals("x")) {
                    vida++;
                }
 
                if (j - 1 >= 0 && tablero[i][j - 1].equals("x")) {
                    vida++;
                }

                if (i - 1 >= 0 && tablero[i - 1][j].equals("x")) {
                    vida++;
                }

                if (i - 1 >= 0 && j + 1 < 4 && tablero[i - 1][j + 1].equals("x")) {
                    vida++;
                }

                if (i - 1 >= 0 && j - 1 >= 0 && tablero[i - 1][j - 1].equals("x")) {
                    vida++;
                }
 
                if (tablero[i][j].equals("x")) {
                    if (vida == 1)
                        point[n] = 1;
                    else if (vida == 2 || vida == 3)
                        point[n] = 2;
                    else if (vida >= 4)
                        point[n] = 1;
                } else {
                    if (vida == 3)
                        point[n] = 3;
                }
                n++;
            }
        }
        return point;
    }
 
    public String[][] getSiguiente(String[][] tablero, int[] point) {
 
        int n = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (point[n] == 1)
                 tablero[i][j] = "o";                    
                if (point[n] == 3)
                    {tablero[i][j] = "x";
                n++;
            }
        }
        }
        return tablero;
    }
    public void printTablero1(String[][] tablero){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 9)
                    System.out.println(tablero[i][j] + " ");
                else
                    System.out.print(tablero[i][j] + " ");
            }
        }
    }
    public int tVida(String[][] tablero,int i,int j) {
    	String [][] tablaT = new String[10][10];
    	for(int p=0;p<10;p++)
    		for(int q=0;q<10;q++) {
    			tablaT[p][q]=tablero[p][q];
    		}
    	int vida = 0;
        if (i + 1 < 4 && tablaT[i + 1][j].equals("x")) {
            vida++;
        }
        if (i + 1 < 4 && j + 1 < 4 && tablaT[i + 1][j + 1].equals("x")) {
            vida++;
        }
 
        if (i + 1 < 4 && j - 1 >= 0 && tablaT[i + 1][j - 1].equals("x")) {
            vida++;
        }

        if (j + 1 < 4 && tablaT[i][j + 1].equals("x")) {
            vida++;
        }

        if (j - 1 >= 0 && tablaT[i][j - 1].equals("x")) {
            vida++;
        }

        if (i - 1 >= 0 && tablaT[i - 1][j].equals("x")) {
            vida++;
        }

        if (i - 1 >= 0 && j + 1 < 4 && tablaT[i - 1][j + 1].equals("x")) {
            vida++;
        }

        if (i - 1 >= 0 && j - 1 >= 0 && tablaT[i - 1][j - 1].equals("x")) {
            vida++;
        }
    
    	 
    	 return vida;
    }
    public void printTablero2(String[][] tablero){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 9)
                    System.out.println(tablero[i][j] + " ");
                else
                    System.out.print(tablero[i][j] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tablero[i][j]=="o")
                {System.out.print("[" +i+ "][" + j + "]:"+"muerte");
                System.out.print(":" + tVida(tablero,i,j) + "-->");
                System.out.println();
                }
    			else if(tablero[i][j] == "x")
                    {System.out.print("[" +i+ "][" + j + "]:"+"vida"); 
                    System.out.print(":" + tVida(tablero,i,j) + "-->");
                    System.out.println();}
         
            }
        }
        
    }
    
}
