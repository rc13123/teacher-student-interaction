
import java.util.StringTokenizer;


public class faculty_home extends javax.swing.JFrame {

   
    public faculty_home(String email) {
        initComponents();
        fetch_faculty_info(email);
        setVisible(true);
        setSize(800,750);
    }
    public void fetch_faculty_info(String email)
    {
        
        String ans=client.fetch_faculty_info(email);
        StringTokenizer st=new StringTokenizer(ans,",");
        
            namelb.setText(st.nextToken());
            fathers_namelb.setText(st.nextToken());
            departmentlb.setText(st.nextToken());
            emaillb.setText(st.nextToken());
            qualificationlb.setText(st.nextToken());
            mobile_nolb.setText(st.nextToken());
            addresslb.setText("<html>"+st.nextToken()+"</html>");
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        namelb = new javax.swing.JLabel();
        fathers_namelb = new javax.swing.JLabel();
        departmentlb = new javax.swing.JLabel();
        emaillb = new javax.swing.JLabel();
        qualificationlb = new javax.swing.JLabel();
        mobile_nolb = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        upload_timetablebt = new javax.swing.JButton();
        post_answers = new javax.swing.JButton();
        add_notesbt = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        check_assignmentbt = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        addresslb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TEACHER'S HOME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(11, 3, 750, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TEACHER'S DUTY");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 70, 360, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 430, 130, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 130, 130, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Father's Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 180, 130, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Department");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 230, 130, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Email ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 280, 130, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("Qualification");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 330, 130, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("Mobile No.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 380, 130, 30);

        namelb.setText("jLabel10");
        getContentPane().add(namelb);
        namelb.setBounds(200, 130, 150, 30);

        fathers_namelb.setText("jLabel10");
        getContentPane().add(fathers_namelb);
        fathers_namelb.setBounds(200, 180, 150, 30);

        departmentlb.setText("jLabel10");
        getContentPane().add(departmentlb);
        departmentlb.setBounds(200, 230, 150, 30);

        emaillb.setText("jLabel10");
        getContentPane().add(emaillb);
        emaillb.setBounds(200, 280, 220, 30);

        qualificationlb.setText("jLabel10");
        getContentPane().add(qualificationlb);
        qualificationlb.setBounds(200, 330, 150, 30);

        mobile_nolb.setText("jLabel10");
        getContentPane().add(mobile_nolb);
        mobile_nolb.setBounds(200, 380, 150, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TEACHER'S INFORMATION");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 70, 360, 30);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 580, 200, 30);

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setText("Check Assignment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(490, 130, 200, 30);

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton3.setText("Mark Attendence");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(490, 180, 200, 30);

        upload_timetablebt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        upload_timetablebt.setText("Upload Time Table");
        upload_timetablebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload_timetablebtActionPerformed(evt);
            }
        });
        getContentPane().add(upload_timetablebt);
        upload_timetablebt.setBounds(490, 230, 200, 30);

        post_answers.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        post_answers.setText("Post Answers");
        post_answers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                post_answersActionPerformed(evt);
            }
        });
        getContentPane().add(post_answers);
        post_answers.setBounds(490, 280, 200, 30);

        add_notesbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        add_notesbt.setText("Add Notes");
        add_notesbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_notesbtActionPerformed(evt);
            }
        });
        getContentPane().add(add_notesbt);
        add_notesbt.setBounds(490, 330, 200, 30);

        jButton7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton7.setText("View Notes");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(490, 380, 200, 30);

        jButton8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton8.setText("Add Assignments");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(490, 430, 200, 30);

        check_assignmentbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        check_assignmentbt.setText("Check Assignments");
        check_assignmentbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_assignmentbtActionPerformed(evt);
            }
        });
        getContentPane().add(check_assignmentbt);
        check_assignmentbt.setBounds(490, 480, 200, 30);

        jButton10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton10.setText("Change Password");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(490, 530, 200, 30);

        addresslb.setText("jLabel11");
        addresslb.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(addresslb);
        addresslb.setBounds(200, 440, 140, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        view_notes obj=new view_notes();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void add_notesbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_notesbtActionPerformed
        add_notes an=new add_notes(emaillb.getText());
    }//GEN-LAST:event_add_notesbtActionPerformed

    private void upload_timetablebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload_timetablebtActionPerformed
        dispose();
        upload_time_table ut=new upload_time_table(emaillb.getText());
    }//GEN-LAST:event_upload_timetablebtActionPerformed

    private void post_answersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_post_answersActionPerformed
       dispose();
       post_answers pa=new post_answers(emaillb.getText());
    }//GEN-LAST:event_post_answersActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        add_assignment obj=new add_assignment();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void check_assignmentbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_assignmentbtActionPerformed
        dispose();
        check_assignment ca=new check_assignment();
    }//GEN-LAST:event_check_assignmentbtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        DeleteSession obj=new DeleteSession();
        obj.func("faculty_email");
        faculty_login obj2=new faculty_login();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mark_attendance obj =new mark_attendance();
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        check_assignment obj=new check_assignment();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        change_password obj=new change_password();
    }//GEN-LAST:event_jButton10ActionPerformed

    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(faculty_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(faculty_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(faculty_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(faculty_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new faculty_home().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_notesbt;
    private javax.swing.JLabel addresslb;
    private javax.swing.JButton check_assignmentbt;
    private javax.swing.JLabel departmentlb;
    private javax.swing.JLabel emaillb;
    private javax.swing.JLabel fathers_namelb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mobile_nolb;
    private javax.swing.JLabel namelb;
    private javax.swing.JButton post_answers;
    private javax.swing.JLabel qualificationlb;
    private javax.swing.JButton upload_timetablebt;
    // End of variables declaration//GEN-END:variables
}
