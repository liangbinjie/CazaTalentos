package cazatalentos;

public class Rutinas {
    private String deporte;
    private String fecha;
    private String duracion;
    private String descripcion;
    private boolean estado;
    private int id;
    
    
    public Rutinas() {
        this.deporte = null;
        this.fecha = "";
        this.duracion = "";
        this.descripcion = "";
        this.estado = false;
        this.id = 0;
    }

    public Rutinas(String deporte, String fecha, String duracion, String descripcion, boolean estado, int id) {
        this.deporte = deporte;
        this.fecha = fecha;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.estado = estado;
        this.id = id;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
