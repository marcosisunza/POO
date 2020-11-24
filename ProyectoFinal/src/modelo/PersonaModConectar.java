package modelo;
//package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class PersonaModConectar {
Conexion conectarBaseD;
	
	public PersonaModConectar(){
		
		conectarBaseD = new Conexion();
}

	public ArrayList<PersonaModelo> listaPersonas(){
		
		ArrayList<PersonaModelo> listaPersonas = new ArrayList<PersonaModelo>();
		PersonaModelo persona;
		
		try{
			// recupera la conexion
			Connection conn = conectarBaseD.getConnection();
			// depende del nombre de su tabla. 
			PreparedStatement prest = conn.prepareStatement("select * from bdproyectofinal");
            ResultSet rs = prest.executeQuery();
            
            
            while(rs.next()){
            	// Lee cada uno de las columnas de la tabla
            	persona = new PersonaModelo();
            	persona.setId(rs.getInt(1));
            	persona.setEdad(rs.getInt(5));
            	persona.setSexo(rs.getInt(2));
            	persona.setEntidadRes(rs.getInt(3));
            	persona.setEpoc(rs.getInt(6));
            	persona.setAsma(rs.getInt(7));
            	persona.setObesidad(rs.getInt(9));
            	persona.setHipertencion(rs.getInt(8));
            	persona.setNeumonia(rs.getInt(4));
            	listaPersonas.add(persona);
            		
            }
            
		
		}catch(Exception ex){
			
			ex.printStackTrace () ;	  
			System.out.println(" SQLException : " + ex.getMessage() );	
			
		}
		return listaPersonas;
	}
}
