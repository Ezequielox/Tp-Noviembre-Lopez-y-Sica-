public abstract class Mascotas {

    //Atributos
    private String nombre;
    private String duenio;
    private ArrayList<Tipo> tipoDeMascota;

    //Contructores
    public class Mascotas(String nombreEquis, String duenioEquis) {
        this.nombre = nombreEquis;
        this.duenio = duenioEquis;
        this.tipoDeMascota = new ArrayList<Tipo>();
    }

    //Metodos
    public String getNombre(){
        return this.nombre;
    }

    public String getDuenio(){
        return this.duenio;
    }

    public ArrayList<Tipo> getTipo(){
        return this.tipoDeMascota;
    }

    public void setNombre(String nombreEquis){
        this.nombre = nombreEquis;
    }

    public void setDuenio(String duenioEquis){
        this.duenio = duenioEquis;
    }

    public String saludarMascota(){
        Scanner recibirNombreUs = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombreUsuario = recibirNombreUs.nextInt();

        Scanner recibirNombreMas = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la mascota: ");
        nombreMascota = recibirNombreMas.nextInt();

        if (Usuario.getNombre() == nombreUsuario) {
            if (Usuario.getTipoUsuario() == duenio) {
                if (getTipo() == Pajaro) {
                    Pajaro.esCantor();
                    System.out.println(Pajaro.getSaludo());
                    Pajaro.getAlegria() -= 1;
                } else if (getTipo() == Gato) {
                    Gato.getSaludo();
                    System.out.println(Gato.getSaludo());
                    Gato.getAlegria() -= 1;
                } else if (getTipo() == Perro) {
                    Perro.getSaludo();
                    System.out.println(Perro.getSaludo());
                    Perro.getAlegria() -= 1;
                } else if (getTipo() == Pez) {
                    vidas -= 1;
                    System.out.println("El pez ha perdido una vida ");
                }
            } else {
                if (getTipo() == Pajaro) {
                    System.out.println("Los pajaros no saludan a quienes no son su duenio");
                } else if (getTipo() == Gato) {
                    saludo = "MIAU";
                } else if (getTipo() == Perro) {
                    saludo = "GUAU";
                } else if (getTipo() == Pez) {
                    vidas = 0;
                    System.out.println("El pez ha muerto ");
                }
            }
        } else {
            System.out.println("No existe ningun usuario con ese nombre ");
        }

    }

    public void alimentarM(){
        if (getTipo() = "Pez"){
            Pez.getVidas() += 1;
        }
        else if (getTipo() = "Gato"){
            Gato.getAlegria() += 1;
        }
        else if (getTipo() = "Perro"){
            Perro.getAlegria() += 1;
        }
        else if (getTipo() = "Pajaro"){
            Pajaro.getAlegria() += 1;
        }

    }
}
