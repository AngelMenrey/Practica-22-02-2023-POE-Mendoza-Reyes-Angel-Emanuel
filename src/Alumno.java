public class Alumno {
    private String nombre;
    private String apellido;
    private int registro;
    
//constructor
    public Alumno(String nombre, String apellido, int registro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.registro = registro;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getRegistro() {
        return registro;
    }
}