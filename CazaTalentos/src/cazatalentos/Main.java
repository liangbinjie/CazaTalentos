package cazatalentos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static LinkedList<Usuarios> usuarios = new LinkedList<>();
    public static ArrayList<Deportistas> deportistas = new ArrayList<>();
    public static ArrayList<Padres> padres = new ArrayList<>();
    public static ArrayList<Persona> administradores = new ArrayList<>();
    public static ArrayList<Persona> entrenadores = new ArrayList<>();
    public static ArrayList<Deportes> deportes = new ArrayList<>();
    public static ArrayList<Rutinas> rutinas = new ArrayList<>();
    
    
    // metodo estatico para buscar la existencia de un deportista
    public static boolean searchD(long identificacion) {
        for (Deportistas d: Main.deportistas) {
            if (d.getIdentificacion() == identificacion) {
                return true;
            }
        }
        return false;
    }
}
