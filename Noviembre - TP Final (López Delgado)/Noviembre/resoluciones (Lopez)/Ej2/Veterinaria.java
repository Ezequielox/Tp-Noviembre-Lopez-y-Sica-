public class Veterinaria {

//Atributos
private ArrayList<Mascotas> mascotitas2;

//Constructores
public Mascotas(ArrayList<Mascotas> mascotitas2Equis){
this.mascotitas2 = mascotitas2Equis
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

public abstract cumplimientoVeterinario();

}