package UI.AdminstrativeRole;

import Business.BusinessClass;
import UserInterface.SupplierRole.ManageProdCatalJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author VAMSI VAS
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private BusinessClass business7;
    public AdminWorkAreaJPanel(JPanel userProcessContainer,BusinessClass business) {
        
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business7=business;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MCJButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        MSPJButton = new javax.swing.JButton();
        managePButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MCJButton.setBackground(new java.awt.Color(255, 204, 204));
        MCJButton.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        MCJButton.setForeground(new java.awt.Color(51, 51, 51));
        MCJButton.setText("Manage Customers");
        MCJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCJButtonActionPerformed(evt);
            }
        });
        add(MCJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 260, -1));

        jLabel11.setFont(new java.awt.Font("Telugu MN", 3, 24)); // NOI18N
        jLabel11.setText("Adminstrative  Page");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        MSPJButton.setBackground(new java.awt.Color(255, 204, 204));
        MSPJButton.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        MSPJButton.setForeground(new java.awt.Color(51, 51, 51));
        MSPJButton.setText("Manage Sales Persons");
        MSPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSPJButtonActionPerformed(evt);
            }
        });
        add(MSPJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 260, -1));

        managePButton.setBackground(new java.awt.Color(255, 204, 204));
        managePButton.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        managePButton.setForeground(new java.awt.Color(51, 51, 51));
        managePButton.setText("Manage Product Catalog");
        managePButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePButtonActionPerformed(evt);
            }
        });
        add(managePButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 260, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void MCJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCJButtonActionPerformed
        ManageCustJPanel mcjp = new ManageCustJPanel(userProcessContainer, business7.getCustomerDir());
        userProcessContainer.add("ManageCustomersJPanel", mcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_MCJButtonActionPerformed

    private void MSPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSPJButtonActionPerformed
        // TODO add your handling code here:
        MSPJPanel mspjp = new MSPJPanel(userProcessContainer,business7.getSalesPersonDir());
        userProcessContainer.add("ManageSalesPersonsJPanel", mspjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_MSPJButtonActionPerformed

    private void managePButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePButtonActionPerformed

        ManageProdCatalJPanel mpcjp = new ManageProdCatalJPanel(userProcessContainer, business7.getXeroxSupplier());
        userProcessContainer.add("ManageProductCatalogJPanel", mpcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MCJButton;
    private javax.swing.JButton MSPJButton;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JButton managePButton;
    // End of variables declaration//GEN-END:variables
    
}
