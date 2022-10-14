
package com.mycompany.inicio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Inicio extends JFrame implements ActionListener{

	private JPanel contTab;
	private Tablero tabLaberinto;
	private JButton bReset;
	private JButton bResolver;

	/**
	 * Ivan Andres Guapacha
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio() 
	{
		setTitle("Laberinto !");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 484);
		contTab = new JPanel();
		contTab.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contTab);
		contTab.setLayout(null);
		
		tabLaberinto = new Tablero();
		tabLaberinto.setBounds(25, 30, 474, 350);
		contTab.add(tabLaberinto);
		
		bReset = new JButton("Reset");
		bReset.setBounds(25, 391, 89, 43);
		contTab.add(bReset);
		bReset.addActionListener(this);
		
		bResolver = new JButton("Resolver");
		bResolver.setBounds(143, 391, 89, 43);
		contTab.add(bResolver);
		bResolver.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == bReset) 
		{
			tabLaberinto.reiniciarLaberito();
			this.setVisible(true);
		}
		if (e.getSource() == bResolver) 
		{
			tabLaberinto.resolverLaberinto();
		}
		
	}
}
