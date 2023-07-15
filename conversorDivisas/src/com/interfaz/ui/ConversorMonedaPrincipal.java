package com.interfaz.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import com.interfaz.Divisas;
import com.logica.Conversor;
import com.logica.ConvertirStringAEnum;
import com.logica.Validaciones;

public class ConversorMonedaPrincipal extends JFrame {


	private static final long serialVersionUID = -7490873424518159947L;

	public JPanel panel;

	private JTextField cantidadDinero = new JTextField();

	public static void main(String[] args) {
		ConversorMonedaPrincipal ventana2 = new ConversorMonedaPrincipal();
		ventana2.setVisible(true);
	}

	public ConversorMonedaPrincipal() {
		ImageIcon image = new ImageIcon("C:\\Users\\Aileen\\Downloads\\conversor-logo.png"); // create an IageIcon
		this.setIconImage(image.getImage()); // change icon of this
		setSize(500, 360);
		setTitle("Conversor de Monedas");
		setLocationRelativeTo(null); // Establecemos la ventana el centro de la pantalla
		setMinimumSize(new Dimension(200, 200)); // Establecemos el tamaño minimo

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // El programa deja de ejecutarse y se cierra el programa

		iniciarComponentes();
		colocarEtiquetas();
		convirtiendoMonedas();
		colocarBotones();
	}

	private void iniciarComponentes() {
		colocarPaneles();

	}

	private void colocarPaneles() {
		panel = new JPanel(); // Creacion de un panel
		panel.setLayout(null);
		panel.setBackground(new Color(255, 228, 225));// Establecemos el color del panel
		this.getContentPane().add(panel); // Agregamos el panel creado a la ventana
	}

