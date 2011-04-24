/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CoursePlannerPanel.java
 *
 * Created on Apr 21, 2011, 4:08:43 PM
 */

package KnightRMS;

import KnightEDU.Course;
import KnightEDU.CourseID;
import KnightEDU.Credits;
import KnightEDU.DBMS.Query.CourseID.PNS.InvalidNumberException;
import KnightEDU.DBMS.Query.CourseID.PNS.InvalidPrefixException;
import KnightEDU.DBMS.Query.CourseID.PNS.InvalidSuffixException;
import KnightEDU.Grade;
import KnightEDU.Grade.Type;
import KnightEDU.Prerequisites;
import KnightEDU.Term;
import KnightEDU.YearParity;
import java.awt.Frame;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Evan
 */
public class CoursePlannerPanel extends javax.swing.JPanel {

    private KnightEDU.DBMS.SQL.DB db;
    private Frame parent;
    private Prerequisites.Builder prereqBuilder = null;

    public CoursePlannerPanel(Frame parent, KnightEDU.DBMS.SQL.DB db)
    {
        this();
        this.db = db;
        this.parent = parent;
    }

    /** Creates new form CoursePlannerPanel */
    private CoursePlannerPanel() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        courseListingPanel = new javax.swing.JPanel();
        courseSearchPan = new javax.swing.JPanel();
        courseListScrollPane = new javax.swing.JScrollPane();
        courseList = new javax.swing.JList();
        searchButton = new javax.swing.JButton();
        resetForm = new javax.swing.JButton();
        coursePlannerSeparator = new javax.swing.JSeparator();
        courseInfoPanel = new javax.swing.JPanel();
        courseInfoTopPanel = new javax.swing.JPanel();
        courseIDPanel = new javax.swing.JPanel();
        prefixPanel = new javax.swing.JPanel();
        coursePrefixLab2 = new javax.swing.JLabel();
        prefixField = new javax.swing.JTextField();
        numberPanel = new javax.swing.JPanel();
        courseNumLab = new javax.swing.JLabel();
        numberField = new javax.swing.JTextField();
        suffixPanel = new javax.swing.JPanel();
        courseSuffixLab = new javax.swing.JLabel();
        suffixField = new javax.swing.JTextField();
        courseNamePanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        gradeTypeAndCreditsPanel = new javax.swing.JPanel();
        gradePrefPan = new javax.swing.JPanel();
        gradeTypeLabel = new javax.swing.JLabel();
        gradeTypeBox = new javax.swing.JComboBox();
        creditsPanel = new javax.swing.JPanel();
        minCreditsPanel = new javax.swing.JPanel();
        creditsMinLab = new javax.swing.JLabel();
        minCreditsField = new javax.swing.JTextField();
        maxCreditsPanel = new javax.swing.JPanel();
        creditsMaxLab = new javax.swing.JLabel();
        maxCreditsField = new javax.swing.JTextField();
        semOfferedPan = new javax.swing.JPanel();
        occasionalBox = new javax.swing.JCheckBox();
        semOfferedSeparator = new javax.swing.JSeparator();
        semOfferedSemPan = new javax.swing.JPanel();
        fallLab = new javax.swing.JLabel();
        fallEvenBox = new javax.swing.JCheckBox();
        fallOddBox = new javax.swing.JCheckBox();
        springLab = new javax.swing.JLabel();
        springEvenBox = new javax.swing.JCheckBox();
        springOddBox = new javax.swing.JCheckBox();
        summerLab = new javax.swing.JLabel();
        summerEvenBox = new javax.swing.JCheckBox();
        summerOddBox = new javax.swing.JCheckBox();
        prerequisitesPanel = new javax.swing.JPanel();
        prereqsButtonsPanel = new javax.swing.JPanel();
        addCoursePrereqsButton = new javax.swing.JButton();
        resetPrereqsButton = new javax.swing.JButton();
        prereqTextAreaScrollPane = new javax.swing.JScrollPane();
        prereqTextArea = new javax.swing.JTextArea();
        descriptionAreaPanel = new javax.swing.JPanel();
        descriptionAreaScrollPane = new javax.swing.JScrollPane();
        descriptionArea = new javax.swing.JTextArea();
        courseOptionsInsidePan = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));

        courseListingPanel.setLayout(new java.awt.BorderLayout());

        courseSearchPan.setBorder(javax.swing.BorderFactory.createTitledBorder("Course Listing"));
        courseSearchPan.setLayout(new java.awt.BorderLayout());

        courseList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                courseListValueChanged(evt);
            }
        });
        courseListScrollPane.setViewportView(courseList);

        courseSearchPan.add(courseListScrollPane, java.awt.BorderLayout.CENTER);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        courseSearchPan.add(searchButton, java.awt.BorderLayout.SOUTH);

        resetForm.setText("Reset Form");
        resetForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetFormActionPerformed(evt);
            }
        });
        courseSearchPan.add(resetForm, java.awt.BorderLayout.NORTH);

        courseListingPanel.add(courseSearchPan, java.awt.BorderLayout.CENTER);

        add(courseListingPanel);

        coursePlannerSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(coursePlannerSeparator);

        courseInfoPanel.setMinimumSize(courseInfoPanel.getPreferredSize());
        courseInfoPanel.setLayout(new java.awt.BorderLayout());

        courseInfoTopPanel.setLayout(new javax.swing.BoxLayout(courseInfoTopPanel, javax.swing.BoxLayout.PAGE_AXIS));

        courseIDPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("CourseID"));

        coursePrefixLab2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        coursePrefixLab2.setText("Prefix: ");
        prefixPanel.add(coursePrefixLab2);

        prefixField.setColumns(3);
        prefixField.setMinimumSize(prefixField.getPreferredSize());
        prefixField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefixFieldActionPerformed(evt);
            }
        });
        prefixField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                prefixFieldFocusLost(evt);
            }
        });
        prefixPanel.add(prefixField);
        prefixField.setDocument(new FixTextFieldLength(3));

        courseIDPanel.add(prefixPanel);

        numberPanel.setLayout(new java.awt.GridBagLayout());

        courseNumLab.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        courseNumLab.setText(" Number: ");
        numberPanel.add(courseNumLab, new java.awt.GridBagConstraints());

        numberField.setColumns(4);
        numberField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numberFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        numberPanel.add(numberField, gridBagConstraints);

        courseIDPanel.add(numberPanel);

        suffixPanel.setLayout(new java.awt.GridBagLayout());

        courseSuffixLab.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        courseSuffixLab.setText(" Suffix: ");
        suffixPanel.add(courseSuffixLab, new java.awt.GridBagConstraints());

        suffixField.setColumns(1);
        suffixField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                suffixFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        suffixPanel.add(suffixField, gridBagConstraints);

        courseIDPanel.add(suffixPanel);

        courseInfoTopPanel.add(courseIDPanel);

        courseNamePanel.setLayout(new java.awt.GridBagLayout());

        nameLabel.setText("Name:");
        courseNamePanel.add(nameLabel, new java.awt.GridBagConstraints());

        nameField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        courseNamePanel.add(nameField, gridBagConstraints);

        courseInfoTopPanel.add(courseNamePanel);

        gradeTypeAndCreditsPanel.setLayout(new javax.swing.BoxLayout(gradeTypeAndCreditsPanel, javax.swing.BoxLayout.X_AXIS));

        gradeTypeLabel.setText("Grade Type:");
        gradePrefPan.add(gradeTypeLabel);

        for (Grade.Type i : Grade.Type.values())
        {
            gradeTypeBox.addItem(i);
        }
        gradeTypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeTypeBoxActionPerformed(evt);
            }
        });
        gradePrefPan.add(gradeTypeBox);

        gradeTypeAndCreditsPanel.add(gradePrefPan);

        creditsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Credits"));
        creditsPanel.setLayout(new javax.swing.BoxLayout(creditsPanel, javax.swing.BoxLayout.LINE_AXIS));

        minCreditsPanel.setMinimumSize(minCreditsPanel.getPreferredSize());

        creditsMinLab.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        creditsMinLab.setText("Min: ");
        minCreditsPanel.add(creditsMinLab);

        minCreditsField.setColumns(2);
        minCreditsPanel.add(minCreditsField);

        creditsPanel.add(minCreditsPanel);

        maxCreditsPanel.setMinimumSize(maxCreditsPanel.getPreferredSize());

        creditsMaxLab.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        creditsMaxLab.setText("Max: ");
        maxCreditsPanel.add(creditsMaxLab);

        maxCreditsField.setColumns(2);
        maxCreditsPanel.add(maxCreditsField);

        creditsPanel.add(maxCreditsPanel);

        gradeTypeAndCreditsPanel.add(creditsPanel);

        courseInfoTopPanel.add(gradeTypeAndCreditsPanel);

        semOfferedPan.setBorder(javax.swing.BorderFactory.createTitledBorder("Semesters Offered"));
        semOfferedPan.setLayout(new javax.swing.BoxLayout(semOfferedPan, javax.swing.BoxLayout.LINE_AXIS));

        occasionalBox.setText("Occasional");
        occasionalBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        occasionalBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occasionalBoxActionPerformed(evt);
            }
        });
        semOfferedPan.add(occasionalBox);

        semOfferedSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        semOfferedPan.add(semOfferedSeparator);

        semOfferedSemPan.setLayout(new java.awt.GridBagLayout());

        fallLab.setText("     Fall:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        semOfferedSemPan.add(fallLab, gridBagConstraints);

        fallEvenBox.setText("Even");
        fallEvenBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        semOfferedSemPan.add(fallEvenBox, new java.awt.GridBagConstraints());

        fallOddBox.setText("Odd");
        fallOddBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        fallOddBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fallOddBoxActionPerformed(evt);
            }
        });
        semOfferedSemPan.add(fallOddBox, new java.awt.GridBagConstraints());

        springLab.setText("     Spring:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        semOfferedSemPan.add(springLab, gridBagConstraints);

        springEvenBox.setText("Even");
        springEvenBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        springEvenBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                springEvenBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        semOfferedSemPan.add(springEvenBox, gridBagConstraints);

        springOddBox.setText("Odd");
        springOddBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        semOfferedSemPan.add(springOddBox, gridBagConstraints);

        summerLab.setText("     Summer:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        semOfferedSemPan.add(summerLab, gridBagConstraints);

        summerEvenBox.setText("Even");
        summerEvenBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        semOfferedSemPan.add(summerEvenBox, gridBagConstraints);

        summerOddBox.setText("Odd");
        summerOddBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        semOfferedSemPan.add(summerOddBox, gridBagConstraints);

        semOfferedPan.add(semOfferedSemPan);

        courseInfoTopPanel.add(semOfferedPan);

        prerequisitesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Prerequisites"));
        prerequisitesPanel.setLayout(new java.awt.BorderLayout());

        prereqsButtonsPanel.setLayout(new java.awt.GridLayout(1, 0));

        addCoursePrereqsButton.setText("Add Course Prerequisites");
        addCoursePrereqsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoursePrereqsButtonActionPerformed(evt);
            }
        });
        prereqsButtonsPanel.add(addCoursePrereqsButton);

        resetPrereqsButton.setText("Reset Prerequisites");
        resetPrereqsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPrereqsButtonActionPerformed(evt);
            }
        });
        prereqsButtonsPanel.add(resetPrereqsButton);

        prerequisitesPanel.add(prereqsButtonsPanel, java.awt.BorderLayout.SOUTH);

        prereqTextArea.setColumns(20);
        prereqTextArea.setEditable(false);
        prereqTextArea.setRows(5);
        prereqTextAreaScrollPane.setViewportView(prereqTextArea);

        prerequisitesPanel.add(prereqTextAreaScrollPane, java.awt.BorderLayout.PAGE_START);

        courseInfoTopPanel.add(prerequisitesPanel);

        courseInfoPanel.add(courseInfoTopPanel, java.awt.BorderLayout.NORTH);

        descriptionAreaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Description"));
        descriptionAreaPanel.setLayout(new java.awt.BorderLayout());

        descriptionAreaScrollPane.setHorizontalScrollBar(null);
        descriptionAreaScrollPane.setPreferredSize(new java.awt.Dimension(200, 96));

        descriptionArea.setColumns(10000);
        descriptionArea.setLineWrap(true);
        descriptionArea.setRows(5);
        descriptionAreaScrollPane.setViewportView(descriptionArea);

        descriptionAreaPanel.add(descriptionAreaScrollPane, java.awt.BorderLayout.CENTER);

        courseInfoPanel.add(descriptionAreaPanel, java.awt.BorderLayout.CENTER);

        courseOptionsInsidePan.setLayout(new java.awt.GridLayout(1, 2));

        saveButton.setText("Save Course");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        courseOptionsInsidePan.add(saveButton);

        removeButton.setText("Remove Course");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        courseOptionsInsidePan.add(removeButton);

        courseInfoPanel.add(courseOptionsInsidePan, java.awt.BorderLayout.PAGE_END);

        add(courseInfoPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void occasionalBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occasionalBoxActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_occasionalBoxActionPerformed

    private void fallOddBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fallOddBoxActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_fallOddBoxActionPerformed

    private void springEvenBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_springEvenBoxActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_springEvenBoxActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        // Get courseID elements.
        String prefix = prefixField.getText();
        String number = numberField.getText();
        String suffix = suffixField.getText();

        // Check to make sure the CourseID fields are filled out.
        if(prefix.equals("") || number.equals(""))
        {
            JOptionPane.showMessageDialog(CoursePlannerPanel.this, "Please specify a valid course ID.");
            return;
        }

        // Convert to courseID.
        KnightEDU.CourseID.PNS courseID = KnightEDU.CourseID.PNS.create(prefix, number, suffix);

        // If course is in database, update course.
        if (db.containsCourse(courseID.toString()))
        {
            KnightEDU.Course c = db.getCourse(courseID.toString());
            Credits credits = null;

            // Update elements.
            c.setName(nameField.getText());
            c.setDescription(descriptionArea.getText());

            // At least one of the credit fields must contain data.
            if(minCreditsField.getText().equals("") && maxCreditsField.getText().equals(""))
                JOptionPane.showMessageDialog(CoursePlannerPanel.this, "Please enter min and/or max credits.");

            else if(!minCreditsField.getText().equals("") && !maxCreditsField.getText().equals(""))
            {
                int min = Integer.parseInt(minCreditsField.getText());
                int max = Integer.parseInt(maxCreditsField.getText());
                credits = Credits.createCredits(min, max);
            }
            else if(minCreditsField.getText().equals(""))
            {
                int cMax = Integer.parseInt(maxCreditsField.getText());
                credits = Credits.createCredits(cMax);
            }
            else
            {
                int cMin = Integer.parseInt(minCreditsField.getText());
                credits = Credits.createCredits(cMin);
            }

            // Update specified elements.
            c.setCredits(credits);
            c.setGradeType((Type) gradeTypeBox.getSelectedItem());

            db.updateCourse(c);
            updateCourseSchedules(courseID);
            JOptionPane.showConfirmDialog(CoursePlannerPanel.this, "Course Successfully Saved.");
        }

        // If course is not in database, add new course.
        else
        {
            Credits credits = null;
            if(minCreditsField.getText().equals("") && maxCreditsField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(CoursePlannerPanel.this, "Please enter min and/or max credits.");
                return;
            }

            else if(!minCreditsField.getText().equals("") && !maxCreditsField.getText().equals(""))
            {
                int min = Integer.parseInt(minCreditsField.getText());
                int max = Integer.parseInt(maxCreditsField.getText());
                credits = Credits.createCredits(min, max);
            }
            else if(minCreditsField.getText().equals("")){
                int c = Integer.parseInt(maxCreditsField.getText());
                credits = Credits.createCredits(c);
            }
            else {
                int c = Integer.parseInt(minCreditsField.getText());
                credits = Credits.createCredits(c);
            }


            Grade.Type type = (Type)gradeTypeBox.getSelectedItem();

            // Add the course to the database.
            //db.addCourse(String courseID, String name, String description, Credits credits, Grade.Type gradeType);
            db.addCourse(courseID.toString(), nameField.getText(), descriptionArea.getText(), credits, type);
            if (occasionalBox.isSelected())
            {
                db.addCourseSchedule(courseID, YearParity.EVEN, Term.OCCASIONAL);
                return;
            }

            updateCourseSchedules(courseID);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void updateCourseSchedules(CourseID courseID)
    {
        if (occasionalBox.isSelected())
        {
            db.removeCourseSchedule(courseID, YearParity.ODD, Term.FALL);
            db.removeCourseSchedule(courseID, YearParity.EVEN, Term.FALL);
            db.removeCourseSchedule(courseID, YearParity.ODD, Term.SPRING);
            db.removeCourseSchedule(courseID, YearParity.EVEN, Term.SPRING);
            db.removeCourseSchedule(courseID, YearParity.ODD, Term.SUMMER);
            db.removeCourseSchedule(courseID, YearParity.EVEN, Term.SUMMER);
            db.addCourseSchedule(courseID, YearParity.EVEN, Term.OCCASIONAL);
            return;
        }
        else
        {
            db.removeCourseSchedule(courseID, YearParity.ODD, Term.OCCASIONAL);
            db.removeCourseSchedule(courseID, YearParity.EVEN, Term.OCCASIONAL);
        }

        if (fallOddBox.isSelected())
             db.addCourseSchedule(courseID, YearParity.ODD, Term.FALL);
        else
            db.removeCourseSchedule(courseID, YearParity.ODD, Term.FALL);
        if (fallEvenBox.isSelected())
            db.addCourseSchedule(courseID, YearParity.EVEN, Term.FALL);
        else
            db.removeCourseSchedule(courseID, YearParity.EVEN, Term.FALL);
        if (springOddBox.isSelected())
            db.addCourseSchedule(courseID, YearParity.ODD, Term.SPRING);
        else
            db.removeCourseSchedule(courseID, YearParity.ODD, Term.SPRING);
        if (springEvenBox.isSelected())
            db.addCourseSchedule(courseID, YearParity.EVEN, Term.SPRING);
        else
            db.removeCourseSchedule(courseID, YearParity.EVEN, Term.SPRING);
        if (summerOddBox.isSelected())
            db.addCourseSchedule(courseID, YearParity.ODD, Term.SUMMER);
        else
            db.removeCourseSchedule(courseID, YearParity.ODD, Term.SUMMER);
        if (summerEvenBox.isSelected())
            db.addCourseSchedule(courseID, YearParity.EVEN, Term.SUMMER);
        else
            db.removeCourseSchedule(courseID, YearParity.EVEN, Term.SUMMER);
    }

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // Get courseID elements.
        String prefix = prefixField.getText();
        String number = numberField.getText();
        String suffix = suffixField.getText();
        // Convert to courseID.
        KnightEDU.CourseID.PNS courseID = KnightEDU.CourseID.PNS.create(prefix, number, suffix);
       
        db.removeCourse(courseID.toString());

    }//GEN-LAST:event_removeButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed


        KnightEDU.DBMS.Query.Course courseQuery = db.queryCourse();
        KnightEDU.DBMS.Query.CourseID.PNS courseIDQuery = (KnightEDU.DBMS.Query.CourseID.PNS) courseQuery.specifyCourseID();
        if (hasPrefix()) {
            try {
                courseIDQuery = courseIDQuery.containsPrefix(prefixField.getText());
            } catch (InvalidPrefixException ex) {
                Logger.getLogger(CoursePlannerPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (hasNumber()) {
            try {
                courseIDQuery = courseIDQuery.containsNumberEqualTo(numberField.getText());
            } catch (InvalidNumberException ex) {
                Logger.getLogger(CoursePlannerPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (hasSuffix()) {
            try {
                courseIDQuery = courseIDQuery.containsSuffix(suffixField.getText());
            } catch (InvalidSuffixException ex) {
                Logger.getLogger(CoursePlannerPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        courseQuery = courseIDQuery.build();
        if (hasName()) {
            courseQuery = courseQuery.nameContains(nameField.getText());
        }
        Set<KnightEDU.Course> results = courseQuery.invoke();

        DefaultListModel searchResultsListData = new DefaultListModel();
        for (KnightEDU.Course i : results)
        {
            searchResultsListData.addElement(i);
        }
        courseList.setModel(searchResultsListData);

    }//GEN-LAST:event_searchButtonActionPerformed

    private void gradeTypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeTypeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeTypeBoxActionPerformed

    private void prefixFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_prefixFieldActionPerformed
    {//GEN-HEADEREND:event_prefixFieldActionPerformed
        
}//GEN-LAST:event_prefixFieldActionPerformed

    private void addCoursePrereqsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoursePrereqsButtonActionPerformed

        String prefix = prefixField.getText();
        String number = numberField.getText();

        if (prefix.equals("") || number.equals("")) {
            JOptionPane.showMessageDialog(null, "Valid Course ID required.");
            return;
        }
        else
        {
            Prerequisites.Builder b;
            b = PrereqEdit.showDialog();

            if (b == null) return;

            if (prereqBuilder == null)
            {
                prereqBuilder = b;
                prereqTextArea.setText(prereqBuilder.build().toString());
                return;
            }

            prereqBuilder = prereqBuilder.and(b);

            prereqTextArea.setText(prereqBuilder.build().toString());
        }
    }//GEN-LAST:event_addCoursePrereqsButtonActionPerformed

    private void resetPrereqsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPrereqsButtonActionPerformed
        prereqBuilder = null;
        prereqTextArea.setText("");
    }//GEN-LAST:event_resetPrereqsButtonActionPerformed

    private void courseListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_courseListValueChanged
        //
        if (courseList.isSelectionEmpty())
            return;

        populateFields((Course) courseList.getSelectedValue());
        
//         prereqTextArea.setText("None");
    }//GEN-LAST:event_courseListValueChanged

    private void prefixFieldFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_prefixFieldFocusLost
    {//GEN-HEADEREND:event_prefixFieldFocusLost
        queryCourseID();
    }//GEN-LAST:event_prefixFieldFocusLost

    private void numberFieldFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_numberFieldFocusLost
    {//GEN-HEADEREND:event_numberFieldFocusLost
        queryCourseID();
    }//GEN-LAST:event_numberFieldFocusLost

    private void suffixFieldFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_suffixFieldFocusLost
    {//GEN-HEADEREND:event_suffixFieldFocusLost
        queryCourseID();
    }//GEN-LAST:event_suffixFieldFocusLost

    private void resetFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetFormActionPerformed
        // Clear all information in the form.
        prefixField.setText("");
        numberField.setText("");
        suffixField.setText("");

        minCreditsField.setText("");
        maxCreditsField.setText("");

        nameField.setText("");
        descriptionArea.setText("");
        prereqTextArea.setText("");

        courseList = null;

        fallOddBox.setSelected(false);
        springOddBox.setSelected(false);
        summerOddBox.setSelected(false);
        fallEvenBox.setSelected(false);
        springEvenBox.setSelected(false);
        summerEvenBox.setSelected(false);
        occasionalBox.setSelected(false);

    }//GEN-LAST:event_resetFormActionPerformed

    private void queryCourseID()
    {
        Course course = db.getCourse((prefixField.getText()+numberField.getText()+suffixField.getText()).toUpperCase());
        if (course != null)
            populateFields(course);
        else
            clearFields();
    }



    private void populateFields(Course course)
    {
//        Course selected = null;
//        selected = (Course) courseList.getSelectedValue();
        
        CourseID.PNS cID = (CourseID.PNS)course.getID();
        prefixField.setText(cID.getPrefix());
        numberField.setText(cID.getNumber());
        suffixField.setText(cID.getSuffix());

        Credits c = course.getCredits();
        minCreditsField.setText(Integer.toString(c.getMinCredits()));
        maxCreditsField.setText(Integer.toString(c.getMaxCredits()));

        nameField.setText(course.getName());
        descriptionArea.setText(course.getDescription());

        //if (course.getPrerequisites().toString().equals("") != true)
        prereqTextArea.setText(course.getPrerequisites().toString());


        fallOddBox.setSelected(false);
        springOddBox.setSelected(false);
        summerOddBox.setSelected(false);
        fallEvenBox.setSelected(false);
        springEvenBox.setSelected(false);
        summerEvenBox.setSelected(false);
        occasionalBox.setSelected(false);

        for (Course.Schedule i : course.getSchedules())
        {
            if (i.getTerm() == Term.FALL && i.getYearParity() == YearParity.ODD)
                fallOddBox.setSelected(true);

            if (i.getTerm() == Term.SPRING && i.getYearParity() == YearParity.ODD)
                springOddBox.setSelected(true);

            if (i.getTerm() == Term.SUMMER && i.getYearParity() == YearParity.ODD)
                summerOddBox.setSelected(true);                

            if (i.getTerm() == Term.FALL && i.getYearParity() == YearParity.EVEN)
                fallEvenBox.setSelected(true);

            if (i.getTerm() == Term.SPRING && i.getYearParity() == YearParity.EVEN)
                springEvenBox.setSelected(true);

            if (i.getTerm() == Term.SUMMER && i.getYearParity() == YearParity.EVEN)
                summerEvenBox.setSelected(true);
            if (i.getTerm() == Term.OCCASIONAL)
                occasionalBox.setSelected(true);
        }

    }

    private void clearFields()
    {
        minCreditsField.setText("");
        maxCreditsField.setText("");

        nameField.setText("");
        descriptionArea.setText("");
        prereqTextArea.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCoursePrereqsButton;
    private javax.swing.JPanel courseIDPanel;
    private javax.swing.JPanel courseInfoPanel;
    private javax.swing.JPanel courseInfoTopPanel;
    private javax.swing.JList courseList;
    private javax.swing.JScrollPane courseListScrollPane;
    private javax.swing.JPanel courseListingPanel;
    private javax.swing.JPanel courseNamePanel;
    private javax.swing.JLabel courseNumLab;
    private javax.swing.JPanel courseOptionsInsidePan;
    private javax.swing.JSeparator coursePlannerSeparator;
    private javax.swing.JLabel coursePrefixLab2;
    private javax.swing.JPanel courseSearchPan;
    private javax.swing.JLabel courseSuffixLab;
    private javax.swing.JLabel creditsMaxLab;
    private javax.swing.JLabel creditsMinLab;
    private javax.swing.JPanel creditsPanel;
    private javax.swing.JTextArea descriptionArea;
    private javax.swing.JPanel descriptionAreaPanel;
    private javax.swing.JScrollPane descriptionAreaScrollPane;
    private javax.swing.JCheckBox fallEvenBox;
    private javax.swing.JLabel fallLab;
    private javax.swing.JCheckBox fallOddBox;
    private javax.swing.JPanel gradePrefPan;
    private javax.swing.JPanel gradeTypeAndCreditsPanel;
    private javax.swing.JComboBox gradeTypeBox;
    private javax.swing.JLabel gradeTypeLabel;
    private javax.swing.JTextField maxCreditsField;
    private javax.swing.JPanel maxCreditsPanel;
    private javax.swing.JTextField minCreditsField;
    private javax.swing.JPanel minCreditsPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField numberField;
    private javax.swing.JPanel numberPanel;
    private javax.swing.JCheckBox occasionalBox;
    private javax.swing.JTextField prefixField;
    private javax.swing.JPanel prefixPanel;
    private javax.swing.JTextArea prereqTextArea;
    private javax.swing.JScrollPane prereqTextAreaScrollPane;
    private javax.swing.JPanel prereqsButtonsPanel;
    private javax.swing.JPanel prerequisitesPanel;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton resetForm;
    private javax.swing.JButton resetPrereqsButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel semOfferedPan;
    private javax.swing.JPanel semOfferedSemPan;
    private javax.swing.JSeparator semOfferedSeparator;
    private javax.swing.JCheckBox springEvenBox;
    private javax.swing.JLabel springLab;
    private javax.swing.JCheckBox springOddBox;
    private javax.swing.JTextField suffixField;
    private javax.swing.JPanel suffixPanel;
    private javax.swing.JCheckBox summerEvenBox;
    private javax.swing.JLabel summerLab;
    private javax.swing.JCheckBox summerOddBox;
    // End of variables declaration//GEN-END:variables


    public boolean hasCompleteCourseID()
    {
        if (!prefixField.getText().equals("") && !numberField.getText().equals(""))
            return true;
        else
            return false;
    }

    public boolean hasPartialCourseID()
    {
        if (nameField.getText().equals("") || numberField.getText().equals("") || suffixField.getText().equals(""))
            return true;
        else
            return false;
    }

    public boolean hasPrefix()
    {
        return !prefixField.getText().isEmpty();

    }

    public boolean hasNumber()
    {
        return !numberField.getText().isEmpty();
    }

    public boolean hasSuffix()
    {
        return !suffixField.getText().isEmpty();
    }

    public boolean hasName()
    {
        return !nameField.getText().isEmpty();
    }

    public boolean hasDescription()
    {
        if (descriptionArea.getText().equals(""))
            return true;
        else
            return false;
    }
}