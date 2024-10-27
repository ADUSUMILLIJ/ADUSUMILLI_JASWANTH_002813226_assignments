/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Professor;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Course.Course;
import model.Course.CourseDirectory;
import model.Professor.Professor;
import model.Professor.ProfessorDirectory;

/**
 *
 * @author LENOVO
 */
public class ProfessorCoursesJPanel extends javax.swing.JPanel {
JPanel work;
Course course;
CourseDirectory courseList;
ProfessorDirectory professorList;
Professor professor;

    /**
     * Creates new form ProfessorCourses
     */
   

    public ProfessorCoursesJPanel(JPanel work, Course course, CourseDirectory courseList, ProfessorDirectory professorList,Professor professor) {
     initComponents();
     this.work=work;
     this.course=course;
     this.courseList=courseList;
     this.professorList=professorList;
     this.professor=professor;
     
     populateProfTable();
     
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CourseTimeTextField = new javax.swing.JTextField();
        txtProfID = new javax.swing.JTextField();
        CourseType = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ProfNameTextField = new javax.swing.JTextField();
        txtCredit = new javax.swing.JTextField();
        CourseNameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        txtTerm = new javax.swing.JTextField();
        Credits = new javax.swing.JLabel();
        CourseViewbtn1 = new javax.swing.JButton();
        CourseCRN = new javax.swing.JLabel();
        CourseSearchbtn = new javax.swing.JButton();
        ProfName = new javax.swing.JLabel();
        txtSearchCourse = new javax.swing.JTextField();
        CourseName = new javax.swing.JLabel();
        CourseDetails = new javax.swing.JLabel();
        Course = new javax.swing.JLabel();
        Backbtn = new javax.swing.JButton();
        txtCourseID = new javax.swing.JTextField();
        Updatebtn = new javax.swing.JButton();
        Savebtn = new javax.swing.JButton();

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Professor ID");

        CourseType.setForeground(new java.awt.Color(255, 0, 0));
        CourseType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseType.setText("Course Time");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Credit");

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Name", "Course ID", "Professor Name", "Term", "Time", "ProfessorID", "Credit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCourse);

        Credits.setForeground(new java.awt.Color(255, 0, 0));
        Credits.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Credits.setText("Term");

        CourseViewbtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CourseViewbtn1.setText("View Details");
        CourseViewbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseViewbtn1ActionPerformed(evt);
            }
        });

        CourseCRN.setForeground(new java.awt.Color(255, 0, 0));
        CourseCRN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseCRN.setText("Course ID");

        CourseSearchbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CourseSearchbtn.setText("Search");
        CourseSearchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseSearchbtnActionPerformed(evt);
            }
        });

        ProfName.setForeground(new java.awt.Color(255, 0, 0));
        ProfName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProfName.setText("Professor Name");

        txtSearchCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCourseActionPerformed(evt);
            }
        });

        CourseName.setForeground(new java.awt.Color(255, 0, 0));
        CourseName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseName.setText("Course Name");

        CourseDetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CourseDetails.setForeground(new java.awt.Color(255, 0, 0));
        CourseDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseDetails.setText("Details");

        Course.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Course.setForeground(new java.awt.Color(255, 0, 0));
        Course.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Course.setText("Course");

        Backbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        Updatebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Updatebtn.setText("Update");

        Savebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Savebtn.setText("Save");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSearchCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                        .addComponent(CourseSearchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(CourseDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGap(233, 233, 233)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CourseViewbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Updatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Savebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CourseCRN, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CourseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CourseType, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ProfName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Credits, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ProfNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtTerm, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(CourseTimeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtProfID)
                                    .addComponent(txtCredit))))
                        .addGap(206, 206, 206))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Backbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CourseSearchbtn)
                            .addComponent(txtSearchCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(CourseDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseCRN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Credits, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProfName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProfNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtProfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CourseType, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(CourseViewbtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Updatebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Savebtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CourseViewbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseViewbtn1ActionPerformed
        // TODO add your handling code here:
        
        
      
    }//GEN-LAST:event_CourseViewbtn1ActionPerformed

    private void CourseSearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseSearchbtnActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_CourseSearchbtnActionPerformed

    private void txtSearchCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCourseActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSearchCourseActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
        work.remove(this);
        CardLayout layout = (CardLayout) work.getLayout();
        layout.previous(work);
    }//GEN-LAST:event_BackbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JLabel Course;
    private javax.swing.JLabel CourseCRN;
    private javax.swing.JLabel CourseDetails;
    private javax.swing.JLabel CourseName;
    private javax.swing.JTextField CourseNameTextField;
    private javax.swing.JButton CourseSearchbtn;
    private javax.swing.JTextField CourseTimeTextField;
    private javax.swing.JLabel CourseType;
    private javax.swing.JButton CourseViewbtn1;
    private javax.swing.JLabel Credits;
    private javax.swing.JLabel ProfName;
    private javax.swing.JTextField ProfNameTextField;
    private javax.swing.JButton Savebtn;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTextField txtCourseID;
    private javax.swing.JTextField txtCredit;
    private javax.swing.JTextField txtProfID;
    private javax.swing.JTextField txtSearchCourse;
    private javax.swing.JTextField txtTerm;
    // End of variables declaration//GEN-END:variables

    private void populateProfTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCourse.getModel();
        dtm.setRowCount(0);
        
        for (Course user : courseList.getCourses()) {
            if (user.getProfID().equals(professor.getId())) {
                Object[] row = new Object[30];

                row[0] = user;
                row[1] = user.getId();
                row[2] = user.getProfessor();
                row[3] = user.getTerm();
                row[4] = user.getTime();
                row[5] = user.getProfID();
                row[6] = user.getCredit();

                dtm.addRow(row);
            }
        
    }
    }
}