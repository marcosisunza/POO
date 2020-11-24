package Prueba;

import controlador.Controlador;
import modelo.PersonaModConectar;
import vista.VistaProyecto;

public class ProyectoFinal {
	public static void main(String[] args) {
		PersonaModConectar pc = new PersonaModConectar(); 
	     VistaProyecto vp = new VistaProyecto();  
		 Controlador cp = new Controlador(vp, pc);
		 vp.setVisible(true);
		}
}
