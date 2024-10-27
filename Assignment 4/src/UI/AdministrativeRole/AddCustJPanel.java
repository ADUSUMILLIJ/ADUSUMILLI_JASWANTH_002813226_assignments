/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminstrativeRole;

import Business.CustomerClass;
import Business.CustDir;
import Business.Utils.MyPhnNumbVerifClass;
import Business.Utils.MyStrngVerifClass;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author VAMSI VAS
 */
public class AddCustJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCustJPanel
     */
    private JPanel userProcessContainer;
    private CustDir customerDirectory;

    public AddCustJPanel(JPanel userProcessContainer, CustDir customerDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.customerDirectory = customerDirectory;
        MyStrngVerifClass myStringVerifier= new MyStrngVerifClass();
        jTextFAddress.setInputVerifier(myStringVerifier);
        custNameJTxtField.setInputVerifier(myStringVerifier);
        MyPhnNumbVerifClass myPhoneNumberVerifier= new MyPhnNumbVerifClass();
        phnNumbJTextField.setInputVerifier(myPhoneNumberVerifier);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattetText = new javax.swing.JFormattedTextField();
        custNameJTxtField = new javax.swing.JTextField();
        jL10 = new javax.swing.JLabel();
        jL2 = new javax.swing.JLabel();
        phnNumbJTextField = new javax.swing.JTextField();
        jL1 = new javax.swing.JLabel();
        jL3 = new javax.swing.JLabel();
        jBtnBck = new javax.swing.JButton();
        jBtnAddCust = new javax.swing.JButton();
        jL4 = new javax.swing.JLabel();
        jTextFAddress = new javax.swing.JTextField();
        custIDJTextField = new javax.swing.JTextField();

        jFormattetText.setText("jFormattedTextField1");

        setBackground(new java.awt.Color(204, 255, 204));

        custNameJTxtField.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        custNameJTxtField.setForeground(new java.awt.Color(204, 204, 255));

        jL10.setBackground(new java.awt.Color(102, 102, 102));
        jL10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jL10.setForeground(new java.awt.Color(51, 51, 51));
        jL10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL10.setText("Phone");

        jL2.setBackground(new java.awt.Color(102, 102, 102));
        jL2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jL2.setForeground(new java.awt.Color(51, 51, 51));
        jL2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL2.setText("Name");

        phnNumbJTextField.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        phnNumbJTextField.setForeground(new java.awt.Color(204, 204, 255));

        jL1.setBackground(new java.awt.Color(102, 102, 102));
        jL1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jL1.setForeground(new java.awt.Color(51, 51, 51));
        jL1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL1.setText("Customer ID");

        jL3.setBackground(new java.awt.Color(102, 102, 102));
        jL3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jL3.setForeground(new java.awt.Color(51, 51, 51));
        jL3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL3.setText("Address");

        jBtnBck.setBackground(new java.awt.Color(255, 204, 204));
        jBtnBck.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jBtnBck.setText("<<Back");
        jBtnBck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBckActionPerformed(evt);
            }
        });

        jBtnAddCust.setBackground(new java.awt.Color(255, 204, 204));
        jBtnAddCust.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jBtnAddCust.setText("Add Customer");
        jBtnAddCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddCustActionPerformed(evt);
            }
        });

        jL4.setFont(new java.awt.Font("Telugu MN", 3, 24)); // NOI18N
        jL4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL4.setText("Add Customer");

        jTextFAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jTextFAddress.setForeground(new java.awt.Color(204, 204, 255));

        custIDJTextField.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        custIDJTextField.setForeground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnBck, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jL10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jL1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFAddress)
                    .addComponent(phnNumbJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAddCust, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(custIDJTextField)
                    .addComponent(custNameJTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jL4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {custIDJTextField, custNameJTxtField, jTextFAddress, phnNumbJTextField});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnAddCust, jBtnBck});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jL4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL1)
                    .addComponent(custIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL2)
                    .addComponent(custNameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL3)
                    .addComponent(jTextFAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL10)
                    .addComponent(phnNumbJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAddCust)
                    .addComponent(jBtnBck))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {custIDJTextField, custNameJTxtField, jTextFAddress, phnNumbJTextField});

    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAddCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddCustActionPerformed
       CustomerClass customer = customerDirectory.addCustData();
String custName = custNameJTxtField.getText().trim();
String address = jTextFAddress.getText().trim();
String phoneNumber = phnNumbJTextField.getText().trim();

if (custName.length() == 0 || address.length() == 0 || phoneNumber.length() == 0) {
    JOptionPane.showMessageDialog(this, "Please enter all the values.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

customer.setCustName(custName);
customer.setAddr(address);
customer.setPhnNumb(phoneNumber);

JOptionPane.showMessageDialog(this, "Customer Created successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
userProcessContainer.remove(this);
CardLayout layout = (CardLayout) userProcessContainer.getLayout();
layout.previous(userProcessContainer);

    }//GEN-LAST:event_jBtnAddCustActionPerformed


    private void jBtnBckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBckActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jBtnBckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField custIDJTextField;
    private javax.swing.JTextField custNameJTxtField;
    private javax.swing.JButton jBtnAddCust;
    private javax.swing.JButton jBtnBck;
    private javax.swing.JFormattedTextField jFormattetText;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jL10;
    private javax.swing.JLabel jL2;
    private javax.swing.JLabel jL3;
    private javax.swing.JLabel jL4;
    private javax.swing.JTextField jTextFAddress;
    private javax.swing.JTextField phnNumbJTextField;
    // End of variables declaration//GEN-END:variables
}
