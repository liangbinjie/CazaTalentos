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

    @Override
    public String getNombre() {
        return getNombre();
    }


    public void setNombre(String nombre) {
        this.setNombre(nombre);
    }

    public String getApellidos() {
        return getApellidos();
    }

    public void setApellidos(String apellidos) {
        this.setApellidos(apellidos);
    }

    public int getEdad() {
        return getEdad();
    }

    public void setEdad(int edad) {
        this.setEdad(edad);
    }

    public long getIdentificacion() {
        return getIdentificacion();
    }

    public void setIdentificacion(long identificacion) {
        this.setIdentificacion(identificacion);
    }

    public long getTelefono() {
        return getTelefono();
    }

    public void setTelefono(long telefono) {
        this.setTelefono(telefono);
    }

    public String getCiudad() {
        return getCiudad();
    }

    public void setCiudad(String ciudad) {
        this.setCiudad(ciudad);
    }

    public String getDireccion() {
        return getDireccion();
    }

    public void setDireccion(String direccion) {
        this.setDireccion(direccion);
    }

    public String getEmail() {
        return getEmail();
    }

    public void setEmail(String email) {
        this.setEmail(email);
    }
    
    
}
