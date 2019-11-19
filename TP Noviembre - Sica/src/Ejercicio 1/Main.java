public static void main(String[] args){

        System.out.println("Que desea hacer?");
        System.out.println("1. Dar de Alta una Mascota");
        System.out.println("2. Dar de Baja una Mascota");
        System.out.println("3. Modificar una Mascota");
        System.out.println("4. Saludar una Mascota");
        System.out.println("5. Alimentar una Mascota");
        Scanner recibirOrden=new Scanner(System.in);
        Orden=recibirOrden.nextInt();

        switch(Orden){
        case 1:
        alta();
        case 2:
        baja();
        break;
        case 3:
        modificar();
        break;
        case 4:
        saludar();
        break;
        case 5:
        alimentar();
        break;
        }

}

public static void alta(){
        String nombre;
        String duenio;
        String tipoDeMascota;

            while(true){
            System.out.print("Nombre: ");
            Scanner recibirNombre=new Scanner(System.in);
            Nombre=recibirNombre.nextInt();
            Mascotas.nombre=Nombre;
            }

            while(true){
            System.out.print("Duenio: ");
            Scanner recibirDuenio=new Scanner(System.in);
            Duenio=recibirDuenio.nextInt();
            Mascotas.duenio=Duenio;
            }

            while(true){
            System.out.print("Tipo: ");
            Scanner recibirTipo=new Scanner(System.in);
            Tipo=recibirTipo.nextInt();
            Mascotas.tipoDeMascota=Tipo;
            }
        }

public static void baja() {
        String nombre;
        while(true) {
            System.out.print("Nombre: ");
            Scanner recibirNombre=new Scanner(System.in);
            Nombre=recibirNombre.nextInt();
            Mascotas.nombre=Nombre;
        }
        if(Mascotas.containsKey(nombre)) {
        Mascotas.remove(nombre);
        System.out.println("La mascota " + nombre + " fue bajada exitosamente!");
        } else {
        System.out.println("La mascota " + nombre + " no existe");
        }
}

public static void saludar() {
        Mascotas.saludarMascotas();
        }

public static void alimentar() {
        Mascotas.alimentarM();
        }
