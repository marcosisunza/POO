package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.*;
import org.jfree.data.category.DefaultCategoryDataset;

public class VistaProyecto extends JFrame {
	public  JButton boton;
	public JPanel cont;
	public JPanel pan;
	public JComboBox combo;
	public JPanel p2;
	public JPanel p3;
	public JPanel p4;
	public ButtonGroup checkBoxGroup;
	public JCheckBox checkBox1;
	public JCheckBox checkBox2;
	public JCheckBox checkBox3;
	public JCheckBox checkBox4;
	public JCheckBox checkBox5;
	public JCheckBox checkBox6;
	public JCheckBox checkBox7;
	public ButtonGroup checkBoxGroup2;
	public VistaProyecto(){
		super("Casos de COVID");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1400,1400);
		this.setLayout(new GridLayout(1,2));
		
		 pan=new JPanel(); 
		  pan.setLayout(new GridLayout(4,1));
		  Color col=new Color(234, 234, 232 );
		  Color col2=new Color(132, 245, 71 );
		  pan.setBackground(col);
			 
			 JPanel p1=new JPanel();
				 JLabel texto=new JLabel("Selecciona una entidad",SwingConstants.CENTER);
				 texto.setFont(new Font("arial", Font.PLAIN, 15));
				 p1.setLayout(new GridLayout(2,1));
				 combo = new JComboBox();
				 combo.addItem("Aguascalientes");
				 combo.addItem("Baja California");
				 combo.addItem("Baja California Sur");
				 combo.addItem("Campeche");
				 combo.addItem("Coahuila");
				 combo.addItem("Colima");
				 combo.addItem("Chiapas");
				 combo.addItem("Chihuahua");
				 combo.addItem("Ciudad de Mexico");
				 combo.addItem("Durango");
				 combo.addItem("Guanajuato");
				 combo.addItem("Guerrero");
				 combo.addItem("Hidalgo");
				 combo.addItem("Jalisco");
				 combo.addItem("Estado de México");
				 combo.addItem("Michoacán de Ocampo");
				 combo.addItem("Morelos");
				 combo.addItem("Nayarit");
				 combo.addItem("Nuevo León");
				 combo.addItem("Oaxaca");
				 combo.addItem("Puebla");
				 combo.addItem("Querétaro");
				 combo.addItem("Quintana Roo");
				 combo.addItem("San Luis Potosí");
				 combo.addItem("Sinaloa");
				 combo.addItem("Sonora");
				 combo.addItem("Tabasco");
				 combo.addItem("Tamaulipas");
				 combo.addItem("Tlaxcala");
				 combo.addItem("Veracruz");
				 combo.addItem("Yucatán");
				 combo.addItem("Zacatecas");
				 	p1.add(texto);
				 	p1.add(combo);
			pan.add(p1);
			 
			p2=new JPanel();
				 p2.setLayout(new GridLayout(2,1));
				 JLabel texto1=new JLabel("Selecciona un género",SwingConstants.CENTER);
				 texto1.setFont(new Font("arial", Font.PLAIN, 15));
				 p2.add(texto1);
				 JPanel p=new JPanel(new GridLayout(1,2));
				 checkBox1 = new JCheckBox("Hombre"); 
				 checkBox1.setOpaque(true);
				 Color col1=new Color(114, 222, 248 );
				 checkBox1.setBackground(col1);
				 Color col21=new Color(243, 202, 234 );
				 checkBox2 = new JCheckBox("Mujer");  
				 checkBox2.setOpaque(true);
				 checkBox2.setBackground(col21);
				  checkBoxGroup = new ButtonGroup();
				  checkBoxGroup.add(checkBox1);
			      checkBoxGroup.add(checkBox2);
			      	p.add(checkBox1);
			      	p.add(checkBox2);
			      p2.add(p);	     
			pan.add(p2);
			
			
			
