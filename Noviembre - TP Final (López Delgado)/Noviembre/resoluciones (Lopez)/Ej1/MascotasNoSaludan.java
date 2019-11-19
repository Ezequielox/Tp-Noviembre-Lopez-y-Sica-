public abstract class MascotasNoSaludan extends Mascotas{
//Atributos

//Constructores
public Mascotas(String nombreEquis, Boolean duenioEquis, Srting nombreDuenioEquis, Boolean saludarEquis, String tipoMascotaEquis){
	super(nombreEquis, duenioEquis, nombreDuenioEquis, saludarEquis,tipoMascotaEquis);
	this.nombre = nombreEquis;
	this.duenio = duenioEquis;
	this.nombreDuenio = nombreDuenioEquis;
	this.saludar = saludarEquis;
	this.tipoMascota = tipoMascotaEquis;
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


public String gettipoMascota(){
	return tipoMascota;
}

public Boolean getsaludar(){
	return saludar;
}


public void settipoMascota(){
 this.tipoMascota = tipoMascotaEquis;
}

public void setnombre(){
 this.nombre = nombreEquis;
}

public void setduenio(){
 this.duenio = duenioEquis;
}

public void setnombreDuenio(){
 this.nombreDuenio = nombreDuenioEquis;
}

public void setsaludar(){
 this.saludar = saludarEquis;
}


}