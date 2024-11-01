/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Professor;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Professor.Professor;
import model.Student.Student;
import model.Course.Course;
import model.Course.CourseDirectory;
import model.Professor.ProfessorDirectory;
import ui.CourseJPanel.CourseSchedule;

/**
 *
 * @author sushanthkumarreddyjanga
 */
public class ProfViewJPanel extends javax.swing.JPanel {
    JPanel work;
    ProfessorDirectory professorList;
    Professor professor;
    Course course;
    CourseDirectory courseList;
    

    /**
     * Creates new form ProfViewJPanel
     */

    

    public ProfViewJPanel(JPanel work, String userId, ProfessorDirectory professorList, Professor professor, Course course, CourseDirectory courseList) {
        initComponents();
        this.professorList=professorList;
        this.work=work;
        this.professor=professorList.searchProfessor(userId);
        this.course=course;
        this.courseList=courseList;
        
        showDetails(userId);
        
    }

    

    
    public void showDetails(String userId){
        
        if(professor == null){
            JOptionPane.showMessageDialog(null, "Account does not exit","Information", JOptionPane.WARNING_MESSAGE);
        }
        else{
            txtNameP.setText(professor.getName());
            txtEID.setText(professor.getId());
            txtEmailP.setText(professor.getEmail());
            txtSpeciality.setText(professor.getSpecialty());
            txtUNameP.setText(professor.getuName());
            txtPassP.setText(professor.getPassword());
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

        jLabel2 = new javax.swing.JLabel();
        txtNameP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmailP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSpeciality = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUNameP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassP = new javax.swing.JPasswordField();
        btnBackPV = new javax.swing.JButton();
        btnSavePV = new javax.swing.JButton();
        btnUpdatePV = new javax.swing.JButton();
        btnAddCourse = new javax.swing.JButton();
        btnCourse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Name:");

        txtNameP.setEditable(false);

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Employee ID");

        txtEID.setEditable(false);

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Email:");

        txtEmailP.setEditable(false);

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Speciality:");

        txtSpeciality.setEditable(false);

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("UserName:");

        txtUNameP.setEditable(false);

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Password:");

        txtPassP.setEditable(false);

        btnBackPV.setText("Back");
        btnBackPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackPVActionPerformed(evt);
            }
        });

        btnSavePV.setText("Save");
        btnSavePV.setEnabled(false);
        btnSavePV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePVActionPerformed(evt);
            }
        });

        btnUpdatePV.setText("Update");
        btnUpdatePV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePVActionPerformed(evt);
            }
        });

        btnAddCourse.setText("Add Course");
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });

        btnCourse.setText("Courses");
        btnCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Professor Panel");

        jLabel4.setText("Latest Employer Feedback");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBackPV)
                        .addGap(311, 874, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNameP, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtEmailP)
                                            .addComponent(txtEID)
                                            .addComponent(txtSpeciality))
                                        .addGap(183, 183, 183)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAddCourse)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(38, 38, 38)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(75, 75, 75))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSavePV)
                                        .addGap(64, 64, 64)
                                        .addComponent(btnUpdatePV)
                                        .addGap(0, 1, Short.MAX_VALUE))
                                    .addComponent(txtUNameP)
                                    .addComponent(txtPassP))
                                .addGap(637, 637, 637))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddCourse, btnCourse});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(btnBackPV)
                .addGap(1, 1, 1)
                .addComponent(btnAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNameP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCourse)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmailP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUNameP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSavePV)
                    .addComponent(btnUpdatePV))
                .addGap(72, 72, 72))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddCourse, btnCourse});

    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdatePVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePVActionPerformed
        // TODO add your handling code here:
        btnSavePV.setEnabled(true);
        txtNameP.setEditable(true);
        txtEID.setEditable(true);
        txtEmailP.setEditable(true);
        txtSpeciality.setEditable(true);
        txtUNameP.setEditable(true);
        txtPassP.setEditable(true);
        
        btnUpdatePV.setEnabled(false);
    }//GEN-LAST:event_btnUpdatePVActionPerformed

    private void btnSavePVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePVActionPerformed
        // TODO add your handling code here:
        String id = txtEID.getText();
        String name = txtNameP.getText();
        String email = txtEmailP.getText();
        String speciality = txtSpeciality.getText();
        String uName= txtUNameP.getText();
        String pwd = txtPassP.getText();
        
        Professor professor = new Professor(id, name, email,uName,pwd, speciality);
        professorList.addProfessor(professor);
        
        JOptionPane.showMessageDialog(this,"Registration Sucessfull");
        
        btnUpdatePV.setEnabled(true);
        btnSavePV.setEnabled(false);
        txtNameP.setEditable(false);
        txtEID.setEditable(false);
        txtEmailP.setEditable(false);
        txtSpeciality.setEditable(false);
        txtUNameP.setEditable(false);
        txtPassP.setEditable(false);
        
    }//GEN-LAST:event_btnSavePVActionPerformed

    private void btnBackPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackPVActionPerformed
        // TODO add your handling code here:
        work.remove(this);
        CardLayout layout = (CardLayout) work.getLayout();
        layout.previous(work);
    }//GEN-LAST:event_btnBackPVActionPerformed

    private void btnCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseActionPerformed
        // TODO add your handling code here:
        ProfessorCoursesJPanel pc = new ProfessorCoursesJPanel(work, course, courseList, professorList,professor);
        work.add("ProfessorCourses", pc);
        CardLayout layout = (CardLayout) work.getLayout();
        layout.next(work);
        
        
    }//GEN-LAST:event_btnCourseActionPerformed

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        // TODO add your handling code here:
        CourseSchedule cs = new CourseSchedule(work, course, courseList, professorList,professor);
        work.add("CourseSchdule", cs);
        CardLayout layout = (CardLayout) work.getLayout();
        layout.next(work);
        
        
    }//GEN-LAST:event_btnAddCourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnBackPV;
    private javax.swing.JButton btnCourse;
    private javax.swing.JButton btnSavePV;
    private javax.swing.JButton btnUpdatePV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtEID;
    private javax.swing.JTextField txtEmailP;
    private javax.swing.JTextField txtNameP;
    private javax.swing.JPasswordField txtPassP;
    private javax.swing.JTextField txtSpeciality;
    private javax.swing.JTextField txtUNameP;
    // End of variables declaration//GEN-END:variables
}
