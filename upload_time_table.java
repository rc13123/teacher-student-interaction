
import java.awt.Image;
import java.io.File;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class upload_time_table extends javax.swing.JFrame {
    
    File ph;
    JFileChooser jfc;
    String teacher_id;
    public upload_time_table(String teacher_id) {
        initComponents();
        this.teacher_id=teacher_id;
        fill_combo_course();
        setVisible(true);
        setSize(600,500);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        semestercb = new javax.swing.JComboBox<>();
        coursecb = new javax.swing.JComboBox<>();
        photolb = new javax.swing.JLabel();
        addbt = new javax.swing.JButton();
        browsebt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" TIME TABLE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(8, 5, 640, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Photo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 210, 120, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Course");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 90, 120, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Semester");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 150, 120, 30);

        semestercb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3","4","5","6","7","8","9","10", }));
        getContentPane().add(semestercb);
        semestercb.setBounds(160, 150, 230, 30);

        coursecb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course"}));
        getContentPane().add(coursecb);
        coursecb.setBounds(160, 90, 230, 30);

        photolb.setText("jLabel5");
        photolb.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(photolb);
        photolb.setBounds(160, 220, 230, 140);

        addbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        addbt.setText("Add");
        addbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtActionPerformed(evt);
            }
        });
        getContentPane().add(addbt);
        addbt.setBounds(210, 390, 120, 30);

        browsebt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        browsebt.setText("Browse");
        browsebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsebtActionPerformed(evt);
            }
        });
        getContentPane().add(browsebt);
        browsebt.setBounds(430, 210, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browsebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsebtActionPerformed
        jfc=new JFileChooser();
       int ans=jfc.showOpenDialog(this);
       if(ans==JFileChooser.APPROVE_OPTION)
       {
           ph=jfc.getSelectedFile();
           ImageIcon ic = new ImageIcon(ph.getPath());
          
          Image img = ic.getImage().getScaledInstance(photolb.getWidth(), photolb.               getHeight(), Image.SCALE_SMOOTH);
          
          ImageIcon ic1 = new ImageIcon(img);
          photolb.setIcon(ic1);
       }
    }//GEN-LAST:event_browsebtActionPerformed

    private void addbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtActionPerformed
       String id=(String)coursecb.getSelectedItem();
       StringTokenizer st=new StringTokenizer(id);
       String course=st.nextToken();
       String semester=(String)semestercb.getSelectedItem();
       if(course.isEmpty()||semester.isEmpty()||ph == null)
        {
         JOptionPane.showMessageDialog(rootPane, "All fileds are Mandatory");
        }
        else
        {
            String result=client.add_time_table(course, semester,teacher_id, ph);
            if(result.trim().equals("exists"))
            {
                JOptionPane.showMessageDialog(rootPane, "Already Exist");
            }
            else if(result.trim().equals("success"))
            {
                JOptionPane.showMessageDialog(rootPane, "Success");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, result);
            }
        }
    }//GEN-LAST:event_addbtActionPerformed
    public void fill_combo_course() {
        try {
            String ans = client.fill_combo_course();
            
            StringTokenizer st = new StringTokenizer(ans, ",");
            int n = st.countTokens();
            
            
            for (int i = 0; i < n; i++) {
                String store = st.nextToken();
                
                coursecb.addItem(store);
                
                
            }
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }

    }
    
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
//            java.util.logging.Logger.getLogger(upload_time_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(upload_time_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(upload_time_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(upload_time_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new upload_time_table().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbt;
    private javax.swing.JButton browsebt;
    private javax.swing.JComboBox<String> coursecb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel photolb;
    private javax.swing.JComboBox<String> semestercb;
    // End of variables declaration//GEN-END:variables
}
