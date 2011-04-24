/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CourseSearchDialog.java
 *
 * Created on Apr 23, 2011, 6:37:00 PM
 */

package knightrms;

/**
 *
 * @author Alexander Darino
 */
public class CourseSearchDialog extends javax.swing.JDialog {

    /** Creates new form CourseSearchDialog */
    public CourseSearchDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        searchButtonsPanel = new javax.swing.JPanel();
        searchOKButton = new javax.swing.JButton();
        searchCancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Course Search");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        courseIDPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("CourseID"));

        coursePrefixLab2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        coursePrefixLab2.setText("Prefix: ");
        prefixPanel.add(coursePrefixLab2);

        prefixField.setColumns(3);
        prefixField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefixFieldActionPerformed(evt);
            }
        });
        prefixPanel.add(prefixField);

        courseIDPanel.add(prefixPanel);

        numberPanel.setLayout(new java.awt.GridBagLayout());

        courseNumLab.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        courseNumLab.setText(" Number: ");
        numberPanel.add(courseNumLab, new java.awt.GridBagConstraints());

        numberField.setColumns(4);
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        suffixPanel.add(suffixField, gridBagConstraints);

        courseIDPanel.add(suffixPanel);

        getContentPane().add(courseIDPanel);

        courseNamePanel.setLayout(new java.awt.GridBagLayout());

        nameLabel.setText("Name:");
        courseNamePanel.add(nameLabel, new java.awt.GridBagConstraints());

        nameField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        courseNamePanel.add(nameField, gridBagConstraints);

        getContentPane().add(courseNamePanel);

        searchOKButton.setText("OK");
        searchButtonsPanel.add(searchOKButton);

        searchCancelButton.setText("Cancel");
        searchButtonsPanel.add(searchCancelButton);

        getContentPane().add(searchButtonsPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prefixFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefixFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_prefixFieldActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CourseSearchDialog dialog = new CourseSearchDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel courseIDPanel;
    private javax.swing.JPanel courseNamePanel;
    private javax.swing.JLabel courseNumLab;
    private javax.swing.JLabel coursePrefixLab2;
    private javax.swing.JLabel courseSuffixLab;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField numberField;
    private javax.swing.JPanel numberPanel;
    private javax.swing.JTextField prefixField;
    private javax.swing.JPanel prefixPanel;
    private javax.swing.JPanel searchButtonsPanel;
    private javax.swing.JButton searchCancelButton;
    private javax.swing.JButton searchOKButton;
    private javax.swing.JTextField suffixField;
    private javax.swing.JPanel suffixPanel;
    // End of variables declaration//GEN-END:variables

}
