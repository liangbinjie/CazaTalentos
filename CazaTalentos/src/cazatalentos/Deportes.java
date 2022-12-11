package cazatalentos;


public class Deportes {
  private String nombre;
  private String description;
  private boolean estado;
  
  public Deportes(String name, String description, boolean state) {
    this.nombre = name;
    this.description = description;
    this.estado = state;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(String name) {
    this.nombre = name;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public boolean getEstado() {
    return this.estado;
  }
  
  public void setEstado(boolean state) {
    this.estado = state;
  }
}