package vista;

import java.awt.Color;
import sun.jvm.hotspot.types.JFloatField;
import vista.Jf_listar;
import vista.Jf_registro;

public class Jf_menu extends javax.swing.JFrame {

    public Jf_menu() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_agregar = new javax.swing.JMenuItem();
        mi_eliminar = new javax.swing.JMenuItem();
        mi_listar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(350, 100));
        setMinimumSize(new java.awt.Dimension(350, 100));

        jMenu1.setText("Procesos");

        mi_agregar.setText("Agregar");
        mi_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_agregarActionPerformed(evt);
            }
        });
        jMenu1.add(mi_agregar);

        mi_eliminar.setText("Eliminar");
        mi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_eliminarActionPerformed(evt);
            }
        });
        jMenu1.add(mi_eliminar);

        mi_listar.setText("Listar");
        mi_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_listarActionPerformed(evt);
            }
        });
        jMenu1.add(mi_listar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Terminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_agregarActionPerformed
        // TODO add your handling code here:
        Jf_registro jfr = Jf_registro.getInstancia();
        jfr.setDefaultCloseOperation(Jf_registro.DISPOSE_ON_CLOSE);
        jfr.setVisible(true);
    }//GEN-LAST:event_mi_agregarActionPerformed

    private void mi_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_listarActionPerformed
        // TODO add your handling code here:
        Jf_listar jfl = Jf_listar.getInstancia();
        jfl.setDefaultCloseOperation(Jf_listar.DISPOSE_ON_CLOSE);
        jfl.setVisible(true);
    }//GEN-LAST:event_mi_listarActionPerformed

    private void mi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_eliminarActionPerformed
        // TODO add your handling code here:
        Jf_eliminar jfe =Jf_eliminar.getInstancia();
        jfe.setVisible(true);
        jfe.setDefaultCloseOperation(Jf_eliminar.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_mi_eliminarActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Jf_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jf_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jf_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jf_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jf_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mi_agregar;
    private javax.swing.JMenuItem mi_eliminar;
    private javax.swing.JMenuItem mi_listar;
    // End of variables declaration//GEN-END:variables
}
