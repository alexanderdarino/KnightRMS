package KnightRMS;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import KnightEDU.Credits;
import KnightEDU.DBMS.Query.CourseID.PNS.InvalidNumberException;
import KnightEDU.DBMS.Query.CourseID.PNS.InvalidPrefixException;
import KnightEDU.DBMS.Query.CourseID.PNS.InvalidSuffixException;
import KnightEDU.DBMS.SQL.DB;
import KnightEDU.Grade.Type;
import javax.swing.*;
import java.awt.event.*;
import java.util.Set;

/**
 *
 * @author David
 */
public class CoursePlanner implements ActionListener extends javax.swing.JFrame
{
    private DB db = new DB(3,4,1);
    private JButton searchButton;
    private JButton editButton;
    private JButton saveCourseButton;
    private JButton removeCourseButton;
    private JTextField nameField;
    private JTextField prefixField;
    private JTextField numberField;
    private JTextField suffixField;
    private JTextField descriptionField;
    private JTextField minCreditsField;
    private JTextField maxCreditsField;
    private JComboBox gradeTypeBox;
    private JList courseList;

    /**
     * @param args the command line arguments
     */

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new CoursePlanner().setVisible(true);
            }
        });
    }

    public void actionPerformed(ActionEvent e)
    {
        String prefix = prefixField.getText();
        String number = numberField.getText();
        String suffix = suffixField.getText();
        String courseID = prefix.concat(number).concat(suffix);
        String name = nameField.getText();
        String description = descriptionField.getText();

        if (minCreditsField != null && maxCreditsField != null)
        {
            int min = Integer.parseInt(minCreditsField.getText());
            int max = Integer.parseInt(maxCreditsField.getText());
            Credits credits = Credits.createCredits(min, max);
        }

        if (e.getSource() == searchButton)
        {
            KnightEDU.DBMS.SQL.DB db = new KnightEDU.DBMS.SQL.DB(3,4,1);

            if (hasCompleteCourseID())
            {
                try
                {
                    Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsPrefix(prefix).containsNumberEqualTo(number).containsSuffix(suffix).build().invoke();
                    if (result != null)
                        courseList.setListData(result.toArray());
                }
                catch (InvalidPrefixException ex)
                {
                    JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid prefix.");
                }
                catch (InvalidNumberException ex)
                {
                    JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid number.");
                }
                catch (InvalidSuffixException ex)
                {
                    JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid suffix.");
                }
            }
            else if (hasPartialCourseID())
            {
                if (hasPrefix() && hasNumber())
                {
                    if (hasName() && hasDescription())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).descriptionContains(description).specifyCourseID().containsPrefix(prefix).containsNumberEqualTo(number).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }
                        catch (InvalidPrefixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid prefix.");
                        }
                        catch (InvalidNumberException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid number.");
                        }
                    }
                    else if (hasName())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).specifyCourseID().containsPrefix(prefix).containsNumberEqualTo(number).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }
                        catch (InvalidPrefixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid prefix.");
                        }
                        catch (InvalidNumberException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid number.");
                        }
                    }
                    else if (hasDescription())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().descriptionContains(description).specifyCourseID().containsPrefix(prefix).containsNumberEqualTo(number).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }
                        catch (InvalidPrefixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid prefix.");
                        }
                        catch (InvalidNumberException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid number.");
                        }
                    }
                    else
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsPrefix(prefix).containsNumberEqualTo(number).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }
                        catch (InvalidPrefixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid prefix.");
                        }
                        catch (InvalidNumberException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid number.");
                        }
                    }
                }
                else if (hasNumber() && hasSuffix())
                {
                    if (hasName() && hasDescription())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).descriptionContains(description).specifyCourseID().containsNumberEqualTo(number).containsSuffix(suffix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }

                        catch (InvalidNumberException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid number.");
                        }
                        catch (InvalidSuffixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid suffix.");
                        }
                    }
                    else if (hasName())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).specifyCourseID().containsNumberEqualTo(number).containsSuffix(suffix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }

                        catch (InvalidNumberException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid number.");
                        }
                        catch (InvalidSuffixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid suffix.");
                        }
                    }
                    else if (hasDescription())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().descriptionContains(description).specifyCourseID().containsNumberEqualTo(number).containsSuffix(suffix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }

                        catch (InvalidNumberException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid number.");
                        }
                        catch (InvalidSuffixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid suffix.");
                        }
                    }
                    // No name or description, just number and suffix.
                    else
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsNumberEqualTo(number).containsSuffix(suffix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }

                        catch (InvalidNumberException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid number.");
                        }
                        catch (InvalidSuffixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid suffix.");
                        }
                    }
                }
                else if (hasPrefix() && hasSuffix())
                {
                    if (hasName() && hasDescription())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).descriptionContains(description).specifyCourseID().containsPrefix(prefix).containsSuffix(suffix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }
                        catch (InvalidPrefixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid prefix.");
                        }

                        catch (InvalidSuffixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid suffix.");
                        }
                    }
                    else if (hasName())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).specifyCourseID().containsPrefix(prefix).containsSuffix(suffix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }
                        catch (InvalidPrefixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid prefix.");
                        }

                        catch (InvalidSuffixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid suffix.");
                        }
                    }
                    else if (hasDescription())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().descriptionContains(description).specifyCourseID().containsPrefix(prefix).containsSuffix(suffix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }
                        catch (InvalidPrefixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid prefix.");
                        }

                        catch (InvalidSuffixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid suffix.");
                        }
                    }

                    // No name or description, just prefix and suffix.
                    else
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsPrefix(prefix).containsSuffix(suffix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }
                        catch (InvalidPrefixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid prefix.");
                        }

                        catch (InvalidSuffixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid suffix.");
                        }
                    }
                }
                else if (hasPrefix())
                {
                    if (hasName() && hasDescription())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).descriptionContains(description).specifyCourseID().containsPrefix(prefix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }
                        catch (InvalidPrefixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid prefix.");
                        }
                    }
                    else if (hasName())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).specifyCourseID().containsPrefix(prefix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }
                        catch (InvalidPrefixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid prefix.");
                        }
                    }
                    else if (hasDescription())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().descriptionContains(description).specifyCourseID().containsPrefix(prefix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }
                        catch (InvalidPrefixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid prefix.");
                        }
                    }
                    else
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsPrefix(prefix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }
                        catch (InvalidPrefixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid prefix.");
                        }
                    }
                }
                else if (hasNumber())
                {
                    if (hasName() && hasDescription())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).descriptionContains(description).specifyCourseID().containsNumberEqualTo(number).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }

                        catch (InvalidNumberException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid number.");
                        }
                    }
                    else if (hasName())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).specifyCourseID().containsNumberEqualTo(number).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }

                        catch (InvalidNumberException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid number.");
                        }
                    }
                    else if (hasDescription())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().descriptionContains(description).specifyCourseID().containsNumberEqualTo(number).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }

                        catch (InvalidNumberException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid number.");
                        }
                    }
                    // Just number - no name, description, prefix, or suffix.
                    else
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsNumberEqualTo(number).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }

                        catch (InvalidNumberException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid number.");
                        }
                    }
                }

                // Only suffix.
                else
                {
                    if (hasName() && hasDescription())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).descriptionContains(description).specifyCourseID().containsSuffix(suffix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }

                        catch (InvalidSuffixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid suffix.");
                        }
                    }
                    else if (hasName())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().nameContains(name).specifyCourseID().containsSuffix(suffix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }

                        catch (InvalidSuffixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid suffix.");
                        }
                    }
                    else if (hasDescription())
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().descriptionContains(description).specifyCourseID().containsSuffix(suffix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }

                        catch (InvalidSuffixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid suffix.");
                        }
                    }

                    // Only suffix
                    else
                    {
                        try
                        {
                            Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsSuffix(suffix).build().invoke();
                            if (result != null)
                                courseList.setListData(result.toArray());
                        }

                        catch (InvalidSuffixException ex)
                        {
                            JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid suffix.");
                        }
                    }
                }
            }
            else if (hasName() && hasDescription())
            {
                Set<KnightEDU.Course> result = db.queryCourse().nameContains(nameField.getText()).descriptionContains(descriptionField.getText()).invoke();
                if (result != null)
                    courseList.setListData(result.toArray());
            }
            else if (hasName())
            {
                Set<KnightEDU.Course> result = db.queryCourse().nameContains(nameField.getText()).invoke();
                if (result != null)
                    courseList.setListData(result.toArray());
            }
            else if (hasDescription())
            {
                Set<KnightEDU.Course> result = db.queryCourse().descriptionContains(descriptionField.getText()).invoke();
                if (result != null)
                    courseList.setListData(result.toArray());
            }
            // No fields have been filled. Prompt for user input.
            else
            {
                JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter search criteria.");
            }
        }

        // Edit button selected.
        else if (e.getSource() == editButton)
        {
            if (courseList.getSelectedValue() != null)
            {
                // open prerequisites window
                Course c = (Course) courseList.getSelectedValue();

            }
            else
                JOptionPane.showMessageDialog(CoursePlanner.this, "No course is selected.");
        }

        else if (e.getSource() == saveCourseButton)
        {
            // If course is in database, update course.
            if (db.containsCourse(courseID))
            {
                Course c = db.getCourse(courseID);
                c.setName(name);
                c.setDescription(description);
                c.setCredits((Credits)creditsBox.getSelectedItem());
                c.setGradeType((Type)gradeTypeBox.getSelectedItem());
            }

            // Need a pop-up window here - if the user makes a typo in the course name,
            // we don't want it to add a new course. Popup window should say something like,
            // "Course not found in database. Add course to database?" and then have buttons
            // for yes or no.

            // If course is not in database, add new course.
            else
            {
                Credits c = (Credits)creditsBox.getSelectedItem();
                Grade.Type type = (Type)gradeTypeBox.getSelectedItem();
                //db.addCourse(String courseID, String name, String description, Credits credits, Grade.Type gradeType);
                db.addCourse(courseID, name, description, c, type);
            }
        }

        // Remove the course from the database
        else if (e.getSource() == removeCourseButton)
        {
            if (courseList.getSelectedValue() != null)
            {
                db.removeCourse(courseID);
            }
            else
            {
                JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter search criteria.");
            }

        }
    }

    public boolean hasCompleteCourseID()
    {
        if (prefixField.getText() != null && numberField.getText() != null && suffixField.getText() != null)
            return true;
        else
            return false;
    }

    public boolean hasPartialCourseID()
    {
        if (nameField.getText() != null || numberField.getText() != null || suffixField.getText() != null)
            return true;
        else
            return false;
    }

    public boolean hasPrefix()
    {
        if (prefixField.getText() != null)
            return true;
        else
            return false;
    }

    public boolean hasNumber()
    {
        if (numberField.getText() != null)
            return true;
        else
            return false;
    }

    public boolean hasSuffix()
    {
        if (suffixField.getText() != null)
            return true;
        else
            return false;
    }

    public boolean hasName()
    {
        if (nameField.getText() != null)
            return true;
        else
            return false;
    }

    public boolean hasDescription()
    {
        if (descriptionField.getText() != null)
            return true;
        else
            return false;
    }

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
