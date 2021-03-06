package Interfaz;

import javax.swing.JOptionPane;

public class JFCitas extends javax.swing.JFrame {
    
    String salida = " ";

    public JFCitas() {
        initComponents();
        this.setLocationRelativeTo(null);
        
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
        jCBLunes = new javax.swing.JComboBox<>();
        jCBMartes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCBMiercoles = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jCBJueves = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCBViernes = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jCBSabado = new javax.swing.JComboBox<>();
        jBAceptar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("CITAS:");

        jLabel2.setText("LUNES:");

        jCBLunes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8-9 am", "9-10 am", "10-11 am", "11-12 pm", "12-13 pm ", "14-15 pm", "15-16 pm", " " }));
        jCBLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBLunesActionPerformed(evt);
            }
        });

        jCBMartes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8-9 am", "9-10 am", "10-11 am", "11-12 pm", "12-13 pm ", "14-15 pm", "15-16 pm", " " }));
        jCBMartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMartesActionPerformed(evt);
            }
        });

        jLabel3.setText("MARTES:");

        jLabel4.setText("MIÉRCOLES:");

        jCBMiercoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8-9 am", "9-10 am", "10-11 am", "11-12 pm", "12-13 pm ", "14-15 pm", "15-16 pm", " " }));
        jCBMiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMiercolesActionPerformed(evt);
            }
        });

        jLabel5.setText("JUEVES:");

        jCBJueves.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8-9 am", "9-10 am", "10-11 am", "11-12 pm", "12-13 pm ", "14-15 pm", "15-16 pm" }));
        jCBJueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBJuevesActionPerformed(evt);
            }
        });

        jLabel6.setText("VIERNES:");

        jCBViernes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8-9 am", "9-10 am", "10-11 am", "11-12 pm", "12-13 pm ", "14-15 pm", "15-16 pm" }));
        jCBViernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBViernesActionPerformed(evt);
            }
        });

        jLabel7.setText("SÁBADO:");

        jCBSabado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8-9 am", "9-10 am", "10-11 am", "11-12 pm", "12-13 pm ", "14-15 pm", "15-16 pm" }));
        jCBSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSabadoActionPerformed(evt);
            }
        });

        jBAceptar.setText("Aceptar");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        jLabel8.setText("Descripción:");

        jTADescripcion.setBackground(new java.awt.Color(255, 255, 255));
        jTADescripcion.setColumns(20);
        jTADescripcion.setRows(5);
        jScrollPane1.setViewportView(jTADescripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel4)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel6)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCBMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAceptar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBJueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBAceptar)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBLunesActionPerformed
        
        salida = "Lunes "+this.jCBLunes.getSelectedItem().toString();
    }//GEN-LAST:event_jCBLunesActionPerformed

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        JOptionPane.showMessageDialog(null,"Cita agendada con éxito!!! "+salida);
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jCBMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMartesActionPerformed
        
        salida = "Martes " + this.jCBMartes.getSelectedItem().toString();
    }//GEN-LAST:event_jCBMartesActionPerformed

    private void jCBMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMiercolesActionPerformed
        salida = "Miércoles "+this.jCBMiercoles.getSelectedItem().toString();
    }//GEN-LAST:event_jCBMiercolesActionPerformed

    private void jCBJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBJuevesActionPerformed
        salida = "Jueves "+ this.jCBJueves.getSelectedItem().toString();
    }//GEN-LAST:event_jCBJuevesActionPerformed

    private void jCBViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBViernesActionPerformed
        salida = "Viernes "+this.jCBViernes.getSelectedItem().toString();
    }//GEN-LAST:event_jCBViernesActionPerformed

    private void jCBSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSabadoActionPerformed
        salida = "Sábado "+ this.jCBSabado.getSelectedItem().toString();
    }//GEN-LAST:event_jCBSabadoActionPerformed

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
            java.util.logging.Logger.getLogger(JFCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JComboBox<String> jCBJueves;
    private javax.swing.JComboBox<String> jCBLunes;
    private javax.swing.JComboBox<String> jCBMartes;
    private javax.swing.JComboBox<String> jCBMiercoles;
    private javax.swing.JComboBox<String> jCBSabado;
    private javax.swing.JComboBox<String> jCBViernes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADescripcion;
    // End of variables declaration//GEN-END:variables
}
