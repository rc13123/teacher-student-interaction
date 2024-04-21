
import javax.swing.JOptionPane;


public class change_password extends javax.swing.JFrame {

    public change_password() {
        
        initComponents();
        setVisible(true);
        setSize(600,400);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        changebt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        usernametf = new javax.swing.JTextField();
        confirmpf = new javax.swing.JPasswordField();
        newpf = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHANGE PASSWORD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(8, 2, 570, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Confirm Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 190, 180, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 180, 30);

        changebt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        changebt.setText("CHANGE");
        changebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changebtActionPerformed(evt);
            }
        });
        getContentPane().add(changebt);
        changebt.setBounds(280, 270, 130, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 70, 180, 30);
        getContentPane().add(usernametf);
        usernametf.setBounds(230, 70, 230, 30);
        getContentPane().add(confirmpf);
        confirmpf.setBounds(230, 190, 230, 30);
        getContentPane().add(newpf);
        newpf.setBounds(230, 132, 230, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changebtActionPerformed
        String username=usernametf.getText();
        String new_password=confirmpf.getText();
        String result=client.change_password(username,new_password);
       
           
        JOptionPane.showMessageDialog(rootPane, result);
        
        dispose();
        admin_home ah=new admin_home(username);
        
        
    }//GEN-LAST:event_changebtActionPerformed

    
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
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new change_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changebt;
    private javax.swing.JPasswordField confirmpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField newpf;
    private javax.swing.JTextField usernametf;
    // End of variables declaration//GEN-END:variables
}
