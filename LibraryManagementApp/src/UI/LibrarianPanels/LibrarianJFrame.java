/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.LibrarianPanels;

import Business.Branch;
import Business.Business;
import Business.UserAccount;
import UI.MainJFrame;
import UI.SystemAdminPanels.UserRegistrationJPanel;

/**
 *
 * @author Prasad
 */
public class LibrarianJFrame extends javax.swing.JFrame {

    private final Business business;
    private final Branch branch;
    private final UserAccount useraccount;

    public LibrarianJFrame(Business business, Branch branch, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
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
        jPanel1 = new javax.swing.JPanel();
        lmBooksBtn = new javax.swing.JButton();
        lmMagsBtn = new javax.swing.JButton();
        lmAuthAndGenreBtn = new javax.swing.JButton();
        lmRentalReqBtn = new javax.swing.JButton();
        lmLogoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setDividerSize(10);

        lmBooksBtn.setText("Books");
        lmBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lmBooksBtnActionPerformed(evt);
            }
        });

        lmMagsBtn.setText("Magazines");
        lmMagsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lmMagsBtnActionPerformed(evt);
            }
        });

        lmAuthAndGenreBtn.setText("Authors and Genre");
        lmAuthAndGenreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lmAuthAndGenreBtnActionPerformed(evt);
            }
        });

        lmRentalReqBtn.setText("Rental Requests");
        lmRentalReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lmRentalReqBtnActionPerformed(evt);
            }
        });

        lmLogoutBtn.setText("Logout");
        lmLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lmLogoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lmBooksBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lmMagsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lmAuthAndGenreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lmRentalReqBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(lmLogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lmBooksBtn)
                .addGap(28, 28, 28)
                .addComponent(lmMagsBtn)
                .addGap(33, 33, 33)
                .addComponent(lmAuthAndGenreBtn)
                .addGap(29, 29, 29)
                .addComponent(lmRentalReqBtn)
                .addGap(86, 86, 86)
                .addComponent(lmLogoutBtn)
                .addContainerGap(263, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lmBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lmBooksBtnActionPerformed
        jSplitPane1.setRightComponent(new BooksJPanel(this.branch));
    }//GEN-LAST:event_lmBooksBtnActionPerformed

    private void lmMagsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lmMagsBtnActionPerformed
        jSplitPane1.setRightComponent(new MagazinesJPanel(this.branch));
    }//GEN-LAST:event_lmMagsBtnActionPerformed

    private void lmAuthAndGenreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lmAuthAndGenreBtnActionPerformed
        jSplitPane1.setRightComponent(new AuthorsAndGenreJPanel(this.branch));
    }//GEN-LAST:event_lmAuthAndGenreBtnActionPerformed

    private void lmLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lmLogoutBtnActionPerformed
        this.setVisible(false);
        new MainJFrame(business, branch, useraccount);
    }//GEN-LAST:event_lmLogoutBtnActionPerformed

    private void lmRentalReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lmRentalReqBtnActionPerformed
        jSplitPane1.setRightComponent(new CustomerRentalRequestsJPanel(this.branch));
    }//GEN-LAST:event_lmRentalReqBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LibrarianJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton lmAuthAndGenreBtn;
    private javax.swing.JButton lmBooksBtn;
    private javax.swing.JButton lmLogoutBtn;
    private javax.swing.JButton lmMagsBtn;
    private javax.swing.JButton lmRentalReqBtn;
    // End of variables declaration//GEN-END:variables
}
