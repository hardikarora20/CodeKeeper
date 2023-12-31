/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codekeeper.gui;

import static com.codekeeper.utility.Helper.*;
import com.codekeeper.pojo.UserPojo;
import com.codekeeper.pojo.UserProfile;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.ui.FlatLineBorder;
import java.awt.Color;
import java.awt.Insets;
import java.util.Random;
import javax.swing.UIManager;

/**
 *
 * @author hardi
 */
public class HomeScreen extends javax.swing.JFrame {

    /** Creates new form homeScreen */
    public HomeScreen() {
        UIManager.put( "TextComponent.arc", 10 );
        UIManager.put( "Button.arc", 30 );
        UIManager.put( "Component.arc", 10 );
        UIManager.put( "CheckBox.arc", 10 );
        UIManager.put( "ProgressBar.arc", 10 );
        FlatMacDarkLaf.setup();
        initComponents();
        helper();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JLabel();
        btnGen = new javax.swing.JLabel();
        btnView = new javax.swing.JLabel();
        txtGreet = new javax.swing.JLabel();
        txtHelp = new javax.swing.JLabel();
        imgUsr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CodeKeeper");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45, 45, 45));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codekeeper/icons/lock.png"))); // NOI18N
        btnAdd.setText("jLabel1");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 350, -1));

        btnGen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codekeeper/icons/generate.png"))); // NOI18N
        btnGen.setText("jLabel1");
        btnGen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenMouseEntered(evt);
            }
        });
        jPanel1.add(btnGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 350, -1));

        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codekeeper/icons/view.png"))); // NOI18N
        btnView.setText("jLabel1");
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewMouseClicked(evt);
            }
        });
        jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 350, -1));

        txtGreet.setFont(new java.awt.Font("Poppins", 1, 50)); // NOI18N
        txtGreet.setForeground(new java.awt.Color(255, 255, 255));
        txtGreet.setText("Welcome back, Rachit!");
        jPanel1.add(txtGreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 800, 69));

        txtHelp.setBackground(new java.awt.Color(229, 229, 229));
        txtHelp.setFont(new java.awt.Font("Poppins", 0, 22)); // NOI18N
        txtHelp.setForeground(new java.awt.Color(239, 239, 239));
        txtHelp.setText("Thanks for using CodeKeeper");
        jPanel1.add(txtHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 910, -1));

        imgUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codekeeper/icons/user1.png"))); // NOI18N
        imgUsr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgUsrMouseClicked(evt);
            }
        });
        jPanel1.add(imgUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 93, 107, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 730));

        setSize(new java.awt.Dimension(1298, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenMouseEntered

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        new SavePassword().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddMouseClicked

    private void imgUsrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgUsrMouseClicked
        new Dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_imgUsrMouseClicked

    private void btnGenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenMouseClicked
        new GeneratePassword().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGenMouseClicked

    private void btnViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseClicked
        new ManagePassword().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnViewMouseClicked

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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnGen;
    private javax.swing.JLabel btnView;
    private javax.swing.JLabel imgUsr;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtGreet;
    private javax.swing.JLabel txtHelp;
    // End of variables declaration//GEN-END:variables

    private void helper() {
        txtHelp.setText(getTip());
        txtGreet.setText(getGreeting(UserProfile.getUserName()));
        imgUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageUrl(UserProfile.getUserImg()))));
    }

}
