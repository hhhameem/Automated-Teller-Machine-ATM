/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hebron Hossain Hamim
 */
public class PinChangePOP extends javax.swing.JFrame {

    /**
     * Creates new form PinChangePOP
     */
    private String userName;
    private String pass;
    String number1, number2, cv;
    LogIn lcw = new LogIn();
    Method mcw = new Method();
    String arr1[] = new String[40];
    double df, du, mr;
    int mouse1, mouse2, mouse3;
    String pass1, pass2;

    public PinChangePOP(String userName, String pass) {
        this.userName = userName;
        this.pass = pass;

        initComponents();

        String sourceFileName = "login.txt";
        String destinationFileName = "temp.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(sourceFileName));
            PrintWriter pw = new PrintWriter(new FileWriter(destinationFileName));

            String line;
            while ((line = br.readLine()) != null) {
                pw.write(line);
                pw.println();
            }

            br.close();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PinChangePOP() {
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
        jNPLabelPCPOP = new javax.swing.JLabel();
        jRNPLabelPCPOP = new javax.swing.JLabel();
        jPasswordField1PCPOP = new javax.swing.JPasswordField();
        jPasswordField2PCPOP = new javax.swing.JPasswordField();
        jSubmitButton = new javax.swing.JButton();
        jBackgroundLabelPCPOP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jNPLabelPCPOP.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jNPLabelPCPOP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNPLabelPCPOP.setText("Type New Password");
        jPanel1.add(jNPLabelPCPOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 40));

        jRNPLabelPCPOP.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jRNPLabelPCPOP.setText("Re-Type New Password");
        jPanel1.add(jRNPLabelPCPOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 40));

        jPasswordField1PCPOP.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jPasswordField1PCPOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1PCPOPActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1PCPOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 150, 30));

        jPasswordField2PCPOP.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jPasswordField2PCPOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2PCPOPActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField2PCPOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 150, 30));

        jSubmitButton.setBackground(new java.awt.Color(0, 153, 0));
        jSubmitButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jSubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        jSubmitButton.setText("Submit");
        jSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jSubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 140, 40));

        jBackgroundLabelPCPOP.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hebron Hossain Hamim\\Desktop\\ATM Project\\Images\\Light Focusing1.jpg")); // NOI18N
        jPanel1.add(jBackgroundLabelPCPOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1PCPOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1PCPOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1PCPOPActionPerformed

    private void jSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitButtonActionPerformed
        // TODO add your handling code here:
        
        pass1 = jPasswordField1PCPOP.getText();
        pass2 = jPasswordField2PCPOP.getText();
        
        
        if (pass1.equals(pass2)) {
            String myline = "";
            String otherpart = "";
            try {
                FileReader fr = new FileReader("temp.txt");
                BufferedReader br = new BufferedReader(fr);
                String line;

                while ((line = br.readLine()) != null) {
                    arr1 = line.split("#");
                    if (arr1[0].equals(userName) && arr1[1].equals(pass)) {
                        myline = line;
                        df = Double.parseDouble(arr1[3]);
                        System.out.println(df);
                    } else {
                        otherpart += line + "$";
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(CashWithdraw.class.getName()).log(Level.SEVERE, null, ex);
            }

            String myarr[] = myline.split("#");
            myarr[1] = pass1;
            myline = myarr[0] + "#" + myarr[1] + "#" + myarr[2] + "#" + myarr[3] + "#" + myarr[4] + "#" + myarr[5] + "$";

            otherpart += myline;

            try {

                PrintWriter pw = new PrintWriter(new FileWriter("temp.txt"));

                String linearr[] = otherpart.split("[$]");
                for (int lineno = 0; lineno < linearr.length; lineno++) {
                    pw.write(linearr[lineno]);
                    pw.println();
                }
                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            String sourceFileName = "temp.txt";
            String destinationFileName = "login.txt";

            try {
                BufferedReader br = new BufferedReader(new FileReader(sourceFileName));
                PrintWriter pw = new PrintWriter(new FileWriter(destinationFileName));

                String line;
                while ((line = br.readLine()) != null) {
                    pw.write(line);
                    pw.println();
                }

                br.close();
                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(rootPane, "Passwor Changed Successfully!!");
            Home h = new Home(userName,pass);
            h.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Passwor Did Not Matched.Please Try Again");
        }
    }//GEN-LAST:event_jSubmitButtonActionPerformed

    private void jPasswordField2PCPOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2PCPOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2PCPOPActionPerformed

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
            java.util.logging.Logger.getLogger(PinChangePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PinChangePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PinChangePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PinChangePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PinChangePOP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBackgroundLabelPCPOP;
    private javax.swing.JLabel jNPLabelPCPOP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1PCPOP;
    private javax.swing.JPasswordField jPasswordField2PCPOP;
    private javax.swing.JLabel jRNPLabelPCPOP;
    private javax.swing.JButton jSubmitButton;
    // End of variables declaration//GEN-END:variables

}
