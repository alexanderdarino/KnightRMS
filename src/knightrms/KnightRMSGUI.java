package KnightRMS;

import KnightEDU.Credits;
import KnightEDU.DBMS.Query.CourseID.PNS.InvalidNumberException;
import KnightEDU.DBMS.Query.CourseID.PNS.InvalidPrefixException;
import KnightEDU.DBMS.Query.CourseID.PNS.InvalidSuffixException;
import KnightEDU.DBMS.SQL.DB;
import KnightEDU.DBMS.SQL.Query.Course;
import KnightEDU.Grade.Type;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Set;
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * KnightsSampleGUI.java
 *
 * Created on Feb 5, 2011, 10:23:33 PM
 */

/**
 *
 * @author Evan
 */

public class KnightRMSGUI extends javax.swing.JFrame {

    public final KnightEDU.DBMS.SQL.DB db = new KnightEDU.DBMS.SQL.DB(3,4,1);
    /** Creates new form KnightsSampleGUI */
    public KnightRMSGUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coursePlannerTab = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Knight Registrar Management System");

        coursePlannerTab.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coursePlannerTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coursePlannerTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );

        coursePlannerTab.add(new CoursePlannerPanel(this, db));
        coursePlannerTab.setTitleAt(0, "Course Planner");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KnightRMSGUI().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane coursePlannerTab;
    // End of variables declaration//GEN-END:variables

