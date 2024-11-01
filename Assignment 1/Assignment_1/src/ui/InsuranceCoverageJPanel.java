/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Model.InsuranceCoverage;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaswanth
 */
public class InsuranceCoverageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceCoverageJPanel
     */
    InsuranceCoverage Insurancecoverage;
    public InsuranceCoverageJPanel(InsuranceCoverage Insurancecoverage) {
        initComponents();
        this.Insurancecoverage=Insurancecoverage;
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
        jLabel1 = new javax.swing.JLabel();
        lblPremium = new javax.swing.JLabel();
        lblCoorporateId = new javax.swing.JLabel();
        lblDAmount = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblBenifits = new javax.swing.JLabel();
        lblAmountToPay = new javax.swing.JLabel();
        txtAmountToPay = new javax.swing.JTextField();
        txtBenifits = new javax.swing.JTextField();
        txtDAmount = new javax.swing.JTextField();
        txtPremium = new javax.swing.JTextField();
        txtCoorporateId = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insurance Coverage");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 445, 53));

        lblPremium.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPremium.setText("Premium:");
        jPanel1.add(lblPremium, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 107, 24));

        lblCoorporateId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCoorporateId.setText("Coorporate Id:");
        jPanel1.add(lblCoorporateId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 205, 24));

        lblDAmount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDAmount.setText("Deductable Amount:");
        jPanel1.add(lblDAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 200, 24));

        lblAddress.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAddress.setText("Address:");
        jPanel1.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 140, 24));

        lblBenifits.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBenifits.setText("Benifits:");
        jPanel1.add(lblBenifits, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 144, 24));

        lblAmountToPay.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAmountToPay.setText("Amount To Pay:");
        jPanel1.add(lblAmountToPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 220, 24));
        jPanel1.add(txtAmountToPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 290, -1));

        txtBenifits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBenifitsActionPerformed(evt);
            }
        });
        jPanel1.add(txtBenifits, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 290, 30));
        jPanel1.add(txtDAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 290, -1));
        jPanel1.add(txtPremium, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 290, -1));
        jPanel1.add(txtCoorporateId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 290, -1));

        btnSave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 290, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/insurance.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 670, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Insurancecoverage.setAddress(txtAddress.getText());
        Insurancecoverage.setAmountToPay(txtAmountToPay.getText());
        Insurancecoverage.setBenifits(txtBenifits.getText());
        Insurancecoverage.setCorporateId(txtCoorporateId.getText());
        Insurancecoverage.setDeductable(txtDAmount.getText());
        Insurancecoverage.setPremium(txtPremium.getText());
         JOptionPane.showMessageDialog(this,"The Information Is Saved");
                
               
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtBenifitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBenifitsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBenifitsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAmountToPay;
    private javax.swing.JLabel lblBenifits;
    private javax.swing.JLabel lblCoorporateId;
    private javax.swing.JLabel lblDAmount;
    private javax.swing.JLabel lblPremium;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAmountToPay;
    private javax.swing.JTextField txtBenifits;
    private javax.swing.JTextField txtCoorporateId;
    private javax.swing.JTextField txtDAmount;
    private javax.swing.JTextField txtPremium;
    // End of variables declaration//GEN-END:variables
}
