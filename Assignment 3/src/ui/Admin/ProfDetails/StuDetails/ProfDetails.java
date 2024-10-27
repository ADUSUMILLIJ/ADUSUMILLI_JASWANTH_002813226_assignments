/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin.ProfDetails.StuDetails;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Professor.Professor;
import model.Professor.ProfessorDirectory;


/**
 *
 * @author sushanthkumarreddyjanga
 */
public class ProfDetails extends javax.swing.JPanel {
    JPanel work;
    Professor result;
    ProfessorDirectory professorList;
   

    /**
     * Creates new form ProfDetails
     */
    

    public ProfDetails(JPanel work, Professor result, ProfessorDirectory professorList) {
        initComponents();
        this.work=work;
        this.result=result;
        this.professorList=professorList;
        
        
        showDetails();
    }
    public void showDetails(){
        txtNameP.setText(result.getName());
        txtEID.setText(result.getId());
        txtEmailP.setText(result.getEmail());
        txtSpeciality.setText(result.getSpecialty());
        txtUNameP.setText(result.getuName());
        txtPassP.setText(result.getPassword());
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNameP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmailP = new javax.swing.JTextField();
        txtSpeciality = new javax.swing.JTextField();
        txtUNameP = new javax.swing.JTextField();
        txtPassP = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnSavePD = new javax.swing.JButton();
        btnUpdatePD = new javax.swing.JButton();
        btnBackPD = new javax.swing.JButton();

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Name:");

        txtNameP.setEditable(false);

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Employee ID");

        txtEID.setEditable(false);

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Email:");

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Speciality:");

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("UserName:");

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Password:");

        txtEmailP.setEditable(false);

        txtSpeciality.setEditable(false);

        txtUNameP.setEditable(false);

        txtPassP.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Professor Details");

        btnSavePD.setText("Save");
        btnSavePD.setEnabled(false);
        btnSavePD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePDActionPerformed(evt);
            }
        });

        btnUpdatePD.setText("Update");
        btnUpdatePD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePDActionPerformed(evt);
            }
        });

        btnBackPD.setText("Back");
        btnBackPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackPDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(404, 404, 404)
                                .addComponent(btnSavePD)
                                .addGap(32, 32, 32)
                                .addComponent(btnUpdatePD))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnBackPD)))
                        .addGap(0, 313, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(304, 304, 304)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUNameP)
                                .addComponent(txtPassP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNameP, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtEID)
                                .addComponent(txtEmailP)
                                .addComponent(txtSpeciality))))
                    .addGap(304, 304, 304)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnBackPD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSavePD)
                    .addComponent(btnUpdatePD))
                .addGap(145, 145, 145))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(187, 187, 187)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNameP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtEmailP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtUNameP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtPassP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(188, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackPDActionPerformed
        // TODO add your handling code here:
        work.remove(this);
        CardLayout layout = (CardLayout) work.getLayout();
        layout.previous(work);
    }//GEN-LAST:event_btnBackPDActionPerformed

    private void btnUpdatePDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePDActionPerformed
        // TODO add your handling code here:
        btnSavePD.setEnabled(true);
        txtNameP.setEditable(true);
        txtEID.setEditable(true);
        txtEmailP.setEditable(true);
        txtSpeciality.setEditable(true);
        txtUNameP.setEditable(true);
        txtPassP.setEditable(true);
        
        btnUpdatePD.setEnabled(false);
        
    }//GEN-LAST:event_btnUpdatePDActionPerformed

    private void btnSavePDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePDActionPerformed
        // TODO add your handling code here:
        String id = txtEID.getText();
        String name = txtNameP.getText();
        String email = txtEmailP.getText();
        String speciality = txtSpeciality.getText();
        String uName= txtUNameP.getText();
        String pwd = txtPassP.getText();
        
        Professor professor = new Professor(id, name, email,uName,pwd, speciality);
        professorList.addProfessor(professor);
        
        JOptionPane.showMessageDialog(this,"Registration Sucessfull");
        
        btnUpdatePD.setEnabled(true);
        btnSavePD.setEnabled(false);
        txtNameP.setEditable(false);
        txtEID.setEditable(false);
        txtEmailP.setEditable(false);
        txtSpeciality.setEditable(false);
        txtUNameP.setEditable(false);
        txtPassP.setEditable(false);
        

    }//GEN-LAST:event_btnSavePDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackPD;
    private javax.swing.JButton btnSavePD;
    private javax.swing.JButton btnUpdatePD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtEID;
    private javax.swing.JTextField txtEmailP;
    private javax.swing.JTextField txtNameP;
    private javax.swing.JPasswordField txtPassP;
    private javax.swing.JTextField txtSpeciality;
    private javax.swing.JTextField txtUNameP;
    // End of variables declaration//GEN-END:variables

    
}