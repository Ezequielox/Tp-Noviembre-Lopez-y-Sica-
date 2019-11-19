public abstract class Mascotas {

//Atributos
private String nombre;
private String fechaNacimiento;
private String duenio;
private Integer vecesAsistidasTotal;
private String tipoAnimal;
private ArrayList<String> fechasVeterinario = new ArrayList


//Constructores
public Mascotas(String nombreEquis, String fechaNacimientoEquis, String duenioEquis,Integer vecesAsistidasTotalEquis, String tipoAnimalEquis, ArrayList<String> fechasVeterinarioEquis){
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

private String gettipoAnimal(){
	return tipoAnimal;
}

private String getraza(){
	return raza;
}

private ArrayList<String> getfechasVeterinario(){
	return fechasVeterinario;
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

private void settipoAnimal(String tipoAnimalEquis){
	this.tipoAnimal = tipoAnimalEquis;
}

private void setvecesAsistidasTotal(){
	this.vecesAsistidasTotal = vecesAsistidasTotalEquis;
}

private void setfechasVeterinario(ArrayList<String> fechasVeterinarioEquis){
	this.fechasVeterinario = fechasVeterinarioEquis;
}

private void setraza(String razaEquis){
	this.raza = razaEquis;
}

public String cantidadVisitasMayor(String tipoAnimalEquis, Integer vecesAsistidasTotalEquis){
	private String ganador;
	private Integer contador1;
	private Integer contador2;
	private Integer contador3;

	if(tipoAnimalEquis = "Perro"){
		contador1 = contador1 + vecesAsistidasTotalEquis;
	}

	if(tipoAnimalEquis = "Gato"){
		contador2 = contador2 + vecesAsistidasTotalEquis;
	}

	if(tipoAnimalEquis = "Tortuga"){
		contador3 = contador3 + vecesAsistidasTotalEquis;
	}

	//
		if(contador1 > contador2 && contador1 > contador3){
			System.out.println("Los perros son los que mas veces ingresaron al veterinario");
			ganador = "Perros";
		}

		if(contador2 > contador1 && contador2 > contador3){
			System.out.println("Los gatos son los que mas veces ingresaron al veterinario");
			ganador = "Gatos";
		}

		if(contador3 > contador1 && contador3 > contador2){
			System.out.println("Las tortugas son las que mas veces ingresaron al veterinario");
			ganador = "Tortugas";
		}
}

public abstract cumplimientoVeterinario();

}