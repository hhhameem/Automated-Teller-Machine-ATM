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
public class CashDeposit extends javax.swing.JFrame {

    /**
     * Creates new form CashDeposit
     */
    private String userName;
    private String pass;
    String number, cv;
    LogIn lcw = new LogIn();
    Method mcw = new Method();
    String arr1[] = new String[40];
    double df, du, mr;

    public CashDeposit(String userName, String pass) {
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

    public CashDeposit() {
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
        jCashDepositLabelCD = new javax.swing.JLabel();
        jAmountLabelCD = new javax.swing.JLabel();
        jTextFieldCD = new javax.swing.JTextField();
        jSubmitButtonCD = new javax.swing.JButton();
        jClearButtonCD = new javax.swing.JButton();
        jBackButtonCd = new javax.swing.JButton();
        jLogOutButtonCD = new javax.swing.JButton();
        jButton1CD = new javax.swing.JButton();
        jButton2CD = new javax.swing.JButton();
        jButton3CD = new javax.swing.JButton();
        jButton4CD = new javax.swing.JButton();
        jButton5CD = new javax.swing.JButton();
        jButton6CD = new javax.swing.JButton();
        jButton7CD = new javax.swing.JButton();
        jButton8CD = new javax.swing.JButton();
        jButton9CD = new javax.swing.JButton();
        jButton0CD = new javax.swing.JButton();
        jKeyBoardLabelCD = new javax.swing.JLabel();
        jBackgroundLabelCD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCashDepositLabelCD.setBackground(new java.awt.Color(255, 255, 255));
        jCashDepositLabelCD.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jCashDepositLabelCD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCashDepositLabelCD.setText("Cash Deposit");
        jCashDepositLabelCD.setOpaque(true);
        jPanel1.add(jCashDepositLabelCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 650, 50));

        jAmountLabelCD.setBackground(new java.awt.Color(255, 255, 255));
        jAmountLabelCD.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jAmountLabelCD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAmountLabelCD.setText("Input Amount Of Money");
        jAmountLabelCD.setOpaque(true);
        jPanel1.add(jAmountLabelCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 250, 40));