			p3=new JPanel();
			 	p3.setLayout(new GridLayout(2,1));
			 	JLabel texto11=new JLabel("Selecciona un padecimiento",SwingConstants.CENTER);
			 	texto11.setFont(new Font("arial", Font.PLAIN, 15));
				p3.add(texto11);
				JPanel p11=new JPanel();
				p11.setLayout(new GridLayout(3,2));
			 	Color col11=new Color(234, 234, 232 );
			 	p3.setBackground(col11);
			 	checkBox3 = new JCheckBox("EPOC");  
			 	checkBox4 = new JCheckBox("ASMA");  
			 	checkBox5 = new JCheckBox("HIPERTENSIÓN");  
			 	checkBox6 = new JCheckBox("OBESIDAD");  
			 	checkBox7 = new JCheckBox("EDAD");  
			 	checkBoxGroup2 = new ButtonGroup();
			 	checkBoxGroup2.add(checkBox3);
			 	checkBoxGroup2.add(checkBox4);
			 	checkBoxGroup2.add(checkBox5);
			 	checkBoxGroup2.add(checkBox6);
			 	checkBoxGroup2.add(checkBox7);
			 		p11.add(checkBox3);
			 		p11.add(checkBox4);
			 		p11.add(checkBox5);
			 		p11.add(checkBox6);
			 		p11.add(checkBox7);
			 	p3.add(p11);
			 pan.add(p3);
			
			 
			 
			p4=new JPanel();
			 p4.setOpaque(true);
			 p4.setBackground(col11);
			 p4.setLayout(new BorderLayout());
			  boton=new JButton("Mostrar gráfica");
			 boton.setPreferredSize(new Dimension(100,100));
			 boton.setBackground(col21);
			 boton.setOpaque(true);
			 boton.setFont(new Font("Arial", Font.PLAIN, 15));
			 p4.add(boton,BorderLayout.SOUTH);
			 pan.add(p4);
			 
		
		cont= new JPanel();
	    cont.setLayout(new BorderLayout());
	    
	    this.add(pan);
	    this.add(cont);
	}
	
	
	public void Grafica(int data, String enfermedad, String estado, String sexo) //Función para graficar los datos de obesidad
    {
    	
    	DefaultCategoryDataset Datos = new DefaultCategoryDataset();
    	String r1 = "Número de personas con covid";
    	String sex;
    	if(sexo.equals("Hombre"))
    	{
    		sex ="Hombres";
    	}
    	else
    	{
    		 sex="Mujeres";
    	}
    		
    	Datos.setValue(data, r1, "");
    	 //JFreeChart Grafica = ChartFactory.createBarChart("Personas con COVID", "", "Número de personas", Datos, PlotOrientation.VERTICAL,false, false, false);
    	 JFreeChart Grafica2 = ChartFactory.createBarChart3D(sex+" con COVID y "+enfermedad+" en "+estado, "Positivo a COVID", "Número de personas", Datos, PlotOrientation.VERTICAL,false, false, false);
    	ChartFrame fr = new ChartFrame("Ejemplo",Grafica2);
    	fr.pack();
    	ChartPanel cp = new ChartPanel(Grafica2);
    	cont.add(cp);
    	cp.setBounds(30,120,600,400);	
    }
	
	public void GraficaEdad(int r1,int r2, int r3, int r4,int r5, int r6, String estado, String sexo) //Función para graficar los datos de obesidad
    {
    	
    	DefaultCategoryDataset Datos = new DefaultCategoryDataset();
    	String sex;
    	if(sexo.equals("Hombre"))
    	{
    		sex ="Hombres";
    	}
    	else
    	{
    		 sex="Mujeres";
    	}
    	
    	Datos.setValue(r1, "1", "20-30");
    	Datos.setValue(r2, "2", "30-40");
    	Datos.setValue(r3, "3", "40-50");
    	Datos.setValue(r4, "4", "50-60");
    	Datos.setValue(r5, "5", "60-70");
    	Datos.setValue(r6, "6", "70-100");
    	
    	 JFreeChart Grafica2 = ChartFactory.createBarChart3D(sex+" con COVID en "+estado, "Rango de edades", "Número de personas", Datos, PlotOrientation.VERTICAL,false, false, false);
    	ChartFrame fr = new ChartFrame("Ejemplo",Grafica2);
    	fr.pack();
    	ChartPanel cp = new ChartPanel(Grafica2);
    	cont.add(cp);
    	cp.setBounds(30,120,600,400);	
    }
}
