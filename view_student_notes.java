
import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;


public class view_student_notes extends javax.swing.JFrame {

    ArrayList<notes_data> al;
    MyTableModel tm;
    JTable jt;
    JScrollPane jsp;
    String course;
    String semester;
    public view_student_notes(String course,String semester) 
    {
        initComponents();
        this.course=course;
        this.semester=semester;
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
        setSize(1000,500);
    }
     public void fill_arraylist() {
        al.clear();
        String fetch = client.fetch_selected_notes(course,semester);
         System.out.println("sourav");
         System.out.println(fetch);
        StringTokenizer st = new StringTokenizer(fetch, ";");

        int n = st.countTokens();
        
            String notes_id = "";
            String teacher_id = "";
            String topic = "";
            String details = "";
            String date = "";
            String type = "";
            String path = "";
            String course = "";
            String semester = "";
        for (int i = 1; i <= n; i++) 
        {
            String ans1 = st.nextToken();
            System.out.println(ans1);
            StringTokenizer st1 = new StringTokenizer(ans1, "$");
           
            notes_id=st1.nextToken();
            teacher_id=st1.nextToken();
            topic=st1.nextToken();
            details=st1.nextToken();
            date=st1.nextToken();
            type=st1.nextToken();
            path=st1.nextToken();
            course=st1.nextToken();
            semester=st1.nextToken();
            al.add(new notes_data(notes_id, teacher_id, topic, details, date, type, path, course, semester));
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
            String col[] = {"NOTES ID", "TEACHER ID", "TITLE", "DETAIL", "DATE TIME","TYPE","FILE","COURSE","SEMESTER"};
            return col[i];
        }

        @Override
        public Object getValueAt(int i, int j) {

           notes_data nd=al.get(i);
            if(j==0)
            {
                 return nd.notes_id;
            }
           else if(j==1)
            {
                return nd.teacher_id;
            }
            else if(j==2)
            {
                return nd.topic;
            }
            else if(j==3)
            {
                return nd.details;
            }
            else if(j==4)
            {
                return nd.date;
            }
            else if(j==5)
            {
                return nd.type;
            }
            else if(j==6)
            {
                return nd.path;
            }
            else if(j==7)
            {
                return nd.course;
            }
             else 
            {
                return nd.semester;
            }
            
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        openbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT NOTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 1, 940, 40);

        openbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        openbt.setText("OPEN FILE");
        openbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openbtActionPerformed(evt);
            }
        });
        getContentPane().add(openbt);
        openbt.setBounds(380, 440, 120, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openbtActionPerformed
       try
        {
            int i=jt.getSelectedRow();
            String path=(String)jt.getValueAt(i, 6);
            Desktop d=Desktop.getDesktop();
            File f=new File(path);
            d.open(f);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_openbtActionPerformed

   
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
//            java.util.logging.Logger.getLogger(view_student_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(view_student_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(view_student_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(view_student_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new view_student_notes("computer science","8").setVisible(true);
//            }
//        });
//    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton openbt;
    // End of variables declaration//GEN-END:variables
}
