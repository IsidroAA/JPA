
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Turno implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_turno;
    @Temporal(TemporalType.DATE)
    private Date fechaTurno;  //La fecha por los calendars, son mas faciles de usar mediante date
    private String horaTurno; //Las horas las usare como string porque las voy a tener que comparar para ver que horaqs tiene disponible el contador
    private String tipo_tramite;
    
    @ManyToOne //En la relacion, en la linea de abajo hay error de integridad puesto que se esta confunciendo este id_turno, con la primary key que igual se llama id_turno
    @JoinColumn(name="id_conta")//Este es el nombre que tendra esta relación 
    private Contador conta; //Este conta como esta del lado de esta clase (que cuenta como n), se debe crear este objeto perteneciente a la clase que esta haciendo referencia aqui, es decir, la clase contado   
    @ManyToOne
    @JoinColumn(name="id_clien")
    private Cliente clien;
    
    
    public Turno() {
    }

    public Turno(int id_turno, Date fechaTurno, String horaTurno, String tipo_tramite) {
        this.id_turno = id_turno;
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
        this.tipo_tramite = tipo_tramite;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public String getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(String horaTurno) {
        this.horaTurno = horaTurno;
    }

    public String getTipo_tramite() {
        return tipo_tramite;
    }

    public void setTipo_tramite(String tipo_tramite) {
        this.tipo_tramite = tipo_tramite;
    }
}
