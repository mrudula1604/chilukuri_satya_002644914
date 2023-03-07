/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CustomerPanels;

import Business.Branch;
import Business.BranchDirectory;
import Customer.Customer;
import Material.Book;
import Services.RentalRequest;
import Services.RentalRequestDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prasad
 */
public class CustomerRentalRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LibRentalRequestsJPanel
     */
    private BranchDirectory branches;
    private Customer customer;
    DefaultTableModel renRequestsTableModel;
    
    public CustomerRentalRequestsJPanel() {
        initComponents();
        this.branches = branches;
        this.customer = customer;
        this.renRequestsTableModel = (DefaultTableModel) custRentalsJTable.getModel();
        
        populateBranches();
    }
    
    private void populateBranches()
    {
        for(Branch b : this.branches.getBranchesList())
        {
            rrSelectBranchCBox.addItem(b.getBranchId());
        }
    }
    
    private void displayRentalRequests(ArrayList<RentalRequest> rr) {
        if(rr.size() >= 0) {
            renRequestsTableModel.setRowCount(0);
            for(RentalRequest r: rr) {
                if(r.getCustomer().getPersonID().equals(this.customer.getPersonID()))
                {
                    Object row[] = new Object[7];
                    row[0] = r.getOrderId();
                    row[1] = r.getMaterialId();
                    row[2] = r.getCustomer().getPersonID();
                    row[3] = r.getBranch().getBranchId();
                    row[4] = r.getPrice();
                    row[5] = r.getStatus();
                    row[6] = r.getDuration();
                    renRequestsTableModel.addRow(row);
                }              
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
        custRentalsJTable = new javax.swing.JTable();
        returnBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rrSelectBranchCBox = new javax.swing.JComboBox<>();
        loadRRBtn = new javax.swing.JButton();

        custRentalsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "MaterialID", "Customer Id", "Branch Id", "Price", "Status", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        custRentalsJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(custRentalsJTable);

        returnBtn.setText("Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        loadRRBtn.setText("Load RentalRequests");
        loadRRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadRRBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(rrSelectBranchCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(loadRRBtn)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rrSelectBranchCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadRRBtn))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(returnBtn)
                .addGap(137, 137, 137))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        int selectedRowIndex = custRentalsJTable.getSelectedRow();
        String orderId = custRentalsJTable.getValueAt(selectedRowIndex, 0).toString();
        String status = custRentalsJTable.getValueAt(selectedRowIndex, 5).toString();
        String branchId = custRentalsJTable.getValueAt(selectedRowIndex, 3).toString();
        String customerId = custRentalsJTable.getValueAt(selectedRowIndex, 2).toString();
        String materialId = custRentalsJTable.getValueAt(selectedRowIndex, 1).toString();
        if (status != "returned")
        {
            
            Branch selectedBranch = this.branches.findBranch(branchId);

            RentalRequest currentOrder =  selectedBranch.getLibrary().getRentals().findRentalRequest(orderId);
            currentOrder.setStatus("returned");
            
            Book book = selectedBranch.getLibrary().getBooks().findBook(materialId);
            if (book != null)
            {
                book.setIsAvailable(true);
            }
            else
            {
                selectedBranch.getLibrary().getMagazines().findMagazine(materialId).setIsAvailable(true);
            }
            
            selectedBranch.getLibrary().getRentals().findRentalRequest(orderId).setStatus("returned");
            
            displayRentalRequests(selectedBranch.getLibrary().getRentals().getOrderlist());
        }
        else{
            JOptionPane.showMessageDialog(null, "This material is already returned");
        } 
    }//GEN-LAST:event_returnBtnActionPerformed

    private void loadRRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadRRBtnActionPerformed
        String branchId = rrSelectBranchCBox.getSelectedItem().toString();
        Branch selectedBranch = this.branches.findBranch(branchId);
        
        displayRentalRequests(selectedBranch.getLibrary().getRentals().getOrderlist());
    }//GEN-LAST:event_loadRRBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable custRentalsJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadRRBtn;
    private javax.swing.JButton returnBtn;
    private javax.swing.JComboBox<String> rrSelectBranchCBox;
    // End of variables declaration//GEN-END:variables
}
