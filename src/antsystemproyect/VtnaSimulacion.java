/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package antsystemproyect;

/**
 *
 * @author Jesús
 */
public class VtnaSimulacion extends javax.swing.JFrame {

    /**
     * Creates new form VtnaSimulacion
     */
    public VtnaSimulacion() {
        initComponents();
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
        spinnerCiclos = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        txtHormigasSimulacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGradoFeromona = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtVisibilidadCiudades = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCiudadPartida = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnSimular = new javax.swing.JButton();
        btnVtnaSimularVolver = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(625, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Simulación");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 190, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Indica el número de ciclos que deseas realizar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 330, 30));
        getContentPane().add(spinnerCiclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 120, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Indica el número de Hormigas que van a participar:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 360, 20));
        getContentPane().add(txtHormigasSimulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 120, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Indica los valores para el grado de importancia de la feromona");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 390, 30));
        getContentPane().add(txtGradoFeromona, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 120, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setText("(Si deseas usar valores por defecto NO ingresar nada por teclado)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 390, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 102));
        jLabel6.setText("Indica los valores para el grado de visibilidad de las ciudades");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 380, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 102));
        jLabel7.setText("(Si deseas usar valores por defecto NO ingresar nada por teclado)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        getContentPane().add(txtVisibilidadCiudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 120, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 102));
        jLabel8.setText("Indica ciudad de partida:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 180, 20));
        getContentPane().add(txtCiudadPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 120, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 102));
        jLabel9.setText("Indica ciudad de llegada:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 170, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 120, 30));

        btnSimular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSimular.setForeground(new java.awt.Color(0, 102, 102));
        btnSimular.setText("Simular");
        getContentPane().add(btnSimular, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 100, 40));

        btnVtnaSimularVolver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVtnaSimularVolver.setForeground(new java.awt.Color(0, 102, 102));
        btnVtnaSimularVolver.setText("Volver");
        btnVtnaSimularVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVtnaSimularVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVtnaSimularVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 80, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/ImagenSimulacion.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVtnaSimularVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVtnaSimularVolverActionPerformed
        this.setVisible(false);
        Principal ventana = new Principal();
        ventana.setVisible(true);

    }//GEN-LAST:event_btnVtnaSimularVolverActionPerformed

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
            java.util.logging.Logger.getLogger(VtnaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnaSimulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimular;
    private javax.swing.JButton btnVtnaSimularVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JSpinner spinnerCiclos;
    private javax.swing.JTextField txtCiudadPartida;
    private javax.swing.JTextField txtGradoFeromona;
    private javax.swing.JTextField txtHormigasSimulacion;
    private javax.swing.JTextField txtVisibilidadCiudades;
    // End of variables declaration//GEN-END:variables
}
