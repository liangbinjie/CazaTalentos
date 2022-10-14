package cazatalentos;

public class Deportista extends Persona {
    public int peso;
    public double estatura;
    //agregamos los atributos de persona y a la vez agregamos atributos a 
    //deportista
   public Deportista(){
       super();
       this.peso=0;
       this.estatura=0;
   }
//añadimos los getters y los setters
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
