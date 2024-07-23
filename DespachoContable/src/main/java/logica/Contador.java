
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Contador extends Persona implements Serializable{
    
    //private int id_contador;
    private String especialidad;
    
    @OneToOne
    private Usuario unUsuario; //Relacion 1 a 1 con la clase Usuario
    @OneToOne
    private Horario unHorario; //Relacion 1 a 1 con la clase horario
    @OneToMany(mappedBy = "conta") //Hacemos el mapeo al objeto conta que esta creado en la clase turno Aqui como es la que esta apuntando es clase OneToMany, y en la clase turno que es la que recibe es mapeo ManyToOne
    private List<Turno> listaTurnos; //Relacion n a n con la clase Turnos

    public Contador() {
    }

    public Contador(String especialidad, Usuario unUsuario, Horario unHorario, List<Turno> listaTurnos, int id, int telefono, Date fecha_nacimiento, String adn, String nombre, String apellido, String direccion) {
        super(id, telefono, fecha_nacimiento, adn, nombre, apellido, direccion);
        this.especialidad = especialidad;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
        this.listaTurnos = listaTurnos;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
