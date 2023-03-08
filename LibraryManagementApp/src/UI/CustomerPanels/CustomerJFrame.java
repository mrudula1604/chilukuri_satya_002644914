/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CustomerPanels;

import Business.Branch;
import Business.BranchDirectory;
import Business.Business;
import UI.MainJFrame;
import Business.UserAccount;
import Customer.Customer;

/**
 *
 * @author chilukuri
 */
public class CustomerJFrame extends javax.swing.JFrame {

    
    private BranchDirectory branches;
    private Customer customer;
    private final Business business;
    private final Branch branch;
    private final UserAccount useraccount;
    
    
    public CustomerJFrame(BranchDirectory branches, Customer customer, Business business, Branch branch, UserAccount useraccount) {
       initComponents();
       this.setVisible(true);
       
       this.branches = branches;
       this.customer = customer;
       this.business = business;
       this.branch = branch;
       this.useraccount = useraccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        custViewBooksBtn = new javax.swing.JButton();
        custViewMagsBtn = new javax.swing.JButton();
        custRenRequestBtn = new javax.swing.JButton();
        custLogoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 51));
        jSplitPane1.setDividerLocation(200);

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        custViewBooksBtn.setText("Books");
        custViewBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custViewBooksBtnActionPerformed(evt);
            }
        });

        custViewMagsBtn.setText("Magazines");
        custViewMagsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custViewMagsBtnActionPerformed(evt);
            }
        });

        custRenRequestBtn.setText("Rental Requests");
        custRenRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custRenRequestBtnActionPerformed(evt);
            }
        });

        custLogoutBtn.setText("Logout");
        custLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custLogoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(custViewMagsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(custViewBooksBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(custRenRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(custLogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(custViewBooksBtn)
                .addGap(18, 18, 18)
                .addComponent(custViewMagsBtn)
                .addGap(18, 18, 18)
                .addComponent(custRenRequestBtn)
                .addGap(18, 18, 18)
                .addComponent(custLogoutBtn)
                .addContainerGap(411, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custViewBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custViewBooksBtnActionPerformed
        jSplitPane1.setRightComponent(new BooksJPanel(this.branches, this.customer));
    }//GEN-LAST:event_custViewBooksBtnActionPerformed

    private void custLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custLogoutBtnActionPerformed
        this.setVisible(false);
        new MainJFrame(business, branch, useraccount);
    }//GEN-LAST:event_custLogoutBtnActionPerformed

    private void custViewMagsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custViewMagsBtnActionPerformed
        jSplitPane1.setRightComponent(new MagazinesJPanel(this.branches, this.customer));
    }//GEN-LAST:event_custViewMagsBtnActionPerformed

    private void custRenRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custRenRequestBtnActionPerformed
        jSplitPane1.setRightComponent(new CustomerRentalRequestsJPanel(this.branches, this.customer));
    }//GEN-LAST:event_custRenRequestBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CustomerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton custLogoutBtn;
    private javax.swing.JButton custRenRequestBtn;
    private javax.swing.JButton custViewBooksBtn;
    private javax.swing.JButton custViewMagsBtn;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
