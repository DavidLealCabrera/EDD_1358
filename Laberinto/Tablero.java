
package com.mycompany.inicio;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Tablero extends JPanel implements ActionListener{

	private JPanel miPanel;
	private JButton[][] bLab;
	private char[][] matSol;
	Laberinto miLab;
	
	
	/**
	 * Create the panel.
	 */
	public Tablero() 
	{
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));
		
		miLab = new Laberinto();
		
		miPanel = new JPanel();
		miPanel.setLayout(new GridLayout(miLab.getlongitudI(), miLab.getLongitudJ()));
		
		bLab = new JButton[miLab.getlongitudI()][miLab.getLongitudJ()];
		
		inicializarMatriz();
		add(miPanel, BorderLayout.CENTER);
		
	}
	
	public void resolverLaberinto()
	{
		if (miLab.isEstadoEntrada() == true && miLab.isEstadoSalida() == true) 
		{
			matSol = miLab.resolver();
			pintarSolucion();
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Debe selecionar la salida y la entrada");
		}
	}
	
	public void pintarSolucion()
	{
		for (int i = 0; i < bLab.length; i++) 
		{
			for (int j = 0; j < bLab[0].length; j++) 
			{
				if (matSol[i][j]=='*') 
				{
					bLab[i][j].setText(matSol[i][j]+"");
					bLab[i][j].setBackground(Color.BLUE);
				}
			}
		}
	}
	
	public void resetearMatriz()
	{
		for (int i = 0; i < bLab.length; i++) 
		{
			for (int j = 0; j < bLab[0].length; j++) 
			{
				if (miLab.getLaberinto()[i][j] == '0') 
				{
					bLab[i][j].setBackground(new Color(74, 84, 92));
				}
				else
				{
					
					bLab[i][j].setBackground(null);
				}
				bLab[i][j].setText(miLab.getLaberinto()[i][j]+"");
				
			}
		}
	}
	
	public void inicializarMatriz()
	{
		for (int i = 0; i < bLab.length; i++) 
		{
			for (int j = 0; j < bLab[0].length; j++) 
			{
				if (miLab.getLaberinto()[i][j] == '0') 
				{
					bLab[i][j] = new JButton(miLab.getLaberinto()[i][j]+"");
					bLab[i][j].setBackground(new Color(74, 84, 92));
				}
				else
				{
					bLab[i][j] = new JButton(miLab.getLaberinto()[i][j]+"");
				}
				
				miPanel.add(bLab[i][j]);
				bLab[i][j].addActionListener(this);
				
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		for (int i = 0; i < bLab.length; i++) 
		{
			for (int j = 0; j < bLab[0].length; j++) 
			{
				if (e.getSource() == bLab[i][j]) 
				{
					if (miLab.getLaberinto()[i][j] == '0') 
					{
						JOptionPane.showMessageDialog(this, "Es un muro !");
					}
					else
					{
						if (miLab.isEstadoEntrada() == false) 
						{
							bLab[i][j].setText("E");
							miLab.setEstadoEntrada(true);
							miLab.setEntradaI(i);
							miLab.setEntradaJ(j);
 						}
						else if(miLab.isEstadoEntrada() == true  &&
								miLab.isEstadoSalida()  == false)
						{
							bLab[i][j].setText("S");
							miLab.setSalidaI(i);
							miLab.setSalidaJ(j);
							miLab.setEstadoSalida(true);
						}
						else
						{
							JOptionPane.showMessageDialog(this, "Ya esta la salida y la entrada");
						}
					}
				}
			}
		}
		
	}

        public void reiniciarLaberito() {
        	
	    miLab.laberintoBase();
            miLab.setEstadoEntrada(false);
            miLab.setEstadoSalida(false);
            resetearMatriz();
	
    }

}
