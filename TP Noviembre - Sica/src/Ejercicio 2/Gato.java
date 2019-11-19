public class Gato extends Mascota implements Racial {
    private String raza;

    public Gato(String nombre, Date nacimiento, String duenio, String raza) {
        super(nombre, nacimiento, duenio, 3);
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
        return "Gato";
    }
}