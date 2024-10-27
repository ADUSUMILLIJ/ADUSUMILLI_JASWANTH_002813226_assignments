
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import Model.Doctor;
import Model.Driver;
import Model.InsuranceCoverage;
import Model.Person;
import Model.VehicleRegistration;
import Model.patient;

/**
 *
 * @author Jaswanth
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */

    Person person;
    Doctor doctor;
    InsuranceCoverage Insurancecoverage;
    patient Patient;
    Driver driver;
    VehicleRegistration vehicle;
   
   
    public MainJFrame() {
        initComponents();
        person=new Person();
        doctor=new Doctor();
        Insurancecoverage=new InsuranceCoverage();
        Patient=new patient();
        driver=new Driver();
        vehicle=new VehicleRegistration();
//        reportText = generateReportText(person,doctor,Insurancecoverage,driver,vehicle,Patient);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        WorkArea = new javax.swing.JPanel();
        ControlPanel = new javax.swing.JPanel();
        btnView = new javax.swing.JButton();
        btnDriver = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnPerson = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setBackground(new java.awt.Color(255, 255, 255));

        WorkArea.setBackground(new java.awt.Color(255, 255, 255));
        WorkArea.setPreferredSize(new java.awt.Dimension(900, 520));

        javax.swing.GroupLayout WorkAreaLayout = new javax.swing.GroupLayout(WorkArea);
        WorkArea.setLayout(WorkAreaLayout);
        WorkAreaLayout.setHorizontalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        WorkAreaLayout.setVerticalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(WorkArea);

        ControlPanel.setBackground(new java.awt.Color(255, 255, 255));

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDriver.setText("Driver");
        btnDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriverActionPerformed(evt);
            }
        });

        jButton2.setText("Vehicle Registration");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Patient");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        jButton5.setText("Insurance Coverage");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnPerson.setText("Person");
        btnPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPerson, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDriver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoctor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnPerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDriver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(ControlPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonActionPerformed
        // TODO add your handling code here:
        PersonJPanel personPanel=new PersonJPanel(person);
        SplitPane.setRightComponent(personPanel);
    }//GEN-LAST:event_btnPersonActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewPanel=new ViewJPanel( person, doctor, Insurancecoverage, driver,
                      vehicle,Patient);
        SplitPane.setRightComponent(viewPanel);
        System.out.println(viewPanel.reportText);
    }//GEN-LAST:event_btnViewActionPerformed
    
    private void btnDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriverActionPerformed
        // TODO add your handling code here:
        DriverJPanel driverFrame=new DriverJPanel(driver);
         SplitPane.setRightComponent(driverFrame);
        
    }//GEN-LAST:event_btnDriverActionPerformed
 
    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
       // TODO add your handling code here:
        DoctorJPanel doctorPanel=new DoctorJPanel(doctor);
         SplitPane.setRightComponent(doctorPanel);
    }//GEN-LAST:event_btnDoctorActionPerformed
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         VehicleRegistrationJPanel VehicleRegistrationPanel=new VehicleRegistrationJPanel(vehicle);
         SplitPane.setRightComponent(VehicleRegistrationPanel);
    }//GEN-LAST:event_jButton2ActionPerformed
  
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        PatientJP  PatientPanel=new PatientJP(Patient);
         SplitPane.setRightComponent(PatientPanel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        InsuranceCoverageJPanel  InsuranceCoveragePanel=new InsuranceCoverageJPanel(Insurancecoverage);
         SplitPane.setRightComponent(InsuranceCoveragePanel);
    }//GEN-LAST:event_jButton5ActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnDriver;
    private javax.swing.JButton btnPerson;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
