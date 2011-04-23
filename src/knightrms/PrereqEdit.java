/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PrereqEdit.java
 *
 * Created on Apr 17, 2011, 7:13:30 PM
 */

package KnightRMS;

import KnightEDU.Prerequisites;
import java.awt.Frame;

/**
 *
 * @author Evan
 */
public class PrereqEdit extends javax.swing.JDialog {

    private KnightEDU.Prerequisites.Builder builder = null;

    /** Creates new form PrereqEdit */
    public static KnightEDU.Prerequisites.Builder showDialog(){
        PrereqEdit dialog = new PrereqEdit(null, true);
        return dialog.getPrerequisitesBuilder();
    }

    private PrereqEdit(Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        setVisible(true);
    }

    private KnightEDU.Prerequisites.Builder getPrerequisitesBuilder()
    {
        return builder;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prereqInfoPan = new javax.swing.JPanel();
        prefixLab = new javax.swing.JLabel();
        prefixField = new javax.swing.JTextField();
        prefixConstraintsLab = new javax.swing.JLabel();
        numberLab = new javax.swing.JLabel();
        numberField = new javax.swing.JTextField();
        numberConstraintsLab = new javax.swing.JLabel();
        suffixLab = new javax.swing.JLabel();
        suffixField = new javax.swing.JTextField();
        suffixConstraintsLab = new javax.swing.JLabel();
        minPassingGradeLab = new javax.swing.JLabel();
        minPassingGradeField = new javax.swing.JTextField();
        minPassingGradeConstraintsLab = new javax.swing.JLabel();
        prereqButtonPan = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Prerequisites");

        prereqInfoPan.setLayout(new java.awt.GridLayout(4, 3));

        prefixLab.setText(" Prefix:");
        prereqInfoPan.add(prefixLab);

        prefixField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefixFieldActionPerformed(evt);
            }
        });
        prereqInfoPan.add(prefixField);

        prefixConstraintsLab.setText(" (exactly 3 letters) ");
        prereqInfoPan.add(prefixConstraintsLab);

        numberLab.setText(" Number:");
        prereqInfoPan.add(numberLab);
        prereqInfoPan.add(numberField);

        numberConstraintsLab.setText(" (exactly 4 numbers) ");
        prereqInfoPan.add(numberConstraintsLab);

        suffixLab.setText(" Suffix:");
        prereqInfoPan.add(suffixLab);
        prereqInfoPan.add(suffixField);

        suffixConstraintsLab.setText(" (at most one letter) ");
        prereqInfoPan.add(suffixConstraintsLab);

        minPassingGradeLab.setText(" Minimum Passing Grade:     ");
        prereqInfoPan.add(minPassingGradeLab);
        prereqInfoPan.add(minPassingGradeField);

        minPassingGradeConstraintsLab.setText(" (based on grading preference) ");
        prereqInfoPan.add(minPassingGradeConstraintsLab);

        getContentPane().add(prereqInfoPan, java.awt.BorderLayout.CENTER);

        prereqButtonPan.setLayout(new java.awt.GridLayout(1, 0));

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        prereqButtonPan.add(okButton);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        prereqButtonPan.add(cancelButton);

        getContentPane().add(prereqButtonPan, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prefixFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefixFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prefixFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        
        // Get course ID elements
        String prefix = prefixField.getText();
        String number = numberField.getText();
        String suffix = suffixField.getText();

        // Get minimum passing grade
        String grade = minPassingGradeField.getText();

        if (minPassingGradeField.getText().equals(""))
        {
            builder = Prerequisites.Builder.course(KnightEDU.CourseID.PNS.create(prefix, number, suffix));
            dispose();
            return;
        }
        builder = Prerequisites.Builder.course(KnightEDU.CourseID.PNS.create(prefix, number, suffix),
                KnightEDU.Grade.Letter.create(grade));
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel minPassingGradeConstraintsLab;
    private javax.swing.JTextField minPassingGradeField;
    private javax.swing.JLabel minPassingGradeLab;
    private javax.swing.JLabel numberConstraintsLab;
    private javax.swing.JTextField numberField;
    private javax.swing.JLabel numberLab;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel prefixConstraintsLab;
    private javax.swing.JTextField prefixField;
    private javax.swing.JLabel prefixLab;
    private javax.swing.JPanel prereqButtonPan;
    private javax.swing.JPanel prereqInfoPan;
    private javax.swing.JLabel suffixConstraintsLab;
    private javax.swing.JTextField suffixField;
    private javax.swing.JLabel suffixLab;
    // End of variables declaration//GEN-END:variables

}
