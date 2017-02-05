package com.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.controlador.LimitadorCaracteres;
import com.controlador.ManejadorPersona;

public class JPersona extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField textField;
	public JButton btnEntrar;
	private ManejadorPersona mp;
	/**
	 * Create the panel.
	 */
	public JPersona() {
		mp = new ManejadorPersona(this);
		setLayout(null);
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setFont(new Font("Arial", Font.BOLD, 12));
		lblBienvenido.setToolTipText("Bienvenido a la Agenda, pasala bien.");
		lblBienvenido.setBounds(181, 12, 69, 34);
		add(lblBienvenido);
		
		textField = new JTextField();
		textField.setBounds(136, 58, 246, 19);
		textField.addKeyListener(mp);
		//limita los caracteres en este caso solo aceptar letras
		textField.setDocument(new LimitadorCaracteres(textField, 60, 1));
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setLabelFor(textField);
		lblNombre.setBounds(25, 60, 53, 15);
		add(lblNombre);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(191, 129, 100, 25);
		
		btnEntrar.addActionListener(mp);
		add(btnEntrar);
		
		
	}
}
