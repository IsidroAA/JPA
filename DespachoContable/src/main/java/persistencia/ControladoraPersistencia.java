
package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    //Creacion de las instancias
    ClienteJpaController clienteJPA = new ClienteJpaController();
    ContadorJpaController contadorJPA = new ContadorJpaController();
    HorarioJpaController horaJPA = new HorarioJpaController();
    PersonaJpaController personaJPA = new PersonaJpaController();
    ResponsableJpaController responsableJPA = new ResponsableJpaController();
    SecretarioJpaController secretarioJPA = new SecretarioJpaController();
    TurnoJpaController turnoJPA = new TurnoJpaController();
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();

    //Nuestra controladora de persistencia nececita de un constructor
    public void crearUsuario(Usuario usu) {
        usuarioJPA.create(usu);
    }
    //Metodo desde la lógoca para crear usuarios
    public List<Usuario> getUsuarios() {
        return usuarioJPA.findUsuarioEntities();
    }

    public void borrarUsuario(int id) {
        try {
            usuarioJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id) {
        return usuarioJPA.findUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuarioJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
