
import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;


public class check_assignment extends javax.swing.JFrame {

    ArrayList<check_assignment_data> al;
    MyTableModel tm;
    JTable jt;
    JScrollPane jsp;
    public check_assignment() {
        initComponents();
         al = new ArrayList<>();
        fill_arraylist();
        System.out.println(al);
      
        tm = new MyTableModel();
        jt = new JTable();
        jsp = new JScrollPane(jt);
       
        jsp.setBounds(10, 50, 900, 400);
        add(jsp);
        jt.setModel(tm);
        setVisible(true);
        setSize(1000,700);
    }
     public void fill_arraylist() {
        al.clear();
        String fetch = client.check_assignment_data();
        
        StringTokenizer st = new StringTokenizer(fetch, ";");

        int n = st.countTokens();
        
            String id = "";
            String assignment_id = "";
            String student_email = "";
            String dateofsubmit = "";
            String file = "";
            String grade = "";
           
        for (int i = 1; i <= n; i++) 
        {
            String ans1 = st.nextToken();
            System.out.println(ans1);
            StringTokenizer st1 = new StringTokenizer(ans1, "$");
           
            id=st1.nextToken();
            assignment_id=st1.nextToken();
            student_email=st1.nextToken();
            dateofsubmit=st1.nextToken();
            file=st1.nextToken();
            grade=st1.nextToken();
            
            al.add(new check_assignment_data(id, assignment_id, student_email, dateofsubmit, file, grade));
        }

    }
    public class MyTableModel extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return al.size();

        }

        @Override
        public int getColumnCount() {
            return 6;
        }

        @Override
        public String getColumnName(int i) {
            String col[] = {"ID", "ASSIGNMENT ID", "STUDENT EMAIL", "DATE TIME","FILE","GRADE"};
            return col[i];
        }

        @Override
        public Object getValueAt(int i, int j) {

           check_assignment_data ca=al.get(i);
            if(j==0)
            {
                 return ca.id;
            }
           else if(j==1)
            {
                return ca.assignment_id;
            }
            else if(j==2)
            {
                return ca.student_email;
            }
            else if(j==3)
            {
                return ca.dateofsubmit;
            }
            else if(j==4)
            {
                return ca.file;
            }
            
             else 
            {
                return ca.grade;
            }
            
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        answertf = new javax.swing.JTextField();
        sendbt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        question_idtf = new javax.swing.JTextField();
        openbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHECK ASSIGNMENT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 850, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Grade");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 530, 160, 30);
        getContentPane().add(answertf);
        answertf.setBounds(200, 530, 340, 30);

        sendbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        sendbt.setText("SEND");
        sendbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtActionPerformed(evt);
            }
        });
        getContentPane().add(sendbt);
        sendbt.setBounds(590, 530, 100, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Assignment Id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 480, 160, 30);
        getContentPane().add(question_idtf);
        question_idtf.setBounds(200, 480, 340, 30);

        openbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        openbt.setText("OPEN FILE");
        openbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openbtActionPerformed(evt);
            }
        });
        getContentPane().add(openbt);
        openbt.setBounds(710, 530, 120, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbtActionPerformed
        String assignment_id=question_idtf.getText();
        String grade=answertf.getText();
        int i=jt.getSelectedRow();
        String email=(String)jt.getValueAt(i, 2);
        String ans=client.post_grade(assignment_id,email,grade);
        JOptionPane.showMessageDialog(rootPane, ans);
          dispose();
        check_assignment pa=new check_assignment();

    }//GEN-LAST:event_sendbtActionPerformed

    private void openbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openbtActionPerformed
        try
        {
            int i=jt.getSelectedRow();
            String path=(String)jt.getValueAt(i, 4);
            Desktop d=Desktop.getDesktop();
            File f=new File(path);
            d.open(f);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_openbtActionPerformed

    
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
            java.util.logging.Logger.getLogger(check_assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(check_assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(check_assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(check_assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new check_assignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answertf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton openbt;
    private javax.swing.JTextField question_idtf;
    private javax.swing.JButton sendbt;
    // End of variables declaration//GEN-END:variables
}
