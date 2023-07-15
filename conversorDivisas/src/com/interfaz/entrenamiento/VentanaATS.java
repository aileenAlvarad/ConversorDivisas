package com.interfaz.entrenamiento;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaATS extends JFrame {

	public JPanel panel;

	public VentanaATS() { 
		setSize(500, 500);
		setTitle("Conversor de Monedas");
		// frame.setLocation(100,200); //Establecenmos la posicion inicial de la ventana
		// frame.setBounds(400, 200, 500, 500); Establecemos la posicion inicial y el
		// tamaño
		setLocationRelativeTo(null); // Establecemos la ventana el centro de la pantalla

		// setResizable(false); //Establecemos si la ventana puede cambiar de tamaño o
		// no
		setMinimumSize(new Dimension(200, 200)); // Establecemos el tamaño minimo

		getContentPane().setBackground(new Color(255, 228, 225));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // El programa deja de ejecutarse y se cierra el programa

		iniciarComponentes();
	}

	private void iniciarComponentes() {
		colocarPaneles();
		//colocarEtiquetas(); 
		//colocarBotones(); 
		//colocarRadioBotones(); 
		//colocarCajasDeTexto(); 
		//colocarAreasDeTexto(); 
		colocarListasDesplegables();


	}

	private void colocarPaneles() {
		panel = new JPanel(); // Creacion de un panel
		panel.setBackground(Color.DARK_GRAY);// Establecemos el color del panel
		panel.setLayout(null); // Desactivando el diseño
		this.getContentPane().add(panel); // Agregamos el panel creado a la ventana
	}

	private void colocarEtiquetas() {
		// Etiqueta 1 - Etiqueta tipo label
		JLabel etiqueta = new JLabel("Bienvenido a tu conversor", SwingConstants.CENTER); // creamos una etiqueta
		// Tambien centramos el contenido de la etiqueta
		// etiqueta.setText("Bienvenido a tu conversor"); //Establecemos el texto de la
		// etiqueta
		etiqueta.setBounds(80, 10, 300, 20);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // Establecemos la alineacion horizontal del texto
		etiqueta.setForeground(Color.white); // Establecemos el color de la letra
		// etiqueta.setOpaque(true); //Establecemos pintar el fondo de la etiqueta
		// etiqueta.setBackground(Color.WHITE);//Cambimaos el color del fonde de la
		// etiqueta
		etiqueta.setFont(new Font("arial", Font.BOLD, 20)); // Establecemos la fuente del texto
		panel.add(etiqueta); // agregamos la etiqueta al panel //

		// Etiqueta 2 - etiqueta new Image
		ImageIcon imagen = new ImageIcon("C:\\Users\\Aileen\\Downloads\\moneda2.jpg");
		JLabel etiqueta2 = new JLabel();
		etiqueta2.setBounds(120, 90, 235, 242); // Cuanto de ancho y largo va a tener nuestra etiqueta
		etiqueta2.setIcon(new ImageIcon(
		imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH))); // Hacemos																							// etiqueta 
		panel.add(etiqueta2);// La agregamos al panel
	} 
	
	private void colocarBotones() {  ///////// Creando botones  
		
		//Boton 1 - Boton de texto
		JButton boton1 = new JButton();   
		boton1.setText("Click"); //Establecemos un texto al boton
		boton1.setBounds(100,100, 100, 40);  
		boton1.setEnabled(true); //Habilitar o desabilitar el boton 
		boton1.setMnemonic('a'); //Estblecemos alt + letra y da click el boton 
		boton1.setForeground(Color.MAGENTA);  
		boton1.setFont(new Font("cooper", Font.BOLD, 20));
		panel.add(boton1); 
		
		//Boton 2 - Boton de imagen  
		JButton boton2 = new JButton();  
		boton2.setBounds(100, 200, 100, 40);  
		ImageIcon clickAqui = new ImageIcon("C:\\Users\\Aileen\\Downloads\\btnBuscar.jpg");
		boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
		//boton2.setBackground(Color.LIGHT_GRAY); //Establecemos el color de fondo del boton
		panel.add(boton2);
		//Video 98
		
	}

	private void colocarRadioBotones() {
		JRadioButton radioBoton1 = new JRadioButton("Opcion 1", true); 
		radioBoton1.setBounds(50, 100, 200, 50);  
		radioBoton1.setEnabled(false); //Especifica si va a estar disponible o no 
		radioBoton1.setText("Programación"); 
		radioBoton1.setFont(new Font("cooper black", 0, 20));
		panel.add(radioBoton1); 
		
		JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false); 
		radioBoton2.setBounds(50, 150, 100, 50); 
		panel.add(radioBoton2);
		
		JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false); 
		radioBoton3.setBounds(50, 200, 100, 50); 
		panel.add(radioBoton3); 
		
		ButtonGroup grupoRadioBotones = new ButtonGroup(); //Creamos un grupo de radioButons para 
		grupoRadioBotones.add(radioBoton1); 				//Que solo podamos marcar una opcion
		grupoRadioBotones.add(radioBoton2);  
		grupoRadioBotones.add(radioBoton3); 
	}

	private void colocarCajasDeTexto() {
		JTextField cajaDeTexto = new JTextField(); 
		cajaDeTexto.setBounds(50, 50, 200, 30);   
		cajaDeTexto.setText("Hola");
		
		System.out.println("Texto en la caja " + cajaDeTexto.getText());
		panel.add(cajaDeTexto); 
		
	}
	
	private void colocarAreasDeTexto() {
		JTextArea areaTexto = new JTextArea(); 
		areaTexto.setBounds(20,20,300, 200); 
		areaTexto.setText("Escriba el texto aqui "); //Establecer texto inicial
		areaTexto.append("\n Escribe por aqui..."); //Añade mas texto al area
		areaTexto.setEditable(true);//permite editar o no editar el area de texto
		
		System.out.println("El texto es: " + areaTexto.getText());
		panel.add(areaTexto);
		
		
	}

	private void colocarListasDesplegables() { 
		String [] paises = {"Mexico", "Peru", "Colombia", "Paraguay", "Ecuador"};
		
		JComboBox listaDesplegable = new JComboBox(paises);  
		listaDesplegable.setBounds(20, 20, 100, 30); 
		
		listaDesplegable.addItem("Argentina"); //Añadir objetos a tu lista desplegable  
		listaDesplegable.setSelectedItem("Paraguay"); //Seleccionar el primer objeto visto
		panel.add(listaDesplegable); //Agregamos al panel 
		
	}

} 

		//Agregando evento de tipo ActionListener 
		//ActionListener oyenteDeAccion = new ActionListener(){
		
		//@Override //Aqui dentro vamos a poner lo que queremos que suceda en caso de dar click en el boton
		//public void actionPerformed(ActonEvent ae)
			//saludo.setText("Hola " + cajaTexto.getText()); 
