/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Model.patient;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaswanth
 */
public class PatientJP extends javax.swing.JPanel {

    /**
     * Creates new form PatientJP
     */
     patient Patient;
    public PatientJP(patient Patient) {
        initComponents();
           this.Patient=Patient;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDoctor = new javax.swing.JLabel();
        lblPatientId = new javax.swing.JLabel();
        lblPatientInfo = new javax.swing.JLabel();
        lblDOLV = new javax.swing.JLabel();
        lblDOA = new javax.swing.JLabel();
        lblAllergies = new javax.swing.JLabel();
        lblInsuranceCoverage = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtDoctor = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtDOLV = new com.toedter.calendar.JDateChooser();
        txtDOA = new com.toedter.calendar.JDateChooser();
        JAYES = new javax.swing.JRadioButton();
        JANO = new javax.swing.JRadioButton();
        JIYES = new javax.swing.JRadioButton();
        JINO = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(613, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDoctor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDoctor.setText("Doctor:");
        jPanel1.add(lblDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 150, -1));

        lblPatientId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPatientId.setText("Patient Id:");
        jPanel1.add(lblPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 102, 164, -1));

        lblPatientInfo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblPatientInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientInfo.setText("Patient Information");
        jPanel1.add(lblPatientInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 490, -1));

        lblDOLV.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDOLV.setText("Date Of Last Visit:");
        jPanel1.add(lblDOLV, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 158, 183, -1));

        lblDOA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDOA.setText("Date Of Next Arrival:");
        jPanel1.add(lblDOA, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 186, 183, -1));

        lblAllergies.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAllergies.setText("Allergies:");
        jPanel1.add(lblAllergies, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 214, 150, -1));

        lblInsuranceCoverage.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblInsuranceCoverage.setText("Insurance Coverage:");
        jPanel1.add(lblInsuranceCoverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 190, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 211, -1));

        txtDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorActionPerformed(evt);
            }
        });
        jPanel1.add(txtDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 211, -1));

        btnSave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 170, -1));
        jPanel1.add(txtDOLV, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 210, -1));
        jPanel1.add(txtDOA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 210, -1));

        JAYES.setText("YES");
        JAYES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JAYESActionPerformed(evt);
            }
        });
        jPanel1.add(JAYES, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        JANO.setText("NO");
        JANO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JANOActionPerformed(evt);
            }
        });
        jPanel1.add(JANO, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 220, 110, -1));

        JIYES.setText("YES");
        JIYES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JIYESActionPerformed(evt);
            }
        });
        jPanel1.add(JIYES, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        JINO.setText("NO");
        jPanel1.add(JINO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/istockphoto-1173046626-612x612.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 610, 470));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
     
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String date=sdf.format(txtDOLV.getDate());
        Patient.setDOLV(date);
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        String date1=sdf.format(txtDOA.getDate());
        Patient.setDONA(date1);
       if(JIYES.isSelected()){
          Patient.setInsuranceCoverage("Yes");
        }
        if(JINO.isSelected()){
           Patient.setInsuranceCoverage("No");
        }
        if(JAYES.isSelected()){
          Patient.setAllergies("Yes");
        }
        if(JANO.isSelected()){
           Patient.setAllergies("No");
        }
      
        Patient.setPrimaryDoctor(txtDoctor.getText());
        Patient.setPatientID(txtId.getText());
       
    JOptionPane.showMessageDialog(this,"The Information Is Saved");

    }//GEN-LAST:event_btnSaveActionPerformed

    private void JAYESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JAYESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JAYESActionPerformed

    private void JANOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JANOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JANOActionPerformed

    private void JIYESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JIYESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JIYESActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JANO;
    private javax.swing.JRadioButton JAYES;
    private javax.swing.JRadioButton JINO;
    private javax.swing.JRadioButton JIYES;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAllergies;
    private javax.swing.JLabel lblDOA;
    private javax.swing.JLabel lblDOLV;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblInsuranceCoverage;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPatientInfo;
    private com.toedter.calendar.JDateChooser txtDOA;
    private com.toedter.calendar.JDateChooser txtDOLV;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
