/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DAO.DAOException;
import DAO.DAOManager;
import DAOMySQL.MySQLDAOManager;
import Modelo.Autor;
import Modelo.IsbnAutor;
import Modelo.Titulo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


/**
 *
 * @author alopezorozco
 */
public class JDAutores extends javax.swing.JDialog {
    //creamos un objeto del tipo interface IAutorDAO
    private DAOManager manager = null;
    
    //el modelo para nuestra tabla tblTitulos
    private TitulosTableModel model;
    
    //propiedad para modificar el width de nuestra tabla tblTitulos
     TableColumnModel columnModel = null;
    
    //campos para almacenar los datos del formulario
    private int idAutor;
    private String nombre;
    private String apellidos;
    
    /**
     * Creates new form JDAutores
     * @param parent
     * @param modal
     */
    public JDAutores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //creamos la propiedad para manejar nuestros DAO
        this.manager = new MySQLDAOManager(); 
        
        //llamada al método para inicializar la tabla tblTitulos
        inicializarListaTitulos();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdAutor = new javax.swing.JTextField();
        txtNombrePila = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarPorId = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTitulos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminarTitulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Id. Autor:");

        jLabel2.setText("Nombre Pila:");

        jLabel3.setText("Apellido Paterno:");

        txtIdAutor.setText("-1");
        txtIdAutor.setEnabled(false);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar una entrada por:"));

