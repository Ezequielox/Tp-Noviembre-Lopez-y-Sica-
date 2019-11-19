public create class Usuario {

    //Atributos
    private String nombre;
    private String apellido;
    private int dni;
    private String tipoUsuario;

    //Contructores
    public class Usuario(String nombreEquis, String apellidoEquis, int dniEquis, String tipoUsuarioEquis) {
        this.nombre = nombreEquis;
        this.apellido = apellidoEquis;
        this.dni = dniEquis;
        this.tipoUsuario = tipoUsuarioEquis;
    }

    //Metodos
    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getDni(){
        return this.dni;
    }

    public String getTipoUsuario(){
        return this.tipoUsuario;
    }

    public void setNombre(String nombreEquis){
        this.nombre = nombreEquis;
    }

    public void setApellido(String apellidoEquis){
        this.apellido = apellidoEquis;
    }

    public void setDni(String dniEquis){
        this.dni = dniEquis;
    }

    public void setTipoUsuario(String tipoUsuarioEquis){
        this.tipoUsuario = tipoUsuarioEquis;
    }

}