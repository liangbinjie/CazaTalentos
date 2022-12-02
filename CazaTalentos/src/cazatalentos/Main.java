package cazatalentos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static LinkedList<Usuarios> usuarios = new LinkedList<>();
    public static ArrayList<Deportistas> deportistas = new ArrayList<>();
    public static ArrayList<Padres> padres = new ArrayList<>();
    public static ArrayList<Persona> administradores = new ArrayList<>();

    
    public Main() {
        
    }
    
    public void mostrar() {
        for (int i=0; i<padres.size(); i++) {
            System.out.println(padres.get(i).getNombre());
        }
    }
    
}
