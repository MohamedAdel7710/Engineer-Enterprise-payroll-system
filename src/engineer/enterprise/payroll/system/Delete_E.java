/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engineer.enterprise.payroll.system;

import static engineer.enterprise.payroll.system.Engineer.eng;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohamed
 */
public class Delete_E extends javax.swing.JFrame {

    /**
     * Creates new form Delete_E
     */
   
    
    public Delete_E() {
        initComponents();
        this.setTitle("Delete Engineer");
       jScrollPane2.setVisible(false);
       jButton1.setVisible(false);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete");
        setLocation(new java.awt.Point(500, 200));
        setPreferredSize(new java.awt.Dimension(1090, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 110, 50, 40);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(240, 120, 268, 28);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-cancel-24.png"))); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 360, 170, 50);

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Position", "Salary", "Age"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(110, 220, 800, 50);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-ok-24.png"))); // NOI18N
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(580, 120, 140, 34);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-go-back-24.png"))); // NOI18N
        jButton3.setText("Return Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(550, 360, 220, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-identity-theft-48.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 110, 48, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/website-login-background.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1090, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                
        String deleted_id=jTextField1.getText();
        //JOptionPane.showInputDialog(deleted_id);
        Boolean found=false;
        for(int i =0;i<Engineer.eng.size();i++){
          if(deleted_id.equals(Engineer.eng.get(i).getID())){
              found=true;
              int f =JOptionPane.showConfirmDialog(this,"Are you sure you want to Delete","Warning", JOptionPane.OK_OPTION);
              if(f==0){
                  Engineer.eng.get(i).Delete();
                  JOptionPane.showMessageDialog(this, "Done","Done",JOptionPane.INFORMATION_MESSAGE);
                  Eng_form form =new Eng_form();
                  form.setVisible(true);
                  this.dispose();
              }
              
          }
        }
          if(found==false){
              JOptionPane.showMessageDialog(this,"The ID Not Found","Error", WIDTH);
          }
      
        //JOptionPane.showInputDialog(this, "Are you sure","Warning", JOptionPane.YES_NO_CANCEL_OPTION);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Position","Salary","Age"}));
        if(jTextField1.getText().length()!=0){
        String deleted_id=jTextField1.getText();
        //JOptionPane.showInputDialog(deleted_id);
        Boolean found=false;
        for(int i =0;i<Engineer.eng.size();i++){
          if(deleted_id.equals(Engineer.eng.get(i).getID())){
              found=true;
              showData(Engineer.eng.get(i));
              jButton1.setVisible(true);
          }
        }
        if(found==false){
              JOptionPane.showMessageDialog(this,"the id  is not found","Error", JOptionPane.ERROR_MESSAGE);
          }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         Eng_form back= new Eng_form();
         back.setVisible(true);
         this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed
        
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
            java.util.logging.Logger.getLogger(Delete_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_E().setVisible(true);
            }
        });
    }
    public void showData(Engineer emp){
         //emp=new Engineer();
         jScrollPane2.setVisible(true);
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        //model.setDataVector(emp,null);
        Object []row = new Object[5];
            for(int i =0;i<3;i++){
            row[0]=emp.getID();
            row[1]=emp.getName();
            row[2]=emp.getGrade().position;
            row[3]=emp.getSalary();
            row[4]=emp.getAge();
            }
            
            model.addRow(row);
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
