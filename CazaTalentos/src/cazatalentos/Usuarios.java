package cazatalentos;

public class Usuarios {
    private int id;
    private String nombre;
    private String apellidos;
    private String username;
    private String password;
    private String role;
    private boolean estado;
    
    public Usuarios() {
        this.id = 0;
        this.nombre = "";
        this.apellidos = "";
        this.username = "";
        this.password = "";
        this.role = "";
        this.estado = false;
    }

    public Usuarios(int id, String username, String password, String nombre, String apellidos, String role, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.username = username;
        this.password = password;
        this.role = role;
        this.estado = estado;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
