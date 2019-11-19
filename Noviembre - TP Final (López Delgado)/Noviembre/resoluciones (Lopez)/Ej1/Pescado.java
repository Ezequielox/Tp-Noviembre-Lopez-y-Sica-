public class Pescado extends MascotasNoSaludan{

//Atributos

private Integer vidas;

//Constructores
public Pescado(String nombreEquis, Boolean duenioEquis, Srting nombreDuenioEquis, String tipoMascotaEquis, Boolean saludarEquis, Integer vidasEquis){
	super(nombreEquis,duenioEquis,saludarEquis,tipoMascotaEquis);
	this.nombre = nombreEquis;
	this.duenio = duenioEquis;
	this.nombreDuenio = nombreDuenioEquis;
	this.saludar = saludarEquis;
	this.tipoMascota = tipoMascotaEquis;
	this.vidas = vidasEquis;
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

public Integer getvidas(){
	return vidas;
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

public void setsaludar(){
 this.saludar = saludarEquis;
}

public void setvidas(Integer vidasEquis){
 this.vidas = vidasEquis;	
}

public void restarVidas(Integer vidasEquis, Boolean saludarEquis){

vidasEquis = 10;

	if(saludarEquis = true){
		if(duenioEquis = true){
			vidasEquis = vidasEquis - 1; 
		}
		else{
			vidasEquis = 0;
		}
	}
}

}