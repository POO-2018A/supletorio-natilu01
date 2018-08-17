package supletorio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ESFOT
 */
public class FrmRegistroProduct extends javax.swing.JFrame {

    ArrayList<Object> productos = new ArrayList<>();
    ClsControlador controller = new ClsControlador();
    ArrayList<String> detalles = new ArrayList<>();
    
    public FrmRegistroProduct() {
        initComponents();
        
        productos = controller.extraerObjetos("productos.dat");
        llenarGrid();
        
        lblTipo.setVisible(false);
        lblCapacidad.setVisible(false);
        lblRam.setVisible(false);
        lblProcesador.setVisible(false);
        lblColor.setVisible(false);
        lblVelocidad.setVisible(false);
        
        txtTipo.setVisible(false);
        txtCapacidad.setVisible(false);
        txtRam.setVisible(false);
        txtProcesador.setVisible(false);
        txtColor.setVisible(false);
        txtVelocidad.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lblTipo = new javax.swing.JLabel();
        lblCapacidad = new javax.swing.JLabel();
        lblRam = new javax.swing.JLabel();
        lblProcesador = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblVelocidad = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtRam = new javax.swing.JTextField();
        txtProcesador = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtVelocidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE PRODUCTO");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Marca:");

        jLabel5.setText("Categoria:");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPUTADOR", "ACCESORIO", "COMPONENTE" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtPrecio)
                    .addComponent(txtMarca)
                    .addComponent(cmbCategoria, 0, 196, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTipo.setText("Tipo:");

        lblCapacidad.setText("Capacidad:");

        lblRam.setText("Memoria Ram:");

        lblProcesador.setText("Procesador");

        lblColor.setText("Color:");

        lblVelocidad.setText("Velocidad:");

        txtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadKeyTyped(evt);
            }
        });

        txtRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRamKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addGap(35, 35, 35)
                        .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCapacidad)
                            .addComponent(lblRam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCapacidad)
                            .addComponent(txtRam)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblProcesador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProcesador)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblVelocidad)
                        .addGap(18, 18, 18)
                        .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblColor)
                        .addGap(38, 38, 38)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(lblColor)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapacidad)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRam)
                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVelocidad)
                    .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProcesador)
                    .addComponent(txtProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Marca", "Categoria", "Detalles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbProductos);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnRegistrar)
                        .addGap(93, 93, 93)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        if(cmbCategoria.getSelectedItem().equals("COMPUTADOR")){
//            System.out.println("COMPUTADOR");
            lblTipo.setVisible(true);
            lblCapacidad.setVisible(true);
            lblRam.setVisible(true);
            lblProcesador.setVisible(true);
            lblColor.setVisible(false);
            lblVelocidad.setVisible(false);

            txtTipo.setVisible(true);
            txtCapacidad.setVisible(true);
            txtRam.setVisible(true);
            txtProcesador.setVisible(true);
            txtColor.setVisible(false);
            txtVelocidad.setVisible(false);
            
        }else if(cmbCategoria.getSelectedItem().equals("ACCESORIO")){
//            System.out.println("ACCSESORIO");
            lblTipo.setVisible(true);
            lblCapacidad.setVisible(false);
            lblRam.setVisible(false);
            lblProcesador.setVisible(false);
            lblColor.setVisible(true);
            lblVelocidad.setVisible(false);

            txtTipo.setVisible(true);
            txtCapacidad.setVisible(false);
            txtRam.setVisible(false);
            txtProcesador.setVisible(false);
            txtColor.setVisible(true);
            txtVelocidad.setVisible(false);
        }else if(cmbCategoria.getSelectedItem().equals("COMPONENTE")){
//            System.out.println("COMPONENTE");
            lblTipo.setVisible(true);
            lblCapacidad.setVisible(true);
            lblRam.setVisible(false);
            lblProcesador.setVisible(false);
            lblColor.setVisible(false);
            lblVelocidad.setVisible(true);

            txtTipo.setVisible(true);
            txtCapacidad.setVisible(true);
            txtRam.setVisible(false);
            txtProcesador.setVisible(false);
            txtColor.setVisible(false);
            txtVelocidad.setVisible(true);
        }
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(cmbCategoria.getSelectedItem().equals("COMPUTADOR")){
            
            detalles.add("Tipo:"+txtTipo.getText()+" "+"Capacidad:"+txtCapacidad.getText()+" "+"Ram:"+txtRam.getText()+" "+"Procesador:"+txtProcesador.getText());

            
        }else if(cmbCategoria.getSelectedItem().equals("ACCESORIO")){
            
            detalles.add("Tipo:"+txtTipo.getText()+" "+"Color:"+txtColor.getText());

            
        }else if(cmbCategoria.getSelectedItem().equals("COMPONENTE")){
            
            detalles.add("Tipo:"+txtTipo.getText()+" "+"Capacidad:"+txtCapacidad.getText()+" "+"Velocidad:"+txtVelocidad.getText());

        }
        
        ClsProducto producto = new ClsProducto(txtNombre.getText(), Double.parseDouble(txtPrecio.getText()),txtMarca.getText(), (String) cmbCategoria.getSelectedItem(), detalles);
        productos.add(producto);
        controller.escribirObjeto("productos.dat", productos);
        productos = controller.extraerObjetos("productos.dat");
        limpiar();
        Object prodcutoT [] = {producto.getNombre(), producto.getPrecio(),producto.getMarca(),producto.getCategoria(), producto.getDetalles()};
        DefaultTableModel model = (DefaultTableModel) tbProductos.getModel();
        model.addRow(prodcutoT);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Intente otra vez!!!",JOptionPane.ERROR_MESSAGE);
        }
        int numero_caracteres = 10;
        if (txtCapacidad.getText().length() >= numero_caracteres) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCapacidadKeyTyped

    private void txtRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Intente otra vez!!",JOptionPane.ERROR_MESSAGE);
        }
        int numero_caracteres = 10;
        if (txtCapacidad.getText().length() >= numero_caracteres) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRamKeyTyped

    
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
            java.util.logging.Logger.getLogger(FrmRegistroProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistroProduct().setVisible(true);
            }
        });
    }
    
    
    public void llenarGrid(){
        if(productos.size() > 0){
            ClsProducto product = new ClsProducto();
            DefaultTableModel model = (DefaultTableModel) tbProductos.getModel();
            for(int i = 0; i < productos.size(); i ++){
                product = (ClsProducto) productos.get(i);
                Object productoT [] = {product.getNombre(), product.getPrecio(), product.getMarca(), product.getCategoria(), product.getDetalles()};
                model.insertRow(i, productoT);
            }
        }
    }

    
    
    public void limpiar(){
        txtNombre.setText(null);
        txtPrecio.setText(null);
        txtMarca.setText(null);
        
        txtTipo.setText(null);
        txtCapacidad.setText(null);
        txtRam.setText(null);
        txtProcesador.setText(null);
        txtColor.setText(null);
        txtVelocidad.setText(null);
        
        lblTipo.setVisible(false);
        lblCapacidad.setVisible(false);
        lblRam.setVisible(false);
        lblProcesador.setVisible(false);
        lblColor.setVisible(false);
        lblVelocidad.setVisible(false);
        
        txtTipo.setVisible(false);
        txtCapacidad.setVisible(false);
        txtRam.setVisible(false);
        txtProcesador.setVisible(false);
        txtColor.setVisible(false);
        txtVelocidad.setVisible(false);

    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblProcesador;
    private javax.swing.JLabel lblRam;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblVelocidad;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProcesador;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtVelocidad;
    // End of variables declaration//GEN-END:variables
}
