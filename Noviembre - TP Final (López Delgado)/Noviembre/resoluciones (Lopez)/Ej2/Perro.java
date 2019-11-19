public class Perro extends Mascotas{

//Atributos
private String raza;

//Constructores
public Perro(String nombreEquis, String fechaNacimientoEquis, String duenioEquis, Integer vecesAsistidasTotalEquis, String razaEquis,String tipoAnimalEquis, ArrayList<String> fechasVeterinarioEquis){
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

private ArrayList<String> getfechasVeterinario(){
	return fechasVeterinario;
}

private Integer getvecesAsistidasTotal(){
	return vecesAsistidasTotal;
}

private String getraza(){
	return raza;
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

private void setraza(String razaEquis){
	this.raza = razaEquis;
}

private void setvecesAsistidasTotal(){
	this.vecesAsistidasTotal = vecesAsistidasTotalEquis;
}

public String cumplimientoVeterinario(ArrayList<String> fechasVeterinarioEquis, String razaEquis){
	private Integer contador;
	private String nombreRaza;

	for(int i=0; i<4; i++){
		if(fechasVeterinario[i] != null){
			contador++;
		}
	}

	if(contador < 4){
		System.out.println("El perro no ha asistido al veterinario las veces necesarias");
		nombreRaza = razaEquis;
	}

	else{
		System.out.println("El perro ha asistido al veterinario frecuentemente");
	}
	return nombreRaza;
}

}