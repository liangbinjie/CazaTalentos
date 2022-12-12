package cazatalentos;

import java.util.ArrayList;

public class Padres extends Persona {
    private ArrayList<String> hijos = new ArrayList<>();
    
    public Padres() {
        super();
        this.hijos = null;
    }

    public Padres(int id, String nombre, String apellidos, int edad, long identificacion, long telefono, String ciudad, String direccion, String email) {
        super(id, nombre, apellidos, edad, identificacion, telefono, ciudad, direccion, email);
    }

    public ArrayList<String> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<String> hijos) {
        this.hijos = hijos;
    }

}
