/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.CourseJPanel;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Course.Course;
import model.Course.CourseDirectory;
import model.Professor.Professor;
import model.Student.Student;

/**
 *
 * @author LENOVO
 */
public class CourseJPanel extends javax.swing.JPanel {
    JPanel work;
    CourseDirectory courseList;
    Course course;

    /**
     * Creates new form Course
     */
    

    public CourseJPanel(JPanel work, CourseDirectory courseList, Course course) {
        initComponents();
        this.course=course;
        this.courseList=courseList;
        this.work=work;
        populateCourseTable();
        
    
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CourseNameTextField = new javax.swing.JTextField();
        txtTerm = new javax.swing.JTextField();
        Credits = new javax.swing.JLabel();
        CourseCRN = new javax.swing.JLabel();
        ProfName = new javax.swing.JLabel();
        CourseName = new javax.swing.JLabel();
        Course = new javax.swing.JLabel();
        txtCourseID = new javax.swing.JTextField();
        CourseTimeTextField = new javax.swing.JTextField();
        CourseType = new javax.swing.JLabel();
        ProfNameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        CourseViewbtn1 = new javax.swing.JButton();
        CourseSearchbtn = new javax.swing.JButton();
        txtSearchCourse = new javax.swing.JTextField();
        CourseDetails = new javax.swing.JLabel();
        Backbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtProfID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCredit = new javax.swing.JTextField();

        Credits.setForeground(new java.awt.Color(255, 0, 0));
        Credits.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Credits.setText("Term");

        CourseCRN.setForeground(new java.awt.Color(255, 0, 0));
        CourseCRN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseCRN.setText("Course ID");

        ProfName.setForeground(new java.awt.Color(255, 0, 0));
        ProfName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProfName.setText("Professor Name");

        CourseName.setForeground(new java.awt.Color(255, 0, 0));
        CourseName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseName.setText("Course Name");

        Course.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Course.setForeground(new java.awt.Color(255, 0, 0));
        Course.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Course.setText("Course");

        CourseType.setForeground(new java.awt.Color(255, 0, 0));
        CourseType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseType.setText("Course Time");

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

        CourseViewbtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CourseViewbtn1.setText("View Details");
        CourseViewbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseViewbtn1ActionPerformed(evt);
            }
        });

        CourseSearchbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CourseSearchbtn.setText("Search");
        CourseSearchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseSearchbtnActionPerformed(evt);
            }
        });

        txtSearchCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCourseActionPerformed(evt);
            }
        });

        CourseDetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CourseDetails.setForeground(new java.awt.Color(255, 0, 0));
        CourseDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseDetails.setText("Details");

        Backbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Professor ID");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Credit");

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
                                .addComponent(CourseViewbtn1)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseViewbtn1)
                    .addComponent(CourseSearchbtn)
                    .addComponent(txtSearchCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CourseViewbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseViewbtn1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCourse.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "please select a row from table to view details","warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Course result = (Course)tblCourse.getValueAt(selectedRow,0);
            CourseNameTextField.setText(result.getName());
            txtCourseID.setText(result.getId());
            txtTerm.setText(result.getTerm());
            ProfNameTextField.setText(result.getProfessor());
            CourseTimeTextField.setText(result.getTime());
            txtProfID.setText(result.getProfID());
            
        }
    }//GEN-LAST:event_CourseViewbtn1ActionPerformed

    private void CourseSearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseSearchbtnActionPerformed
        // TODO add your handling code here:
        Course result = courseList.searchCourse(txtSearchCourse.getText());
        if(result == null){
            JOptionPane.showMessageDialog(null, "Course does not exist","Information", JOptionPane.WARNING_MESSAGE);
        }
        else{
            CourseNameTextField.setText(result.getName());
            txtCourseID.setText(result.getId());
            txtTerm.setText(result.getTerm());
            ProfNameTextField.setText(result.getProfessor());
            CourseTimeTextField.setText(result.getTime());
            txtProfID.setText(result.getProfID());
            
            
            
        }
    }//GEN-LAST:event_CourseSearchbtnActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
         work.remove(this);
        CardLayout layout = (CardLayout) work.getLayout();
        layout.previous(work);
    }//GEN-LAST:event_BackbtnActionPerformed

    private void txtSearchCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCourseActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSearchCourseActionPerformed


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

    private void populateCourseTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCourse.getModel();
        dtm.setRowCount(0);
        for(Course user: courseList.getCourses()){
            Object[] row = new Object[7];
            
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