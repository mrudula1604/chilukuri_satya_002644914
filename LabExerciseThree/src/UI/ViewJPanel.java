/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Application;
import Model.Observation;
import Model.VitalSignHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mrudula
 */
public class ViewJPanel extends javax.swing.JPanel {

    private Application application;
    DefaultTableModel viewtableModel;
    Observation selectedObservation;

    /**
     * Creates new form ViewJPanel
     */
    ViewJPanel(Application application) {
        initComponents();

        this.application = application;
        this.viewtableModel = (DefaultTableModel) observationTable.getModel();

        // display the vital sign observations
        displayObservations();

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
        fieldObservationID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldBloodPressure = new javax.swing.JTextField();
        fieldTemperature1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        observationTable = new javax.swing.JTable();
        viewObservationBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("VIEW AND UPDATE A VITAL SIGN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 190, 40));

        fieldObservationID.setEnabled(false);
        add(fieldObservationID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 120, 30));

        jLabel2.setText("Blood Pressure");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        add(fieldBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 120, 30));
        add(fieldTemperature1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 120, 30));

        jLabel3.setText("ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setText("Temperature");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        updateBtn.setText("UPDATE OBSERVATION");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        observationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Temperature", "BP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(observationTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, 340));

        viewObservationBtn.setText("VIEW DETAILS");
        viewObservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewObservationBtnActionPerformed(evt);
            }
        });
        add(viewObservationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:

        // update the observation object
        if (!fieldObservationID.getText().isEmpty()) {

            // call the findObservation method
            Observation o = this.application.getHistory().findObservation(Integer.valueOf(fieldObservationID.getText()));
            o.setBloodPressure(Double.valueOf(fieldBloodPressure.getText()));
            o.setTemperature(Double.valueOf(fieldTemperature1.getText()));

            //  or
            // use the seletedObservation member we defined at the top of this class
//            this.selectedObservation.setBloodPressure(Double.valueOf(fieldBloodPressure.getText()));
//            this.selectedObservation.setTemperature(Double.valueOf(fieldTemperature1.getText()));
            
        } else {
            JOptionPane.showMessageDialog(null, "You have not made any selection");
        }
        
        displayObservations();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void viewObservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewObservationBtnActionPerformed
        // TODO add your handling code here:

        // what was clicked? Get the row in the table that was clicked
        int selectedRow = observationTable.getSelectedRow();

        if (selectedRow >= 0) {

            // we can directly fetch the Observation object from the Zeroth position
            this.selectedObservation = (Observation) observationTable.getValueAt(selectedRow, 0);

            // fill all the text fields
            fieldObservationID.setText(String.valueOf(this.selectedObservation.getObservationId()));
            fieldBloodPressure.setText(String.valueOf(this.selectedObservation.getBloodPressure()));
            fieldTemperature1.setText(String.valueOf(this.selectedObservation.getTemperature()));

        } else {
            // no selection made by the user

            JOptionPane.showMessageDialog(null, "Please select a row!");
        }

    }//GEN-LAST:event_viewObservationBtnActionPerformed

    public void displayObservations() {
        VitalSignHistory history = this.application.getHistory();

        if (history.getVitalSignHistory().size() > 0) {
            // display

            viewtableModel.setRowCount(0);
            for (Observation o : history.getVitalSignHistory()) {
                // number of columns in the table = 3 and row should be framed

                Object row[] = new Object[3];
                row[0] = o;
                row[1] = o.getTemperature();
                row[2] = o.getBloodPressure();

                // add the row to the table
                viewtableModel.addRow(row);

            }

        } else {
            System.out.print("Empty list");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldBloodPressure;
    private javax.swing.JTextField fieldObservationID;
    private javax.swing.JTextField fieldTemperature1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable observationTable;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewObservationBtn;
    // End of variables declaration//GEN-END:variables
}
