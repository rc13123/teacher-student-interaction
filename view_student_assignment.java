
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;


public class view_student_assignment extends javax.swing.JFrame {

     ArrayList<assignment_data> al;
    MyTableModel tm;
    JTable jt;
    JScrollPane jsp;
    String course;
    String semester;
     File ph;
    JFileChooser jfc;
    String email;
    public view_student_assignment(String course,String semester,String email) {
        initComponents();
          this.course=course;
        this.semester=semester;
        this.email=email;
        al = new ArrayList<>();
        fill_arraylist();
        System.out.println(al);
      
        tm =new MyTableModel();
        jt = new JTable();
        jsp = new JScrollPane(jt);
       
        jsp.setBounds(10, 50, 900, 400);
        add(jsp);
        jt.setModel(tm);
        setVisible(true);
        setSize(1000,650);
    }
     public void fill_arraylist() {
        al.clear();
        String fetch = client.fetch_assignment(course,semester);
        
        StringTokenizer st = new StringTokenizer(fetch, ";");

        int n = st.countTokens();
        
            String asid = "";
            String teacher_id = "";
            String title = "";
            String detail = "";
            String date_time = "";
           String course = "";
            String semester = "";
            String file = "";
            String lastdate="";
        for (int i = 1; i <= n; i++) 
        {
            String ans1 = st.nextToken();
            System.out.println(ans1);
            StringTokenizer st1 = new StringTokenizer(ans1, "$");
           
            asid=st1.nextToken();
            teacher_id=st1.nextToken();
            title=st1.nextToken();
            detail=st1.nextToken();
            date_time=st1.nextToken();
            course=st1.nextToken();
            semester=st1.nextToken();
            file=st1.nextToken();
            lastdate=st1.nextToken();
           
            al.add(new assignment_data(asid, teacher_id, title, detail, date_time, course, semester, file,lastdate));
        }

    }
    public class MyTableModel extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return al.size();

        }

        @Override
        public int getColumnCount() {
            return 9;
        }

        @Override
        public String getColumnName(int i) {
            String col[] = {"ASID", "TEACHER ID", "TITLE", "DETAIL", "DATE TIME","COURSE","SEMESTER","FILE","LASTDATE"};
            return col[i];
        }

        @Override
        public Object getValueAt(int i, int j) {

           assignment_data ad=al.get(i);
            if(j==0)
            {
                 return ad.asid;
            }
           else if(j==1)
            {
                return ad.teacher_id;
            }
            else if(j==2)
            {
                return ad.title;
            }
            else if(j==3)
            {
                return ad.detail;
            }
            else if(j==4)
            {
                return ad.date_time;
            }
            else if(j==5)
            {
                return ad.course;
            }
            else if(j==6)
            {
                 return ad.semester;
            }
             else if(j==7)
            {
               return ad.file;
            }
            else
             {
                 return ad.lastdate;
             }
            
        }

    }
    
     
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        openbt = new javax.swing.JButton();
        choosebt = new javax.swing.JButton();
        submitbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW ASSIGNMENT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 860, 30);

        openbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        openbt.setText("OPEN ASSIGNMENT");
        openbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openbtActionPerformed(evt);
            }
        });
        getContentPane().add(openbt);
        openbt.setBounds(130, 460, 210, 30);

        choosebt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        choosebt.setText("CHOOSE FILE");
        choosebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosebtActionPerformed(evt);
            }
        });
        getContentPane().add(choosebt);
        choosebt.setBounds(380, 460, 140, 30);

        submitbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        submitbt.setText("SUBMIT ASSIGNMENT");
        submitbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtActionPerformed(evt);
            }
        });
        getContentPane().add(submitbt);
        submitbt.setBounds(550, 460, 230, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openbtActionPerformed
        try
        {
            int i=jt.getSelectedRow();
            String path=(String)jt.getValueAt(i, 7);
            Desktop d=Desktop.getDesktop();
            File f=new File(path);
            d.open(f);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_openbtActionPerformed

    private void choosebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosebtActionPerformed
        jfc=new JFileChooser();
       int ans=jfc.showOpenDialog(this);
       if(ans==JFileChooser.APPROVE_OPTION)
       {
           ph=jfc.getSelectedFile();
          
          
       }
    }//GEN-LAST:event_choosebtActionPerformed

    private void submitbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtActionPerformed
        int i=jt.getSelectedRow();
        String assignment_id=(String)jt.getValueAt(i, 0);
        String student_email=email;
        SimpleDateFormat sdf=new SimpleDateFormat();
        String dateofsubmit=sdf.format(new Date());
         String path=ph.getPath();
        String ans=client.submit_assignment(assignment_id,student_email,dateofsubmit,path);
        JOptionPane.showMessageDialog(rootPane, ans);
        dispose();
        view_student_assignment vs=new view_student_assignment(course, semester, email);
    }//GEN-LAST:event_submitbtActionPerformed

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
//            java.util.logging.Logger.getLogger(view_student_assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(view_student_assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(view_student_assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(view_student_assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new view_student_assignment().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton choosebt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton openbt;
    private javax.swing.JButton submitbt;
    // End of variables declaration//GEN-END:variables
}
