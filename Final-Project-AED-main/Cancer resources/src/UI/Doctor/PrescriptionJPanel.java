/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Doctor;

import Model.Account;
import Model.DoctorPrescription;
import Model.EnterPrise;
import Model.Organization.Organization;
import Model.Organization.DoctorOrganization;
import Model.Organization.PharmacyOrganization;
import Model.PrescriptionRepo;
import Model.WorkQueue.Doctor_WorkRequest;
import Model.WorkQueue.Pharmacy_WorkRequest;
import Model.WorkQueue.Work_Request;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaswa
 */
public class PrescriptionJPanel extends javax.swing.JPanel {
private PrescriptionRepo prescribedlist;
private DoctorOrganization doctororg;
private EnterPrise enter;
private JPanel uppercontainer;
private DoctorPrescription docpres;
private Doctor_WorkRequest docreq;
private Account ua;



    /**
     * Creates new form PrescriptionJPanel
     */
    public PrescriptionJPanel(
JPanel upperContainer, PrescriptionRepo prescribedList, Account ua
, EnterPrise enter, DoctorOrganization doctororg) {



        initComponents();
this.uppercontainer = upperContainer;
this.ua = ua;
this.enter = enter;
this.doctororg = doctororg;


populateWorkReqTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jdiagtextfield1 = new javax.swing.JTextField();
        buttonback = new javax.swing.JButton();
        labelmedication1 = new javax.swing.JLabel();
        labelheader1 = new javax.swing.JLabel();
        medCmbBox = new javax.swing.JComboBox<>();
        labelname1 = new javax.swing.JLabel();
        timesLabel1 = new javax.swing.JLabel();
        textfieldname = new javax.swing.JTextField();
        timescmbspin = new javax.swing.JSpinner();
        labelage1 = new javax.swing.JLabel();
        forlabel = new javax.swing.JLabel();
        textfieldage = new javax.swing.JTextField();
        forSpincmb = new javax.swing.JSpinner();
        labelsex1 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        sexcmbbutton = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        diagnosisLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));
        setForeground(new java.awt.Color(153, 255, 255));
        setPreferredSize(new java.awt.Dimension(1060, 900));

        jdiagtextfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdiagtextfield1ActionPerformed(evt);
            }
        });
        jScrollPane2.setViewportView(jdiagtextfield1);

        buttonback.setBackground(new java.awt.Color(204, 204, 204));
        buttonback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonback.setText("<<BACK");
        buttonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbackActionPerformed(evt);
            }
        });

        labelmedication1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelmedication1.setForeground(new java.awt.Color(153, 255, 255));
        labelmedication1.setText("Medication:");

        labelheader1.setBackground(new java.awt.Color(153, 255, 255));
        labelheader1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelheader1.setForeground(new java.awt.Color(153, 255, 255));
        labelheader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelheader1.setText("Doctor Prescription");

        medCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please selcet--", "Paracetomol", "Crocin", "Synthroid", "Crestor", "Ventolin", "Esomeprazole", "Insulin", "Infliximab", "Fluticasone", "Rusovastatin", "Januvia(diabetes)", "Lantus(diabetes)", "Abilify(psychosis, depression)", "Symbicort(asthma)", "Tamiflu(influenza)", "Cialis(erectile dysrunction)", "Viagra(erectile dysrunction)", "Suboxone(opiate addiction)", " " }));

        labelname1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelname1.setForeground(new java.awt.Color(153, 255, 255));
        labelname1.setText("Name:");

        timesLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timesLabel1.setForeground(new java.awt.Color(153, 255, 255));
        timesLabel1.setText("Times a Day:");

        labelage1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelage1.setForeground(new java.awt.Color(153, 255, 255));
        labelage1.setText("Age:");

        forlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        forlabel.setForeground(new java.awt.Color(153, 255, 255));
        forlabel.setText("For:");

        labelsex1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelsex1.setForeground(new java.awt.Color(153, 255, 255));
        labelsex1.setText("Sex:");

        saveButton.setBackground(new java.awt.Color(204, 204, 204));
        saveButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/prescription_cancer.png"))); // NOI18N
        saveButton.setText("SAVE PRESCRIPTION");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        sexcmbbutton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please selcet--", "Male", "Female" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medical Name", "Toatal Quantity", "Reciever"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        diagnosisLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        diagnosisLabel1.setForeground(new java.awt.Color(153, 255, 255));
        diagnosisLabel1.setText("Diagnosis:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(labelmedication1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(timesLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timescmbspin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(forlabel)
                        .addGap(18, 18, 18)
                        .addComponent(forSpincmb, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(medCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelheader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diagnosisLabel1)
                                    .addComponent(labelsex1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sexcmbbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelname1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textfieldname, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelage1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(textfieldage, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(394, 394, 394))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonback)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveButton))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(labelheader1)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelname1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelage1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelsex1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexcmbbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diagnosisLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelmedication1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timesLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timescmbspin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forSpincmb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonback))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(777, 777, 777))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jdiagtextfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdiagtextfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdiagtextfield1ActionPerformed

    private void buttonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbackActionPerformed
        uppercontainer.remove(this);
        CardLayout crd = (CardLayout) uppercontainer.getLayout();
        crd.previous(uppercontainer);        // TODO add your handling code here:
    }//GEN-LAST:event_buttonbackActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
         try {
        DoctorPrescription p = new DoctorPrescription();

        p.setDiagnosis(jdiagtextfield1.getText());

        p.setDrug(medCmbBox.getSelectedItem().toString());

        p.setTotal_days((Integer) timescmbspin.getValue());

        p.setFrequency_day((Integer) forSpincmb.getValue());
        p.setName_Netw(enter.getOrgName());

        String age = textfieldage.getText();

        // Check if age is a valid integer
        try {
            Integer.parseInt(age);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Age should be an integer!");
        }

        // Check if diagnosis is empty
        if (p.getDiagnosis().isEmpty()) {
            throw new IllegalArgumentException("Diagnosis cannot be empty!");
        } else if (textfieldname.getText().isEmpty()) {
            throw new IllegalArgumentException("Patient name cannot be empty!");
        }

        // If all checks passed, add the prescription
        doctororg.addPrescription(p);

        // Create a Pharmacy_WorkRequest
        Pharmacy_WorkRequest request = new Pharmacy_WorkRequest();
        request.setMedicationName(medCmbBox.getSelectedItem().toString());
        request.setQuantity(((Integer) timescmbspin.getValue()) * ((Integer) forSpincmb.getValue()));
        request.setSender(ua);
        request.setStatus("Sent");

        JOptionPane.showMessageDialog(null, "Prescription added successfully");

        // Find the PharmacyOrganization and add the request
        Organization org = null;
        for (Organization organization : enter.getOrgaDirectory().getOrganizations()) {
            if (organization instanceof PharmacyOrganization) {
                org = organization;
                break;
            }
        }

        if (org != null) {
            org.getWQ().getWorkRequestList().add(request);
            ua.getWorkQ().getWorkRequestList().add(request);
        }

        populateWorkReqTable();
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "An unexpected error occurred.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // Print the stack trace for debugging purposes
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonback;
    private javax.swing.JLabel diagnosisLabel1;
    private javax.swing.JSpinner forSpincmb;
    private javax.swing.JLabel forlabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jdiagtextfield1;
    private javax.swing.JLabel labelage1;
    private javax.swing.JLabel labelheader1;
    private javax.swing.JLabel labelmedication1;
    private javax.swing.JLabel labelname1;
    private javax.swing.JLabel labelsex1;
    private javax.swing.JComboBox<String> medCmbBox;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> sexcmbbutton;
    private javax.swing.JTextField textfieldage;
    private javax.swing.JTextField textfieldname;
    private javax.swing.JLabel timesLabel1;
    private javax.swing.JSpinner timescmbspin;
    // End of variables declaration//GEN-END:variables

 private void populateWorkReqTable() {
    // Get the table model
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    // Clear the existing rows in the table
    model.setRowCount(0);

    // Loop through the work requests
    for (Work_Request request : ua.getWorkQ().getWorkRequestList()) {
        // Check if the request is of type Pharmacy_WorkRequest
        if (request instanceof Pharmacy_WorkRequest) {
            Pharmacy_WorkRequest pharmacyRequest = (Pharmacy_WorkRequest) request;
            
            // Create an array to hold the row data
            Object[] row = new Object[4];
            
            // Get medication name from the Pharmacy_WorkRequest
            String medication = pharmacyRequest.getMedicationName();
            row[0] = medication;
            
            // Get quantity from the Pharmacy_WorkRequest
            int quantity = pharmacyRequest.getQuantity();
            row[1] = quantity;
            
            // Get receiver from the Pharmacy_WorkRequest
          String receiver = pharmacyRequest.getReceiverUsername() != null ? pharmacyRequest.getReceiverUsername() : "BOSTON HOSPITAL";
            row[2] = receiver;
            
            // Get the status of the request
            String result = request.getStatus() != null ? request.getStatus() : "Waiting";
            row[3] = result;

            // Add the row to the table model
            model.addRow(row);
        }
    }
}

}