//} 
	
	//boton.addActionListener(oyenteDeAccion);Añade un oyente de accion, que cuando den click en el boton automaticamnte algo pase


//private void eventoOyenteDeRaton() { 
		//Agregando oyente de Raton - MouseListener 
		//MouseListener oyenteDeRaton = new MouseListener();
		
		//Override
		//public void mouseClicke(MouseEvent me){ //Cuando den click en el areaTexto 
			//areaTexto.append("mouseClicked") //Se mostrara esto 

		//Override
		//public void mousePressed(MouseEvent me){ //Cuando presionemos se ejecutara el MouusePresed
			//areaTexto.append("mousePressed") 

		//Override
		//public void mouseReleased(MouseEvent me){ //Cuando soltamos se ejecutara el mouseReleased
			//areaTexto.append("mouseReleased")  

		//Override
		//public void mouseEntered(MouseEvent me){ //al posicionar el mouse sobre el boton se ejecutara el mouseEntered 
			//areaTexto.append("mouseEntered") 

		//Override
		//public void mouseExited(MouseEvent me){ //al posicionar el mouse sobre el boton se ejecutara el mouseEntered y 
			//areaTexto.append("mouseExited") 		//Al salir se ejecutara el mouseExited 
		//boton.addMouseListener(oyenteDeRaton);
//} 


			///Eventos de teclado 
		/*private void eventosDelTeclado() { 
			KeyListener eventoTeclado = new KeyListener(); 
			
			@Override
			public void keyTyped(keyEvent Ke){ //Solo admite unicos, es casi igual que keyPressed, el alt, crtl, etc no las admite
			
		} 
			
			@Override
			public void KeyPressed(keyEvent Ke){ //Presionar cualquier tecla del teclado, ya se hace el KeyPressed
				areaTexto.append("KeyPressed");
		} 
			
			@Override
			public void KeyReleased(keyEvent Ke){ //Al presionar y soltar cualquier tecla se ejecuta, ya sean letras o numeros
				//Para poner que letra especificamente quiero que se pulse podemos usar if 
				 * if(ke.getkeyChar() == 'p'{
				 * areaTexto.append("letra p \n"); 
				 * 	} 
				 * if(ke.getkeyChar() == 'Enter'{
				 * areaTexto.append("Enter \n"); 
				 * 	}
				 */
				
		/*}
		areaTexto.append("KeyPressed");
			cajaTexto.addKeyListener(eventoTeclado); //Cuando presione algo alguna tecla, va a suceder algo sobre la caja de texto*/










