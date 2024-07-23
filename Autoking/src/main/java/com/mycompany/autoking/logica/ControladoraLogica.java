
package com.mycompany.autoking.logica;

import com.mycompany.autoking.persistencia.ControladoraPersistencia;
import java.util.List;


public class ControladoraLogica {

    //Creamos instancia para comunicar esta ControlLogica a ControlPersis
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarAutomovil(String modelo, String marca, String motor, 
            String color, String placa, int numeroPuertas) {
        //Usamos constructor de la logica porque es la encargada de modelar, podriamos pasar el constructor con los parametros
        //pero vamos a pasar el constructor vacio para posteriormente irlo llenando con los setters
        Automovil auto = new Automovil();
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setNumeroPuertas(numeroPuertas);
        auto.setMotor(motor);
        auto.setPlaca(placa);
        
        controlPersis.agregarAutomovil(auto);//Solo agregamos el objeto el cuial contendra al objeto con los parametros
//

    }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
    }
//Aqui ya me llego el id para borrarlo, ahora se lo tengo que mandar a la Persistencia
    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAutos(int idAuto) { 
        return controlPersis.traerAutos(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String placa, int numeroPuertas) {
        //No podemos cambiarle el id porque es el identificador unico
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setNumeroPuertas(numeroPuertas);
        //Le pido a la persistencia que modifique todo el auto
        controlPersis.modificarAuto(auto);
    }
    
}
