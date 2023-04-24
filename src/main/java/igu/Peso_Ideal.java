/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import java.text.DecimalFormat;
import javax.swing.*;

/**
 * @author Camila Acosta
 */

public class Peso_Ideal extends javax.swing.JFrame {
  
    String option; //Variable para guardar la opción escogida en el Box de Género
    
    public Peso_Ideal() {
        initComponents();//Método para inicializar los componentes de la vista
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_TextCM = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Genero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        boxGenero = new javax.swing.JComboBox<>();
        jLabel_Altura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel_TextCM_pi = new javax.swing.JLabel();

        jLabel_TextCM.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        jLabel_TextCM.setText("cm");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 251, 213));

        jLabel_Genero.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel_Genero.setText("Género");

        jPanel2.setBackground(new java.awt.Color(255, 146, 0));
        jPanel2.setForeground(new java.awt.Color(255, 146, 0));

        jLabel_Titulo.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("PESO IDEAL (IBW)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addComponent(jLabel_Titulo)
                .addGap(206, 206, 206))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel_Titulo)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        boxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- selecciona ---", "Hombre", "Mujer" }));
        boxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxGeneroActionPerformed(evt);
            }
        });

        jLabel_Altura.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel_Altura.setText("Altura");

        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(255, 146, 0));
        btnCalcular.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(255, 146, 0));
        btnRegresar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel_TextCM_pi.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        jLabel_TextCM_pi.setText("cm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(552, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Genero)
                            .addComponent(jLabel_Altura))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_TextCM_pi))
                            .addComponent(boxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Genero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Altura)
                    .addComponent(jLabel_TextCM_pi))
                .addGap(34, 34, 34)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        Limpiar();
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void boxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxGeneroActionPerformed
        option = (String)boxGenero.getSelectedItem();
    }//GEN-LAST:event_boxGeneroActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double Mujer = 53.1;
        double Hombre = 56.2;
        
        int txtAltura1;
        double resultado;
        
        try {
            txtAltura1 = Integer.parseInt(txtAltura.getText());

            if(option.equals("Hombre")){
                resultado = Hombre + (1.41*((txtAltura1/2.54)-60));
                DecimalFormat df = new DecimalFormat("#.##");                
                
                JOptionPane.showMessageDialog(this, "SU PESO IDEAL ES: "+df.format(resultado),"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                
            } else if(option.equals("Mujer")){
                
                resultado = Mujer + (1.36*((txtAltura1/2.54)-60));
                DecimalFormat df = new DecimalFormat("#.##");                             
                               
                JOptionPane.showMessageDialog(this, "SU PESO IDEAL ES: "+df.format(resultado),"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
            
            } else 
                JOptionPane.showMessageDialog(this, "Selecciona un género");
            
        } catch (NumberFormatException | NullPointerException e) {
            
            if (e instanceof NumberFormatException) {
                JOptionPane.showMessageDialog(this, "Ingrese solo números enteros","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            }
                JOptionPane.showMessageDialog(this, "Selecciona un género","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                return;
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        index I = new index();
        I.setVisible(true);
        I.setLocationRelativeTo(null);
        this.dispose();        
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Peso_Ideal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peso_Ideal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peso_Ideal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peso_Ideal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peso_Ideal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxGenero;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel_Altura;
    private javax.swing.JLabel jLabel_Genero;
    private javax.swing.JLabel jLabel_TextCM;
    private javax.swing.JLabel jLabel_TextCM_pi;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAltura;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        boxGenero.setSelectedItem("Selecciona una opción");
        txtAltura.setText("");
    }

 
}
