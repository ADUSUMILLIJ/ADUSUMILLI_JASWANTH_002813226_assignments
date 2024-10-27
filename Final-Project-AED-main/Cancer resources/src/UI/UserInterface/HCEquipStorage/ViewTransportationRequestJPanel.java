/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.UserInterface.HCEquipStorage;

import Model.Account;
import Model.DB4OUtil.DB4OUtil;
import Model.WorkQueue.Transportation_WorkRequest;
import Model.WorkQueue.Work_Request;
import com.db4o.ObjectContainer;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author goutam
 */
public class ViewTransportationRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewTransportationRequestJPanel
     */
JPanel upperContainer;
Transportation_WorkRequest request;
private Account acc;
    public ViewTransportationRequestJPanel(JPanel upperContainer,Account acc ) {
        initComponents();
        this.upperContainer = upperContainer;
        this.request = request;
        this.acc = acc;
      populateTable();
       
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelScroll1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Backbutton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        MainLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SENDER", "RECIEVER", "HOSPITAL NAME", "STATUS"
            }
        ));
        jPanelScroll1.setViewportView(jTable1);

        Backbutton.setBackground(new java.awt.Color(204, 204, 204));
        Backbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Backbutton.setText("<<BACK");
        Backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbuttonActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        MainLabel1.setBackground(new java.awt.Color(0, 51, 153));
        MainLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MainLabel1.setForeground(new java.awt.Color(153, 255, 255));
        MainLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/transport_cancer.png"))); // NOI18N
        MainLabel1.setText("VIEW TRANSPORTATION WORK REQUEST STATUS");

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Remove");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(MainLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(351, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(MainLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanelScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbuttonActionPerformed
        upperContainer.remove(this);
        CardLayout layout = (CardLayout) upperContainer.getLayout();
        layout.previous(upperContainer);          // TODO add your handling code here:
    }//GEN-LAST:event_BackbuttonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        populateTable(); 
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         int[] selectedRows = jTable1.getSelectedRows();

    if (selectedRows.length == 0) {
        // No rows selected, show a message or handle it accordingly
        return;
    }

    // Iterate through selected rows in reverse order to avoid index issues
    for (int i = selectedRows.length - 1; i >= 0; i--) {
        int selectedRow = selectedRows[i];

        // Get the corresponding Work_Request object
        Work_Request request = acc.getWorkQ().getWorkRequestList().get(selectedRow);

        // Remove the row from the table
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.removeRow(selectedRow);

        // Delete the Work_Request object from the list
        acc.getWorkQ().getWorkRequestList().remove(request);

        // Delete the Work_Request object from db4o
        deleteWorkRequestFromDB4O(request);
    }
    }                                        
private void deleteWorkRequestFromDB4O(Work_Request request) {
    // Get the instance of DB4OUtil
    DB4OUtil db4OUtil = DB4OUtil.getInstance();

    // Open a connection to db4o
    ObjectContainer conn = db4OUtil.createConnection();

    // Delete the Work_Request object from db4o
    conn.delete(request);

    // Commit the transaction and close the connection
    conn.commit();
    //db4OUtil.shutdown(conn);

    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbutton;
    private javax.swing.JLabel MainLabel1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jPanelScroll1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
   // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
 
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    Object[] row = new Object[4];

    for (Work_Request request : acc.getWorkQ().getWorkRequestList()) {
        row[0] = request.getSender().getUsernm();
        if (request.getReceiver() != null) {
        row[1] = request.getReceiver().getUsernm();
    } else {
        row[1] ="zooda"; // You can provide an appropriate message
    }
        
        if (request instanceof Transportation_WorkRequest) {
            row[2] = ((Transportation_WorkRequest) request).getHospitalName();
            
            // Check if getMessage() is null
            if (((Transportation_WorkRequest) request).getMessage() == null) {
                row[3] = "Awaiting an update"; // Handle the case when it's null
            } else {
                String result = "Delivery Time: " + ((Transportation_WorkRequest) request).getMessage();
                row[3] = result;
                // ... (more code)
            }
        } else {
            // Handle the case when request is not an instance of Transportation_WorkRequest
            row[2] = "";
            row[3] = "";
        }
        
        // Add the row to the table model
        model.addRow(row);
    }
}
}
