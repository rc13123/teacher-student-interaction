
public class welcome_2 extends javax.swing.JFrame {

   
    public welcome_2() {
        initComponents();
        setVisible(true);
        setSize(750,500);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        studentbt = new javax.swing.JButton();
        adminbt = new javax.swing.JButton();
        facultybt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO TEACHER STUDENT INTERACTION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(7, 1, 700, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 50, 530, 250);

        studentbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        studentbt.setText("STUDENT LOGIN");
        studentbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentbtActionPerformed(evt);
            }
        });
        getContentPane().add(studentbt);
        studentbt.setBounds(470, 330, 180, 30);

        adminbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        adminbt.setText("ADMIN LOGIN");
        adminbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbtActionPerformed(evt);
            }
        });
        getContentPane().add(adminbt);
        adminbt.setBounds(70, 330, 160, 30);

        facultybt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        facultybt.setText("FACULTY LOGIN");
        facultybt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultybtActionPerformed(evt);
            }
        });
        getContentPane().add(facultybt);
        facultybt.setBounds(270, 330, 168, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbtActionPerformed
       dispose();
       admin_login obj=new admin_login();
    }//GEN-LAST:event_adminbtActionPerformed

    private void facultybtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultybtActionPerformed
       dispose();
       faculty_login obj=new faculty_login();
    }//GEN-LAST:event_facultybtActionPerformed

    private void studentbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentbtActionPerformed
        dispose();
       student_login obj=new student_login();
    }//GEN-LAST:event_studentbtActionPerformed

    
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
            java.util.logging.Logger.getLogger(welcome_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminbt;
    private javax.swing.JButton facultybt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton studentbt;
    // End of variables declaration//GEN-END:variables
}
