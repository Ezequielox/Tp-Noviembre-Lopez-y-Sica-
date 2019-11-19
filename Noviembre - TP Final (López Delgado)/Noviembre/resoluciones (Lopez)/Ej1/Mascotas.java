public abstract class Mascotas{

//Atributos
private String nombre;
private Boolean duenio;
private Srting nombreDuenio;
private String tipoMascota;
private Char opcion;


//Constructores
public Mascotas(String nombreEquis, Boolean duenioEquis, Srting nombreDuenioEquis, Boolean saludarEquis, String tipoMascotaEquis, Char opcionEquis){
	this.nombre = nombreEquis;
	this.duenio = duenioEquis;
	this.nombreDuenio = nombreDuenioEquis;
	this.saludar = saludarEquis;
	this.tipoMascota = tipoMascotaEquis;
	this.opcion = opcionEquis;
}


//Metodos
public String getnombre(){
	return nombre;
}

public Boolean getduenio(){
	return duenio;
}

public String getnombreDuenio(){
	return nombreDuenio;
}

public Boolean getsaludar(){
	return saludar;
}

public String gettipoMascota(){
	return tipoMascota;
}

public char getopcion(){
	return opcion;
}

public void settipoMascota(String tipoMascotaEquis){
 this.tipoMascota = tipoMascotaEquis;
}

public void setnombre(String nombreEquis){
 this.nombre = nombreEquis;
}

public void setduenio(Boolean duenioEquis){
 this.duenio = duenioEquis;
}

public void setnombreDuenio(String nombreDuenioEquis){
 this.nombreDuenio = nombreDuenioEquis;
}

public void setsaludar(Boolean saludarEquis){
 this.saludar = saludarEquis;
}

public void setopcion(Char opcionEquis){
 this.opcion = opcionEquis;
}
