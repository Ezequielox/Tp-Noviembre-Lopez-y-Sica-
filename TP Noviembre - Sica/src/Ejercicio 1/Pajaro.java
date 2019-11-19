public create class Pajaro extends Mascotas {

    //Atributos
    private boolean cantor;
    private int alegria;
    private String saludo;

    //Constructores
    public class Pajaro(boolean cantorEquis, int alegriaEquis, String saludo){
        super(nombre, duenio)
        this.cantor = cantorEquis;
        this.alegria = alegriaEquis;
        this.saludo = "pio";
    }

    //Metodos
    public boolean getCantor() {
        return cantor;
    }

    public int getAlegria() { return  this.alegria; }

    public String getSaludo(){
        return this.saludo;
    }

    public void setCantor(boolean cantorEquis) {
        this.cantor = cantorEquis;
    }

    public void setAlegria(int alegriaEquis) { this.alegria = alegriaEquis; }

    public boolean esCantor(){
        if (cantor == true) {
            saludo = "cuack";
        }
        else {
            saludo = "pio";
        }
    }

}