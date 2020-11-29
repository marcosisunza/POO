package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import modelo.PersonaModConectar;
import modelo.PersonaModelo;
import vista.VistaProyecto;



//Implementacion del controlador 
public class Controlador implements ActionListener{
	
	VistaProyecto vistPer;
	PersonaModConectar personaConecta;
	
	public Controlador(VistaProyecto vistPer,PersonaModConectar personaConecta){
		this.vistPer = vistPer;
		this.personaConecta = personaConecta;
		vistPer.boton.addActionListener(this);
		vistPer.checkBox1.setActionCommand("Hombre");
		vistPer.checkBox2.setActionCommand("Mujer");
		vistPer.checkBox3.setActionCommand("EPOC");
		vistPer.checkBox4.setActionCommand("ASMA");
		vistPer.checkBox5.setActionCommand("HIPERTENSIÓN");
		vistPer.checkBox6.setActionCommand("OBESIDAD");
		vistPer.checkBox7.setActionCommand("EDAD");
	}
   public void actionPerformed(ActionEvent e){	
	   if(e.getSource() == vistPer.boton){
		   try {
			   int estado = vistPer.combo.getSelectedIndex();  //Se identifica que estado de la lista que fue seleccionado
			   String edo=(String) vistPer.combo.getSelectedItem();
			   int sexoAux = 0;
			   int estadoAux=estado+1;
			   int enfermedadAux=0;
			   int bandera=0;
			   int rango1=0;
			   int rango2=0;
			   int rango3=0;
			   int rango4=0;
			   int rango5=0;
			   int rango6=0;
			  System.out.println("estado: "+estado);
			  String sexo=vistPer.checkBoxGroup.getSelection().getActionCommand(); //Se identifica el sexo que fue seleccionado
			  System.out.println(sexo);
			  String enfermedad=vistPer.checkBoxGroup2.getSelection().getActionCommand(); //Se identifica la enfermedad que fue seleccionada
			  System.out.println(enfermedad);
			  //Se castea el valor del sexo de acuerdo al de la base de datos para obtenerl la consulta correctamente
			  if(sexo.equals("Hombre"))
			   {
				   sexoAux = 2;
			   }
			   else if(sexo.equals("Mujer"))
			   {
				   sexoAux = 1;
			   }   
			 System.out.println(sexoAux);
			 System.out.println(personaConecta.listaPersonas().size());
			//Este controlador recorre la lista de datos para obtener todos los registros que cumplan con los requisitos
			  	for(PersonaModelo aux:personaConecta.listaPersonas())
			   {
				   if(enfermedad.equals("EPOC"))
				   {
					   if((aux.getSexo()==sexoAux)&&(aux.getEntidadRes()==estadoAux)&&(aux.getEpoc()==1))//se compara cada objeto de tipo personaModelo con el criterio seleccionado por el susuario
					   {
						   bandera=bandera+1;//bandera es el contador que tendrá el valor total de registros que coincidan con la selección hecha por el usuario
					   }
				   }
				   if(enfermedad.equals("ASMA"))
				   {
					   if((aux.getSexo()==sexoAux)&&(aux.getEntidadRes()==estadoAux)&&(aux.getAsma()==1))
					   {
						   bandera=bandera+1;
					   }
				   }
				   if(enfermedad.equals("HIPERTENSIÓN"))
				   {
					   if((aux.getSexo()==sexoAux)&&(aux.getEntidadRes()==estadoAux)&&(aux.getHipertencion()==1))
					   {
						   bandera=bandera+1;
					   }
				   }
				   if(enfermedad.equals("OBESIDAD"))
				   {
					   if((aux.getSexo()==sexoAux)&&(aux.getEntidadRes()==estadoAux)&&(aux.getObesidad()==1))
					   {
						   bandera=bandera+1;
					   }
				   }
				   //en caso de que la selección haya sido edad se entra en las siguientes condiciones
				   if(enfermedad.equals("EDAD"))
				   {
					   if((aux.getSexo()==sexoAux)&&(aux.getEntidadRes()==estadoAux)&&(aux.getEdad()>10)&&(aux.getEdad()<=30))
					   {
						   rango1=rango1+1; //rango1 guarda el número de personas que se encuentren entre 10 y 30 años de edad
					   }
					   if((aux.getSexo()==sexoAux)&&(aux.getEntidadRes()==estadoAux)&&(aux.getEdad()>30)&&(aux.getEdad()<=40))
					   {
						   rango2=rango2+1; //rango2 guarda el número de personas que se encuentren entre 30 y 40 años de edad
					   }
					   if((aux.getSexo()==sexoAux)&&(aux.getEntidadRes()==estadoAux)&&(aux.getEdad()>40)&&(aux.getEdad()<=50))
					   {
						   rango3=rango3+1; //rango3 guarda el número de personas que se encuentren entre 40 y 50 años de edad
					   }
					   if((aux.getSexo()==sexoAux)&&(aux.getEntidadRes()==estadoAux)&&(aux.getEdad()>50)&&(aux.getEdad()<=60))
					   {
						   rango4=rango4+1; //rango4 guarda el número de personas que se encuentren entre 50 y 60 años de edad
					   }
					   if((aux.getSexo()==sexoAux)&&(aux.getEntidadRes()==estadoAux)&&(aux.getEdad()>60)&&(aux.getEdad()<=70))
					   {
						   rango5=rango5+1; //rango5 guarda el número de personas que se encuentren entre 60 y 70 años de edad
					   }
					   if((aux.getSexo()==sexoAux)&&(aux.getEntidadRes()==estadoAux)&&(aux.getEdad()>70)&&(aux.getEdad()<=100))
					   {
						   rango6=rango6+1;//rango6 guarda el número de personas que se encuentren entre 70 y 100 años de edad
					   }
				   }
			   }
			  	//de acuerdo a si el usuario seleccionó edad o alguna enfermedad se llama la función que imprime la grafica correspondiente
			  	 if(!enfermedad.equals("EDAD"))
			  	 {
			  		 System.out.println("El total de enfermos es "+bandera);
				    	vistPer.Grafica(bandera,enfermedad,edo,sexo);
			  	 }
			  	 else 
			  	 {
			  		 vistPer.GraficaEdad(rango1, rango2, rango3, rango4,rango5,rango6,edo,sexo);
			  	 }
			  
		   }
		   catch(Exception e2) {
		JOptionPane.showMessageDialog(null, "Ingrese los datos correctamente");
	}
   }
}
   }