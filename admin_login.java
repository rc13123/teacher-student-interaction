import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JButton;
public class admin_login extends javax.swing.JFrame implements ActionListener{

    JButton forgotbt;
    public admin_login() {
        initComponents();
        forgotbt=new JButton("Change Password");
        forgotbt.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); 
        forgotbt.setBounds(300, 233, 180, 40);
        add(forgotbt);
        forgotbt.addActionListener(this);
        setSize(700,500);
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        usernamelb = new javax.swing.JLabel();
        passwordlb = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernametf = new javax.swing.JTextField();
        passwordtf = new javax.swing.JPasswordField();
        loginbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        usernamelb.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        usernamelb.setText("USERNAME");
        getContentPane().add(usernamelb);
        usernamelb.setBounds(20, 80, 80, 30);

        passwordlb.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        passwordlb.setText("PASSWORD");
        getContentPane().add(passwordlb);
        passwordlb.setBounds(20, 150, 90, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADMIN LOGIN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 10, 430, 40);
        getContentPane().add(usernametf);
        usernametf.setBounds(150, 80, 290, 40);
        getContentPane().add(passwordtf);
        passwordtf.setBounds(150, 150, 290, 40);

        loginbt.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        loginbt.setText("LOGIN");
        // NOI18N
        
        loginbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtActionPerformed(evt);
            }
        });
        getContentPane().add(loginbt);
        loginbt.setBounds(150, 233, 140, 40);

        pack();
    }// </editor-fold>                        

    private void loginbtActionPerformed(java.awt.event.ActionEvent evt) {                                        
       String username=usernametf.getText();
        String password=passwordtf.getText();
        String result=client.admin_login(username,password);
       
           
        JOptionPane.showMessageDialog(rootPane, result);
        
        dispose();
        admin_home ah=new admin_home(username);
    }                                       

    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel usernamelb;
    private javax.swing.JTextField usernametf;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginbt;
    private javax.swing.JLabel passwordlb;
    private javax.swing.JPasswordField passwordtf;

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       dispose();
       change_password cp=new change_password();
    }
             
}
