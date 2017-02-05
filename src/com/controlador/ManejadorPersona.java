package com.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import com.modelo.Persona;
import com.vista.JPersona;

public class ManejadorPersona implements ActionListener, KeyListener {
	private JPersona jpersona;
	private Persona persona;
	
	boolean espacio = false; 
	
	public ManejadorPersona(JPersona jpersona){
		this.jpersona = jpersona;
		persona = new Persona();
	}
	public void keyPressed(KeyEvent e) {
		int tecla = e.getKeyCode();
		if(tecla == KeyEvent.VK_SPACE)
			espacio = true;
	}
	
	public void actionPerformed(ActionEvent e) {
	//probando los metodos set y get, se limpia el texField
		if(e.getSource().equals(jpersona.btnEntrar)){
			persona.setNombre(jpersona.textField.getText());
			if(!persona.getNombre().equals("") && !espacio){
			JOptionPane.showMessageDialog(null, persona.getNombre() +" Has entrado felicidades");
			}else{
				JOptionPane.showMessageDialog(null, "Sin espacios por favor");
				espacio = false;
			}
			jpersona.textField.setText("");
		}
	}


	

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
