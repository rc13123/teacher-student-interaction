
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class post_answers extends javax.swing.JFrame {

   String email;
    public post_answers(String email) {
        initComponents();
        this.email=email;
        display();
        setVisible(true);
        setSize(800,600);
    }

    public void display()
    {
        chatta.setEditable(false);
        chatta.setLineWrap(true);
        String ans=client.fetch_questions();
        StringTokenizer st=new StringTokenizer(ans,";;");
        int n=st.countTokens();
        for(int i=1;i<=n;i++)
        {
            StringTokenizer st1=new StringTokenizer(st.nextToken(),"$");
            String id=st1.nextToken();
            String question=st1.nextToken();
            
           
            chatta.append(id+" "+question+"\n\n");
            
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        answertf = new javax.swing.JTextField();
        sendbt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatta = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        question_idtf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POST ANSWERS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 740, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Answer");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 460, 160, 30);
        getContentPane().add(answertf);
        answertf.setBounds(200, 460, 340, 30);

        sendbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        sendbt.setText("SEND");
        sendbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtActionPerformed(evt);
            }
        });
        getContentPane().add(sendbt);
        sendbt.setBounds(590, 460, 100, 30);

        chatta.setColumns(20);
        chatta.setRows(5);
        jScrollPane1.setViewportView(chatta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 730, 330);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Question Id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 420, 160, 30);
        getContentPane().add(question_idtf);
        question_idtf.setBounds(200, 420, 340, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbtActionPerformed
       String chat_id=question_idtf.getText();
       String answer=answertf.getText();
       String ans=client.post_answer(chat_id,email,answer);
       JOptionPane.showMessageDialog(rootPane, ans);
       dispose();
       post_answers pa=new post_answers(email);
       

    }//GEN-LAST:event_sendbtActionPerformed

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(post_answers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(post_answers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(post_answers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(post_answers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new post_answers().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answertf;
    private javax.swing.JTextArea chatta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField question_idtf;
    private javax.swing.JButton sendbt;
    // End of variables declaration//GEN-END:variables
}
