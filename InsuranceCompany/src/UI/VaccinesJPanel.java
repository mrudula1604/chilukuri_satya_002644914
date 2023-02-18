/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Business.Catalog;
import Business.Vaccine;
import Business.VaccineCatalog;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prasad
 */
public class VaccinesJPanel extends javax.swing.JPanel {
    
    private Catalog catalog;
    DefaultTableModel vaccinesTableModel;
    Vaccine selectedVaccine;
    /**
     * Creates new form VaccinesJPanel
     */
    public VaccinesJPanel(Catalog catalog) {
        initComponents();
        
        this.catalog = catalog;
        this.vaccinesTableModel = (DefaultTableModel) vaccinesJTable.getModel();
        
        displayVaccines();
        
        updateVaccineButton.setEnabled(false);
    }
    
    public void displayVaccines() {
        ArrayList<Vaccine> vaccines = this.catalog.getVaccines().getVaccines();
        if(vaccines.size() >= 0) {
            vaccinesTableModel.setRowCount(0);
            for(Vaccine vac: vaccines) {
                Object row[] = new Object[2];
                row[0] = vac.getVaccineName();
                row[1] = vac.getDosage();
                vaccinesTableModel.addRow(row);
            }
        }
    }                                  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vaccineNameLabel = new javax.swing.JLabel();
        vaccineNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        vaccineDosageTextField = new javax.swing.JTextField();
        addVaccineButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccinesJTable = new javax.swing.JTable();
        viewVaccineDetailsButton = new javax.swing.JButton();
        deleteVaccineButton = new javax.swing.JButton();
        updateVaccineButton = new javax.swing.JButton();

        vaccineNameLabel.setText("Vaccine Name");

        vaccineNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vaccineNameTextFieldFocusLost(evt);
            }
        });
        vaccineNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineNameTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Dosage");

        addVaccineButton.setText("Add");
        addVaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVaccineButtonActionPerformed(evt);
            }
        });

        vaccinesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Vaccine Name", "Dosage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vaccinesJTable);

        viewVaccineDetailsButton.setText("View Vaccine Details");
        viewVaccineDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVaccineDetailsButtonActionPerformed(evt);
            }
        });

        deleteVaccineButton.setText("Delete Vaccine");
        deleteVaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVaccineButtonActionPerformed(evt);
            }
        });

        updateVaccineButton.setText("Update");
        updateVaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateVaccineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vaccineNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(addVaccineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(vaccineNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addComponent(vaccineDosageTextField))
                    .addComponent(updateVaccineButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(deleteVaccineButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewVaccineDetailsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vaccineNameLabel)
                            .addComponent(vaccineNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(vaccineDosageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addVaccineButton)
                            .addComponent(updateVaccineButton)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(viewVaccineDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteVaccineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void vaccineNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaccineNameTextFieldActionPerformed

    private void addVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVaccineButtonActionPerformed
        String name = vaccineNameTextField.getText();
        String dosage = vaccineDosageTextField.getText();
        
        VaccineCatalog vaccineCatalog = this.catalog.getVaccines();                
        vaccineCatalog.createVaccine(name, Double.valueOf(dosage));
        displayVaccines();
        
        vaccineNameTextField.setText("");
        vaccineDosageTextField.setText("");
    }//GEN-LAST:event_addVaccineButtonActionPerformed

    private void vaccineNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vaccineNameTextFieldFocusLost
        String vacName = vaccineNameTextField.getText();
        Boolean isUnique = this.catalog.getVaccines().checkIfVaccineUnique(vacName);
        if(isUnique) {
            
        } else {
            vaccineNameTextField.setText("");
            JOptionPane.showMessageDialog(null, "Vaccine already exists");
        }
    }//GEN-LAST:event_vaccineNameTextFieldFocusLost

    private void deleteVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVaccineButtonActionPerformed
        int selectedRow = vaccinesJTable.getSelectedRow();  
        if(selectedRow >= 0) {
            String vaccineName =  vaccinesJTable.getValueAt(selectedRow, 0).toString();
            this.catalog.getVaccines().removeVaccine(vaccineName); 
            displayVaccines();
        } else {
            
        }
    }//GEN-LAST:event_deleteVaccineButtonActionPerformed

    private void viewVaccineDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVaccineDetailsButtonActionPerformed
        int selectedRow = vaccinesJTable.getSelectedRow();
        if (selectedRow >= 0) {
            //this.selectedVaccine = (Vaccine) vaccinesJTable.getValueAt(selectedRow, 0);
            String vaccineName = vaccinesJTable.getValueAt(selectedRow, 0).toString();
            String vaccineDosage = vaccinesJTable.getValueAt(selectedRow, 1).toString();
            vaccineNameTextField.setText(String.valueOf(vaccineName));
            vaccineDosageTextField.setText(String.valueOf(vaccineDosage));
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row!");
        }
        
        updateVaccineButton.setEnabled(true);
        //addVaccineButton.setEnabled(false);
    }//GEN-LAST:event_viewVaccineDetailsButtonActionPerformed

    private void updateVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateVaccineButtonActionPerformed
        // update the observation object
        if (!vaccineNameTextField.getText().isEmpty()) {
            Vaccine vac = this.catalog.getVaccines().findVaccine(vaccineNameTextField.getText());
            vac.setVaccineName(vaccineNameTextField.getText());
            vac.setDosage(Double.valueOf(vaccineDosageTextField.getText()));
            
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to update");
        }
        
        vaccineNameTextField.setText("");
        vaccineDosageTextField.setText("");
        updateVaccineButton.setEnabled(false);
        //addVaccineButton.setEnabled(true);
        
        displayVaccines();
    }//GEN-LAST:event_updateVaccineButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVaccineButton;
    private javax.swing.JButton deleteVaccineButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateVaccineButton;
    private javax.swing.JTextField vaccineDosageTextField;
    private javax.swing.JLabel vaccineNameLabel;
    private javax.swing.JTextField vaccineNameTextField;
    private javax.swing.JTable vaccinesJTable;
    private javax.swing.JButton viewVaccineDetailsButton;
    // End of variables declaration//GEN-END:variables

    
}
