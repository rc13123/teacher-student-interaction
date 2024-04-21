
import java.awt.Component;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;


public class mark_attendance extends javax.swing.JFrame {

    ArrayList<student_data> al;
    MyTableModel tm;
    JTable jt;
    JScrollPane jsp;
    public mark_attendance() {
        initComponents();
        al = new ArrayList<>();
        fill_combo_course();
        fill_arraylist();
        System.out.println(al);
      
        tm = new MyTableModel();
        jt = new JTable();
        jsp = new JScrollPane(jt);
       
        jsp.setBounds(10, 200, 970, 400);
        add(jsp);
        jt.setModel(tm);
          jt.setRowHeight(90);

        jt.getColumnModel().getColumn(7).setCellRenderer(new mark_attendance.ImageRenderer());
        setVisible(true);
        setSize(1000,650);
    }
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
    public void fill_arraylist() {
        al.clear();
        String fetch = client.fetch_student_data();
        
        StringTokenizer st = new StringTokenizer(fetch, ";");

        int n = st.countTokens();
        
            String department = "";
            int course = 0;
            String semester = "";
            String name = "";
            String fathers_name = "";
            String mobile_no = "";
            String email = "";
            String address = "";
            String photo = "";
        for (int i = 1; i <= n; i++) 
        {
            String ans1 = st.nextToken();
            
            StringTokenizer st1 = new StringTokenizer(ans1, ",");
           
            department=st1.nextToken();
            course=Integer.parseInt(st1.nextToken());
            semester=st1.nextToken();
            name=st1.nextToken();
            fathers_name=st1.nextToken();
            mobile_no=st1.nextToken();
            email=st1.nextToken();
            address=st1.nextToken();
            photo=st1.nextToken();
            al.add(new student_data(department, course, semester, name, fathers_name, mobile_no, email, address, photo));
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
            String col[] = {"DEPARTMENT","COURSE","SEMESTER","NAME", "FATHER'S NAME", "MOBILE NO.", "EMAIL","ADDRESS","PHOTO"};
            return col[i];
        }

        @Override
        public Object getValueAt(int i, int j) {

            //System.out.println(i);
            student_data sd = al.get(i);

            if(j==0)
            {
                return sd.department;
            }
            else if(j==1)
            {
                return sd.course;
            }
            else if(j==2)
            {
                return sd.semester;
            }
            else if(j==3)
            {
                return sd.name;
            }
            else if(j==4)
            {
                return sd.fathers_name;
            }
            else if(j==5)
            {
                return sd.mobile_no;
            }
            else if(j==6)
            {
                return sd.email;
            }
            else if(j==7)
            {
                return sd.address;
            }
            else
            {
                return sd.photo;
            }
        }

    }
     class ImageRenderer extends DefaultTableCellRenderer {

                    JLabel lbl = new JLabel();
              
                    @Override
                    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                            boolean hasFocus, int row, int column) {
                        try {
                            ImageIcon ic = new ImageIcon(al.get(row).photo);
                            Image img = ic.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                            lbl.setIcon(new ImageIcon(img));
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        
                   
                        return lbl;
                   }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        coursecb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        semestercb = new javax.swing.JComboBox<>();
        Vviewbt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        statuscb = new javax.swing.JComboBox<>();
        markbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MARK ATTENDANCE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 860, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Status");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 60, 120, 30);

        coursecb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course" }));
        coursecb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coursecbItemStateChanged(evt);
            }
        });
        getContentPane().add(coursecb);
        coursecb.setBounds(160, 60, 210, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Semester");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 110, 120, 30);

        semestercb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3","4","5","6","7","8","9","10", }));
        semestercb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                semestercbItemStateChanged(evt);
            }
        });
        getContentPane().add(semestercb);
        semestercb.setBounds(160, 110, 210, 30);

        Vviewbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Vviewbt.setText("VIEW");
        Vviewbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VviewbtActionPerformed(evt);
            }
        });
        getContentPane().add(Vviewbt);
        Vviewbt.setBounds(160, 160, 210, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Course");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 60, 120, 30);

        statuscb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "status","absent","present"}));
        getContentPane().add(statuscb);
        statuscb.setBounds(600, 60, 200, 30);

        markbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        markbt.setText("MARK");
        markbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markbtActionPerformed(evt);
            }
        });
        getContentPane().add(markbt);
        markbt.setBounds(650, 120, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coursecbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coursecbItemStateChanged

        //        if(evt.getStateChange()==evt.SELECTED)
        //        {
            //           String select=(String)coursecb.getSelectedItem();
            //           System.out.println(select);
            //         int fetch=Integer.parseInt(select.charAt(0)+"");
            //            System.out.println(fetch);
            //            fill_combo_semester(fetch);
            //        }
    }//GEN-LAST:event_coursecbItemStateChanged

    private void semestercbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_semestercbItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_semestercbItemStateChanged

    private void VviewbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VviewbtActionPerformed
         al.clear();
           String id=(String)coursecb.getSelectedItem();
         int course1=Integer.parseInt(id.charAt(0)+"");
         String semester1=(String)semestercb.getSelectedItem();
        
        String fetch = client.fetch_selected_student_data_based_on_course(course1+"",semester1);
        
        StringTokenizer st = new StringTokenizer(fetch, ";");

        int n = st.countTokens();
        
            String department = "";
            int course = 0;
            String semester = "";
            String name = "";
            String fathers_name = "";
            String mobile_no = "";
            String email = "";
            String address = "";
            String photo = "";
        for (int i = 1; i <= n; i++) 
        {
            String ans1 = st.nextToken();
            
            StringTokenizer st1 = new StringTokenizer(ans1, ",");
           
            department=st1.nextToken();
            course=Integer.parseInt(st1.nextToken());
            semester=st1.nextToken();
            name=st1.nextToken();
            fathers_name=st1.nextToken();
            mobile_no=st1.nextToken();
            email=st1.nextToken();
            address=st1.nextToken();
            photo=st1.nextToken();
            al.add(new student_data(department, course, semester, name, fathers_name, mobile_no, email, address, photo));
        }
        tm.fireTableDataChanged();
    }//GEN-LAST:event_VviewbtActionPerformed

    private void markbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markbtActionPerformed
       int i=jt.getSelectedRow();
       String email=(String)jt.getValueAt(i, 6);
       int course=(int)jt.getValueAt(i, 1);
       String semester=(String)jt.getValueAt(i, 2);
        SimpleDateFormat sdf=new SimpleDateFormat();
        String date=sdf.format(new Date());
        String status=(String)statuscb.getSelectedItem();
        String ans=client.mark_attendance(email,date,status,course,semester);
        JOptionPane.showMessageDialog(rootPane, ans);
    }//GEN-LAST:event_markbtActionPerformed

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
            java.util.logging.Logger.getLogger(mark_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mark_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mark_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mark_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mark_attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Vviewbt;
    private javax.swing.JComboBox<String> coursecb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton markbt;
    private javax.swing.JComboBox<String> semestercb;
    private javax.swing.JComboBox<String> statuscb;
    // End of variables declaration//GEN-END:variables
}