        jLabel4.setText("Id. Autor:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarPorId, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuscarPorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Titulos del autor"));

        tblTitulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTitulos);
        if (tblTitulos.getColumnModel().getColumnCount() > 0) {
            tblTitulos.getColumnModel().getColumn(0).setMaxWidth(150);
            tblTitulos.getColumnModel().getColumn(1).setMaxWidth(400);
            tblTitulos.getColumnModel().getColumn(2).setMaxWidth(200);
            tblTitulos.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        jLabel5.setText("<html>Agregar Nuevo título:<br />(Escribe el ISBN del título)</html>");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminarTitulo.setText("Eliminar título del autor");
        btnEliminarTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTituloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregar))
                            .addComponent(btnEliminarTitulo))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarTitulo)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombrePila)
                                .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombrePila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
        try{
             //obtenemos el id. del Autor a buscar
            int idABuscar =(Integer) Integer.parseInt(txtBuscarPorId.getText());
            
            //obtenemos los datos del autor y lo asignamos al objetio miAutor.
            Autor miAutor = manager.getAutorDAO().obtener(idABuscar);
            
            //mostramos los datos en la caja de texto
            txtIdAutor.setText(Integer.toString(miAutor.getIdAutor()));
            txtNombrePila.setText(miAutor.getNombrePila());
            txtApellidoPaterno.setText(miAutor.getApellidoPaterno());
            
            //actualizamos la tabla de titulos del autor
            actualizarListaTitulos(miAutor.getIdAutor());
           
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Especifica "
                    + "un número entero", "Error", JOptionPane.ERROR_MESSAGE);
            txtBuscarPorId.requestFocusInWindow();
            txtBuscarPorId.selectAll();
        } catch(DAOException ex) {
            imprimirMensajeDeErrorDAO(ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        //llamamos al método validar para ver si procede guardar los datos
        if (validar()){
        
            //si idAutor = -1 entonces insertamos el registro
            if (idAutor==-1){
                    
                //llamamos al constructor para crear un objeto de tipo Autor
                Autor miAutor = new Autor(nombre, apellidos);
                
                try {
                    manager.getAutorDAO().insertar(miAutor);
                    txtIdAutor.setText(Integer.toString(miAutor.getIdAutor()));
                    JOptionPane.showMessageDialog(null, "Los datos han sido guardados");
                } catch (DAOException ex) {
                    imprimirMensajeDeErrorDAO(ex);
                }
            }else{//si es diferente a -1 quiere decir que se esta realizando una modificación
                
                //llamamos al constructor para crear un objeto de tipo Autor
                Autor miAutor = new Autor(idAutor, nombre, apellidos);
                
                
                try{
                    
                    
                    manager.getAutorDAO().modificar(miAutor);
                    JOptionPane.showMessageDialog(null, "Los cambios han sido guardados");
                } catch (DAOException ex) {
                    imprimirMensajeDeErrorDAO(ex);
                }
            }//fin del else
        }//fin del if validar
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //solo se puede eliminar si el idAutor es diferente a -1
        
        if (!txtIdAutor.getText().equals("-1")){
            int idAutor = Integer.parseInt(txtIdAutor.getText());
            
            int respuesta = JOptionPane.showConfirmDialog(null, 
                    "¿Deseas eliminar al autor con id = "+idAutor+ "?", "Confirmar",0);
            
            if (respuesta==0){
            
                try {
                    //eliminamos el autor
                    manager.getAutorDAO().eliminar(idAutor);

                     //si no ocurre una excepción
                    JOptionPane.showMessageDialog(null, "El autor ha sido eliminado");
                } catch (DAOException ex) {
                    imprimirMensajeDeErrorDAO(ex);
                }  
            }
        }else{
            JOptionPane.showMessageDialog(null, "Busca un autor para poder eliminarlo");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //llamamos al método limpiarFormulario
        limpiarFormulario();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //para agregar un nuevo título el Id. del autor debe ser diferente a -1
        if (!txtIdAutor.getText().equals("-1")){
            
            int idAutor = Integer.parseInt(txtIdAutor.getText());           
            
            //ahora verificamos que el ISBN insertado en la caja de texto
            //realmente corresponda con uno en la tabla títulos
            if (!txtISBN.getText().trim().equals("")){
                String isbn = txtISBN.getText();
                
                try {
                    //hacemos la consulta para ver si existe el ISBN
                    Titulo miTitulo = manager.getTituloDAO().obtener(isbn);
                    
                    //si no se genera una excepción procedemos a tratar de insertar
                    //los datos
                    IsbnAutor isbnautor = new IsbnAutor(idAutor, isbn);
                    
                    manager.getIsbnAutorDAO().insertar(isbnautor);
                    
                    actualizarListaTitulos(idAutor);
                    
                    JOptionPane.showMessageDialog(null, "Se han guardado los datos");
                } catch (DAOException ex) {
                    imprimirMensajeDeErrorDAO(ex);
                    txtISBN.requestFocus();
                    txtISBN.selectAll();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Especifica el ISBN del libro");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Busca primero al autor del título");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTituloActionPerformed
       if (tblTitulos.getRowCount()>0){
          //obtenemos el isbn seleccionado
          String isbn;
          isbn = tblTitulos.getValueAt(tblTitulos.getSelectedRow(), 
                   0).toString();
           
          if (JOptionPane.showConfirmDialog(rootPane, "¿Seguro que "
                  + " quieres borrar el ISBN: "+isbn
                  + " \nvinculado con el autor activo?",
                  "Borrar ISBN vinculado al autor", 
                  JOptionPane.YES_NO_OPTION,
                  JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            
            //obtenemos el idAutor de la caja de texto
            int idAutor = Integer.parseInt(txtIdAutor.getText());
              
            //creamos un objeto de tpo IsbnAutor
            IsbnAutor isbnAutor = new IsbnAutor(idAutor, isbn);
            
              try {
                  //llamamos al método eliminar que recibe 
                  //el objeto creado anteriormente
                  manager.getIsbnAutorDAO().eliminar(isbnAutor);
                  
                  //actualizamos nuestra tabla
                  actualizarListaTitulos(idAutor);
                  
                  //mandamos mensaje de confirmación
                  JOptionPane.showMessageDialog(null, "Se ha eliminado "
                          + " el ISBN con exito");           
                  
              } catch (DAOException ex) {
                  imprimirMensajeDeErrorDAO( ex );
              }//fin del catch            
          }//fin del if Question 
       }//fin del if getRowCount...
    }//GEN-LAST:event_btnEliminarTituloActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDAutores dialog = null;
                dialog = new JDAutores(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarTitulo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTitulos;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtBuscarPorId;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtIdAutor;
    private javax.swing.JTextField txtNombrePila;
    // End of variables declaration//GEN-END:variables

    
    /**
     * Imprime un mensaje de error personalizado para aquellos errores
     * que son producidos por el acceso a la base de datos
     * @param ex objeto de tipo DAOExcepción
     */
    private void imprimirMensajeDeErrorDAO(DAOException ex) {
        //Si getMessage existe obtenemos su valor
        String mensajeError;
        
        try{
            mensajeError = "Mensaje: " + ex.getCause().getMessage();
        }catch(NullPointerException error){
            mensajeError = "";
        }
        
        JOptionPane.showMessageDialog(null, 
                ex.getMessage()+"\n"+
                        mensajeError,
                "Error",JOptionPane.ERROR_MESSAGE);
    }//fin del método imprimirMensajeDeErrorDAO
    
    

    /**
     * Este método permite limpiar las cajas de texto
     * y ubicar el focus en la caja de texto del nombre
     */
    private void limpiarFormulario() {
        //asignamos el string -1 a la caja de texto del id. autor
        txtIdAutor.setText("-1");
        
        //limpiamos las otras cajas de texto
        txtNombrePila.setText("");
        txtApellidoPaterno.setText("");
        txtBuscarPorId.setText("");
        
        //ubicamos el focus en la caja de texto del nombre
        txtNombrePila.requestFocusInWindow(); 
        
        inicializarListaTitulos();               
    }//fin del método limpiarFormulario

    /**
     * Valida los datos de entrada del formulario
     * @return true si todos son validados 
     * correctamente, false en caso contrario
     */
    private boolean validar() {
        boolean validacion = false;
        
        idAutor = Integer.parseInt(txtIdAutor.getText());
        nombre = txtNombrePila.getText().trim();
        apellidos = txtApellidoPaterno.getText().trim();
        
        if (nombre.equals("")||(nombre==null)){
            JOptionPane.showMessageDialog(null, "Especifica el nombre del autor");
            txtNombrePila.requestFocusInWindow();
            return validacion;
        }
        
        if (apellidos.equals("")||(apellidos==null)){
            JOptionPane.showMessageDialog(null, "Especifica el apellido del autor");
            txtApellidoPaterno.requestFocusInWindow();
            return validacion;
        }
        
        return true;
    }//fin del método validar

    

    private void inicializarListaTitulos() {
       model = new TitulosTableModel(manager.getIsbnAutorDAO());
       
       //asingamos el modelo pero sin llamar al método actualizar
       //ya que al iniciar el id. Autor es -1
       tblTitulos.setModel(model);
       
       //redimensionamos las celdas
       setJTableColumnsWidth(tblTitulos, 480,40,150,70,30);
    }
    
    /**
     * actualiza el contenido de la tabla tblTitulos 
     * @param idAutor parámetro para realizar la búsqueda de titulos por autor
     * @throws DAOException 
     */
    private void actualizarListaTitulos(int idAutor) throws DAOException{
        /*si no hay ningún error actualizamos la tabla 
        * para mostrar los libros de este autor
        */
        model.updateModel(idAutor);
        
        //hacemos que se reflejen los cambios
        model.fireTableDataChanged();
        
        //redimensionamos la celda
        setJTableColumnsWidth(tblTitulos, 480,40,150,70,30);
    }//fin del método
    
    /**
     * Este método redimensiona el ancho de las celdas de nuestra tabla tblTitulos
     * @param table
     * @param tablePreferredWidth
     * @param percentages 
     */
    public static void setJTableColumnsWidth(JTable table, int tablePreferredWidth,
        double... percentages) {
        double total = 0;
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            total += percentages[i];
        }

        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            TableColumn column = table.getColumnModel().getColumn(i);
            column.setPreferredWidth((int)
                    (tablePreferredWidth * (percentages[i] / total)));
        }
    }//fin del método setJTable...


}//fin de la clase