        jTextFieldCD.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jTextFieldCD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCDMouseClicked(evt);
            }
        });
        jTextFieldCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCDActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 200, 40));

        jSubmitButtonCD.setBackground(new java.awt.Color(0, 153, 0));
        jSubmitButtonCD.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jSubmitButtonCD.setForeground(new java.awt.Color(255, 255, 255));
        jSubmitButtonCD.setText("Submit");
        jSubmitButtonCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitButtonCDActionPerformed(evt);
            }
        });
        jPanel1.add(jSubmitButtonCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 190, 50));

        jClearButtonCD.setBackground(new java.awt.Color(0, 0, 0));
        jClearButtonCD.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jClearButtonCD.setForeground(new java.awt.Color(255, 255, 255));
        jClearButtonCD.setText("Clear");
        jClearButtonCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearButtonCDActionPerformed(evt);
            }
        });
        jPanel1.add(jClearButtonCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 70, 40));

        jBackButtonCd.setBackground(new java.awt.Color(0, 0, 0));
        jBackButtonCd.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jBackButtonCd.setForeground(new java.awt.Color(255, 255, 255));
        jBackButtonCd.setText("Back");
        jBackButtonCd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButtonCdActionPerformed(evt);
            }
        });
        jPanel1.add(jBackButtonCd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 190, 50));

        jLogOutButtonCD.setBackground(new java.awt.Color(255, 0, 0));
        jLogOutButtonCD.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLogOutButtonCD.setForeground(new java.awt.Color(255, 255, 255));
        jLogOutButtonCD.setText("Log Out");
        jLogOutButtonCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogOutButtonCDActionPerformed(evt);
            }
        });
        jPanel1.add(jLogOutButtonCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 190, 50));

        jButton1CD.setBackground(new java.awt.Color(0, 0, 0));
        jButton1CD.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jButton1CD.setForeground(new java.awt.Color(255, 255, 255));
        jButton1CD.setText("1");
        jButton1CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CDActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1CD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 60, 40));

        jButton2CD.setBackground(new java.awt.Color(0, 0, 0));
        jButton2CD.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jButton2CD.setForeground(new java.awt.Color(255, 255, 255));
        jButton2CD.setText("2");
        jButton2CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2CDActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2CD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 60, 40));

        jButton3CD.setBackground(new java.awt.Color(0, 0, 0));
        jButton3CD.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jButton3CD.setForeground(new java.awt.Color(255, 255, 255));
        jButton3CD.setText("3");
        jButton3CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3CDActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3CD, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 60, 40));

        jButton4CD.setBackground(new java.awt.Color(0, 0, 0));
        jButton4CD.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jButton4CD.setForeground(new java.awt.Color(255, 255, 255));
        jButton4CD.setText("4");
        jButton4CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4CDActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4CD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 60, 40));

        jButton5CD.setBackground(new java.awt.Color(0, 0, 0));
        jButton5CD.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jButton5CD.setForeground(new java.awt.Color(255, 255, 255));
        jButton5CD.setText("5");
        jButton5CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5CDActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5CD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 60, 40));

        jButton6CD.setBackground(new java.awt.Color(0, 0, 0));
        jButton6CD.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jButton6CD.setForeground(new java.awt.Color(255, 255, 255));
        jButton6CD.setText("6");
        jButton6CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6CDActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6CD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 60, 40));

        jButton7CD.setBackground(new java.awt.Color(0, 0, 0));
        jButton7CD.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jButton7CD.setForeground(new java.awt.Color(255, 255, 255));
        jButton7CD.setText("7");
        jButton7CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7CDActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7CD, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 60, 40));

        jButton8CD.setBackground(new java.awt.Color(0, 0, 0));
        jButton8CD.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jButton8CD.setForeground(new java.awt.Color(255, 255, 255));
        jButton8CD.setText("8");
        jButton8CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8CDActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8CD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 60, 40));

        jButton9CD.setBackground(new java.awt.Color(0, 0, 0));
        jButton9CD.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jButton9CD.setForeground(new java.awt.Color(255, 255, 255));
        jButton9CD.setText("9");
        jButton9CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9CDActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9CD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 60, 40));

        jButton0CD.setBackground(new java.awt.Color(0, 0, 0));
        jButton0CD.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jButton0CD.setForeground(new java.awt.Color(255, 255, 255));
        jButton0CD.setText("0");
        jButton0CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0CDActionPerformed(evt);
            }
        });
        jPanel1.add(jButton0CD, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 60, 40));

        jKeyBoardLabelCD.setBackground(new java.awt.Color(255, 255, 255));
        jKeyBoardLabelCD.setOpaque(true);
        jPanel1.add(jKeyBoardLabelCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 340, 180));

        jBackgroundLabelCD.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hebron Hossain Hamim\\Desktop\\ATM Project\\Images\\bnwb.jpg")); // NOI18N
        jPanel1.add(jBackgroundLabelCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 550));

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

    private void jButton1CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CDActionPerformed
        // TODO add your handling code here:
        number = jTextFieldCD.getText() + "1";
        jTextFieldCD.setText(number);
    }//GEN-LAST:event_jButton1CDActionPerformed

    private void jButton2CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2CDActionPerformed
        // TODO add your handling code here:
        number = jTextFieldCD.getText() + "2";
        jTextFieldCD.setText(number);
    }//GEN-LAST:event_jButton2CDActionPerformed

    private void jButton3CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3CDActionPerformed
        // TODO add your handling code here:
        number = jTextFieldCD.getText() + "3";
        jTextFieldCD.setText(number);
    }//GEN-LAST:event_jButton3CDActionPerformed

    private void jButton4CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4CDActionPerformed
        // TODO add your handling code here:
        number = jTextFieldCD.getText() + "4";
        jTextFieldCD.setText(number);
    }//GEN-LAST:event_jButton4CDActionPerformed

    private void jButton5CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5CDActionPerformed
        // TODO add your handling code here:
        number = jTextFieldCD.getText() + "5";
        jTextFieldCD.setText(number);
    }//GEN-LAST:event_jButton5CDActionPerformed

    private void jButton6CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6CDActionPerformed
        // TODO add your handling code here:
        number = jTextFieldCD.getText() + "6";
        jTextFieldCD.setText(number);
    }//GEN-LAST:event_jButton6CDActionPerformed

    private void jButton7CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7CDActionPerformed
        // TODO add your handling code here:
        number = jTextFieldCD.getText() + "7";
        jTextFieldCD.setText(number);
    }//GEN-LAST:event_jButton7CDActionPerformed

    private void jButton8CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8CDActionPerformed
        // TODO add your handling code here:
        number = jTextFieldCD.getText() + "8";
        jTextFieldCD.setText(number);
    }//GEN-LAST:event_jButton8CDActionPerformed

    private void jButton9CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9CDActionPerformed
        // TODO add your handling code here:
        number = jTextFieldCD.getText() + "9";
        jTextFieldCD.setText(number);
    }//GEN-LAST:event_jButton9CDActionPerformed

    private void jButton0CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0CDActionPerformed
        // TODO add your handling code here:
        number = jTextFieldCD.getText() + "0";
        jTextFieldCD.setText(number);
    }//GEN-LAST:event_jButton0CDActionPerformed

    private void jTextFieldCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCDActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_jTextFieldCDActionPerformed

    private void jSubmitButtonCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitButtonCDActionPerformed
        // TODO add your handling code here:

        String myline = "";
        String otherpart = "";

        //editing temp file
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

        du = Double.parseDouble(number);
        if (du <= 500000) {
            mr = mcw.addmoney(df, du);
            cv = String.valueOf(mr);
            System.out.println(cv);

            String myarr[] = myline.split("#");
            myarr[3] = cv;
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

            //copying temp file into new file
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
            
            mcw.history(userName, pass, "Cash Deposit", du);
            JOptionPane.showMessageDialog(rootPane, "Cash Deposit Successfull!!");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Deposit Amount Excedded.\nPlease Deposit Less Then 5 Lakh BDT At A Time.");
        }
    }//GEN-LAST:event_jSubmitButtonCDActionPerformed

    private void jClearButtonCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearButtonCDActionPerformed
        // TODO add your handling code here:
        jTextFieldCD.setText("");
        number = "";
    }//GEN-LAST:event_jClearButtonCDActionPerformed

    private void jBackButtonCdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackButtonCdActionPerformed
        // TODO add your handling code here:
        Home h = new Home(userName, pass);
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBackButtonCdActionPerformed

    private void jTextFieldCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCDMouseClicked

    private void jLogOutButtonCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogOutButtonCDActionPerformed
        // TODO add your handling code here:
        lcw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLogOutButtonCDActionPerformed

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
            java.util.logging.Logger.getLogger(CashDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashDeposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAmountLabelCD;
    private javax.swing.JButton jBackButtonCd;
    private javax.swing.JLabel jBackgroundLabelCD;
    private javax.swing.JButton jButton0CD;
    private javax.swing.JButton jButton1CD;
    private javax.swing.JButton jButton2CD;
    private javax.swing.JButton jButton3CD;
    private javax.swing.JButton jButton4CD;
    private javax.swing.JButton jButton5CD;
    private javax.swing.JButton jButton6CD;
    private javax.swing.JButton jButton7CD;
    private javax.swing.JButton jButton8CD;
    private javax.swing.JButton jButton9CD;
    private javax.swing.JLabel jCashDepositLabelCD;
    private javax.swing.JButton jClearButtonCD;
    private javax.swing.JLabel jKeyBoardLabelCD;
    private javax.swing.JButton jLogOutButtonCD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSubmitButtonCD;
    private javax.swing.JTextField jTextFieldCD;
    // End of variables declaration//GEN-END:variables
}
