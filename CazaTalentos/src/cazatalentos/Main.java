package cazatalentos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static LinkedList<Usuarios> usuarios = new LinkedList<>();
    public static ArrayList<Deportistas> deportistas = new ArrayList<>();
    public static ArrayList<Padres> padres = new ArrayList<>();
    public static ArrayList<Persona> administradores = new ArrayList<>();

    
    public Main() {
        Usuarios usuario = new Usuarios();
        usuario.setId(1);
        usuario.setUsername("admin");
        usuario.setPassword("admin12345");
        usuario.setNombre("Admin");
        usuario.setApellidos("");
        usuario.setRole("Administrador");
        usuario.setEstado(true);
        usuarios.add(usuario);
        Persona p = new Persona(1, "Admin", "", 20, 115600, 123, "asd", "ad", "asd");
        administradores.add(p);
        
    }
    
}
