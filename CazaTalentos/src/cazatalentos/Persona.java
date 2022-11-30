package cazatalentos;

public class Persona {
    
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    private long identificacion;
    private long telefono;
    private String ciudad;
    private String direccion;
    private String email;
    
    
    // constructor 
    public Persona(){
        this.id = 0;
        this.nombre="";
        this.apellidos="";
        this.edad=0;
        this.identificacion = 0;
        this.telefono = 0;
        this.ciudad = "";
        this.direccion = "";
        this.email = "";
    }

    public Persona(int id, String nombre, String apellidos, int edad, long identificacion, long telefono, String ciudad, String direccion, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.email = email;
    }
    
    
    
    public int getId() {
        return id;
    }    

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
