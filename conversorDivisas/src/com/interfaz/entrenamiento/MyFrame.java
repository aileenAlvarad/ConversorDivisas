package com.interfaz.entrenamiento;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	MyFrame(){

	setTitle("Conversor de Monedas"); //sets title of this
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
	this.setResizable(false); //prevent this from being resized 
	this.setSize(420, 420); // sets the x- dimension, and y-dimension of this
	this.setVisible(true); //make this visible 
	
	ImageIcon image = new ImageIcon("C:\\Users\\Aileen\\Downloads\\logo-conversorl.png"); //create an IageIcon
	this.setIconImage(image.getImage()); // change icon of this
	this.getContentPane().setBackground(/*Color.lightGray*/new Color(255, 228, 225)); 
	//label.setIconTextGap(-25);
}
	
	
}
