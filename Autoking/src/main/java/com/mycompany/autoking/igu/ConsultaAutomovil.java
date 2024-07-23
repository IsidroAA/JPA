
package com.mycompany.autoking.igu;

import com.mycompany.autoking.logica.Automovil;
import com.mycompany.autoking.logica.ControladoraLogica;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultaAutomovil extends javax.swing.JFrame {

    
    //Creamos objeto de tipo ControladoraLogica para agregar funcionalidades a esta clase
    ControladoraLogica control = new ControladoraLogica();
    
    public ConsultaAutomovil() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsulta = new javax.swing.JTable();
        eliminarAuto = new javax.swing.JButton();
        modificarAuto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CONSULTA DE AUTOMOVILES");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaConsulta);

        eliminarAuto.setText("Eliminar");
        eliminarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAutoActionPerformed(evt);
            }
        });

        modificarAuto.setText("Modificar");
        modificarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarAutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(eliminarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(modificarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(eliminarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modificarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarAutoActionPerformed
        //Para modificar es necesario primero comprobar que la tabla no este vacia y que se haya seleccionado correctamente un objeto a modificar como en la de elimina
        if(tablaConsulta.getRowCount() > 0){
            //Valida que se haya sellecionado un valor
            if(tablaConsulta.getSelectedRow() != -1){ 
                //Aqui va codigo de modificar
                int idAuto = Integer.parseInt(String.valueOf(tablaConsulta.getValueAt(tablaConsulta.getSelectedRow(), 0)));
                //MANDA UN ID
                modificarAuto modif = new modificarAuto(idAuto); //Con esto le estamos pasando el Id del auto a el apartado de modificar
                modif.setVisible(true);
                modif.setLocationRelativeTo(null);
                
                //Cuando haga click en modificar y llame a la nueva ventana la actual se cierre
                this.dispose();
                     
            }
            else{
                mostrarMensaje("No se la seleccionado nada", "Error", "Error al modificar");
            }
        }
        else{      
            mostrarMensaje("La Tabla Esta Vacia No Se Puede Modificar Nada", "Error", "Error al Modificar");
        } 
    }//GEN-LAST:event_modificarAutoActionPerformed
//Este metodo es para que cuando se abra el apartado, abra una ventana en automatico
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Método para que cargue la tabla 
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void eliminarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAutoActionPerformed
        //Los requisitos son: verificar que la tabla este vacia, y verificar que se este seleccionando una fila
        //Control de que la tabla no este vacia
        if(tablaConsulta.getRowCount() > 0){//Si la cantidad de filas es mayor a 0, quiere decir que no esta vacia, no se pone null porque sino trabajaria con valores negativos
            //Valido que se haya seleccoinado un registro
            if(tablaConsulta.getSelectedRow() != -1){ //Si la fila seleccionada es difernte de -1, porque las filas se empiezan a contar desde 0
                //Si todo lo anterior se cumplio, voy a crear una variable auxiliar y voy a traer el id del auto a eliminar
                //Traerme los valores de la fila n, con el Id seleccioado, en este caso la columna perteneciente al id es la 0
                int idAuto = Integer.parseInt(String.valueOf(tablaConsulta.getValueAt(tablaConsulta.getSelectedRow(), 0)));//La fila me esta pidiendo un castep porque necesita recibir un valor igual al puesto previamente
               //Para cumplir lo anterior primero se transforma a string y despues a int
               //Con lo anteroir obtenemos el ID, ahora se lo debemos mandar a la Logica
               control.borrarAuto(idAuto);
               mostrarMensaje("Auto Borrado Correctamente", "Info", "Borrado Exitoso");
               cargarTabla();//El metodo cargar tabla se hizo aparte para poder ser llamado desde cualquier parte sin necesidad de cerrar y abrir la pantalla para actualizar
            }//Una vez eliminado tuvimos que poner en actualizar tabla para que esta se actualice con la nueva información (la que se elimino o la que se agrego)
            else{
                mostrarMensaje("No se la seleccionado nada", "Error", "");
            }
        }
        else{      
            mostrarMensaje("La Tabla Esta Vacia", "Error", "Error de Borrado");
        }
    }//GEN-LAST:event_eliminarAutoActionPerformed

    //MOSTRAR MENSAJE        Los parametros que recibe son, un mensaje, de un tipo, con el titulo que yo le otorgo
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);//Crea una ventanita JOPTIONPANE
        if(tipo.equals("Info")){//Si el titulo es de Info, crea un simbolito de info
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tipo.equals("Error")){//Si no es de Infor¿ pero es de Error, crea simbolo de error
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminarAuto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarAuto;
    private javax.swing.JTable tablaConsulta;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //Vamos a hacer que la tabla no sea editable
        //DefaultTableModel modeloTabla = isCellEditable(row, column) {return false;};, Se puede escribir de esta manera resumida, pero para saber
        //el porque, mejor ponemos la manera larga:
        DefaultTableModel modeloTabla = new DefaultTableModel () {
            //Hasta este punto ya existe isCellEditable por defecto y por defecto se puede escrobor dentro de la tabla, por lo que se usa
            //Este metodo para hacer sobreescritura de metodos e indicarle que desactive la funcion de poder escribir en la tabla
            @Override 
            public boolean isCellEditable(int row, int column){
                return false;
            }        
        }; //Ponemos punto y coma porque esta no es una porcion de codigo que se valla a ejecutar como cualquier otra, sino que
        //esto indica que es una porcion de código que se debe respetar si o si
        
        //Ponemos titulo a las columnas creando un Array
        String titulos[] = {"Id","Modelo","Marca","Motor","Color","Placa","Puertas"};
        modeloTabla.setColumnIdentifiers(titulos); //Metemos el nombre de las columnas en la tabla
        
        //Traer los autos desde la BD
        //Para hacerlo con buenas practicas no traere los datos desde esta que es la interfáz grafica, sino que los voy a mandar
        //desde la parte de lógica
        
        List <Automovil> ListaAutomoviles = control.traerAutos();
         
        //Setear los datos de la tabla
        //Comprobar que la lista no este vacia
        if(ListaAutomoviles !=null){
            //For cada Automovil auto de mi lista de automoviles
            for(Automovil auto: ListaAutomoviles){
                //En java como es tipado si creo una variable debo mostrar de que tipo es y lo mismo si creo un objeto
                Object[] objeto= {auto.getId(), auto.getModelo(), auto.getMarca(), auto.getMotor(),
                auto.getColor(), auto.getPlaca(), auto.getNumeroPuertas()};
                
                modeloTabla.addRow(objeto); //El objeto recien creado lo agrego como fila
            }
        }
    
        tablaConsulta.setModel(modeloTabla);
    }
}
