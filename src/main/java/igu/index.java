/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import image.JPanelImage;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author crisu
 */
public class index extends javax.swing.JFrame {

    
   // CalculadoraDatosBiometricos icono = new CalculadoraDatosBiometricos();
    
    public index() {
        //this.setContentPane(icono);
        
        initComponents();
        /*JPanelImage mImagen = new JPanelImage(jPanelFondo, "/image/Fondo.jpg");
        jPanelFondo.add(mImagen).repaint();*/
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabel1_txt1 = new javax.swing.JLabel();
        jLabel1_txt2 = new javax.swing.JLabel();
        btn_pesoIdeal = new javax.swing.JButton();
        btn_calorias = new javax.swing.JButton();
        btn_grasaCorporal = new javax.swing.JButton();
        btn_indiceMetabolico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1_txt1.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel1_txt1.setText("CÁLCULO");

        jLabel1_txt2.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1_txt2.setText("DE MAGNITUDES BIOMÉTRICAS");

        btn_pesoIdeal.setBackground(new java.awt.Color(255, 146, 0));
        btn_pesoIdeal.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_pesoIdeal.setForeground(new java.awt.Color(255, 255, 255));
        btn_pesoIdeal.setText("PESO IDEAL");
        btn_pesoIdeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesoIdealActionPerformed(evt);
            }
        });

        btn_calorias.setBackground(new java.awt.Color(255, 146, 0));
        btn_calorias.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_calorias.setForeground(new java.awt.Color(255, 255, 255));
        btn_calorias.setText("CALORIAS");
        btn_calorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_caloriasActionPerformed(evt);
            }
        });

        btn_grasaCorporal.setBackground(new java.awt.Color(255, 146, 0));
        btn_grasaCorporal.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_grasaCorporal.setForeground(new java.awt.Color(255, 255, 255));
        btn_grasaCorporal.setText("GRASA CORPORAL");
        btn_grasaCorporal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grasaCorporalActionPerformed(evt);
            }
        });

        btn_indiceMetabolico.setBackground(new java.awt.Color(255, 146, 0));
        btn_indiceMetabolico.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_indiceMetabolico.setForeground(new java.awt.Color(255, 255, 255));
        btn_indiceMetabolico.setText("ÍNDICE METABOLICO");
        btn_indiceMetabolico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_indiceMetabolicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_txt1)
                    .addComponent(jLabel1_txt2)
                    .addComponent(btn_pesoIdeal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calorias, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_grasaCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_indiceMetabolico))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1_txt1)
                .addGap(6, 6, 6)
                .addComponent(jLabel1_txt2)
                .addGap(18, 18, 18)
                .addComponent(btn_pesoIdeal)
                .addGap(6, 6, 6)
                .addComponent(btn_calorias)
                .addGap(12, 12, 12)
                .addComponent(btn_grasaCorporal)
                .addGap(12, 12, 12)
                .addComponent(btn_indiceMetabolico)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pesoIdealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesoIdealActionPerformed
        Peso_Ideal IBW = new Peso_Ideal();
        IBW.setVisible(true);
        IBW.setLocationRelativeTo(null);
        this.dispose(); 
    }//GEN-LAST:event_btn_pesoIdealActionPerformed

    private void btn_grasaCorporalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grasaCorporalActionPerformed
        Porcentaje_Grasa_Corporal PGC = new Porcentaje_Grasa_Corporal();
        PGC.setVisible(true);
        PGC.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_grasaCorporalActionPerformed

    private void btn_indiceMetabolicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_indiceMetabolicoActionPerformed
        Indice_Metabolico_Basal TMB = new Indice_Metabolico_Basal();
        TMB.setVisible(true);
        TMB.setLocationRelativeTo(null);
        this.dispose(); 
    }//GEN-LAST:event_btn_indiceMetabolicoActionPerformed

    private void btn_caloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_caloriasActionPerformed
        Quemando_Calorias QC = new Quemando_Calorias();
        QC.setVisible(true);
        QC.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_caloriasActionPerformed

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calorias;
    private javax.swing.JButton btn_grasaCorporal;
    private javax.swing.JButton btn_indiceMetabolico;
    private javax.swing.JButton btn_pesoIdeal;
    private javax.swing.JLabel jLabel1_txt1;
    private javax.swing.JLabel jLabel1_txt2;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables

   /* class CalculadoraDatosBiometricos extends JPanel{
        
        private Image imagen;
        
        public void paint (Graphics g){
            
            imagen=new ImageIcon(getClass().getResource("Fondo.jpeg")).getImage();
            g.drawImage(imagen, 0,0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
        
    }*/
}
