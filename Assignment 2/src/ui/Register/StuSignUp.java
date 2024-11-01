/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Register;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Professor.Professor;
import model.Student.Student;
import model.Student.StudentDirectory;

/**
 *
 * @author sushanthkumarreddyjanga
 */
public class StuSignUp extends javax.swing.JPanel {
    JPanel work;
    StudentDirectory studentList;
    Student srtudent;

    /**
     * Creates new form StuSignUp
     */
   

    StuSignUp(JPanel work, StudentDirectory studentList) {
        initComponents();
        this.work=work;
        this.studentList=studentList;
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
        jLabel2 = new javax.swing.JLabel();
        txtNameStudent = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnuidStudent = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmailStu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUNameStu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassStu = new javax.swing.JPasswordField();
        btnSaveS = new javax.swing.JButton();
        btnBackS = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Sign Up");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Name:");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("NUID:");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Email:");

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("UserName:");

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Password:");

        btnSaveS.setText("Save");
        btnSaveS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSActionPerformed(evt);
            }
        });

        btnBackS.setText("Back");
        btnBackS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnBackS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNameStudent)
                            .addComponent(txtnuidStudent)
                            .addComponent(txtEmailStu)
                            .addComponent(txtUNameStu)
                            .addComponent(txtPassStu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaveS)
                .addGap(381, 381, 381))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNameStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnBackS)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnuidStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmailStu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUNameStu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPassStu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSaveS)
                .addContainerGap(316, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSActionPerformed
        // TODO add your handling code here:
        work.remove(this);
        CardLayout layout = (CardLayout) work.getLayout();
        layout.previous(work);
    }//GEN-LAST:event_btnBackSActionPerformed

    private void btnSaveSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSActionPerformed
        // TODO add your handling code here:
        String id = txtnuidStudent.getText();
        String name = txtNameStudent.getText();
        String email = txtEmailStu.getText();
        String uName= txtUNameStu.getText();
        String pwd = txtPassStu.getText();
        
        Student student = new Student(id, name, email,uName,pwd);
        studentList.addStudent(student);
        
        JOptionPane.showMessageDialog(this,"Registration Sucessfull");
        
    }//GEN-LAST:event_btnSaveSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackS;
    private javax.swing.JButton btnSaveS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtEmailStu;
    private javax.swing.JTextField txtNameStudent;
    private javax.swing.JPasswordField txtPassStu;
    private javax.swing.JTextField txtUNameStu;
    private javax.swing.JTextField txtnuidStudent;
    // End of variables declaration//GEN-END:variables
}
