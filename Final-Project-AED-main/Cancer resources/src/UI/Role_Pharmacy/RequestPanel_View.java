/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Role_Pharmacy;

import Model.Account;
import Model.EcoSystem;
import Model.EnterPrise;
import Model.Organization.Organization;
import Model.WorkQueue.Supplier_WorkRequest;
import Model.WorkQueue.Work_Request;
import Model.WorkQueue.Operations_WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VAMSI VAS
 */
public class RequestPanel_View extends javax.swing.JPanel {
    
    private EnterPrise enterprise;
    private JPanel panel;
    private EcoSystem eco;
    private Account acc;
    private Organization organization;
    private Operations_WorkRequest operationWorkRequest;

    /**
     * Creates new form RequestPanel_View
     */
    public RequestPanel_View(JPanel panel, Account acc, EnterPrise enterprise, Organization orgz) {
        initComponents();
        this.organization= orgz;
        this.panel=panel;
        this.acc=acc;
        this.enterprise=enterprise;
        fillRows();
    }
    
    public void fillRows() {
        DefaultTableModel o = (DefaultTableModel) tblReq.getModel();
        o.setRowCount(0);
        o.setRowCount(0);
        for (Work_Request wr : acc.getWorkQ().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = ((Supplier_WorkRequest) wr).getMedicationName();
            row[1] = ((Supplier_WorkRequest) wr).getQuantity();
            row[2] = wr.getReceiver().getUsernm();
            String s = ((Supplier_WorkRequest) wr).getStatus();
            row[3] = s == null ? "Waiting" : s;
            if (((Supplier_WorkRequest) wr).getDeliveryTime() == null) {
                row[4] = "Details yet to be updated by supplier";
            } else {
                row[4] = "Expected delivery time " + ((Supplier_WorkRequest) wr).getDeliveryTime();
            }
            o.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new javax.swing.JScrollPane();
        tblReq = new javax.swing.JTable();
        labelHeader = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));

        tblReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "URGENCY LEVEL", "RECIEVER", "STATUS", "DELIVERY DATE"
            }
        ));
        scrollPane1.setViewportView(tblReq);

        labelHeader.setBackground(new java.awt.Color(153, 255, 255));
        labelHeader.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelHeader.setForeground(new java.awt.Color(153, 255, 255));
        labelHeader.setText("VIEW REQUESTS");

        buttonBack.setBackground(new java.awt.Color(204, 204, 204));
        buttonBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonBack.setText("<<BACK");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        buttonRefresh.setBackground(new java.awt.Color(204, 204, 204));
        buttonRefresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonRefresh.setText("REFRESH");
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(labelHeader))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(579, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(308, 308, 308))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(labelHeader)
                .addGap(12, 12, 12)
                .addComponent(buttonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(buttonBack)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        panel.remove(this);
        Component[] ca = panel.getComponents();
        Component c = ca[ca.length - 1];
        WorkAreaPanel_Pharmacy wap = (WorkAreaPanel_Pharmacy) c;
        wap.arrangeRows();
        CardLayout cd = (CardLayout) panel.getLayout();
        cd.previous(panel);        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JTable tblReq;
    // End of variables declaration//GEN-END:variables
}