
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity 
public class Cliente extends Persona implements Serializable{
    
    //private int id_cliente;
    private boolean es_personaMoral;
    private String tipo_problema;
    @OneToOne
    private Responsable unResponsable; //Es la relacion 1 a 1 de cliente y responsable
    @OneToMany(mappedBy = "clien")
    private List<Turno> listaTurnos; //Relación n a n (Un cliente puede tener una lista de turnos)

    public Cliente() {
    }

    public Cliente(boolean es_personaMoral, String tipo_problema, Responsable unResponsable, List<Turno> listaTurnos, int id, int telefono, Date fecha_nacimiento, String adn, String nombre, String apellido, String direccion) {
        super(id, telefono, fecha_nacimiento, adn, nombre, apellido, direccion);
        this.es_personaMoral = es_personaMoral;
        this.tipo_problema = tipo_problema;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public boolean isEs_personaMoral() {
        return es_personaMoral;
    }

    public void setEs_personaMoral(boolean es_personaMoral) {
        this.es_personaMoral = es_personaMoral;
    }

    public String getTipo_problema() {
        return tipo_problema;
    }

    public void setTipo_problema(String tipo_problema) {
        this.tipo_problema = tipo_problema;
    }   
}
