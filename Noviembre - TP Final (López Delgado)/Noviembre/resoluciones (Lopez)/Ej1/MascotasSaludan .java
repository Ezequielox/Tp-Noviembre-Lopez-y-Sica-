public abstract class MascotasSaludan extends Mascotas{

//Atributos
private String saludo;
private Boolean saludar;
private int puntosAlegria;

//Constructores
public MascotasSaludan(String nombreEquis, Boolean duenioEquis, Srting nombreDuenioEquis, String tipoMascotaEquis, String saludoEquis, int puntosAlegriaEquis, Boolean saludarEquis){
	super(nombreEquis,duenioEquis,nombreDuenioEquis,tipoMascotaEquis);
	this.saludo = saludoEquis;
	this.puntosAlegria = puntosAlegriaEquis;
	this.saludar = saludarEquis;
}

//Metodos
public String getsaludo(){
	return saludo;
} 

public int getpuntosAlegria(){
	return puntosAlegria;
}

public Boolean getsaludar(){
	return saludar;
}

public String getnombre(){
	return nombre;
}
public Boolean getduenio(){
	return duenio;
}

public String getNombreDuenio(){
	return nombreDuenio;
}

public String getTipoMascota(){
	return tipoMascota;
}

public void setnombre(String nombreEquis){
	this.nombre = nombreEquis;
}

public void setduenio(Boolean duenioEquis){
	this.duenio = duenioEquis;
}

public void setnombreDuenio(String nombreDuenioEquis ){
	this.nombreDuenio = nombreDuenioEquis;
}

public void setTipoMascota(String tipoMascotaEquis){
	this.tipoMascota = tipoMascotaEquis;
}

public void setsaludo(String saludoEquis){
	this.saludo = saludoEquis;
}

public void setpuntosAlegria(Integer puntosAlegriaEquis){
	this.puntosAlegria = puntosAlegriaEquis;
}

public void setsaludar(Boolean saludarEquis){
	this.saludar = saludarEquis;
}



public abstract Boolean tipoDeSaludo();
public abstract void alimentarMascota();
public abstract void llamadoAlimentacion();

}
