package cazatalentos;

public class Persona {
    
    public String nombre;
    public String apellidos;
    public int edad;
    public long identificacion;
    public long telefono;
    public String ciudad;
    public String direccion;
    public String email;
    
    
    
    public Persona(){
        this.nombre="";
        this.apellidos="";
        this.edad=0;
    }
    //añadimos los getters y los setters 

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
    
    
}
