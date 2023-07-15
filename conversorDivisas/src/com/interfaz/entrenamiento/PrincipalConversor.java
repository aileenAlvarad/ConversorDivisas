package com.interfaz.entrenamiento;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrincipalConversor {

	public static void main(String[] args) {

		/*
		 * JFrame frame = new JFrame(); //Creates a frame
		 * frame.setTitle("Conversor de Monedas"); //sets title of frame
		 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of
		 * application frame.setResizable(false); //prevent frame from being resized //
		 * sets the x- dimension, and y-dimension of frame frame.setVisible(true);
		 * //make frame visible
		 * 
		 * ImageIcon image = new
		 * ImageIcon("C:\\Users\\Aileen\\Downloads\\logo-conversorl.png"); //create an
		 * IageIcon frame.setIconImage(image.getImage()); // change icon of frame
		 * frame.getContentPane().setBackground(/*Color.lightGray
		 *//* new Color(255, 228, 225)); */ // change color of background

		// MyFrame myFrame = new MyFrame();

		ImageIcon image = new ImageIcon("C:\\Users\\Aileen\\Downloads\\monedas.jpg");

		JLabel label = new JLabel(); // create a label
		label.setText("Welcome"); // set text of label
		label.setIcon(image);

		JFrame frame = new JFrame(); // Creates a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // El programa deja de ejecutarse y se cierra el programa
		frame.setSize(500, 500);
		frame.setTitle("Conversor de Monedas");
		// frame.setLocation(100,200); //Establecenmos la posicion inicial de la ventana
		// frame.setBounds(400, 200, 500, 500); Establecemos la posicion inicial y el tamaño
		frame.setLocationRelativeTo(null); // Establecemos la ventana el centro de la pantalla
		//setResizable(false); //Establecemos si la ventana puede cambiar de tamaño o no 
		frame.setMinimumSize(new Dimension(200,200)); //Establecemos el tamaño minimo
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.setVisible(true);
		frame.add(label);

	}

}
