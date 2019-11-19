abstract public class Mascota {

    //Atributos
    private String nombre;
    private Date nacimiento;
    private String duenio;
    private int veces;
    private Map<Integer,ArrayList<Date>> controles = new HashMap<Integer,ArrayList<Date>>();

    //Constructores
    public Mascota(String nombre, Date nacimiento, String duenio, int veces) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.duenio = duenio;
        this.veces = veces;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getDuenio() {
        return duenio;
    }

    public int getVeces() {
        return veces;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public void setVeces(int veces) {
        this.veces = veces;
    }

    public String getTipo() {
        return null;
    }

    public boolean controlesNecesarios(int year) {
        List<Date> dates = controles.get(year);
        if(dates == null) return false;
        return dates.size() >= this.veces;
    }

    public boolean controlesNecesariosParaAsistenciaPerfecta() {
        List<Date> dates = controles.get(Calendar.getInstance().get(Calendar.YEAR));
        if(dates == null) return false;
        return dates.size() >= this.veces;
    }

    public boolean asistenciaPerfecta() {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(nacimiento);
        for(int i = calendario.get(Calendar.YEAR); i < Calendar.getInstance().get(Calendar.YEAR); i++) {
            if(!controlesNecesariosParaAsistenciaPerfecta(i)) {
                return false;
            }
        }
        return true;
    }

}