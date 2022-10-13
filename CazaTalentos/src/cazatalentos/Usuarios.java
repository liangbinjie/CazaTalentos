package cazatalentos;
import java.util.LinkedList;

/**
 *
 * @author Binjie Liang
 */
public class Usuarios {
    
    public LinkedList usuarios = new LinkedList<>();
    
    
    private String nombre;
    private String apellidos;
    private String usuario;
    private String password;
    private Estados estado;
    
    // constructor 
    public Usuarios() {
        this.nombre = "";
        this.apellidos = "";
        this.usuario = "";
        this.password = "";
        this.estado = Estados.Inactivo;
    }
    
    
    // getters and setters

    public LinkedList getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(LinkedList usuarios) {
        this.usuarios = usuarios;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
    
}
