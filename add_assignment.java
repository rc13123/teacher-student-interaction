
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class add_assignment extends javax.swing.JFrame {

    File ph;
    JFileChooser jfc;
    String last_date;
    public add_assignment() {
        initComponents();
        fill_combo_course();
        setVisible(true);
        setSize(450,900);
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
        dayscb = new javax.swing.JComboBox<>();
        coursecb = new javax.swing.JComboBox<>();
        semestercb = new javax.swing.JComboBox<>();
        titletf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailta = new javax.swing.JTextArea();
        photolb = new javax.swing.JLabel();
        addbt = new javax.swing.JButton();
        browsebt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD ASSIGNMENT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(5, 2, 420, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("File");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 410, 170, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Course");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 70, 170, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Semester");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 120, 170, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Title");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 170, 170, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Detail");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 220, 170, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("No. Of Days");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 350, 170, 30);

        dayscb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3","4","5", }));
        dayscb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dayscbItemStateChanged(evt);
            }
        });
        getContentPane().add(dayscb);
        dayscb.setBounds(200, 350, 180, 30);

        coursecb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course" }));
        getContentPane().add(coursecb);
        coursecb.setBounds(200, 72, 180, 30);

        semestercb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3","4","5","6","7","8","9","10",}));
        getContentPane().add(semestercb);
        semestercb.setBounds(200, 120, 180, 30);
        getContentPane().add(titletf);
        titletf.setBounds(200, 172, 180, 30);

        detailta.setColumns(20);
        detailta.setRows(5);
        jScrollPane1.setViewportView(detailta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(200, 220, 180, 110);

        photolb.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        photolb.setText("preview");
        photolb.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(photolb);
        photolb.setBounds(200, 420, 180, 100);

        addbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        addbt.setText("Add");
        addbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtActionPerformed(evt);
            }
        });
        getContentPane().add(addbt);
        addbt.setBounds(220, 600, 130, 30);

        browsebt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        browsebt.setText("Browse");
        browsebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsebtActionPerformed(evt);
            }
        });
        getContentPane().add(browsebt);
        browsebt.setBounds(220, 540, 130, 30);

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
        
       int course=Integer.parseInt(id.charAt(0)+"");
      
       String teacher_id="ridhimabehal475@gmail.com";
       
       String semester=(String)semestercb.getSelectedItem();
      
       String title=titletf.getText();
       
       String detail=detailta.getText();
      
        SimpleDateFormat sdf=new SimpleDateFormat();
        String date=sdf.format(new Date());
        
        if(teacher_id.isEmpty()||title.isEmpty()||detail.isEmpty()||date.isEmpty()||last_date.isEmpty()||course==0||semester.isEmpty()||ph==null)
        {
         JOptionPane.showMessageDialog(rootPane, "All fileds are Mandatory");
        }
        else
        {
             System.out.println("hello world1");
            String result=client.add_assignment(teacher_id,title,detail,date,course,semester,ph,last_date);
            System.out.println("hello world");
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

    private void dayscbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dayscbItemStateChanged
        if(evt.getStateChange()==evt.SELECTED)
        {
            Calendar c=Calendar.getInstance();
            c.setTime(new Date());
            String days=(String)dayscb.getSelectedItem();
            int day=Integer.parseInt(days);
            c.add(Calendar.DATE, day);
            last_date=new SimpleDateFormat().format(c.getTime());
           
        }
        
    }//GEN-LAST:event_dayscbItemStateChanged

    
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
            java.util.logging.Logger.getLogger(add_assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_assignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbt;
    private javax.swing.JButton browsebt;
    private javax.swing.JComboBox<String> coursecb;
    private javax.swing.JComboBox<String> dayscb;
    private javax.swing.JTextArea detailta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel photolb;
    private javax.swing.JComboBox<String> semestercb;
    private javax.swing.JTextField titletf;
    // End of variables declaration//GEN-END:variables
}
