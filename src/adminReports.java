
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matthewrodgers
 */

public class adminReports extends javax.swing.JFrame {
    Admin admin = new Admin();
    /**
     * Creates new form adminReports
     */
    public adminReports() {
        initComponents();
        courseID.setVisible(false);
        i2.setVisible(false);
        reportInterface.setVisible(false);
        studentName.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        viewAllCourses = new javax.swing.JButton();
        viewFullCourses = new javax.swing.JButton();
        viewStudentsInCourse = new javax.swing.JButton();
        studentCourses = new javax.swing.JButton();
        sort = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        managementTextArea = new javax.swing.JTextArea();
        courseID = new javax.swing.JTextField();
        i2 = new javax.swing.JLabel();
        reportInterface = new javax.swing.JButton();
        studentName = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel5.setText("Admin");

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 572, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(72, 72, 72))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(2, 17, 49));

        viewAllCourses.setText("View All Courses");
        viewAllCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllCoursesActionPerformed(evt);
            }
        });

        viewFullCourses.setText("View Full Courses");
        viewFullCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFullCoursesActionPerformed(evt);
            }
        });

        viewStudentsInCourse.setText("View Students in Course");
        viewStudentsInCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStudentsInCourseActionPerformed(evt);
            }
        });

        studentCourses.setText("View Student Courses");
        studentCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentCoursesActionPerformed(evt);
            }
        });

        sort.setText("Sort");
        sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewAllCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewFullCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewStudentsInCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(studentCourses, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(sort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(viewAllCourses)
                .addGap(18, 18, 18)
                .addComponent(viewFullCourses)
                .addGap(18, 18, 18)
                .addComponent(viewStudentsInCourse)
                .addGap(18, 18, 18)
                .addComponent(studentCourses)
                .addGap(18, 18, 18)
                .addComponent(sort)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(33, 49, 89));

        managementTextArea.setColumns(20);
        managementTextArea.setRows(5);
        jScrollPane1.setViewportView(managementTextArea);

        courseID.setText("Course ID");
        courseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseIDActionPerformed(evt);
            }
        });

        i2.setForeground(new java.awt.Color(255, 0, 0));
        i2.setText("Invalid Entry");

        reportInterface.setText("View");
        reportInterface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportInterfaceActionPerformed(evt);
            }
        });

        studentName.setText("Student Name");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(courseID)
                            .addComponent(studentName, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(i2))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(reportInterface, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(studentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(i2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(reportInterface)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        adminHome home = new adminHome();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void viewAllCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllCoursesActionPerformed
        managementTextArea.setText(null);
        courseID.setVisible(false);
        i2.setVisible(false);
        studentName.setVisible(false);
        reportInterface.setVisible(false);
        managementTextArea.append("All Courses that are available:\n");
        for(int i = 0; i < Admin.course_data.size(); i++ ) {
                managementTextArea.append(Admin.course_data.get(i).getCourseName() + " | ");
                managementTextArea.append(Admin.course_data.get(i).getCourseID() + " | ");
                managementTextArea.append(Admin.course_data.get(i).getStudentNames() + " | ");
                managementTextArea.append(Admin.course_data.get(i).getMaxStudents() + "\n"); 
        }
    }//GEN-LAST:event_viewAllCoursesActionPerformed

    private void courseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseIDActionPerformed

    private void viewFullCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFullCoursesActionPerformed
        courseID.setVisible(false);
        i2.setVisible(false);
        reportInterface.setVisible(false);
        managementTextArea.setText(null);
        studentName.setVisible(false);
        
        try {
            Admin.viewFullCourses();
        } catch (IOException ex) {
            Logger.getLogger(adminReports.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i = 0; i < Admin.course_data.size(); i++) {
            if(Admin.course_data.get(i).getCurrentStudents().equals((Admin.course_data).get(i).getMaxStudents())) {
                managementTextArea.append("This course is full: " + Admin.course_data.get(i).getCourseName());
            }
            else if((i + 1 == Admin.course_data.size()) && (managementTextArea.getText().equals(""))) {
                managementTextArea.append("No full courses");
            }
        }
    }//GEN-LAST:event_viewFullCoursesActionPerformed

    
    
    private void viewStudentsInCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStudentsInCourseActionPerformed
        managementTextArea.setText(null);
        i2.setVisible(false);
        courseID.setVisible(true);
        reportInterface.setVisible(true);
        reportInterface.setText("View");
        studentName.setVisible(false);
        
    }//GEN-LAST:event_viewStudentsInCourseActionPerformed

    private void reportInterfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportInterfaceActionPerformed
        if(reportInterface.getText().equals("View")) {
            managementTextArea.setText(null);
            String id = courseID.getText();
            for(int i = 0; i < Admin.course_data.size(); i++) {
                if(Admin.course_data.get(i).getCourseID().equals(id)) {
                    i2.setVisible(false);
                    managementTextArea.append((Admin.course_data.get(i).getStudentNames().toString()));
                    break;
                }
                else {
                    i2.setVisible(true);
                }
            }
        }
        
        else if(reportInterface.getText().equals("View Student Courses")) {
            String student_name = studentName.getText();
            managementTextArea.setText(null);
            for(int i = 0; i < Admin.course_data.size(); i++) {
                if(Admin.course_data.get(i).getStudentNames().contains(student_name)) {
                    i2.setVisible(false);
                    if(i == 0) {
                        managementTextArea.append("The student is registered in the following courses: \n");
                    }
                        
                    managementTextArea.append(Admin.course_data.get(i).getCourseName() + "\n");
                }
                else {
                    //i2.setVisible(true);
                }

          }
        }
        
    }//GEN-LAST:event_reportInterfaceActionPerformed

    private void studentCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentCoursesActionPerformed
        studentName.setVisible(true);
        courseID.setVisible(false);
        reportInterface.setVisible(true);
        reportInterface.setText("View Student Courses");
        
    }//GEN-LAST:event_studentCoursesActionPerformed

    private void sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortActionPerformed
        courseID.setVisible(false);
        i2.setVisible(false);
        reportInterface.setVisible(false);
        managementTextArea.setText(null);
        studentName.setVisible(false);
        
        admin.sort();
        managementTextArea.append("Courses sorted based on current number of students");
        
    }//GEN-LAST:event_sortActionPerformed
    
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
            java.util.logging.Logger.getLogger(adminReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField courseID;
    private javax.swing.JLabel i2;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea managementTextArea;
    private javax.swing.JButton reportInterface;
    private javax.swing.JButton sort;
    private javax.swing.JButton studentCourses;
    private javax.swing.JTextField studentName;
    private javax.swing.JButton viewAllCourses;
    private javax.swing.JButton viewFullCourses;
    private javax.swing.JButton viewStudentsInCourse;
    // End of variables declaration//GEN-END:variables
}
