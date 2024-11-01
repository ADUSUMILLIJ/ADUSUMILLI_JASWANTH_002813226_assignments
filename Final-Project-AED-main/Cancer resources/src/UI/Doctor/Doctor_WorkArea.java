/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Doctor;

import Model.Account;
import Model.Doctor;
import Model.EcoSystem;
import Model.EnterPrise;
import Model.Network;
import Model.Organization.DoctorOrganization;
import Model.PrescriptionRepo;
import Model.WorkQueue.Doctor_WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author jaswa
 */
public class Doctor_WorkArea extends javax.swing.JPanel {



private JPanel userContainer;
private DoctorOrganization org_doc;
private Account ua;
private EnterPrise enter;
private Doctor doctor;
private PrescriptionRepo p_repo;
private Doctor_WorkRequest dwr ;
private Network network;
private EcoSystem ecosystem;




    /**
     * Creates new form Doctor_WorkArea
     * @param 
     */
    public Doctor_WorkArea(JPanel userContainer,
Account ua,
DoctorOrganization org_doc,
 EnterPrise enter,
EcoSystem ecosystem,
Network network
) {
        initComponents();
this.userContainer = userContainer;
this.ua = ua ;
this.network = network;
this.org_doc = org_doc;
this.enter = enter;
this.ecosystem = ecosystem;
network();




    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlogo1 = new javax.swing.JLabel();
        pressbutton = new javax.swing.JButton();
        manage_equip_button = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jlogo1.setBackground(new java.awt.Color(0, 204, 204));
        jlogo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlogo1.setForeground(new java.awt.Color(153, 255, 255));
        jlogo1.setText("DOCTOR WORK SPACE ");

        pressbutton.setBackground(new java.awt.Color(204, 204, 204));
        pressbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pressbutton.setText("Precribe Medicine");
        pressbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressbuttonActionPerformed(evt);
            }
        });

        manage_equip_button.setBackground(new java.awt.Color(204, 204, 204));
        manage_equip_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        manage_equip_button.setText("Manage Equipment");
        manage_equip_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_equip_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(pressbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(manage_equip_button, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jlogo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlogo1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manage_equip_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pressbutton))
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manage_equip_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_equip_buttonActionPerformed
        // TODO add your handling code here:
CardLayout abs = (CardLayout)userContainer.getLayout();
userContainer.add("PrescriptionJPanel", new UI.Doctor.HealthCareEquipmentManagementJpanel(userContainer, ua,org_doc,enter,ecosystem,network));
abs.next(userContainer);
    }//GEN-LAST:event_manage_equip_buttonActionPerformed

    private void pressbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pressbuttonActionPerformed
        // TODO add your handling code here:
CardLayout abs = (CardLayout)userContainer.getLayout();
userContainer.add("PrescriptionJPanel", new UI.Doctor.PrescriptionJPanel(userContainer,p_repo,ua,enter,org_doc));
abs.next(userContainer);
    }//GEN-LAST:event_pressbuttonActionPerformed

private void network(){
network.getNetwork_name();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlogo1;
    private javax.swing.JButton manage_equip_button;
    private javax.swing.JButton pressbutton;
    // End of variables declaration//GEN-END:variables
}
