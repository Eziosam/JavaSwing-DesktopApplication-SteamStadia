/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fixer Sam
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
        Steam s = new Steam();
        String name= s.getName();
        usersprofilename.setText(name);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("steam.png")));
        Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        usersprofilename = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        kButton1 = new keeptoo.KButton();
        jLabel13 = new javax.swing.JLabel();
        kButton2 = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Exit_25px.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 30, 110));

        kGradientPanel1.setkEndColor(new java.awt.Color(27, 40, 56));
        kGradientPanel1.setkStartColor(new java.awt.Color(39, 53, 74));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/steamheader2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 120));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/samllavatar.png"))); // NOI18N
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(61, 108, 128), 3, true));
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 70, 60));

        usersprofilename.setFont(new java.awt.Font("Segoe UI Semibold", 1, 28)); // NOI18N
        usersprofilename.setForeground(new java.awt.Color(255, 255, 255));
        usersprofilename.setText("acrobaticsam");
        kGradientPanel1.add(usersprofilename, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 260, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/profilebarpage2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 860, 100));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Profile Name:");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 110, -1));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Real Name   : ");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 110, -1));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("E- Mail       :");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 110, -1));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Mobile        : ");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Country      :");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Avatar        :");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        jPanel2.setBackground(new java.awt.Color(23, 35, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Settings");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Profile");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Chat");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Home");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 30));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 110, 520));

        jTextField1.setBackground(new java.awt.Color(22, 34, 38));
        jTextField1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 85, 108), 2, true));
        kGradientPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 240, 20));

        jTextField2.setBackground(new java.awt.Color(22, 34, 38));
        jTextField2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("acrobaticsam");
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 85, 108), 2, true));
        kGradientPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 240, 20));

        jTextField3.setBackground(new java.awt.Color(22, 34, 38));
        jTextField3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 85, 108), 2, true));
        kGradientPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 240, 20));

        jTextField4.setBackground(new java.awt.Color(22, 34, 38));
        jTextField4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 85, 108), 2, true));
        kGradientPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 240, 20));

        jTextField5.setBackground(new java.awt.Color(22, 34, 38));
        jTextField5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 85, 108), 2, true));
        kGradientPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 240, 20));

        jComboBox1.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "Bangladesh", "India", "England", "Australia", "Spain", "Germany", "France", "Italy" }));
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 85, 108), 2, true));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 240, -1));

        kButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(20, 30, 49), new java.awt.Color(20, 30, 48), null, null));
        kButton1.setText("Choose");
        kButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(30, 24, 48));
        kButton1.setkEndColor(new java.awt.Color(36, 59, 85));
        kButton1.setkHoverEndColor(new java.awt.Color(45, 64, 82));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(44, 62, 80));
        kButton1.setkPressedColor(new java.awt.Color(20, 30, 48));
        kButton1.setkSelectedColor(new java.awt.Color(20, 30, 48));
        kButton1.setkStartColor(new java.awt.Color(20, 30, 48));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 120, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/bigavatar.png"))); // NOI18N
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(61, 105, 126), 3, true));
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 160, 160));

        kButton2.setBorder(null);
        kButton2.setText("Save");
        kButton2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton2.setkEndColor(new java.awt.Color(6, 191, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(6, 191, 255));
        kButton2.setkSelectedColor(new java.awt.Color(6, 191, 255));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, 130, 30));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        jLabel9.setForeground(new java.awt.Color(103,193,245));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
        jLabel9.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
        jLabel10.setForeground(new java.awt.Color(103,193,245));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
        jLabel10.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
        jLabel11.setForeground(new java.awt.Color(103,193,245));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
        jLabel11.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:
        jLabel12.setForeground(new java.awt.Color(103,193,245));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:
        jLabel12.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_jLabel12MouseExited
    public ImageIcon resize(String path,JLabel jLabel13)
    {
        ImageIcon  myimage= new ImageIcon(path);
        Image img= myimage.getImage();
        Image resizedimage = img.getScaledInstance(jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image= new ImageIcon(resizedimage);
        return image;
    }
    
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser choose=new JFileChooser() ;
        choose.showOpenDialog(null);
        File f= choose.getSelectedFile();
        String filename= f.getAbsolutePath();
        jTextField1.setText(filename);
        jLabel13.setIcon(resize(filename,jLabel13));
        jLabel14.setIcon(resize(filename,jLabel14));
        
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        GLibrary injust =new GLibrary();
        injust.setVisible(true);
        WindowEvent clossed = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(clossed);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Exit_30px.png")));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Exit_25px.png")));
    }//GEN-LAST:event_exitMouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        messenger injust =new  messenger();
        injust.setVisible(true);
        WindowEvent clossed = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(clossed);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        
        String pronm=jTextField2.getText();
        String renm=jTextField3.getText();
        String email=jTextField4.getText();
        String mbl=jTextField5.getText();
        int i;
        Boolean pn=true,rn=true,em=true,mb=true;
        for(i=0;i<pronm.length();i++)
        {
            if(pronm.charAt(i)>='0' && pronm.charAt(i)<='9')
            {
                pn=false;
                break;
            }
        }
        for(i=0;i<renm.length();i++)
        {
            if(renm.charAt(i)>='0' && renm.charAt(i)<='9')
            {
                rn=false;
                break;
            }
        }
        boolean at=false,dot=false;
        for(i=0;i<email.length();i++)
        {
            if(email.charAt(i)=='@')
                at=true;
            if(email.charAt(i)=='.')
                dot=true;
        }
        if(!at || !dot)
            em=false;
        for(i=0;i<mbl.length();i++)
        {
            if(!(mbl.charAt(i)>='0' && mbl.charAt(i)<='9'))
            {
                mb=false;
                break;
            }
        }
        String s="";
        if(pronm.length()>12)
            s+="Name length must be than 12 charcters\n";
        if(!pn)
            s+="Invalid profile name\n";
        if(!rn)
            s+="Invalid name\n";
        if(!em)
            s+="Invalid mail\n";
        if(!mb)
            s+="Invalid mobile number\n";
        if(!s.isEmpty())
            JOptionPane.showMessageDialog(null,s);
        else
            JOptionPane.showMessageDialog(null,"Information saved");
        
    }//GEN-LAST:event_kButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel usersprofilename;
    // End of variables declaration//GEN-END:variables
}
