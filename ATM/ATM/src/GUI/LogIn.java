/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hebron Hossain Hamim
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    
    String arr[] = new String[40];
    private  String userName;
    private  String pass;
    
    public LogIn() {
        initComponents();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBackgroundPanel = new javax.swing.JPanel();
        jULNLabel = new javax.swing.JLabel();
        jPhotoLabel = new javax.swing.JLabel();
        jAccNoPhotoLabel = new javax.swing.JLabel();
        jAccNoTextField = new javax.swing.JTextField();
        jPassPhotoLabel = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLogInButton = new javax.swing.JButton();
        jUserLoginLabel = new javax.swing.JLabel();
        jBackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jULNLabel.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jULNLabel.setText("USER LOGIN");
        jBackgroundPanel.add(jULNLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 180, 50));

        jPhotoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hebron Hossain Hamim\\Desktop\\ATM Project\\Images\\person.png")); // NOI18N
        jBackgroundPanel.add(jPhotoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 100, 100));

        jAccNoPhotoLabel.setBackground(new java.awt.Color(204, 204, 204));
        jAccNoPhotoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hebron Hossain Hamim\\Desktop\\ATM Project\\Images\\person1.jpg")); // NOI18N
        jAccNoPhotoLabel.setOpaque(true);
        jBackgroundPanel.add(jAccNoPhotoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 30, 30));

        jAccNoTextField.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jAccNoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jAccNoTextField.setText("Input Your Account Number");
        jAccNoTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAccNoTextFieldMouseClicked(evt);
            }
        });
        jAccNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAccNoTextFieldActionPerformed(evt);
            }
        });
        jBackgroundPanel.add(jAccNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 180, 30));

        jPassPhotoLabel.setBackground(new java.awt.Color(204, 204, 204));
        jPassPhotoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hebron Hossain Hamim\\Desktop\\ATM Project\\Images\\lock.jpg")); // NOI18N
        jBackgroundPanel.add(jPassPhotoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 30, 30));

        jPasswordField.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField.setText("Input Password");
        jPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldMouseClicked(evt);
            }
        });
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        jBackgroundPanel.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 180, 30));

        jLogInButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLogInButton.setText("Log In");
        jLogInButton.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLogInButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogInButtonActionPerformed(evt);
            }
        });
        jBackgroundPanel.add(jLogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 100, 50));

        jUserLoginLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hebron Hossain Hamim\\Desktop\\ATM Project\\Images\\Light Focusing.jpg")); // NOI18N
        jUserLoginLabel.setOpaque(true);
        jBackgroundPanel.add(jUserLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 420, 450));

        jBackgroundLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hebron Hossain Hamim\\Desktop\\ATM Project\\Images\\bnwb.jpg")); // NOI18N
        jBackgroundLabel.setOpaque(true);
        jBackgroundLabel.setPreferredSize(new java.awt.Dimension(670, 550));
        jBackgroundPanel.add(jBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jLogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogInButtonActionPerformed
        // TODO add your handling code here:
        String userName = jAccNoTextField.getText();
        String pass = jPasswordField.getText();
        
        try {
            File file = new File("login.txt");
            file.createNewFile();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            boolean isvalid = false;
            while ((line = br.readLine()) != null) {
                arr = line.split("#");
                if (arr[0].equals(userName) && arr[1].equals(pass)) {
                    JOptionPane.showMessageDialog(rootPane, "You Are Successfully Logged In");
                    isvalid = true;
                    this.setUserName(userName);
                    this.setPass(pass);
                    Home h = new Home(userName,pass);
                    h.setVisible(true);
                    this.dispose();
                    break;
                }
            }
            if (isvalid == false) {
                JOptionPane.showMessageDialog(rootPane, "User Name Or Passwor Is Wrong");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jLogInButtonActionPerformed

    private void jAccNoTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAccNoTextFieldMouseClicked
        // TODO add your handling code here:
        jAccNoTextField.setText("");
    }//GEN-LAST:event_jAccNoTextFieldMouseClicked

    private void jPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldMouseClicked
        // TODO add your handling code here:
        jPasswordField.setText("");
    }//GEN-LAST:event_jPasswordFieldMouseClicked

    private void jAccNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAccNoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAccNoTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAccNoPhotoLabel;
    private javax.swing.JTextField jAccNoTextField;
    private javax.swing.JLabel jBackgroundLabel;
    private javax.swing.JPanel jBackgroundPanel;
    private javax.swing.JButton jLogInButton;
    private javax.swing.JLabel jPassPhotoLabel;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel jPhotoLabel;
    private javax.swing.JLabel jULNLabel;
    private javax.swing.JLabel jUserLoginLabel;
    // End of variables declaration//GEN-END:variables
}
