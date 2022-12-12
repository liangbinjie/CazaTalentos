package cazatalentos;
public class Facturacioon {
    private String Nombrefa;
    private String fecha;
    private String hora;

    public Facturacioon() {
        this.Nombrefa = "";
        this.fecha = "";
        this.hora = "";
    }

    public String getNombrefa() {
        return Nombrefa;
    }

    public void setNombrefa(String Nombrefa) {
        this.Nombrefa = Nombrefa;
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
    
    
}
