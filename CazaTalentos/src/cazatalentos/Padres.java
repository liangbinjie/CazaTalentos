package cazatalentos;

import java.util.ArrayList;

public class Padres extends Persona {
    private ArrayList<Long> hijos = new ArrayList<>();
    
    public Padres() {
        super();
        this.hijos = null;
    }

    public Padres(int id, String nombre, String apellidos, int edad, long identificacion, long telefono, String ciudad, String direccion, String email) {
        super(id, nombre, apellidos, edad, identificacion, telefono, ciudad, direccion, email);
    }
    
    

    public ArrayList<Long> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Long> hijos) {
        this.hijos = hijos;
    }
    
}
