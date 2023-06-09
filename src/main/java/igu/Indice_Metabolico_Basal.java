/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import java.text.DecimalFormat;
import javax.swing.*;

/**
 *
 * @author CAMI
 */
public class Indice_Metabolico_Basal extends javax.swing.JFrame {

    String option;
    /**
     * Creates new form Peso_Ideal
     */
    public Indice_Metabolico_Basal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel_Genero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        boxGenero = new javax.swing.JComboBox<>();
        jLabel_Altura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        txtPeso = new javax.swing.JTextField();
        jLabel_Peso = new javax.swing.JLabel();
        jLabel_Edad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        jLabel_TextCM = new javax.swing.JLabel();
        jLabel_TextKG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 251, 213));

        jLabel_Genero.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel_Genero.setText("Género");

        jPanel2.setBackground(new java.awt.Color(255, 146, 0));

        jLabel_Titulo.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("ÍNDICE METABÓLICO BASAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel_Titulo)
                .addContainerGap(138, Short.MAX_VALUE))
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

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        jLabel_Peso.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel_Peso.setText("Peso");

        jLabel_Edad.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel_Edad.setText("Edad");

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(255, 146, 0));
        btnRegresar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel_TextCM.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        jLabel_TextCM.setText("cm");

        jLabel_TextKG.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        jLabel_TextKG.setText("kg");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Genero)
                            .addComponent(jLabel_Altura)
                            .addComponent(jLabel_Peso)
                            .addComponent(jLabel_Edad))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_TextKG)
                                    .addComponent(jLabel_TextCM)))
                            .addComponent(boxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Genero)
                    .addComponent(boxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Altura)
                    .addComponent(jLabel_TextCM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Peso)
                    .addComponent(jLabel_TextKG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Edad))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnRegresar))
                .addContainerGap(12, Short.MAX_VALUE))
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
        //Se crea las variables y se tiene su nùmero predeterminado para màs adelante hacer la operaciòn
        double Mujer = 447.593;
        double MujerP = 9.247;
        double MujerA = 4.330;
        double MujerE = 3.098;
        
        double Hombre = 88.362;
        double HombreP = 13.397;
        double HombreA = 5.677;
        double HombreE = 4.799;
        
        //Variable donde la persona digita su altura, peso y edad
        int txtAltura1, txtPeso1, txtEdad1;
        double resultado;
        try {
            //Convierte el txtAltura, txtPeso y txtEdad en números enteros
            txtAltura1 = Integer.parseInt(txtAltura.getText());
            txtPeso1 = Integer.parseInt(txtPeso.getText());
            txtEdad1 = Integer.parseInt(txtEdad.getText());
            //Ciclo if donde se realiza los calculos de la persona
            if(option.equals("Hombre")){ //Cálculo hombre
                resultado = ((HombreP*(txtPeso1))+(HombreE*(txtAltura1))-(HombreA*(txtEdad1))+Hombre); //realiza la operación con los datos que digitó la persona y con las variables pre-establecidas donde dice"Hombre"
                DecimalFormat df = new DecimalFormat("#.###"); //Código para solicitar al programa que solo utilice 3 decimales    
                //Arroja el resultado de la persona en una interfaz diferente   
                JOptionPane.showMessageDialog(this, "SU TASA METABÓLICA BASAL ES: "+df.format(resultado),"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                
            } else if(option.equals("Mujer")){ //Cálculo mujer
                resultado = ((MujerP*(txtPeso1))+(MujerE*(txtAltura1))-(MujerA*(txtEdad1))+Mujer); //realiza la operación con los datos que digitó la persona y con las variables pre-establecidas donde dice"Mujer"
                DecimalFormat df = new DecimalFormat("#.###"); //Código para solicitar al programa que solo utilice 3 decimales       
                //Arroja el resultado de la persona en una interfaz diferente   
                JOptionPane.showMessageDialog(this, "SU TASA METABÓLICA BASAL ES: "+df.format(resultado),"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
            //condicional para que cuando la persona no seleccione un género le aparecera un mensaje diciendo que "seleccione su género"
            } else 
                JOptionPane.showMessageDialog(this, "Selecciona un género");
            
        } catch (NumberFormatException | NullPointerException e) {
            //Condicional para cuando la persona digite numeros decimales le salga un mensaje diciendo "solo números enteros"
            if (e instanceof NumberFormatException) {
                JOptionPane.showMessageDialog(this, "Ingrese solo números enteros","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            }
                JOptionPane.showMessageDialog(this, "Selecciona un género","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                return;
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        Limpiar();
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        Limpiar();
    }//GEN-LAST:event_txtEdadActionPerformed

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
            java.util.logging.Logger.getLogger(Indice_Metabolico_Basal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Indice_Metabolico_Basal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Indice_Metabolico_Basal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Indice_Metabolico_Basal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Indice_Metabolico_Basal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxGenero;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel_Altura;
    private javax.swing.JLabel jLabel_Edad;
    private javax.swing.JLabel jLabel_Genero;
    private javax.swing.JLabel jLabel_Peso;
    private javax.swing.JLabel jLabel_TextCM;
    private javax.swing.JLabel jLabel_TextKG;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        boxGenero.setSelectedItem("Selecciona una opción");
        txtAltura.setText("");
    }

 
}
