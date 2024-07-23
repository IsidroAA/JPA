
package com.mycompany.autoking.persistencia;

import com.mycompany.autoking.logica.Automovil;
import com.mycompany.autoking.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    
    AutomovilJpaController autoJpa = new AutomovilJpaController(); 
    
    //Esta es la parte de los CRUD que va a enviar la información a la BD
    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        //Persistencia hace un return y llama a ------>controladora de persistencia
        //A la controladora de la loogica habia llamado a la IGU y esta recibe los automoviles
        return autoJpa.findAutomovilEntities();
      
    }

    public void borrarAuto(int idAuto) {
        try {
            //Ahora aqui vamos a mandar para borrar el Id a la BD
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }//Con el try-catch en caso de que queramos destruir un id que no exista, no se va a cortar la ejecución, sino que va a intentar hacer lo que le pedimos
    }//despues de intentarlo va a agarrar el error y ahi quedara y nos permitira seguir haciendo mas cosas sin necesidad de crashear la ejecución

    public Automovil traerAutos(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
