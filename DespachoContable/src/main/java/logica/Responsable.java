
package logica;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona{
    
    //private int id_responsable;
    private String parentesco;

    public Responsable() {
    }

    public Responsable(String parentesco, int id, int telefono, Date fecha_nacimiento, String adn, String nombre, String apellido, String direccion) {
        super(id, telefono, fecha_nacimiento, adn, nombre, apellido, direccion);
        this.parentesco = parentesco;
    }
    
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
