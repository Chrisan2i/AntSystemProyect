
package antsystemproyect;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;


/*import antsystemproyect.AntOptimization;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;*/

/**
 *Clase de interfaz para realizar Simulación del programa.
 * @author Jesús
 */
public class VtnaSimulacion extends javax.swing.JFrame {
    Grafo grafo = GlobalGrafo.getGrafo();
    GraphStream visual = GlobalGraphStream.getGraph();
    /**
     * Creates new form VtnaSimulacion
     */
    public VtnaSimulacion() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        
        //Validaciones de los componentes del Spinner.
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSimular = new javax.swing.JButton();
        btnVtnaSimularVolver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TEXT = new javax.swing.JTextArea();
        comida = new javax.swing.JTextField();
        gradeP = new javax.swing.JTextField();
        gradeV = new javax.swing.JTextField();
        factorE = new javax.swing.JTextField();
        numCiclos = new javax.swing.JTextField();
        numAnts = new javax.swing.JTextField();
        nido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(625, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Simulación");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 240, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Indica el número de ciclos que deseas realizar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 330, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Indica el número de Hormigas que van a participar:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 360, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Indica los valores para el grado de importancia de la feromona:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 400, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("(Si deseas usar valores por defecto NO ingresar nada por teclado)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 390, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Indica los valores para el grado de visibilidad de las ciudades: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 390, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("(Si deseas usar valores por defecto NO ingresar nada por teclado)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 60));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Indica valores para el factor de evaporación o usar por defecto:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 390, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Indica ciudad de llegada:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 170, 30));

        btnSimular.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSimular.setForeground(new java.awt.Color(0, 102, 102));
        btnSimular.setText("Simular");
        btnSimular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimular, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 250, 50));

        btnVtnaSimularVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVtnaSimularVolver.setForeground(new java.awt.Color(0, 102, 102));
        btnVtnaSimularVolver.setText("Volver");
        btnVtnaSimularVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVtnaSimularVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVtnaSimularVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVtnaSimularVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 480, 130, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Indica ciudad de partida:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 180, 20));

        TEXT.setColumns(20);
        TEXT.setRows(5);
        jScrollPane1.setViewportView(TEXT);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 340, 350));

        comida.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        comida.setText("0");
        comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comidaActionPerformed(evt);
            }
        });
        getContentPane().add(comida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 120, 30));

        gradeP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        gradeP.setText("1");
        gradeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradePActionPerformed(evt);
            }
        });
        getContentPane().add(gradeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 120, 30));

        gradeV.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        gradeV.setText("2");
        gradeV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeVActionPerformed(evt);
            }
        });
        getContentPane().add(gradeV, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 120, 30));

        factorE.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        factorE.setText("0.5");
        factorE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorEActionPerformed(evt);
            }
        });
        getContentPane().add(factorE, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 120, 30));

        numCiclos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numCiclos.setText("0");
        numCiclos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numCiclosActionPerformed(evt);
            }
        });
        getContentPane().add(numCiclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 120, 30));

        numAnts.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numAnts.setText("0");
        numAnts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAntsActionPerformed(evt);
            }
        });
        getContentPane().add(numAnts, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 120, 30));

        nido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nido.setText("0");
        nido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidoActionPerformed(evt);
            }
        });
        getContentPane().add(nido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 120, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/ImagenSimulacion1.jpg.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón para devolver al menú principal.
     * @param evt 
     */
    
    private void btnVtnaSimularVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVtnaSimularVolverActionPerformed
        this.setVisible(false);
        Principal ventana = new Principal();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnVtnaSimularVolverActionPerformed

    /**
     * Botón para iniciar la simulación.
     * @param evt 
     */
    
    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed
        try{
            
            int antsAmount;
            double m = grafo.getNumVerts();
            
            antsAmount = Integer.parseInt(numAnts.getText());
         
            double ti = 1/m;        
           
            System.out.println(antsAmount);
            
            AntOptimization optimus = new AntOptimization(antsAmount);         
            int cycles = Integer.parseInt(numCiclos.getText());
            double GPhermone = Double.parseDouble(gradeP.getText());
            double GVisibility = Double.parseDouble(gradeV.getText());
            double eva = Double.parseDouble(factorE.getText());
            int r = Integer.parseInt(nido.getText());
            int s = Integer.parseInt(comida.getText());
            String result = "";
            int cont_c = 0;    
            int cont = 0;  
            //Cantidad de ciclos que pide el usuario
            while (cont_c < cycles) {
                    
                cont_c ++;
                //Funcion que simula el recorrido de las hormigas 
                String re = optimus.Simulacion(ti, GPhermone, GVisibility, r, s,cont,eva);
                result += re;
       
                TEXT.setText(result);
                cont ++;    
                
            }   visual.Uptdate();
                visual.showGrafo();
                
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
        }  
               
    }//GEN-LAST:event_btnSimularActionPerformed

    private void comidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comidaActionPerformed

    private void gradePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradePActionPerformed

    private void gradeVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeVActionPerformed

    private void factorEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factorEActionPerformed

    private void numCiclosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCiclosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numCiclosActionPerformed

    private void numAntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAntsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numAntsActionPerformed

    private void nidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nidoActionPerformed

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
    private javax.swing.JTextArea TEXT;
    private javax.swing.JButton btnSimular;
    private javax.swing.JButton btnVtnaSimularVolver;
    private javax.swing.JTextField comida;
    private javax.swing.JTextField factorE;
    private javax.swing.JTextField gradeP;
    private javax.swing.JTextField gradeV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nido;
    private javax.swing.JTextField numAnts;
    private javax.swing.JTextField numCiclos;
    // End of variables declaration//GEN-END:variables
}
