package KnightEDU;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import KnightEDU.DBMS.Query.CourseID.PNS.InvalidPrefixException;
import KnightEDU.DBMS.SQL.DB;
import javax.swing.*;
import java.awt.event.*;
import java.util.Set;
/**
 *
 * @author David
 */
public class CoursePlanner implements MouseListener
        
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
    private JTextField creditsField;
    private JComboBox gradeTypeBox;
    private JList courseList;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == searchButton)
        {
            KnightEDU.DBMS.SQL.DB db = new KnightEDU.DBMS.SQL.DB(3,4,1);
            
            if (hasCompleteCourseID())
            {
                try
                {
                    Set<KnightEDU.Course> result = db.queryCourse().specifyCourseID().containsPrefix(null).build().invoke();
                    if (result != null)
                    courseList.setListData(result.toArray());
                }
                catch (InvalidPrefixException ex)
                {
                    JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter valid prefix.");
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
            else
            {
                JOptionPane.showMessageDialog(CoursePlanner.this, "Please enter search criteria.");
            }

        }

        else if (e.getSource() == editButton)
        {
            if (courseList.getSelectedValue() != null)
            {
                // open prerequisites window
            }
            else
                JOptionPane.showMessageDialog(CoursePlanner.this, "No course is selected.");
        }

        else if (e.getSource() == saveCourseButton)
        {
            // If course is in database, update course.
            if (db.containsCourse(null)))
            {
                Course c = db.getCourse(null);
                c.setName(nameField.getText());
                c.setCredits(null);
                c.setDescription(descriptionField.getText());
                c.setGradeType(Grade.Type.LETTER);
                c.setPrerequisites(null);
            }

            // Need a pop-up window here - if the user makes a typo in the course name,
            // we don't want it to add a new course. Popup window should say something like,
            // "Course not found in database. Add course to database?" and then have buttons
            // for yes or no.

            // If course is not in database, add new course.
            else
            {
                //CourseID cID = new CourseID.PNS.create(prefixField.getText(), numberField.getText(), suffixField.getText()));
                //db.addCourse(courseName, cID, prefix, cID, cID);
            }
        }

        else if (e.getSource() == removeCourseButton)
        {
            if (courseList.getSelectedValue() != null)
            {
                Course c = (Course) courseList.getSelectedValue();
                db.removeCourse(c.id.toString());
            }
        }
    }

    public void updateList()
    {
        //courseList.setListData(array or vector);
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
