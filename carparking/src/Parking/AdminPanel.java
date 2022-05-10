/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Parking;

/**
 *
 * @author ADMIN
 */
public class AdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public AdminPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parkingdetails = new javax.swing.JButton();
        userslist = new javax.swing.JButton();
        container = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        parkingdetails.setText("Parking Details");
        parkingdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parkingdetailsActionPerformed(evt);
            }
        });
        getContentPane().add(parkingdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, -1, -1));

        userslist.setText("User List");
        userslist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userslistActionPerformed(evt);
            }
        });
        getContentPane().add(userslist, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, -1, -1));

        container.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\OneDrive\\Documents\\carparking.jpg")); // NOI18N
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 350, 510));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\OneDrive\\Documents\\carparking.jpg")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userslistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userslistActionPerformed
        // TODO add your handling code here:
        new UserList().setVisible(true);
        dispose();
    }//GEN-LAST:event_userslistActionPerformed

    private void parkingdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parkingdetailsActionPerformed
        // TODO add your handling code here:
        new Details().setVisible(true);
        dispose();
    }//GEN-LAST:event_parkingdetailsActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel container;
    private javax.swing.JButton parkingdetails;
    private javax.swing.JButton userslist;
    // End of variables declaration//GEN-END:variables
}