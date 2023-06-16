package vista;

import controlador.Registro;
import javax.swing.JOptionPane;
import modelo.Encomiendas;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.util.ArrayList;
import sql.Conexion;

public class Jf_registro extends javax.swing.JFrame {

    private static Jf_registro instancia;

        public static Jf_registro getInstancia() {
        if(instancia == null) {

            instancia = new Jf_registro();
        }
        return instancia; 
    }
    
    public Jf_registro() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false); // Oculta la ventana cuando se cierra
            }
        }); 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        tf_destinatario = new javax.swing.JTextField();
        tf_direccion = new javax.swing.JTextField();
        tf_remitente = new javax.swing.JTextField();
        cb_tipo = new javax.swing.JComboBox<>();
        cb_tamaño = new javax.swing.JComboBox<>();
        chb_entrega = new javax.swing.JCheckBox();
        btn_agregar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_buscarId = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setMaximumSize(new java.awt.Dimension(415, 360));
        setMinimumSize(new java.awt.Dimension(415, 360));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO ENCOMIENDAS");

        jLabel2.setText("ID");

        jLabel3.setText("Destinatario:");

        jLabel4.setText("Direccion");

        jLabel5.setText("Tipo Encomienda");

        jLabel6.setText("Tamaño");

        jLabel7.setText("Remitente");

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sobre", "Paquete" }));
        cb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipoActionPerformed(evt);
            }
        });

        cb_tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeño", "Mediano", "Grande" }));

        chb_entrega.setText("Entrega a Domicilio");

        btn_agregar.setBackground(new java.awt.Color(153, 153, 255));
        btn_agregar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(255, 153, 153));
        btn_modificar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(153, 153, 255));
        btn_limpiar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_buscarId.setBackground(new java.awt.Color(204, 204, 255));
        btn_buscarId.setText("Buscar ID");
        btn_buscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_remitente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_destinatario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_id)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_tamaño, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(chb_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_buscarId)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chb_entrega)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(tf_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tipoActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

        // TODO add your handling code here:
            Encomiendas encomiendas = new Encomiendas();
            encomiendas.setId(Integer.parseInt(this.tf_id.getText().trim()));
            encomiendas.setDestinatario(this.tf_destinatario.getText().trim());
            encomiendas.setDireccion(this.tf_direccion.getText().trim());
            encomiendas.setTipoEncomienda(this.cb_tipo.getSelectedItem().toString());
            encomiendas.setEntrega(this.chb_entrega.isSelected());
            encomiendas.setTamano(this.cb_tamaño.getSelectedItem().toString());
            encomiendas.setRemitente(this.tf_remitente.getText().trim());
            if (Registro.agregarRegistro(encomiendas)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Registro Grabado");  
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se registraron los datos");
            }
        

    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        
        Encomiendas encomienda = new Encomiendas();
        encomienda.setId(Integer.parseInt(this.tf_id.getText().trim()));
        encomienda.setDestinatario(this.tf_destinatario.getText().trim());
        encomienda.setDireccion(this.tf_direccion.getText().trim());
        encomienda.setTipoEncomienda(this.cb_tipo.getSelectedItem().toString());
        encomienda.setEntrega(this.chb_entrega.isSelected());
        encomienda.setTamano(this.cb_tamaño.getSelectedItem().toString());
        encomienda.setRemitente(this.tf_remitente.getText().trim());
        
        if(Registro.editarRegistro(encomienda)){
            javax.swing.JOptionPane.showMessageDialog(this, "Registro modificado");
        } else{
            javax.swing.JOptionPane.showMessageDialog(this, "No se modificó el registro");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        tf_id.setText("");
        tf_destinatario.setText("");
        tf_direccion.setText("");
        cb_tipo.setSelectedIndex(0);
        chb_entrega.setSelected(false);
        tf_remitente.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_buscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarIdActionPerformed
        // TODO add your handling code here:
        int idBuscado = Integer.parseInt(tf_id.getText().trim());

        Encomiendas encomiendas = Registro.buscarPorEncomienda(idBuscado);

        if(encomiendas ==null){
            JOptionPane.showMessageDialog(null, "Id no encontrado");
        }else {
            this.tf_destinatario.setText(encomiendas.getDestinatario());
            this.tf_direccion.setText(encomiendas.getDireccion());
            this.cb_tipo.setSelectedItem(encomiendas.getTipoEncomienda());
            this.chb_entrega.setSelected(encomiendas.getEntrega());
            this.cb_tamaño.setSelectedItem(encomiendas.getTamano());
            this.tf_remitente.setText(encomiendas.getRemitente());
        }
        
    }//GEN-LAST:event_btn_buscarIdActionPerformed

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
            java.util.logging.Logger.getLogger(Jf_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jf_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jf_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jf_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jf_registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscarId;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox<String> cb_tamaño;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JCheckBox chb_entrega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tf_destinatario;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_remitente;
    // End of variables declaration//GEN-END:variables
}