	private void colocarEtiquetas() {

		JLabel etiquetaBienvenida = new JLabel("Bienvenido a tu Conversor de Monedas", SwingConstants.CENTER); // creamos
																												// una
																												// etiqueta
		etiquetaBienvenida.setBounds(80, 10, 300, 20);
		etiquetaBienvenida.setHorizontalAlignment(SwingConstants.CENTER); // Establecemos la alineacion horizontal del
																			// texto
		etiquetaBienvenida.setForeground(Color.darkGray); // Establecemos el color de la letra
		etiquetaBienvenida.setFont(new Font("arial", Font.BOLD, 15)); // Establecemos la fuente del texto
		panel.add(etiquetaBienvenida); // agregamos la etiqueta al panel //

		JLabel etiquetaCantidadDinero = new JLabel("Ingresa la cantidad de dinero que deseas convertir",
				SwingConstants.CENTER); // creamos una etiqueta
		etiquetaCantidadDinero.setBounds(80, 40, 300, 20);
		etiquetaCantidadDinero.setHorizontalAlignment(SwingConstants.CENTER); // Establecemos la alineacion horizontal
																				// del
		// texto
		etiquetaCantidadDinero.setForeground(Color.darkGray); // Establecemos el color de la letra
		etiquetaCantidadDinero.setFont(new Font("arial", Font.ITALIC, 13)); // Establecemos la fuente del texto
		panel.add(etiquetaCantidadDinero);

		cantidadDinero.setBounds(80, 60, 300, 28);
		cantidadDinero.setEditable(true);// permite editar o no editar el area de texto
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		cantidadDinero
				.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(4, 10, 10, 10)));
		panel.add(cantidadDinero);

		JLabel elegirMoneda = new JLabel("Elige la moneda a la que deseas convertir tu dinero", SwingConstants.CENTER); // creamos
																														// una
																														// etiqueta
		elegirMoneda.setBounds(80, 100, 300, 20);
		elegirMoneda.setHorizontalAlignment(SwingConstants.CENTER); // Establecemos la alineacion horizontal del texto
		elegirMoneda.setForeground(Color.darkGray); // Establecemos el color de la letra
		elegirMoneda.setFont(new Font("arial", Font.ITALIC, 13)); // Establecemos la fuente del texto
		panel.add(elegirMoneda);

	}

	private void convirtiendoMonedas() { /// ComboBox

	}

	private void colocarBotones() { ///////// Creando botones

		String[] monedas = { Divisas.DOLAR_A_PESOS.name(), Divisas.PESOS_A_DOLAR.name(), Divisas.PESOS_A_LIBRAS.name(),
				Divisas.LIBRAS_A_PESOS.name(), Divisas.PESOS_A_YEN.name(), Divisas.YEN_A_PESOS.name(),
				Divisas.PESOS_A_WON.name(), Divisas.WON_A_PESOS.name(), Divisas.PESOS_A_EURO.name(),
				Divisas.EURO_A_PESOS.name() };

		JComboBox listaDesplegable = new JComboBox(monedas);
		listaDesplegable.setBounds(80, 120, 300, 20);

		panel.add(listaDesplegable); // Agregamos al panel
		// Boton 1 - Boton de texto
		JButton boton1 = new JButton();
		boton1.setText("Convertir"); // Establecemos un texto al boton
		boton1.setBounds(80, 190, 100, 20);
		boton1.setEnabled(true); // Habilitar o desabilitar el boton
		boton1.setForeground(Color.BLACK);
		boton1.setFont(new Font("cooper", Font.BOLD, 12));

		panel.add(boton1);

		// Agregando Evento de tipo ActionLitener
		ActionListener btnConvertir = new ActionListener() {

			@Override // Implementamos el metodo abtracto de ActionEventListener
			public void actionPerformed(ActionEvent e) { 
				// Este codigo se jecuta Al precionar el boton 
				String stringCantidadDinero = cantidadDinero.getText(); // Obteniendo texto del inputDinero
				boolean esEntero = Validaciones.validarString(stringCantidadDinero); 
				JFrame jFrameresultado = new JFrame(); 
				
				if(!esEntero) {
					JOptionPane.showMessageDialog(jFrameresultado, "El valor ingresado no es valido", "Mensaje", 3); 
					return ;
				}

				String valorMonedaSeleccionada = listaDesplegable.getSelectedItem().toString(); // Obtenemos el valor
																								// del combobox
				int cantidadDinero = Integer.parseInt(stringCantidadDinero);// Convirtiendo string a entero
				Divisas valorEnum = ConvertirStringAEnum.convertir(valorMonedaSeleccionada);
				double resultadoEnMonedasConvertidas = Conversor.convertir(valorEnum, cantidadDinero);
				String tipoMonedaResultado = valorMonedaSeleccionada
						.substring(valorMonedaSeleccionada.lastIndexOf("_") + 1);
				
				BigDecimal bd = new BigDecimal(resultadoEnMonedasConvertidas).setScale(2, RoundingMode.HALF_UP);
				String conFormato = "Tienes " + bd.toString() + " " + tipoMonedaResultado;
				JOptionPane.showMessageDialog(jFrameresultado, conFormato, "Mensaje", 3); 

				// String list = listaDesplegable.getSelectedItem().toString();
				// System.out.println(list);
				// JFrame jFrame = new JFrame();
				// JOptionPane.showMessageDialog(jFrame, "El valor ingresado no es valido :(",
				// "Error", 0); 
				
				  int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
			        
			        if (respuesta == JOptionPane.YES_OPTION) {
			            System.out.println("El usuario ha elegido continuar.");
			        } else {
			            System.out.println("El usuario ha elegido no continuar.");
			            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			            JOptionPane.showMessageDialog(null, "Fin del programa");
			            System.exit(1);
			        } 
			        
			    }
			
			//Fin logica BotonConvertir
		};

		boton1.addActionListener(btnConvertir); // Añade un oyente de accion, en cuanto den click que pase algo

		
		ActionListener btnCancelar = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { 
				JOptionPane.showMessageDialog(null, "Fin del programa");
				System.exit(1);
				
			} 
			
			
		};
		// Boton 2
		JButton botonCancelar = new JButton();
		botonCancelar.setText("Cancelar"); // Establecemos un texto al boton
		botonCancelar.setBounds(280, 190, 100, 20);
		botonCancelar.setEnabled(true); // Habilitar o desabilitar el boton
		botonCancelar.setForeground(Color.BLACK);
		botonCancelar.setFont(new Font("cooper", Font.BOLD, 12));
		botonCancelar.addActionListener(btnCancelar);
		panel.add(botonCancelar);  
		
		
		
	}

}
