/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminstrativeRole;

import Business.SalesPersonClass;
import Business.SalesPersonDirClass;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VAMSI VAS
 */
public class MSPJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomersJPanel
     */
    private JPanel userProcessContainer;
    private SalesPersonDirClass salesPersonDirectory;

    public MSPJPanel(JPanel userProcessContainer, SalesPersonDirClass salesPersonDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.salesPersonDirectory=salesPersonDirectory;
        populateSalesPersonTable();
    }
    
    private void populateSalesPersonTable()
    {
        DefaultTableModel dtm= (DefaultTableModel) SPJTable.getModel();
        dtm.setRowCount(0);
        
        for(SalesPersonClass salesPerson:salesPersonDirectory.getSalesPrsnDir())
        {
            Object row[]= new Object[4];
            row[0]=salesPerson;
            row[1]=salesPerson.getSalesPersId();
            row[2]= salesPerson.getFloorComm();
            row[3]= salesPerson.getCeilComm();
            dtm.addRow(row);
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

        aSPJButton = new javax.swing.JButton();
        vSPJButton = new javax.swing.JButton();
        refreshJBtn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        JSP2 = new javax.swing.JScrollPane();
        SPJTable = new javax.swing.JTable();
        JL1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        aSPJButton.setBackground(new java.awt.Color(255, 204, 204));
        aSPJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        aSPJButton.setText("Add Sales Person");
        aSPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aSPJButtonActionPerformed(evt);
            }
        });

        vSPJButton.setBackground(new java.awt.Color(255, 204, 204));
        vSPJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        vSPJButton.setText("View Sales Person");
        vSPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vSPJButtonActionPerformed(evt);
            }
        });

        refreshJBtn.setBackground(new java.awt.Color(255, 204, 204));
        refreshJBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        refreshJBtn.setText("Refresh");
        refreshJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJBtnActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(255, 204, 204));
        backJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        SPJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Floor Commission", "Ceiling Commission"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JSP2.setViewportView(SPJTable);

        JL1.setFont(new java.awt.Font("Telugu MN", 3, 24)); // NOI18N
        JL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL1.setText("Manage Customers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JSP2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(refreshJBtn)
                            .addGap(67, 67, 67)
                            .addComponent(JL1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(backJButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aSPJButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(556, 556, 556)
                        .addComponent(vSPJButton)))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(refreshJBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JL1)
                        .addGap(25, 25, 25)))
                .addComponent(JSP2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vSPJButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(aSPJButton)
                        .addGap(91, 91, 91))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aSPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aSPJButtonActionPerformed
        // TODO add your handling code here:
        AddSalesPersonJPanel acjp= new AddSalesPersonJPanel(userProcessContainer,salesPersonDirectory);
        userProcessContainer.add("AddSalesPersonJPanel", acjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_aSPJButtonActionPerformed

    private void refreshJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJBtnActionPerformed
        // TODO add your handling code here:
       populateSalesPersonTable();               
    }//GEN-LAST:event_refreshJBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void vSPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vSPJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = SPJTable.getSelectedRow();
if (selectedRow < 0) {
    JOptionPane.showMessageDialog(this, "Please select a SalesPerson.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

SalesPersonClass salesPerson = (SalesPersonClass) SPJTable.getValueAt(selectedRow, 0);
CardLayout layout = (CardLayout) userProcessContainer.getLayout();
VSPDJPanel vspjp = new VSPDJPanel(userProcessContainer, salesPerson);

userProcessContainer.add("ViewSalesPersonDetailsJPanel", vspjp);
layout.next(userProcessContainer);


    }//GEN-LAST:event_vSPJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL1;
    private javax.swing.JScrollPane JSP2;
    private javax.swing.JTable SPJTable;
    private javax.swing.JButton aSPJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton refreshJBtn;
    private javax.swing.JButton vSPJButton;
    // End of variables declaration//GEN-END:variables
}