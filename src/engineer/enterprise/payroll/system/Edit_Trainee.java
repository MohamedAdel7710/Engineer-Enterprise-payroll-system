/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engineer.enterprise.payroll.system;

import javax.swing.JOptionPane;

/**
 *
 * @author Lap
 */
public class Edit_Trainee extends javax.swing.JFrame {

    /**
     * Creates new form Edit_Trainee
     */
    public Edit_Trainee() {
        initComponents();
        this.setTitle("Edit data");
        jComboBox1.setVisible(false);
        jButton2.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jLabel6.setVisible(false);
        jTextField5.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setPreferredSize(new java.awt.Dimension(1090, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-identity-theft-48.png"))); // NOI18N
        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 30, 110, 48);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 40, 154, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-ok-24.png"))); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(680, 40, 110, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-compose-48.png"))); // NOI18N
        jLabel2.setText("Edit");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 80, 110, 60);

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Age", "Univeristy_Name", "Days", "Edit all data" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(300, 100, 160, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-autograph-48.png"))); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 320, 140, 48);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(330, 330, 170, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-age-48.png"))); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 250, 130, 48);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(330, 260, 170, 28);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-classroom-48.png"))); // NOI18N
        jLabel5.setText("Univeristy_Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 190, 270, 40);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(330, 190, 170, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-timetable-48.png"))); // NOI18N
        jLabel6.setText("Days");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 390, 140, 48);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(330, 400, 170, 28);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-simple-arrow-24.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 520, 180, 50);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-go-back-24.png"))); // NOI18N
        jButton3.setText("Return Back");
        jButton3.setActionCommand("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(660, 520, 210, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/f153e729-628b-446c-a69c-217cde29c861.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1280, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          boolean flag=false;
          boolean day=true;
        
        if(jTextField1.getText().length()!=0){
            String id=jTextField1.getText();
         for(int i=0;i<trainee.tra.size();i++){
            if(id.equals(trainee.tra.get(i).getID())){
                flag=true;
                if (trainee.tra.get(i).getDays()>3){
                day=false;
               
                }
            }
        }
         if(flag==true&&day==true){
               jLabel2.setVisible(true);
               jComboBox1.setVisible(true);
               jButton2.setVisible(true);
               
         }
         if(flag==false){
               jLabel2.setVisible(false);
               jComboBox1.setVisible(false);
               jButton2.setVisible(false);
               
            JOptionPane.showMessageDialog(this,"the ID is not found ", "Error",JOptionPane.ERROR_MESSAGE);
             
         }
         if(day==false){
             jLabel2.setVisible(false);
               jComboBox1.setVisible(false);
               jButton2.setVisible(false);
               
             JOptionPane.showMessageDialog(this, "This Trainee is deleted as the his absence days is more than three days", "ERROR",JOptionPane.ERROR_MESSAGE);
         }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please Enter the trainne id", "ERROR",JOptionPane.ERROR_MESSAGE);

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
         String choice=String.valueOf(jComboBox1.getSelectedItem());
          if(choice.equals("Name")){
          
         jButton2.setVisible(true);
        jButton3.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jTextField2.setVisible(true);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
       jLabel6.setVisible(false);
          
          }
           else if(choice.equals("Age")){
           
       
         jButton2.setVisible(true);
        jButton3.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(false);
        jLabel4.setVisible(true);
        jLabel5.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(true);
        jTextField4.setVisible(false);
        jLabel6.setVisible(false);
           
           }
             else if(choice.equals("Univeristy_Name")){
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(true);
        jLabel6.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField5.setVisible(false);
        jTextField4.setVisible(true);
       
             }
             else if (choice.equals("Days")){
               
             jButton2.setVisible(true);
        jButton3.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jLabel6.setVisible(true);
        jTextField5.setVisible(true);
             
             
             
             }
           else if (choice.equals("Edit all data")){
             jButton2.setVisible(true);
        jButton3.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jLabel6.setVisible(true);
        jTextField5.setVisible(true);
       
             
           }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
          String id=jTextField1.getText();
          
          trainee tempp;
      if(jTextField2.getText().length()!=0||jTextField3.getText().length()!=0||jTextField4.getText().length()!=0||jTextField5.getText().length()!=0){
       for(int i=0;i<trainee.tra.size();i++){
   
          
            if(id.equals(trainee.tra.get(i).getID())){
                tempp=trainee.tra.get(i);
                String choice=String.valueOf(jComboBox1.getSelectedItem());
                if(choice.equals("Name")){
                tempp.setName(jTextField2.getText());
                }
                
                else if(choice.equals("Age")){
                   int age=Integer.parseInt(jTextField3.getText());
                    tempp.setAge(age);
                    
                }
                else if (choice.equals("Univeristy_Name")){
                
                tempp.setUniversty_name(jTextField4.getText());
                
                }
                  else if (choice.equals("Days")){
                int day=Integer.parseInt(jTextField5.getText());
                tempp.setDays(day);
                
                }
                else if(choice.equals("Edit all data")){
                    tempp.setName(jTextField2.getText());
                    int age=Integer.parseInt(jTextField3.getText());
                    tempp.setAge(age);
                    tempp.setUniversty_name(jTextField4.getText());
                    int day=Integer.parseInt(jTextField5.getText());
                    
                    tempp.setDays(day);
                 
                }
            }           
        }
                  
                  jTextField1.setText(null);
                  jTextField2.setText(null);
                  jTextField3.setText(null);
                  jTextField4.setText(null);
                  jTextField5.setText(null);
                  jComboBox1.setVisible(false);
                  jButton2.setVisible(false);
                  jButton3.setVisible(true);
                  jLabel2.setVisible(false);
                  jLabel3.setVisible(false);
                  jLabel4.setVisible(false);
                  jLabel5.setVisible(false);
                  jTextField2.setVisible(false);
                  jTextField3.setVisible(false);
                  jTextField4.setVisible(false);
                  jLabel6.setVisible(false);
                  jTextField5.setVisible(false);
                      JOptionPane.showMessageDialog(this,"the new data has saved","Done", JOptionPane.INFORMATION_MESSAGE);
           
       }
             else{
                JOptionPane.showMessageDialog(this,"please enter the new data","Error", JOptionPane.ERROR_MESSAGE);

             }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       Trainee_form  F = new Trainee_form ();
        F.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(Edit_Trainee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Trainee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Trainee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Trainee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Trainee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
