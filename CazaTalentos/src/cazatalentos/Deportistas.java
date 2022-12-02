package cazatalentos;

import java.util.ArrayList;


public class Deportistas extends Persona {
    private ArrayList<String> rutinas = new ArrayList<>();
    
    public Deportistas() {
        super();
        this.rutinas = null;
    }

    public ArrayList<String> getRutinas() {
        return rutinas;
    }

    public void setRutinas(ArrayList<String> rutinas) {
        this.rutinas = rutinas;
    }
}
