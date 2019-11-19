public class Perro extends MascotasSaludan{

//Atributos

//Constructores
public Perro(String nombreEquis, Boolean duenioEquis, Srting nombreDuenioEquis, String tipoMascotaEquis, String saludoEquis, int puntosAlegriaEquis, Boolean saludarEquis){
	super(nombreEquis,duenioEquis,saludarEquis,tipoMascotaEquis,saludoEquis);
	this.nombre = nombreEquis;
	this.duenio = duenioEquis;
	this.nombreDuenio = nombreDuenioEquis;
	this.tipoMascota = tipoMascotaEquis;
	this.saludo = saludoEquis;
	this.puntosAlegria = puntosAlegriaEquis;
	this.saludar = saludarEquis;
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

public String getsaludo(){
	return saludo;
} 

public int getpuntosAlegria(){
	return puntosAlegria;
}

public Boolean getsaludar(){
	return saludar;
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

public void setsaludo(String saludoEquis){
	this.saludo = saludoEquis;
}

public void setpuntosAlegria(Integer puntosAlegriaEquis){
	this.puntosAlegria = puntosAlegriaEquis;
}

public void setsaludar(String saludarEquis){
	this.saludar = saludarEquis;
}

public String tipoDeSaludo(Boolean duenioEquis, String tipoMascotaEquis, Boolean saludarEquis){
	private Boolean valorDueño = duenioEquis;
	private String tipoDeMascota = tipoMascotaEquis;
	private String saludito;

		if(saludarEquis = true){
			if(valorDueño = true){
				switch(tipoDeMascota):

					case "Perro":
						saludito = "guau";
						break;		
				
					case "Pajaro":
						saludito = "pio";
						break;

					case "Gato":
						saludito = "miau";
						break;				
			}

			else{
				switch(tipoDeMascota):

					case "Perro":
						saludito = "GUAU!";
						break;		
				
					case "Pajaro":
						saludito = "...";
						break;

					case "Gato":
						saludito = "MIAU!";
						break;				
			}
		}
	return saludito;
}


public void alimentarMascota(Integer puntosAlegriaEquis){
	puntosAlegriaEquis = puntosAlegriaEquis + 1;
}


public void llamadoAliementacion(Integer puntosAlegriaEquis){
	
	for(int i=0; i=puntosAlegriaEquis; i++){
		System.out.println(tipoDeSaludo());
	}

	puntosAlegriaEquis = puntosAlegriaEquis - 1;
}

}