/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engineer.enterprise.payroll.system;

import javax.swing.JOptionPane;

/**
 *
 * @author Mohamed
 */
public class edit extends javax.swing.JFrame {

    /**
     * Creates new form edit
     */
    public edit() {
        initComponents();
        this.setTitle("Edit data");
        combo.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField1.setVisible(false);
        jButton2.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

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
        jLabel1.setBounds(130, 40, 160, 34);

        idtext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtextActionPerformed(evt);
            }
        });
        getContentPane().add(idtext);
        idtext.setBounds(310, 50, 200, 28);

        combo.setBackground(new java.awt.Color(204, 204, 204));
        combo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Position", "Working hour", "Age", "Edit all data" }));
        combo.setToolTipText("");
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo);
        combo.setBounds(350, 140, 145, 28);

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
        jButton1.setBounds(680, 50, 130, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-compose-48.png"))); // NOI18N
        jLabel2.setText("Edit");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 130, 140, 48);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-autograph-48.png"))); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 240, 150, 31);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-clock-48.png"))); // NOI18N
        jLabel4.setText("working hours");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 290, 240, 37);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-place-marker-48.png"))); // NOI18N
        jLabel5.setText("position");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 350, 220, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/icons8-age-48.png"))); // NOI18N
        jLabel6.setText("age");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 400, 150, 48);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(320, 240, 190, 28);

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
        jButton2.setBounds(280, 510, 190, 54);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(320, 300, 190, 28);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(320, 420, 200, 28);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(320, 360, 190, 28);

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
        jButton3.setBounds(630, 510, 210, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engineer/enterprise/payroll/system/f153e729-628b-446c-a69c-217cde29c861.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -50, 1550, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
        
        
       String choice=String.valueOf(combo.getSelectedItem());
       if(choice.equals("Name")){
           jLabel3.setVisible(true);
           jTextField2.setVisible(true);
           jLabel4.setVisible(false);
           jLabel5.setVisible(false);
           jLabel6.setVisible(false);
           jTextField3.setVisible(false);
           jTextField4.setVisible(false);
           jTextField1.setVisible(false);
           jButton2.setVisible(true);
          
       }
       else if(choice.equals("Working hour")){
           jLabel4.setVisible(true);
           jTextField3.setVisible(true);
           jLabel3.setVisible(false);
           jLabel5.setVisible(false);
           jLabel6.setVisible(false);
           jTextField2.setVisible(false);
           jTextField4.setVisible(false);
           jTextField1.setVisible(false);
           jButton2.setVisible(true);
         
       }
       else if(choice.equals("Position")){
           jLabel5.setVisible(true);
           jTextField4.setVisible(true);
           jLabel3.setVisible(false);
           jLabel4.setVisible(false);
           jLabel6.setVisible(false);
           jTextField3.setVisible(false);
           jTextField2.setVisible(false);
           jTextField1.setVisible(false);
            jButton2.setVisible(true);
            
       }
       else if(choice.equals("Age")){
           jLabel6.setVisible(true);
           jTextField1.setVisible(true);
           jTextField3.setVisible(false);
           jTextField4.setVisible(false);
           jTextField2.setVisible(false);
           jLabel3.setVisible(false);
           jLabel4.setVisible(false);
           jLabel5.setVisible(false);
            jButton2.setVisible(true);
           
       }
       else if(choice.equals("Edit all data")){
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField1.setVisible(true);
        jButton2.setVisible(true);
        
       }
        
    }//GEN-LAST:event_comboActionPerformed

    private void idtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtextActionPerformed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_idtextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean flag=false;
        boolean age=true;
        if(idtext.getText().length()!=0){
        String id=idtext.getText();
         for(int i=0;i<Engineer.eng.size();i++){
            if(id.equals(Engineer.eng.get(i).getID())){
                flag=true;
                if(Engineer.eng.get(i).getAge()>60){
                 age=false;                
                }
            }
        }
         if(flag==true&&age==true){
             jLabel2.setVisible(true);
             combo.setVisible(true);
         }
         if(flag==false){
         
            JOptionPane.showMessageDialog(this,"The ID Is Not Found ", "Error",JOptionPane.ERROR_MESSAGE);
             
         }
         if(age==false){
             
          JOptionPane.showMessageDialog(this,"This Engineer is retired you can't edit his Data","Error",JOptionPane.ERROR_MESSAGE);   
         }
        }
        else{
           JOptionPane.showMessageDialog(this,"Please Enter ID", "Error",JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id=idtext.getText();
        Engineer temp;
        if(jTextField2.getText().length()!=0||jTextField3.getText().length()!=0||jTextField1.getText().length()!=0||jTextField4.getText().length()!=0){
        for(int i=0;i<Engineer.eng.size();i++){
            if(id.equals(Engineer.eng.get(i).getID())){
                
                temp=Engineer.eng.get(i);
                String choice=String.valueOf(combo.getSelectedItem());
                if(choice.equals("Name")){
                temp.setName(jTextField2.getText());
                }
                else if(choice.equals("Working hour")){
                    int newworkingHour=Integer.parseInt(jTextField3.getText());
                    Grade newGrade=new Grade(newworkingHour,Engineer.eng.get(i).grade.position);
                    
                    temp.setGrade(newGrade);
                }
                else if(choice.equals("Age")){
                    
                   int age=Integer.parseInt(jTextField1.getText());
                    temp.setAge(age);
                    temp.Upto60(age);
                    
                }
                else if(choice.equals("Position")){
                    String Position=jTextField4.getText();
                    Grade newGrade=new Grade(Engineer.eng.get(i).grade.workingHour,Position);
                    temp.setGrade(newGrade);
                }
                else if(choice.equals("Edit all data")){
                    if(jTextField2.getText().length()!=0&&jTextField3.getText().length()!=0&&jTextField1.getText().length()!=0&&jTextField4.getText().length()!=0){
                    temp.setName(jTextField2.getText());
                    int age=Integer.parseInt(jTextField1.getText());
                    temp.setAge(age);
                    
                    int newworkingHour=Integer.parseInt(jTextField3.getText());
                    String Position=jTextField4.getText();
                    Grade newGrade=new Grade(newworkingHour,Position);
                    temp.setGrade(newGrade);
                    }
                    else{
                           JOptionPane.showMessageDialog(this,"please enter all data required","Error", JOptionPane.ERROR_MESSAGE);
                    }
                      
                }
                
              idtext.setText(null);
              jTextField1.setText(null);
              jTextField2.setText(null);
              jTextField3.setText(null);
              jTextField4.setText(null);
              combo.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField1.setVisible(false);
        jButton2.setVisible(false);
              
                JOptionPane.showMessageDialog(this,"the new data has saved","Done", JOptionPane.INFORMATION_MESSAGE);
//                else{
//                   upTo60=false;
//                }
                
               }
           }
       }
        else{
             JOptionPane.showMessageDialog(this,"please enter the new data","Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Eng_form form= new Eng_form();
        form.setVisible(true);
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
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo;
    private javax.swing.JTextField idtext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
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
    // End of variables declaration//GEN-END:variables
}
