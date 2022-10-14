package cazatalentos;

public class Deportista extends Persona {
    public int peso;
    public double estatura;
    
   public Deportista(){
       super();
       this.peso=0;
       this.estatura=0;
   }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    
}
