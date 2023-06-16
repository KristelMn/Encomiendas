package vista;


import controlador.Registro;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import modelo.Encomiendas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Jf_listar extends javax.swing.JFrame {

        private static Jf_listar instancia;

    public static Jf_listar getInstancia() {

        if(instancia == null) {

            instancia = new Jf_listar();
        }
        return instancia;
 
    }

    public Jf_listar() {
        initComponents();
        actualizarTabla();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false); // Oculta la ventana cuando se cierra
            }
        });    
    }
    
 private void actualizarTabla(){
     ArrayList<Encomiendas> lista= Registro.mostrarTodo();
     String matriz[][] = new String[lista.size()][7];
     
     for(int i=0; i<lista.size();i++){
         matriz[i][0]= lista.get(i).getId()+"";
         matriz[i][1]=lista.get(i).getDestinatario();
         matriz[i][2]=lista.get(i).getDireccion();
         matriz[i][3]=lista.get(i).getTipoEncomienda();
         matriz[i][4]=lista.get(i).getEntrega()?"A domicilio":"En sucursal";
         matriz[i][5]=lista.get(i).getTamano();
         matriz[i][6]=lista.get(i).getRemitente();
     }
    tb_encomiendas.setModel(new javax.swing.table.DefaultTableModel(
    matriz,
            new String[]{
                "ID","DESTINATARIO","DIRECCION","TIPOENCOMIENDA","ENTREGA","TAMANO","REMITENTE"
            }
    )
    );
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_listarId = new javax.swing.JTextField();
        btn_generarLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_encomiendas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(794, 373));
        setMinimumSize(new java.awt.Dimension(794, 373));

        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de encomiendas");

        btn_generarLista.setBackground(new java.awt.Color(153, 204, 255));
        btn_generarLista.setText("Generar Listado");
        btn_generarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarListaActionPerformed(evt);
            }
        });

        tb_encomiendas.setBackground(new java.awt.Color(255, 204, 204));
        tb_encomiendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        tb_encomiendas.setPreferredSize(new java.awt.Dimension(794, 373));
        jScrollPane1.setViewportView(tb_encomiendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_listarId, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_generarLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_listarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_generarLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarListaActionPerformed
    
        String idText = tf_listarId.getText().trim();
    
        // Verificar si el campo de búsqueda está vacío
        if (idText.isEmpty()) {
            // Mostrar el listado completo
            actualizarTabla();
            return;
        }
        int id = Integer.parseInt(tf_listarId.getText());
        Encomiendas buscada = Registro.buscarPorEncomienda(id);
        if (buscada ==null){
            JOptionPane.showMessageDialog(null, "ID no encontrado");
        }else {
            String[][] datos = {
                {Integer.toString(buscada.getId()),buscada.getDestinatario(), buscada.getDireccion(),
                    buscada.getTipoEncomienda(), buscada.getEntrega()? "A domicilio": "En sucursal",
                    buscada.getTamano(), buscada.getRemitente()
                }
                
            };
            tb_encomiendas.setModel(new javax.swing.table.DefaultTableModel(
              datos,
                        new String[]{
                            "ID", "DESTINATARIO","DIRECCION","TIPOENCOMIENDA","ENTREGA","TAMANO","REMITENTE"
                        }
            ));
        }
    }//GEN-LAST:event_btn_generarListaActionPerformed

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
            java.util.logging.Logger.getLogger(Jf_listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jf_listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jf_listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jf_listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jf_listar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generarLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_encomiendas;
    private javax.swing.JTextField tf_listarId;
    // End of variables declaration//GEN-END:variables
}
