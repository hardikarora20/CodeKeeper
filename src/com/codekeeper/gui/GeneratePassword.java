/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekeeper.gui;

import static com.codekeeper.utility.Helper.generatePassword;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author hardi
 */
public class GeneratePassword extends javax.swing.JFrame {

    private String generated;
    public GeneratePassword() {
        UIManager.put( "TextComponent.arc", 40 );
        UIManager.put( "Button.arc", 40 );
        UIManager.put( "Component.arc", 40 );
        UIManager.put( "CheckBox.arc", 40 );
        UIManager.put( "ProgressBar.arc", 25 );
        UIManager.put( "Component.focusColor", new Color(108,176,124));
        UIManager.put( "CheckBox.icon.selectedBackground", new Color(108,176,124));
        FlatMacDarkLaf.setup();
        initComponents();
        btnGeneratePass.requestFocus();
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
        txtGeneratedPass = new javax.swing.JTextField();
        includeUpper = new javax.swing.JCheckBox();
        includeLower = new javax.swing.JCheckBox();
        includeDigits = new javax.swing.JCheckBox();
        includeSymbols = new javax.swing.JCheckBox();
        lblCustomize = new javax.swing.JLabel();
        lblPassLength = new javax.swing.JLabel();
        sldrLength = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        txtPassLength = new javax.swing.JTextField();
        btnCopyPass = new javax.swing.JButton();
        customizeBack = new javax.swing.JButton();
        btnSavePassword = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnGeneratePass = new javax.swing.JButton();
        lblGenerated = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generate Password");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 45, 45));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtGeneratedPass.setBackground(new java.awt.Color(61, 61, 61));
        txtGeneratedPass.setFont(new java.awt.Font("Poppins", 1, 32)); // NOI18N
        txtGeneratedPass.setText("••••••••");
        txtGeneratedPass.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtGeneratedPass.setEnabled(false);
        txtGeneratedPass.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jPanel1.add(txtGeneratedPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 760, 100));

        includeUpper.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        includeUpper.setText("include uppercase");
        jPanel1.add(includeUpper, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 250, 50));

        includeLower.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        includeLower.setText("include lowercase");
        jPanel1.add(includeLower, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 250, 50));

        includeDigits.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        includeDigits.setText("include digits");
        jPanel1.add(includeDigits, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 250, 50));

        includeSymbols.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        includeSymbols.setText("include symbols");
        jPanel1.add(includeSymbols, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 250, 50));

        lblCustomize.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        lblCustomize.setForeground(new java.awt.Color(204, 204, 204));
        lblCustomize.setText("Customize Password");
        jPanel1.add(lblCustomize, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 200, 40));

        lblPassLength.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        lblPassLength.setText("Password Length");
        jPanel1.add(lblPassLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 270, 40));

        sldrLength.setForeground(new java.awt.Color(83, 144, 97));
        sldrLength.setMaximum(25);
        sldrLength.setMinimum(8);
        sldrLength.setValue(8);
        sldrLength.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldrLengthStateChanged(evt);
            }
        });
        jPanel1.add(sldrLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 270, 50));

        jButton1.setBackground(new java.awt.Color(167, 77, 77));
        jButton1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 238, 238));
        jButton1.setText("<html><body>Short and sweet, just like you! But maybe not the best for security.</body></html>");
        jButton1.setFocusable(false);
        jButton1.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 320, 100));

        txtPassLength.setBackground(new java.awt.Color(61, 61, 61));
        txtPassLength.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtPassLength.setForeground(new java.awt.Color(255, 255, 255));
        txtPassLength.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassLength.setText("8");
        jPanel1.add(txtPassLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 340, 50, 50));

        btnCopyPass.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        btnCopyPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codekeeper/icons/copy.png"))); // NOI18N
        btnCopyPass.setFocusable(false);
        btnCopyPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyPassActionPerformed(evt);
            }
        });
        jPanel1.add(btnCopyPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 110, 100, 100));

        customizeBack.setEnabled(false);
        jPanel1.add(customizeBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 880, 260));

        btnSavePassword.setBackground(new java.awt.Color(98, 98, 98));
        btnSavePassword.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnSavePassword.setForeground(new java.awt.Color(255, 255, 255));
        btnSavePassword.setText("SAVE PASSWORD");
        btnSavePassword.setEnabled(false);
        btnSavePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePasswordActionPerformed(evt);
            }
        });
        jPanel1.add(btnSavePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 430, 100));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codekeeper/icons/back.png"))); // NOI18N
        btnBack.setToolTipText("Go back to Home?");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setFocusable(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 70));

        btnGeneratePass.setBackground(new java.awt.Color(36, 100, 68));
        btnGeneratePass.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnGeneratePass.setForeground(new java.awt.Color(255, 255, 255));
        btnGeneratePass.setText("GENERATE PASSWORD");
        btnGeneratePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneratePassActionPerformed(evt);
            }
        });
        jPanel1.add(btnGeneratePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 430, 100));

        lblGenerated.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        lblGenerated.setForeground(new java.awt.Color(204, 204, 204));
        lblGenerated.setText("Generated Password");
        jPanel1.add(lblGenerated, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 780, 30));

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

        setSize(new java.awt.Dimension(1298, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCopyPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopyPassActionPerformed

    private void sldrLengthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldrLengthStateChanged
        txtPassLength.setText(sldrLength.getValue()+"");
        if(sldrLength.getValue()<15){
            jButton1.setBackground(new Color(167,77,77));
            jButton1.setText("<html><body>Your password is shorter than a TikTok video. Let's make it more secure!</body></html>");
        }
        else if(sldrLength.getValue()<20){
            jButton1.setBackground(new Color(146,113,90));
            jButton1.setText("<html><body>We recommend using a password length of around 20 characters for optimal security.</body></html>");
        }
        else{
            jButton1.setBackground(new Color(83,144,97));
            jButton1.setText("<html><body>Wow, that's a long password! You must have really important cat videos to protect.</body></html>");
        }
    }//GEN-LAST:event_sldrLengthStateChanged

    private void btnGeneratePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneratePassActionPerformed
        if(noneSelected()){
            JOptionPane.showMessageDialog(null, "Please select at least one option.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            generated = generatePassword(includeUpper.isSelected(), includeLower.isSelected(), includeDigits.isSelected(), includeSymbols.isSelected(), sldrLength.getValue());
            txtGeneratedPass.setText(generated);
            btnSavePassword.setEnabled(true);
        }
    }//GEN-LAST:event_btnGeneratePassActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new HomeScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSavePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePasswordActionPerformed
        new SavePassword(txtGeneratedPass.getText().toString()).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSavePasswordActionPerformed

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
            java.util.logging.Logger.getLogger(GeneratePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneratePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneratePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneratePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneratePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCopyPass;
    private javax.swing.JButton btnGeneratePass;
    private javax.swing.JButton btnSavePassword;
    private javax.swing.JButton customizeBack;
    private javax.swing.JCheckBox includeDigits;
    private javax.swing.JCheckBox includeLower;
    private javax.swing.JCheckBox includeSymbols;
    private javax.swing.JCheckBox includeUpper;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCustomize;
    private javax.swing.JLabel lblGenerated;
    private javax.swing.JLabel lblPassLength;
    private javax.swing.JSlider sldrLength;
    private javax.swing.JTextField txtGeneratedPass;
    private javax.swing.JTextField txtPassLength;
    // End of variables declaration//GEN-END:variables

    private boolean noneSelected() {
        if(includeUpper.isSelected() || includeLower.isSelected() || includeDigits.isSelected() || includeSymbols.isSelected())
            return false;
        return true;
    }
}