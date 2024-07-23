
package logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Secretario extends Persona {
    
    //private int id_secretario;
    private String sector;
    @OneToOne
    private Usuario unUsuario;

    public Secretario() {
    }

    public Secretario(String sector, Usuario unUsuario, int id, int telefono, Date fecha_nacimiento, String adn, String nombre, String apellido, String direccion) {
        super(id, telefono, fecha_nacimiento, adn, nombre, apellido, direccion);
        this.sector = sector;
        this.unUsuario = unUsuario;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
    
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }  
}
