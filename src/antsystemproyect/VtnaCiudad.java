package antsystemproyect;

import javax.swing.JOptionPane;

/**
 * Esta clase representa el código e interfaz de la Ventana para implementar y modificar ciudades que va a ser mostrado una vez el usuario ingrse en el botón 
 * correspondiente del Menú Principal.
 * @author Jesús
 */

public class VtnaCiudad extends javax.swing.JFrame {
    Grafo grafo = GlobalGrafo.getGrafo();
    
    
    /**
     * Método que abre la ventana de ciudades.
     */
    
    public VtnaCiudad() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        showMatriz.setText(grafo.print());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVtnaRemoveCity1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVtnaRemoveAri = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVtnaAddCity = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRemoveCity = new javax.swing.JTextField();
        txtAddpesoCity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDeleteAristaCiudadPartida = new javax.swing.JTextField();
        txtDeleteAristaCiudadLlegada = new javax.swing.JTextField();
        btnVtnPrincipal = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtAddCity = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnVtnaAddAristaCity = new javax.swing.JButton();
        btnVtnaRemoveCity = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtAddSegundaAristaCity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        showMatriz = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        TXT = new javax.swing.JLabel();
        txtAddAristaPrimeraCiudad = new javax.swing.JTextField();

        btnVtnaRemoveCity1.setText("Eliminar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar o Eliminar Ciudad");
        setBounds(new java.awt.Rectangle(0, 0, 575, 330));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(472, 340));
        setPreferredSize(new java.awt.Dimension(1060, 360));
        setSize(new java.awt.Dimension(473, 340));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Eliminando Vertice...");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        btnVtnaRemoveAri.setText("Eliminar");
        btnVtnaRemoveAri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVtnaRemoveAri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVtnaRemoveAriActionPerformed(evt);
            }
        });
        getContentPane().add(btnVtnaRemoveAri, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 90, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Eliminando Arista...");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Peso");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 50, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Escribe el numero de la ciudad que deseas añadir ");
        jLabel5.setMinimumSize(new java.awt.Dimension(758, 400));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 40, 390, 30));

        btnVtnaAddCity.setText("Agregar");
        btnVtnaAddCity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVtnaAddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVtnaAddCityActionPerformed(evt);
            }
        });
        getContentPane().add(btnVtnaAddCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 90, 30));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 10, 340));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("Agregando Vertice...");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Escribe los numeros de las ciudades para eliminar una Arista");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 390, 30));

        txtRemoveCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemoveCityActionPerformed(evt);
            }
        });
        getContentPane().add(txtRemoveCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 60, 30));

        txtAddpesoCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddpesoCityActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddpesoCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 50, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Primera");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 110, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Escribe el numero de la ciudad que deseas eliminar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 210, 390, 30));

        txtDeleteAristaCiudadPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteAristaCiudadPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(txtDeleteAristaCiudadPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 70, 30));

        txtDeleteAristaCiudadLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteAristaCiudadLlegadaActionPerformed(evt);
            }
        });
        getContentPane().add(txtDeleteAristaCiudadLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 70, 30));

        btnVtnPrincipal.setText("Menu Principal");
        btnVtnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVtnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVtnPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(btnVtnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 120, 30));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 760, 10));

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Segunda");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 90, 30));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 760, 10));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 450, 10));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setText("Agregando Arista...");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 140, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Escribe los numeros de las ciudades para agregar una Arista");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 390, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Primera");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 110, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Segunda ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 90, 30));

        txtAddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddCityActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 60, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setText("--");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 30, -1));

        btnVtnaAddAristaCity.setText("Agregar");
        btnVtnaAddAristaCity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVtnaAddAristaCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVtnaAddAristaCityActionPerformed(evt);
            }
        });
        getContentPane().add(btnVtnaAddAristaCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 90, 30));

        btnVtnaRemoveCity.setText("Eliminar");
        btnVtnaRemoveCity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVtnaRemoveCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVtnaRemoveCityActionPerformed(evt);
            }
        });
        getContentPane().add(btnVtnaRemoveCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 90, 30));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 10, 340));

        jLabel1.setText("Matriz del grafo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, -1, -1));

        txtAddSegundaAristaCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddSegundaAristaCityActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddSegundaAristaCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 70, 30));

        showMatriz.setColumns(20);
        showMatriz.setRows(5);
        jScrollPane1.setViewportView(showMatriz);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, -1, 160));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));
        getContentPane().add(TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        txtAddAristaPrimeraCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddAristaPrimeraCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddAristaPrimeraCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 70, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método vacío TextField para eliminar ciudades del grafo.
     * @param evt 
     */
    
    private void txtRemoveCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemoveCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemoveCityActionPerformed

    /**
     * Método vacío TextField para agregar el peso a las aristas que une ciudades del grafo.
     * @param evt 
     */
    
    private void txtAddpesoCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddpesoCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddpesoCityActionPerformed

    /**
     * Método vacío TextField para eliminar la arista que sale de la ciudad de partida.
     * @param evt 
     */
    
    private void txtDeleteAristaCiudadPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteAristaCiudadPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeleteAristaCiudadPartidaActionPerformed

    /**
     * Método vacío TextField para eliminar la arista que recibe la ciudad de llegada.
     * @param evt 
     */
    
    private void txtDeleteAristaCiudadLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteAristaCiudadLlegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeleteAristaCiudadLlegadaActionPerformed

    /**
     * Método vacío TextField para que el usuario ingrese la ciudad que desea añadir.
     * @param evt 
     */
    
    private void txtAddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddCityActionPerformed

    /**
     * Método para agregar un vértice(Ciudad) al grafo.
     * @param evt 
     */
    
    private void btnVtnaAddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVtnaAddCityActionPerformed
        int c1;
        int max = grafo.getNumVerts();

        try{
            if("".equals(txtAddCity.getText())){
                JOptionPane.showMessageDialog(null, "Agregue cuantas ciudades desea agregar");
            }else{
            
            
            c1 = Integer.parseInt(txtAddCity.getText());
            
            grafo.insertVertice(c1);
            showMatriz.setText(grafo.print());
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error el input no es un num");   
        }
 
    }//GEN-LAST:event_btnVtnaAddCityActionPerformed

    /**
     * Método para agregar arista que unen las ciudades.
     * @param evt 
     */
    
    private void btnVtnaAddAristaCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVtnaAddAristaCityActionPerformed

        int c1;
        int c2;
        double p;
        int max = grafo.getNumVerts();

        try{
            if("".equals(txtAddAristaPrimeraCiudad.getText())){
                JOptionPane.showMessageDialog(null, "Agrega a que la primera ciudad");
            }else if("".equals(txtAddSegundaAristaCity.getText())){
                JOptionPane.showMessageDialog(null, "Agregue la segunda ciudad");
            }else if("".equals(txtAddpesoCity.getText())){
                JOptionPane.showMessageDialog(null, "Agregue la distancia entre las ciudades");
            }else if(Integer.parseInt(txtAddAristaPrimeraCiudad.getText())> max){
                JOptionPane.showMessageDialog(null, "Esta ciudad no se encuentra en el rango");
            }else if(Integer.parseInt(txtAddSegundaAristaCity.getText())> max){
                JOptionPane.showMessageDialog(null, "Esta ciudad no se encuentra en el rango");
            }else{
                
            c1 = Integer.parseInt(txtAddAristaPrimeraCiudad.getText());
            c2 = Integer.parseInt(txtAddSegundaAristaCity.getText());
            p = Double.parseDouble(txtAddpesoCity.getText());
            grafo.addArista(c1-1, c2-1, p);
            showMatriz.setText(grafo.print());
        }
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error el input no es un num");   
        }
        
    }//GEN-LAST:event_btnVtnaAddAristaCityActionPerformed

    /**
     * TextField vacío para indicar la ciudad de llegada de la arista.
     * @param evt 
     */
    
    private void txtAddSegundaAristaCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddSegundaAristaCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddSegundaAristaCityActionPerformed

    /**
     * Método del botón que regresa al menú principal.
     * @param evt 
     */
    
    private void btnVtnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVtnPrincipalActionPerformed
       this.setVisible(false);
        Principal ventana = new Principal();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnVtnPrincipalActionPerformed

    /**
     * Método del botón para eliminar una arista.
     * @param evt 
     */
    
    private void btnVtnaRemoveAriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVtnaRemoveAriActionPerformed
        int c1;
        int c2;
        int max = grafo.getNumVerts();
        try{
            if("".equals(txtDeleteAristaCiudadPartida.getText())){
                JOptionPane.showMessageDialog(null, "Agrega a que la primera ciudad");
            }else if("".equals(txtDeleteAristaCiudadLlegada.getText())){
                JOptionPane.showMessageDialog(null, "Agregue la segunda ciudad");
            }else if(Integer.parseInt(txtDeleteAristaCiudadPartida.getText())> max){
                JOptionPane.showMessageDialog(null, "Esta ciudad no se encuentra en el rango");
            }else if(Integer.parseInt(txtDeleteAristaCiudadLlegada.getText())> max){
                JOptionPane.showMessageDialog(null, "Esta ciudad no se encuentra en el rango");
            }else{
            c1 = Integer.parseInt(txtDeleteAristaCiudadPartida.getText());
            c2 = Integer.parseInt(txtDeleteAristaCiudadLlegada.getText());
            grafo.deleteArista(c1-1, c2-1);
            showMatriz.setText(grafo.print());
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error el input no es un num");   
        }
    }//GEN-LAST:event_btnVtnaRemoveAriActionPerformed

    /**
     * TextField vacío para indicar la ciudad de partida de la arista.
     * @param evt 
     */
    
    private void txtAddAristaPrimeraCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddAristaPrimeraCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddAristaPrimeraCiudadActionPerformed

    /**
     * Método del botón para eliminar una ciudad.
     * @param evt 
     */
    
    private void btnVtnaRemoveCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVtnaRemoveCityActionPerformed
        int c1;
        int max = grafo.getNumVerts();
        try{
            if("".equals(txtRemoveCity.getText())){
                JOptionPane.showMessageDialog(null, "Agregue la ciudad que deseas eliminar");
            }else if(Integer.parseInt(txtRemoveCity.getText())< max){
                JOptionPane.showMessageDialog(null, "Esta ciudad no existe en el grafo");
            }else{
            c1 = Integer.parseInt(txtRemoveCity.getText());
            
            grafo.removeVertice(c1);
            showMatriz.setText(grafo.print());
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error el input no es un num");   
        }
    }//GEN-LAST:event_btnVtnaRemoveCityActionPerformed

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
            java.util.logging.Logger.getLogger(VtnaCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnaCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnaCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnaCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnaCiudad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TXT;
    private javax.swing.JButton btnVtnPrincipal;
    private javax.swing.JButton btnVtnaAddAristaCity;
    private javax.swing.JButton btnVtnaAddCity;
    private javax.swing.JButton btnVtnaRemoveAri;
    private javax.swing.JButton btnVtnaRemoveCity;
    private javax.swing.JButton btnVtnaRemoveCity1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextArea showMatriz;
    private javax.swing.JTextField txtAddAristaPrimeraCiudad;
    private javax.swing.JTextField txtAddCity;
    private javax.swing.JTextField txtAddSegundaAristaCity;
    private javax.swing.JTextField txtAddpesoCity;
    private javax.swing.JTextField txtDeleteAristaCiudadLlegada;
    private javax.swing.JTextField txtDeleteAristaCiudadPartida;
    private javax.swing.JTextField txtRemoveCity;
    // End of variables declaration//GEN-END:variables
}
