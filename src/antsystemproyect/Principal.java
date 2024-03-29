package antsystemproyect;



import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Esta clase representa el código e interfaz de la Ventana Principal que va a ser mostrado inicialmente para poder realizar las demás funciones.
 * @author Jesús
 */


public class Principal extends javax.swing.JFrame {

    Grafo grafo = GlobalGrafo.getGrafo();
    

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //showGrafo.setText(grafo.print());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAddCity = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSaveGrafo = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnLoadGrafo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnVerGrafo = new javax.swing.JButton();
        btnBeingSimulation = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AntSystem");
        setBounds(new java.awt.Rectangle(0, 0, 50000, 100));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(700, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 78, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO AL SISTEMA DE COLONIA DE HORMIGAS");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 600, 40));

        btnAddCity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddCity.setText("Agregar o Eliminar Ciudad");
        btnAddCity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCityActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 200, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("te sugerimos que empieces por añadir las ciudades\"");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 470, 50));

        btnSaveGrafo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSaveGrafo.setText("Guardar Grafo");
        btnSaveGrafo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveGrafoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaveGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, 40));

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setText("Salir");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 200, 40));

        btnLoadGrafo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLoadGrafo.setText("Cargar Grafo");
        btnLoadGrafo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoadGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadGrafoActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoadGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 200, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("\"Para empezar con la simulación");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 470, 50));

        btnVerGrafo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVerGrafo.setText("Mostrar Grafo");
        btnVerGrafo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerGrafoActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 200, 40));

        btnBeingSimulation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBeingSimulation.setText("Iniciar Simulación");
        btnBeingSimulation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBeingSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeingSimulationActionPerformed(evt);
            }
        });
        getContentPane().add(btnBeingSimulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 200, 40));

        jLabel5.setText("Angulo, Jesús");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel6.setText("By:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 40, -1));

        jLabel7.setText("Sanchez, Christian");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/FondoAntSystem.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Código del botón para añadir ciudades.
     * @param evt 
     */
    
    private void btnAddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCityActionPerformed
        this.setVisible(false);
        VtnaCiudad ventana = new VtnaCiudad();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnAddCityActionPerformed

    
    /**
     * Código del botón para aguardar el grafo.
     * @param evt 
     */
    
    private void btnSaveGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveGrafoActionPerformed
        FileChosser doc = new FileChosser();
        
        try {
            doc.GuardarTxt();
            JOptionPane.showMessageDialog(null, "Se ha guardado exitosamente!!","EXITO",JOptionPane.INFORMATION_MESSAGE);
            

        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se ha guardado el guardado el grafo","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveGrafoActionPerformed

    /**
     * Código del botón para cerrar el programa.
     * @param evt 
     */
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * Este código representa la opción de cargar un grafo anteriormente guardado.
     * @param evt 
     */
    
    private void btnLoadGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadGrafoActionPerformed
        FileChosser doc = new FileChosser();
        String[] ari = doc.getAri();
        try {
            doc.ReadDoc();

            grafo.setNumVerts(doc.getNumVertices());

            for (int i = 0; i < doc.getNumAri(); i++) {
                String[] n = ari[i].split(",");

                int v1 = Integer.parseInt(n[0]) - 1;
                int v2 = Integer.parseInt(n[1]) - 1;

                double s = Double.parseDouble(n[2]);

                grafo.addArista(v1, v2, s);
            }
            JOptionPane.showMessageDialog(null, "Se ha cargado el grafo exitosamente !!","EXITO",JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Este archivo no contiene un grafo","ERROR",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoadGrafoActionPerformed

    /**
     * Este código representa la opción de poder visualizar el grafo ya creado en la simulación.
     * @param evt 
     */
    
    private void btnVerGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerGrafoActionPerformed
        GraphStream visual = new GraphStream();
        visual.showGrafo(grafo.getArray());
    }//GEN-LAST:event_btnVerGrafoActionPerformed

    /**
     * Este código representa la opción para iniciar la simulación del programa AntSystem.
     * @param evt 
     */
    
    private void btnBeingSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeingSimulationActionPerformed
        VtnaSimulacion ventana = new VtnaSimulacion();
        this.setVisible(false);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnBeingSimulationActionPerformed

    
    
    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
       
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited

    }//GEN-LAST:event_btnExitMouseExited
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCity;
    private javax.swing.JButton btnBeingSimulation;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLoadGrafo;
    private javax.swing.JButton btnSaveGrafo;
    private javax.swing.JButton btnVerGrafo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
