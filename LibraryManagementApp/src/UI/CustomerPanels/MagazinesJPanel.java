/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CustomerPanels;

import Business.Branch;
import Business.BranchDirectory;
import Customer.Customer;
import Material.Magazine;
import Services.RentalRequestDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prasad
 */
public class MagazinesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MagazinesJPanel
     */
    private BranchDirectory branches;
    private Customer customer;
    DefaultTableModel magsTableModel;
    
    public MagazinesJPanel(BranchDirectory branches, Customer customer) {
        initComponents();
        this.branches = branches;
        this.customer = customer;
        this.magsTableModel = (DefaultTableModel) custMagsJtable.getModel();
        
        //displayBooks();
        populateBranches();
    }
    
    private void populateBranches()
    {
        for(Branch b : this.branches.getBranchesList())
        {
            selectBranchCBox.addItem(b.getBranchId());
        }
    }
    
    private void displayMagazines(ArrayList<Magazine> mags) {
        if(mags.size() >= 0) {
            magsTableModel.setRowCount(0);
            for(Magazine b: mags) {
                Object row[] = new Object[6];
                row[0] = b.getSerialNumber();
                row[1] = b.getName();
                row[2] = b.getRegisteredDate().toString();
                row[3] = b.getIsAvailable();
                row[4] = b.getCompanyName();
                row[5] = b.getIssueType();
                magsTableModel.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        custMagsJtable = new javax.swing.JTable();
        reqMagazineBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selectBranchCBox = new javax.swing.JComboBox<>();
        loadMagsBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        magPriceTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        magDurationTextField = new javax.swing.JTextField();

        custMagsJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "S.No", "Name", "Registred Date", "Is Available", "Company", "Issue Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(custMagsJtable);

        reqMagazineBtn.setText("Request");
        reqMagazineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqMagazineBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Select a Branch");

        loadMagsBtn.setText("Load Magazines");
        loadMagsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMagsBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Price");

        jLabel3.setText("Duration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(selectBranchCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(loadMagsBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(magPriceTextField)
                            .addComponent(magDurationTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addGap(92, 92, 92)
                        .addComponent(reqMagazineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(selectBranchCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadMagsBtn))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(magPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(magDurationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(reqMagazineBtn)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reqMagazineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqMagazineBtnActionPerformed
        int selectedRowIndex = custMagsJtable.getSelectedRow();
        String bookSerialNo = custMagsJtable.getValueAt(selectedRowIndex, 0).toString();
        boolean bookisAvailable = Boolean.valueOf(custMagsJtable.getValueAt(selectedRowIndex, 3).toString());
        if (bookisAvailable)
        {
            Float price = Float.valueOf(magPriceTextField.getText());
            int duration = Integer.valueOf(magDurationTextField.getText());

            String branchId = selectBranchCBox.getSelectedItem().toString();
            Branch selectedBranch = this.branches.findBranch(branchId);

            RentalRequestDirectory rd = selectedBranch.getLibrary().getRentals();
            rd.createOrder(customer, selectedBranch, bookSerialNo, duration, price);
            
            selectedBranch.getLibrary().getMagazines().findMagazine(branchId).setIsAvailable(false);
            
            displayMagazines(selectedBranch.getLibrary().getMagazines().getMagazinesList());
        }
        else{
            JOptionPane.showMessageDialog(null, "The selected magazine is not currently available");
        } 
    }//GEN-LAST:event_reqMagazineBtnActionPerformed

    private void loadMagsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMagsBtnActionPerformed
        String branchId = selectBranchCBox.getSelectedItem().toString();
        Branch selectedBranch = this.branches.findBranch(branchId);
        
        displayMagazines(selectedBranch.getLibrary().getMagazines().getMagazinesList());
    }//GEN-LAST:event_loadMagsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable custMagsJtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadMagsBtn;
    private javax.swing.JTextField magDurationTextField;
    private javax.swing.JTextField magPriceTextField;
    private javax.swing.JButton reqMagazineBtn;
    private javax.swing.JComboBox<String> selectBranchCBox;
    // End of variables declaration//GEN-END:variables
}
