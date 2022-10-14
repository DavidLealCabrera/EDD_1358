
package com.mycompany.inicio;

public class Laberinto {

	private boolean estadoEntrada;
	private boolean estadoSalida;
	private char[][] laberinto;
	private int entradaI;
	private int entradaJ;
	private int salidaI;
	private int salidaJ;
	
	
public Laberinto(){
    
	laberintoBase();
    }
	
public void laberintoBase(){
	
	char[][] laberintoBase={ 
		        {'0', '0', '0', '0', '0', '0'},
                        {'0', ' ', ' ', ' ', ' ', '0'},
			{'0', '0', '0', '0', ' ', '0'},
                        {'0', ' ', ' ', ' ', ' ', '0'},
                        {'0', ' ', '0', ' ', '0', '0'},
                        {'0', '0', '0', '0', '0', '0'},
		    };
		laberinto = new char[laberintoBase.length][laberintoBase[0].length];
		for (int i = 0; i < laberintoBase.length; i++) 
		{
			for (int j = 0; j < laberintoBase.length; j++) 
			{
				laberinto[i][j] = laberintoBase[i][j];
			}
		}
	}
	
    public char[][] resolver()
    {
    	laberinto[salidaI][salidaJ] = 'S'; 
        if (paso(entradaI, entradaJ)) { 								
            laberinto[entradaI][entradaJ] = 'E'; 						
	    }
        return laberinto;
    }
    
    private boolean paso(int x, int y) 
    {

    	 if (laberinto[x][y]=='S'){ 
    		 return true; 
    	 }
    	 
    	 if (laberinto[x][y]=='0'||laberinto[x][y]=='*') { 
    		 return false; 
    	 }
    	 
    	 
    	 laberinto[x][y]='*'; 
    	 
    	 boolean result; 
    	 
    	 result=paso(x-1, y);
    	 
    	 if (result) 
    	 {
    		 return true; 
    	 } 
    	 result=paso(x, y+1); 
    	 
    	 if (result)
    	 {
    		 return true; 
    	 }
    	 result=paso(x, y-1); 
    	 
    	 if (result) 
    	 {
    		 return true; 
    	 }
    	 result=paso(x+1, y); 
    	 
    	 if (result)
    	 {
    		 return true; 
    	 }

    	 laberinto[x][y]='+'; 
    		    return true; 
    }
	
	
	public boolean isEstadoEntrada() {
		return estadoEntrada;
	}
	public void setEstadoEntrada(boolean estadoEntrada) {
		this.estadoEntrada = estadoEntrada;
	}
	public boolean isEstadoSalida() {
		return estadoSalida;
	}
	public void setEstadoSalida(boolean estadoSalida) {
		this.estadoSalida = estadoSalida;
	}
	public char[][] getLaberinto() {
		return laberinto;
	}
	public void setLaberinto(char[][] laberinto) {
		this.laberinto = laberinto;
	}
	public int getEntradaI() {
		return entradaI;
	}
	public void setEntradaI(int entradaI) {
		this.entradaI = entradaI;
	}
	public int getEntradaJ() {
		return entradaJ;
	}
	public void setEntradaJ(int entradaJ) {
		this.entradaJ = entradaJ;
	}
	public int getSalidaI() {
		return salidaI;
	}
	public void setSalidaI(int salidaI) {
		this.salidaI = salidaI;
	}
	public int getSalidaJ() {
		return salidaJ;
	}
	public void setSalidaJ(int salidaJ) {
		this.salidaJ = salidaJ;
	}
	
	public int getlongitudI()
	{
		return laberinto.length;
	}
	
	public int getLongitudJ()
	{
		return laberinto[0].length;
	}
	
	
	
	
}
