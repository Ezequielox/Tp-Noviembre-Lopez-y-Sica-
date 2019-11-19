public class Tortuga extends Mascotas{

//Atributos


//Constructores
public Tortuga(String nombreEquis, String fechaNacimientoEquis, String duenioEquis, Integer vecesAsistidasTotalEquis, String tipoAnimalEquis, ArrayList<String> fechasVeterinarioEquis){
super(nombreEquis,fechaNacimientoEquis,duenioEquis);
this.nombre = nombreEquis;
this.fechaNacimiento = fechaNacimientoEquis;
this.duenio = duenioEquis;
this.vecesAsistidasTotal = vecesAsistidasTotalEquis;
this.tipoAnimal = tipoAnimalEquis;
this.fechasVeterinario = fechasVeterinarioEquis;
}

//Metodos

private String getnombre(){
	return nombre;
}

private String getfechaNacimiento(){
	return fechaNacimiento;
}

private String getduenio(){
	return duenio;
}

private Integer getvecesAsistidasTotal(){
	return vecesAsistidasTotal;
}

private ArrayList<String> getfechasVeterinario(){
	return fechasVeterinario;
}

private String gettipoAnimal(){
	return tipoAnimal;
}

private void setnombre(String nombreEquis){
	this.nombre = nombreEquis;
}

private void setfechaNacimiento(String fechaNacimientoEquis){
	this.fechaNacimiento = fechaNacimientoEquis;
}

private void setduenio(String duenioEquis){
	this.duenio = duenioEquis;
}

private void setfechasVeterinario(ArrayList<String> fechasVeterinarioEquis){
	this.fechasVeterinario = fechasVeterinarioEquis;
}

private void setvecesAsistidasTotal(){
	this.vecesAsistidasTotal = vecesAsistidasTotalEquis;
}

public void cumplimientoVeterinario(ArrayList<String> fechasVeterinarioEquis){
	private Integer contador;
	for(int i=0; i<1; i++){
		if(fechasVeterinario[i] != null){
			contador++;
		}
	}

	if(contador < 1){
		System.out.println("La tortuga no ha asistido al veterinario las veces necesarias");
	}

	else{
		System.out.println("La tortuga ha asistido al veterinario frecuentemente");
	}
}

}