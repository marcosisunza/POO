package modelo;

//se crea la clase con las variables a leer y utilizar de la base de datos
public class PersonaModelo {
	int sexo;
	int entidadRes;
	int neumonia;
	int edad;
	int epoc;
	int asma;
	int hipertencion; 
	int obesidad;
	int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public int getEntidadRes() {
		return entidadRes;
	}
	public void setEntidadRes(int entidadRes) {
		this.entidadRes = entidadRes;
	}
	public int getNeumonia() {
		return neumonia;
	}
	public void setNeumonia(int neumonia) {
		this.neumonia = neumonia;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEpoc() {
		return epoc;
	}
	public void setEpoc(int epoc) {
		this.epoc = epoc;
	}
	public int getAsma() {
		return asma;
	}
	public void setAsma(int asma) {
		this.asma = asma;
	}
	public int getHipertencion() {
		return hipertencion;
	}
	public void setHipertencion(int hipertencion) {
		this.hipertencion = hipertencion;
	}
	public int getObesidad() {
		return obesidad;
	}
	public void setObesidad(int obesidad) {
		this.obesidad = obesidad;
	}
	
	public PersonaModelo(){
		id=0;
		sexo=0;
		edad=0;
		entidadRes=0;
		neumonia=0;
		edad=0;
		epoc=0;
		asma=0;
		hipertencion=0;
		obesidad=0;
	}
}
