package cazatalentos;
public class Facturacion {
    private String nombre;
    private String apellidos;
    private int pagoMensual;
    private long idCliente;
    private String fecha;
    private String hora;
    private String descripcionR;

    public Facturacion() {
        this.nombre = "";
        this.apellidos = "";
        this.pagoMensual = 0;
        this.idCliente = 0;
        this.fecha = "";
        this.hora = "";
        this.descripcionR = "";
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

    public int getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(int pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcionR() {
        return descripcionR;
    }

    public void setDescripcionR(String descripcionR) {
        this.descripcionR = descripcionR;
    }


    
    
}
