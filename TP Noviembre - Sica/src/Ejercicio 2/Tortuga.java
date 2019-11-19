public class Tortuga extends Mascota {
    public Tortuga(String nombre, Date nacimiento, String duenio) {
        super(nombre, nacimiento, duenio, 1);
    }

    @Override
    public String getTipo() {
        return "Tortuga";
    }
}