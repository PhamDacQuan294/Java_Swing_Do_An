/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author FPT
 */
public class Home extends javax.swing.JFrame {

    public String email;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public Home(String userEmail) {
        initComponents();
        setLocationRelativeTo(null);
        email = userEmail;
        if (!email.equals("admin@gmail.com")) {
            btnManage.setVisible(false);
            btnNewProduct.setVisible(false);
            btnViewEdit.setVisible(false);
            btnVerify.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        btnPlanceOrder = new javax.swing.JButton();
        btnViewBill = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        tbnChangeSecureti = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnViewEdit = new javax.swing.JButton();
        btnVerify = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon("C:\\Java_Swing_Do_An\\Java_Swing_Do_An\\src\\images\\logout.png")); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        btnPlanceOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlanceOrder.setIcon(new javax.swing.ImageIcon("C:\\Java_Swing_Do_An\\Java_Swing_Do_An\\src\\images\\place order.png")); // NOI18N
        btnPlanceOrder.setText("Place Order");
        btnPlanceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlanceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        btnViewBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewBill.setIcon(new javax.swing.ImageIcon("C:\\Java_Swing_Do_An\\Java_Swing_Do_An\\src\\images\\View Bills & Order Placed Details.png")); // NOI18N
        btnViewBill.setText("View Bill & Order Planced Detals");
        btnViewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBillActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        btnChangePassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChangePassword.setIcon(new javax.swing.ImageIcon("C:\\Java_Swing_Do_An\\Java_Swing_Do_An\\src\\images\\change Password.png")); // NOI18N
        btnChangePassword.setText("Change Password");
        getContentPane().add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        tbnChangeSecureti.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbnChangeSecureti.setIcon(new javax.swing.ImageIcon("C:\\Java_Swing_Do_An\\Java_Swing_Do_An\\src\\images\\change Security Question.png")); // NOI18N
        tbnChangeSecureti.setText("Change Security Question");
        tbnChangeSecureti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnChangeSecuretiActionPerformed(evt);
            }
        });
        getContentPane().add(tbnChangeSecureti, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon("C:\\Java_Swing_Do_An\\Java_Swing_Do_An\\src\\images\\exit.png")); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, -1));

        btnManage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManage.setIcon(new javax.swing.ImageIcon("C:\\Java_Swing_Do_An\\Java_Swing_Do_An\\src\\images\\category.png")); // NOI18N
        btnManage.setText("Manage Category");
        getContentPane().add(btnManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 690, -1, -1));

        btnNewProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNewProduct.setIcon(new javax.swing.ImageIcon("C:\\Java_Swing_Do_An\\Java_Swing_Do_An\\src\\images\\new product.png")); // NOI18N
        btnNewProduct.setText("New Product");
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 690, -1, -1));

        btnViewEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewEdit.setIcon(new javax.swing.ImageIcon("C:\\Java_Swing_Do_An\\Java_Swing_Do_An\\src\\images\\view edit delete product.png")); // NOI18N
        btnViewEdit.setText("View,Edit & Delete Product");
        getContentPane().add(btnViewEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 690, -1, -1));

        btnVerify.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerify.setIcon(new javax.swing.ImageIcon("C:\\Java_Swing_Do_An\\Java_Swing_Do_An\\src\\images\\verify users.png")); // NOI18N
        btnVerify.setText("Veryfy Users");
        getContentPane().add(btnVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 690, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Java_Swing_Do_An\\Java_Swing_Do_An\\src\\images\\home-background-image.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, " Do you really want to Logout ", "Select", JOptionPane.YES_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void tbnChangeSecuretiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnChangeSecuretiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbnChangeSecuretiActionPerformed

    private void btnViewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewBillActionPerformed

    private void btnPlanceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanceOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlanceOrderActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int a = JOptionPane.showConfirmDialog(null, " Do you really want to Close Application  ", "Select", JOptionPane.YES_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManage;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnPlanceOrder;
    private javax.swing.JButton btnVerify;
    private javax.swing.JButton btnViewBill;
    private javax.swing.JButton btnViewEdit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton tbnChangeSecureti;
    // End of variables declaration//GEN-END:variables
}
