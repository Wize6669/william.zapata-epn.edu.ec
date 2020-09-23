
package Interfaces;

import Fuentes.Estudiante;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class JFEstudiante extends javax.swing.JFrame {

    Estudiante estudiante;
    
        public JFEstudiante() {
            initComponents();
            this.setLocationRelativeTo(null);
            estudiante = new Estudiante();
        }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBAceptar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTF = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jTFCedula = new javax.swing.JTextField();
        jTFN1 = new javax.swing.JTextField();
        jTFN2 = new javax.swing.JTextField();
        jTFN3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAResultados = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBAceptar.setText("Aceptar");
        jBAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBNuevo.setText("Nuevo");
        jBNuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Nombre");

        jLabel4.setText("Cedula");

        jLabel5.setText("Nota 1");

        jLabel6.setText("Nota 2");

        jTF.setText("Nota 3");

        jTFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreActionPerformed(evt);
            }
        });
        jTFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNombreKeyPressed(evt);
            }
        });

        jTFCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCedulaActionPerformed(evt);
            }
        });
        jTFCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFCedulaKeyPressed(evt);
            }
        });

        jTFN1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFN1KeyPressed(evt);
            }
        });

        jTFN2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFN2KeyPressed(evt);
            }
        });

        jTFN3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFN3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTF, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFN2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jTFN3)
                    .addComponent(jTFN1)
                    .addComponent(jTFCedula)
                    .addComponent(jTFNombre))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF)
                    .addComponent(jTFN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Datos");

        jTAResultados.setColumns(20);
        jTAResultados.setRows(5);
        jScrollPane1.setViewportView(jTAResultados);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Resultado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAceptar)
                    .addComponent(jBSalir)
                    .addComponent(jBNuevo))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        estudiante.setNombre(this.jTFNombre.getText());
        estudiante.setCedula(Long.parseLong(this.jTFCedula.getText()));
        try{
            estudiante.setN1(Float.parseFloat(this.jTFN1.getText()));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Por valor Ingrese números en Nota 1");
            this.jTFN1.setText("");
        }
        try{
            estudiante.setN2(Float.parseFloat(this.jTFN2.getText())); 
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Por valor Ingrese números en Nota 2");
            this.jTFN2.setText("");
        }
        try{
            estudiante.setN3(Float.parseFloat(this.jTFN3.getText())); 
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Por valor Ingrese números en Nota 3");
            this.jTFN3.setText("");
        }
        
        String salida="";
        salida+=estudiante.toString();
        if(estudiante.aprueba())
            salida+="\n Aprueba";
        else
            salida+="\n No Aprueba";
        this.jTAResultados.setText(salida);
        
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jTFCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCedulaActionPerformed

    private void jTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        this.jTFNombre.setText("");
        this.jTFCedula.setText("");
        this.jTFN1.setText("");
        this.jTFN2.setText("");
        this.jTF.setText("");
        this.jTFNombre.requestFocus();

    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTFNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreKeyPressed

    private void jTFCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCedulaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCedulaKeyPressed

    private void jTFN1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFN1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
    {
        try
        {
            estudiante.setN1(Float.parseFloat(this.jTFN1.getText()));
            if(estudiante.Validacion1())
            {
                this.jTFN2.setText("");
                this.jTFN2.requestFocus();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"solo admite valores entre 1 y 10 en este campo");
                this.jTFN1.setText("");
                this.jTFN1.requestFocus();
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"solo se pueden ingresar numero en este campo");
            this.jTFN1.setText("");
            this.jTFN1.requestFocus();
        }
    }
    }//GEN-LAST:event_jTFN1KeyPressed

    private void jTFN2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFN2KeyPressed
            if(evt.getKeyCode()==KeyEvent.VK_ENTER)
    {
        try
        {
            estudiante.setN2(Float.parseFloat(this.jTFN2.getText()));
            if(estudiante.Validacion2())
            {
                this.jTFN3.setText("");
                this.jTFN3.requestFocus();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"solo admite valores entre 1 y 10 en este campo");
                this.jTFN2.setText("");
                this.jTFN2.requestFocus();
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"solo se pueden ingresar numero en este campo");
            this.jTFN2.setText("");
            this.jTFN2.requestFocus();
        }
    }
    }//GEN-LAST:event_jTFN2KeyPressed

    private void jTFN3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFN3KeyPressed
           if(evt.getKeyCode()==KeyEvent.VK_ENTER)
    {
        try
        {
            estudiante.setN3(Float.parseFloat(this.jTFN3.getText()));
            if(estudiante.Validacion3())
            {
              
                this.jBAceptar.requestFocus();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"solo admite valores entre 1 y 10 en este campo");
                this.jTFN3.setText("");
                this.jTFN3.requestFocus();
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"solo se pueden ingresar numero en este campo");
            this.jTFN3.setText("");
            this.jTFN3.requestFocus();
        }
    }
    }//GEN-LAST:event_jTFN3KeyPressed

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
            java.util.logging.Logger.getLogger(JFEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAResultados;
    private javax.swing.JLabel jTF;
    private javax.swing.JTextField jTFCedula;
    private javax.swing.JTextField jTFN1;
    private javax.swing.JTextField jTFN2;
    private javax.swing.JTextField jTFN3;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables
}
