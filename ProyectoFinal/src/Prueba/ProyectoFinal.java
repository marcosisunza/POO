package Prueba;

import controlador.Controlador;
import modelo.PersonaModConectar;
import vista.VistaProyecto;

//clase en donde se inicializa modelo,vista y controlador y se ejecutan
public class ProyectoFinal {
	public static void main(String[] args) {
		PersonaModConectar pc = new PersonaModConectar(); //instancia para conectar BD  (Modelo)
	     VistaProyecto vp = new VistaProyecto();          //instancia para la ventana   (Vista)
		 Controlador cp = new Controlador(vp, pc);         //instancia de controlador 
		 vp.setVisible(true);                              //se visibiliza la ventana
		}
}
