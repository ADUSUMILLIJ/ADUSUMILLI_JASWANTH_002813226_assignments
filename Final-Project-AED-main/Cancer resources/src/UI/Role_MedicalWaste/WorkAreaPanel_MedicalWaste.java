/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Role_MedicalWaste;

import Model.Account;
import Model.EcoSystem;
import Model.MedicalWastage;
import Model.Organization.Organization;
import Model.Organization.MedicalWastageOrganization;
//import java.awt.Panel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VAMSI VAS
 */
public class WorkAreaPanel_MedicalWaste extends javax.swing.JPanel {
    
    private MedicalWastageOrganization mw;
    private JPanel panel;
    private Account acc;
    private EcoSystem eco;
    ArrayList<MedicalWastage> list = new ArrayList<>();

    /**
     * Creates new form WorkAreaPanel_MedicalWaste
     */
    public WorkAreaPanel_MedicalWaste(JPanel panel, EcoSystem eco, Account acc, Organization o) {
        initComponents();
        this.panel = panel;
        this.acc = acc;
        this.eco = eco;
        this.mw = (MedicalWastageOrganization)o ;
        popdData();
    }
    
    public void popdData() {
        MedicalWastage mw1 = new MedicalWastage();
        mw1.setName("Radioactive Waste");
        mw1.setDays(10);
        mw1.setWeight(20);
        
        MedicalWastage mw2 = new MedicalWastage();
        mw1.setName("Plastic Waste");
        mw1.setDays(20);
        mw1.setWeight(30);
        
        MedicalWastage mw3 = new MedicalWastage();
        mw1.setName("Dry Waste");
        mw1.setDays(15);
        mw1.setWeight(10);
        
        MedicalWastage mw4 = new MedicalWastage();
        mw1.setName("Wet Waste");
        mw1.setDays(2);
        mw1.setWeight(8);

        list.add(mw4);
        list.add(mw3);
        list.add(mw2);
        list.add(mw1);
        
        DefaultTableModel model = (DefaultTableModel) tablemw.getModel();
        model.setRowCount(0);
        
        for (MedicalWastage m : list) {
            Object[] row = new Object[3];
            row[0] = m;
            row[1] = m.getWeight();
            row[2] = m.getDays();
            model.addRow(row);
        }
        
    }
    
    public void fillRows() {
        DefaultTableModel model = (DefaultTableModel) tablemw.getModel();
        model.setRowCount(0);
        
        for (MedicalWastage m : list) {
            Object[] row = new Object[3];
            row[0] = m;
            row[1] = m.getWeight();
            row[2] = m.getDays();
            model.addRow(row);
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

        labelMW = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablemw = new javax.swing.JTable();
        buttonrecycle = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));

        labelMW.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelMW.setForeground(new java.awt.Color(153, 255, 255));
        labelMW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMW.setText("Manage Medical Waste");

        tablemw.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Weight", "Days since cleared"
            }
        ));
        jScrollPane1.setViewportView(tablemw);

        buttonrecycle.setBackground(new java.awt.Color(204, 204, 204));
        buttonrecycle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonrecycle.setText("Recycle");
        buttonrecycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonrecycleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 99, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonrecycle, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(labelMW)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(buttonrecycle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonrecycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonrecycleActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tablemw.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tablemw.getModel();
        MedicalWastage selectedMW = (MedicalWastage) model.getValueAt(selectedRowIndex, 0);

        list.remove(selectedMW);

        JOptionPane.showMessageDialog(this, "Recycled");

        fillRows();
    }//GEN-LAST:event_buttonrecycleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonrecycle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMW;
    private javax.swing.JTable tablemw;
    // End of variables declaration//GEN-END:variables
}
