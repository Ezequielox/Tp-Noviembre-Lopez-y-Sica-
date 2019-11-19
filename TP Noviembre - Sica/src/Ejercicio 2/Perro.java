public class Perro extends Mascota implements Raza {
    private String raza;

    public Perro(String nombre, Date nacimiento, String duenio, String raza) {
        super(nombre, nacimiento, duenio, 6);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String getTipo() {
        return "Perro";
    }
}