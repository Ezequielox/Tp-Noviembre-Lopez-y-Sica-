import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		HashMap<String,String> Mascotitas = new HashMap<String,String>();

		Mascotas masc1 = new Mascotas(null,null,null,null,null);

		Perro perro1 = new Perro("Chester",1,"Carlos","Perro","guau",0,1);
		Perro perro2 = new Perro("Marisol",1,"Estefania","Perro","guau",2,1);
		Perro perro3 = new Perro("Carlos",0,null,"Perro","guau",2,1);

		Perro gato1 = new Gato("Juana",1,"Juana","Gato","miau",0,1);
		Perro gato2 = new Gato("Maria",1,"Kiara","Gato","miau",2,1);
		Perro gato3 = new Gato("Rise",0,null,"Gato","miau",2,1);

		Perro pajarito1 = new Pajaro("TikTok",1,"Cringe","Pajaro","pio",0,1);
		Perro pajarito2 = new Pajaro("Piolin",1,"Abuela","Pajaro","pio",2,1);
		Perro pajarito3 = new Pajaro("Pikipek",0,null,"Pajaro","pio",2,1);

		Perro pescado1 = new Pescado("Tiburon",1,"Mario","Pescado","...",0,1);
		Perro pescado2 = new Pescado("Pinky",1,"Luigi","Pescado","...",2,1);
		Perro pescado3 = new Pescado("Ezequiel",0,null,"Pescado","...",2,1);


		Mascotitas.put("Chester","Carlos");
		Mascotitas.put("Matisol","Estefania");
		Mascotitas.put("Carlos","");
		Mascotitas.put("Juana","Juana");
		Mascotitas.put("Maria","Kiara");
		Mascotitas.put("Rise","");
		Mascotitas.put("TikTok","Cringe");
		Mascotitas.put("Piolin","Abuela");
		Mascotitas.put("Pikipek","");
		Mascotitas.put("Tiburon","Mario");
		Mascotitas.put("Pinky","Luigi");
		Mascotitas.put("Ezequiel","");



		System.out.println("Bienvenidos al sistema de las Mascotitas!!");
		System.out.println("Aqui podremos observar y modificar a las mascotas que hay registradas dentro del sistema");
		System.out.println("Opciones para realizar: Saludar(S) // Modificar (M) // Eliminar (E)");
		System.out.println("");
		System.out.println("");
		System.out.println("ingrese su opcion");
        Scanner opcion = new Scanner(System.in);
        String opcionRealizada = opcion.nextLine();
        System.out.println("ingresaste la opcion: "+ opcionRealizada);
        System.out.println("");

        if(opcionRealizada = "s" || opcionRealizada = "S"){
        	System.out.println("Ingrese el nombre de la mascota: ");
        	Scanner nombreM = new Scanner(System.in);
        	String nombreMasc = nombreM.nextLine();
        	System.out.println("Ingrese el nombre del dueño de la mascota: ");
        	Scanner nombreD = new Scanner(System.in);
        	String nombreDuen = nombreD.nextLine();

        	switch(Mascotitas.get(nombreMasc)){
        		
        		Case perro1.nombreDuenio:
        			
        		System.out.println(perro1.tipoDeSaludo());
        			break;

        		Case perro2.nombreDuenio:
        			
        		System.out.println(perro2.tipoDeSaludo());
        			break;

        		Case perro3.nombreDuenio:
        			
        		System.out.println(perro3.tipoDeSaludo());
        			break;

        		Case gato1.nombreDuenio:
        			
        		System.out.println(gato1.tipoDeSaludo());
        			break;

        		Case gato2.nombreDuenio:
        			
        		System.out.println(gato2.tipoDeSaludo());
        			break;

        		Case gato3.nombreDuenio:
        			
        		System.out.println(gato3.tipoDeSaludo());
        			break;

        		Case pajarito1.nombreDuenio:
        			
        		System.out.println(pajaro1.tipoDeSaludo());
        			break;

        		Case pajarito2.nombreDuenio:
        			
        		System.out.println(pajaro2.tipoDeSaludo());
        			break;

        		Case pajarito3.nombreDuenio:
        			
        		System.out.println(pajaro3.tipoDeSaludo());
        			break;

        		Case pescado1.nombreDuenio:
        		
        			pescado1.restarVidas();
        			System.out.println("El pescado no puede saludar, su tiempo de vida se acorta");
        			break;

        		Case pescado2.nombreDuenio:
        		
        			pescado2.restarVidas();
        			System.out.println("El pescado no puede saludar, su tiempo de vida se acorta");
        			break;

        		Case pescado3.nombreDuenio:
        		
        			pescado3.restarVidas();
        			System.out.println("El pescado no puede saludar, su tiempo de vida se acorta");
        			break;


        	}

        }


        if(opcionRealizada = "e" || opcionRealizada = "E"){
        	System.out.println("Ingrese el nombre de la mascota: ");
        	Scanner nombreM = new Scanner(System.in);
        	String nombreMasc = nombreM.nextLine();

        	Mascotitas.remove(nombreMasc);
        	System.out.println("Se ha eliminado la mascota de la lista exitosamente");


        }


        if(opcionRealizada = "m" || opcionRealizada = "M"){
        	System.out.println("Vuelva a ingresar los datos de la mascota: ");
        	System.out.println("");

        	
        	System.out.println("Ingrese el nombre de la mascota: ");
        	Scanner nombreM = new Scanner(System.in);
        	String nombreMasc = nombreM.nextLine();
        	System.out.println("Ingrese el nombre del dueño de la mascota: ");
        	Scanner nombreD = new Scanner(System.in);
        	String nombreDuen = nombreD.nextLine();

        	switch(Mascotitas.get(nombreMasc)){
        		
        		Case perro1.nombreDuenio:
        		Scanner nombre1 = new Scanner(System.in);
        		String nombre111 = nombre1.nextLine();
        		perro1.setNombre(nombre111);

        		Scanner nombreD1 = new Scanner(System.in);
        		String nombreDuenioNuevo = nombreD1.nextLine();
        		perro1.setnombreDuenio(nombreDuenioNuevo);

        		System.out.println("Datos Modificados");
        			break;

        		Case perro2.nombreDuenio:
        			
        		Scanner nombre2 = new Scanner(System.in);
        		String nombre222 = nombre2.nextLine();
        		perro2.setNombre(nombre111);

        		Scanner nombreD1 = new Scanner(System.in);
        		String nombreDuenioNuevo = nombreD1.nextLine();
        		perro2.setnombreDuenio(nombreDuenioNuevo);

        		System.out.println("Datos Modificados");
        			break;

        		Case perro3.nombreDuenio:
        			
        		Scanner nombre1 = new Scanner(System.in);
        		String nombre111 = nombre1.nextLine();
        		perro3.setNombre(nombre111);

        		Scanner nombreD1 = new Scanner(System.in);
        		String nombreDuenioNuevo = nombreD1.nextLine();
        		perro3.setnombreDuenio(nombreDuenioNuevo);

        		System.out.println("Datos Modificados");
        			break;

        		Case gato1.nombreDuenio:
        			
        		Scanner nombre1 = new Scanner(System.in);
        		String nombre111 = nombre1.nextLine();
        		gato1.setNombre(nombre111);

        		Scanner nombreD1 = new Scanner(System.in);
        		String nombreDuenioNuevo = nombreD1.nextLine();
        		gato1.setnombreDuenio(nombreDuenioNuevo);

        		System.out.println("Datos Modificados");
        			break;

        		Case gato2.nombreDuenio:
        			
        		Scanner nombre1 = new Scanner(System.in);
        		String nombre111 = nombre1.nextLine();
        		gato2.setNombre(nombre111);

        		Scanner nombreD1 = new Scanner(System.in);
        		String nombreDuenioNuevo = nombreD1.nextLine();
        		gato2.setnombreDuenio(nombreDuenioNuevo);

        		System.out.println("Datos Modificados");
        			break;

        		Case gato3.nombreDuenio:
        			
        		Scanner nombre1 = new Scanner(System.in);
        		String nombre111 = nombre1.nextLine();
        		gato3.setNombre(nombre111);

        		Scanner nombreD1 = new Scanner(System.in);
        		String nombreDuenioNuevo = nombreD1.nextLine();
        		gato3.setnombreDuenio(nombreDuenioNuevo);

        		System.out.println("Datos Modificados");
        			break;

        		Case pajarito1.nombreDuenio:
        			
        		Scanner nombre1 = new Scanner(System.in);
        		String nombre111 = nombre1.nextLine();
        		pajarito1.setNombre(nombre111);

        		Scanner nombreD1 = new Scanner(System.in);
        		String nombreDuenioNuevo = nombreD1.nextLine();
        		pajarito1.setnombreDuenio(nombreDuenioNuevo);

        		System.out.println("Datos Modificados");
        			break;

        		Case pajarito2.nombreDuenio:
        			
        		Scanner nombre1 = new Scanner(System.in);
        		String nombre111 = nombre1.nextLine();
        		pajarito2.setNombre(nombre111);

        		Scanner nombreD1 = new Scanner(System.in);
        		String nombreDuenioNuevo = nombreD1.nextLine();
        		pajarito2.setnombreDuenio(nombreDuenioNuevo);

        		System.out.println("Datos Modificados");
        			break;

        		Case pajarito3.nombreDuenio:
        			
        		Scanner nombre1 = new Scanner(System.in);
        		String nombre111 = nombre1.nextLine();
        		pajarito3.setNombre(nombre111);

        		Scanner nombreD1 = new Scanner(System.in);
        		String nombreDuenioNuevo = nombreD1.nextLine();
        		pajarito3.setnombreDuenio(nombreDuenioNuevo);

        		System.out.println("Datos Modificados");
        			break;

        		Case pescado1.nombreDuenio:
        		
        		Scanner nombre1 = new Scanner(System.in);
        		String nombre111 = nombre1.nextLine();
        		pescado1.setNombre(nombre111);

        		Scanner nombreD1 = new Scanner(System.in);
        		String nombreDuenioNuevo = nombreD1.nextLine();
        		pescado1.setnombreDuenio(nombreDuenioNuevo);

        		System.out.println("Datos Modificados");
        			break;

        		Case pescado2.nombreDuenio:
        		
        			Scanner nombre1 = new Scanner(System.in);
        		String nombre111 = nombre1.nextLine();
        		pescado2.setNombre(nombre111);

        		Scanner nombreD1 = new Scanner(System.in);
        		String nombreDuenioNuevo = nombreD1.nextLine();
        		pescado2.setnombreDuenio(nombreDuenioNuevo);

        		System.out.println("Datos Modificados");
        			break;

        		Case pescado3.nombreDuenio:
        		
        		Scanner nombre1 = new Scanner(System.in);
        		String nombre111 = nombre1.nextLine();
        		pescado3.setNombre(nombre111);

        		Scanner nombreD1 = new Scanner(System.in);
        		String nombreDuenioNuevo = nombreD1.nextLine();
        		pescado3.setnombreDuenio(nombreDuenioNuevo);

        		System.out.println("Datos Modificados");
        			break;


        	}
        }

	}
}