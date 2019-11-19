public class Gato extends Mascotas{

//Atributos
private String raza;

//Constructores
public Gato(String nombreEquis, String fechaNacimientoEquis, String duenioEquis, Integer vecesAsistidasTotalEquis, String razaEquis, String tipoAnimalEquis, ArrayList<String> fechasVeterinarioEquis){
super(nombreEquis,fechaNacimientoEquis,duenioEquis);
this.nombre = nombreEquis;
this.fechaNacimiento = fechaNacimientoEquis;
this.duenio = duenioEquis;
this.vecesAsistidasTotal = vecesAsistidasTotalEquis;
this.raza = razaEquis;
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

private String getraza(){
	return raza;
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

private void setraza(String razaEquis){
	this.raza = razaEquis;
}

private void setvecesAsistidasTotal(){
	this.vecesAsistidasTotal = vecesAsistidasTotalEquis;
}

private void setraza(String razaEquis){
	this.raza = razaEquis;
}

public void cumplimientoVeterinario(ArrayList<String> fechasVeterinarioEquis){
	private Integer contador;
	for(int i=0; i<2; i++){
		if(fechasVeterinario[i] != null){
			contador++;
		}
	}

	if(contador < 2){
		System.out.println("El gatito no ha asistido al veterinario las veces necesarias");
	}

	else{
		System.out.println("El gatito ha asistido al veterinario frecuentemente");
	}

}

}