/*
public void actionPerformed(ActionEvent e) throws InvalidSuffixException
    {


        if (e.getSource() == searchButton)
        {
//            KnightEDU.DBMS.SQL.DB db = new KnightEDU.DBMS.SQL.DB(3,4,1);
//
//            if (hasCompleteCourseID())
//            {
//                try
//                {
//                    Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsPrefix(prefix).containsNumberEqualTo(number).containsSuffix(suffix).build().invoke();
//                    if (result != null)
//                        courseList.setListData(result.toArray());
//                }
//
//
//                catch (InvalidPrefixException ex)
//                {
//                    JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid prefix.");
//                }                catch (InvalidNumberException ex)
//                {
//                    JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid number.");
//                }                catch (InvalidSuffixException ex)
//                {
//                    JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid suffix.");
//                }
//            }
//            else if (hasPartialCourseID())
//            {
//                if (hasPrefix() && hasNumber())
//                {
//                    if (hasName() && hasDescription())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).descriptionContains(description).specifyCourseID().containsPrefix(prefix).containsNumberEqualTo(number).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//                        catch (InvalidPrefixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid prefix.");
//                        }                        catch (InvalidNumberException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid number.");
//                        }
//                    }
//                    else if (hasName())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).specifyCourseID().containsPrefix(prefix).containsNumberEqualTo(number).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//                        catch (InvalidPrefixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid prefix.");
//                        }
//                        catch (InvalidNumberException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid number.");
//                        }
//                    }
//                    else if (hasDescription())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().descriptionContains(description).specifyCourseID().containsPrefix(prefix).containsNumberEqualTo(number).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//                        catch (InvalidPrefixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid prefix.");
//                        }                        catch (InvalidNumberException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid number.");
//                        }
//                    }
//                    else
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsPrefix(prefix).containsNumberEqualTo(number).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//                        catch (InvalidPrefixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid prefix.");
//                        }                        catch (InvalidNumberException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid number.");
//                        }
//                    }
//                }
//                else if (hasNumber() && hasSuffix())
//                {
//                    if (hasName() && hasDescription())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).descriptionContains(description).specifyCourseID().containsNumberEqualTo(number).containsSuffix(suffix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//
//                        catch (InvalidNumberException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid number.");
//                        }                        catch (InvalidSuffixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid suffix.");
//                        }
//                    }
//                    else if (hasName())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).specifyCourseID().containsNumberEqualTo(number).containsSuffix(suffix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//
//                        catch (InvalidNumberException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid number.");
//                        }                        catch (InvalidSuffixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid suffix.");
//                        }
//                    }
//                    else if (hasDescription())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().descriptionContains(description).specifyCourseID().containsNumberEqualTo(number).containsSuffix(suffix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//
//                        catch (InvalidNumberException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid number.");
//                        }                        catch (InvalidSuffixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid suffix.");
//                        }
//                    }
//                    // No name or description, just number and suffix.
//                    else
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsNumberEqualTo(number).containsSuffix(suffix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//
//                        catch (InvalidNumberException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid number.");
//                        }                        catch (InvalidSuffixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid suffix.");
//                        }
//                    }
//                }
//                else if (hasPrefix() && hasSuffix())
//                {
//                    if (hasName() && hasDescription())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).descriptionContains(description).specifyCourseID().containsPrefix(prefix).containsSuffix(suffix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//
//                        catch (InvalidPrefixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid prefix.");
//                        }                        catch (InvalidSuffixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid suffix.");
//                        }
//                    }
//                    else if (hasName())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).specifyCourseID().containsPrefix(prefix).containsSuffix(suffix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//
//                        catch (InvalidPrefixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid prefix.");
//                        }                        catch (InvalidSuffixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid suffix.");
//                        }
//                    }
//                    else if (hasDescription())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().descriptionContains(description).specifyCourseID().containsPrefix(prefix).containsSuffix(suffix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//
//                        catch (InvalidPrefixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid prefix.");
//                        }                        catch (InvalidSuffixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid suffix.");
//                        }
//                    }
//
//                    // No name or description, just prefix and suffix.
//                    else
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsPrefix(prefix).containsSuffix(suffix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//
//                        catch (InvalidPrefixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid prefix.");
//                        }                        catch (InvalidSuffixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid suffix.");
//                        }
//                    }
//                }
//                else if (hasPrefix())
//                {
//                    if (hasName() && hasDescription())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).descriptionContains(description).specifyCourseID().containsPrefix(prefix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//                        catch (InvalidPrefixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid prefix.");
//                        }
//                    }
//                    else if (hasName())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).specifyCourseID().containsPrefix(prefix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//                        catch (InvalidPrefixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid prefix.");
//                        }
//                    }
//                    else if (hasDescription())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().descriptionContains(description).specifyCourseID().containsPrefix(prefix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//                        catch (InvalidPrefixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid prefix.");
//                        }
//                    }
//                    else
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsPrefix(prefix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//                        catch (InvalidPrefixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid prefix.");
//                        }
//                    }
//                }
//                else if (hasNumber())
//                {
//                    if (hasName() && hasDescription())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).descriptionContains(description).specifyCourseID().containsNumberEqualTo(number).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//                        catch (InvalidNumberException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid number.");
//                        }
//                    }
//                    else if (hasName())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).specifyCourseID().containsNumberEqualTo(number).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//                        catch (InvalidNumberException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid number.");
//                        }
//                    }
//                    else if (hasDescription())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().descriptionContains(description).specifyCourseID().containsNumberEqualTo(number).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//                        catch (InvalidNumberException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid number.");
//                        }
//                    }
//                    // Just number - no name, description, prefix, or suffix.
//                    else
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsNumberEqualTo(number).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//                        catch (InvalidNumberException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid number.");
//                        }
//                    }
//                }
//
//                // Only suffix.
//                else
//                {
//                    if (hasName() && hasDescription())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).descriptionContains(description).specifyCourseID().containsSuffix(suffix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//                        catch (InvalidSuffixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid suffix.");
//                        }
//                    }
//                    else if (hasName())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).specifyCourseID().containsSuffix(suffix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//                        catch (InvalidSuffixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid suffix.");
//                        }
//                    }
//                    else if (hasDescription())
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().descriptionContains(description).specifyCourseID().containsSuffix(suffix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//                        catch (InvalidSuffixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid suffix.");
//                        }
//                    }
//
//                    // Only suffix
//                    else
//                    {
//                        try
//                        {
//                            Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsSuffix(suffix).build().invoke();
//                            if (result != null)
//                                courseList.setListData(result.toArray());
//                        }
//
//                        catch (InvalidSuffixException ex)
//                        {
//                            JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter valid suffix.");
//                        }
//                    }
//                }
//            }
//            else if (hasName() && hasDescription())
//            {
//                Set<KnightEDU.Course> result = db.queryCourse().nameContains(nameField.getText()).descriptionContains(descriptionField.getText()).invoke();
//                if (result != null)
//                    courseList.setListData(result.toArray());
//            }
//            else if (hasName())
//            {
//                Set<KnightEDU.Course> result = db.queryCourse().nameContains(nameField.getText()).invoke();
//                if (result != null)
//                    courseList.setListData(result.toArray());
//            }
//            else if (hasDescription())
//            {
//                Set<KnightEDU.Course> result = db.queryCourse().descriptionContains(descriptionField.getText()).invoke();
//                if (result != null)
//                    courseList.setListData(result.toArray());
//            }
//            // No fields have been filled. Prompt for user input.
//            else
//            {
//                JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter search criteria.");
//            }
        }

        // Edit button selected.
        else if (e.getSource() == editPrereqsButton)
        {
//            if (courseList.getSelectedValue() != null)
//            {
//                // open prerequisites window
//                Course c = (Course) courseList.getSelectedValue();
//
//            }
//            else
//                JOptionPane.showMessageDialog(KnightRMSGUI.this, "No course is selected.");
        }

        else if (e.getSource() == saveButton)
        {
//            // If course is in database, update course.
//            if (db.containsCourse(courseID))
//            {
//                KnightEDU.Course c = db.getCourse(courseID);
//                Credits credits = null;
//                c.setName(name);
//                c.setDescription(description);
//                if(minCreditsField == null && maxCreditsField == null)
//                    JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter min and/or max credits.");
//                else if(minCreditsField != null && maxCreditsField != null)
//                {
//                    int min = Integer.parseInt(minCreditsField.getText());
//                    int max = Integer.parseInt(maxCreditsField.getText());
//                    credits = Credits.createCredits(min, max);
//                }
//                else if(minCreditsField == null)
//                {
//                    int cMax = Integer.parseInt(maxCreditsField.getText());
//                    credits = Credits.createCredits(cMax);
//                }
//                else
//                {
//                    int cMin = Integer.parseInt(minCreditsField.getText());
//                    credits = Credits.createCredits(cMin);
//                }
//                c.setCredits(credits);
//                c.setGradeType((Type)gradePrefBox.getSelectedItem());
//            }
//
//            // Need a pop-up window here - if the user makes a typo in the course name,
//            // we don't want it to add a new course. Popup window should say something like,
//            // "Course not found in database. Add course to database?" and then have buttons
//            // for yes or no.
//
//            // If course is not in database, add new course.
//            else
//            {
//                Credits credits = null;
//                if(minCreditsField == null && maxCreditsField == null)
//                    JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter min and/or max credits.");
//                else if(minCreditsField != null && maxCreditsField != null)
//                {
//                    int min = Integer.parseInt(minCreditsField.getText());
//                    int max = Integer.parseInt(maxCreditsField.getText());
//                    credits = Credits.createCredits(min, max);
//                }
//                else if(minCreditsField == null){
//                    int c = Integer.parseInt(maxCreditsField.getText());
//                    credits = Credits.createCredits(c);
//                }
//                else {
//                    int c = Integer.parseInt(minCreditsField.getText());
//                    credits = Credits.createCredits(c);
//                }
//
//
//                Grade.Type type = (Type)gradePrefBox.getSelectedItem();
//                //db.addCourse(String courseID, String name, String description, Credits credits, Grade.Type gradeType);
//                db.addCourse(courseID, name, description, credits, type);
//            }
        }

        // Remove the course from the database
        else if (e.getSource() == removeButton)
        {
//            if (courseList.getSelectedValue() != null)
//            {
//                db.removeCourse(courseID);
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(KnightRMSGUI.this, "Please enter search criteria.");
//            }

        }
    }
*/
  

    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
