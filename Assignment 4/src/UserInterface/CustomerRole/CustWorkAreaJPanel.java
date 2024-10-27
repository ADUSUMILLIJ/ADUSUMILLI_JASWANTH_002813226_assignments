/*
 * ProductManagerWorkAreaJPanel.java
 *
 * Created on October 3, 2008, 8:06 AM
 */
package UserInterface.CustomerRole;

import Business.BusinessClass;
import Business.MasterOrderCatalClass;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ajayr
 */
public class CustWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private MasterOrderCatalClass masterOrderCatalog;
    private BusinessClass business;
    /** Creates new form ProductManagerWorkAreaJPanel */
    public CustWorkAreaJPanel(JPanel upc, BusinessClass business) {
        initComponents();
       this.userProcessContainer = upc;
       this.business=business;
       masterOrderCatalog = business.getMasterOrderCatal();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL1 = new javax.swing.JLabel();
        JL2 = new javax.swing.JLabel();
        viewCustJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JL1.setText("My Work Area (Customer Role)");
        add(JL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        JL2.setBackground(new java.awt.Color(0, 0, 0));
        JL2.setFont(new java.awt.Font("Vijaya", 1, 48)); // NOI18N
        JL2.setForeground(new java.awt.Color(0, 51, 51));
        JL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CustomerRole/bestbuy.gif"))); // NOI18N
        JL2.setText("Welcome To Black Market");
        JL2.setIconTextGap(7);
        add(JL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        viewCustJButton.setText("View Customer Orders");
        viewCustJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustJButtonActionPerformed(evt);
            }
        });
        add(viewCustJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewCustJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustJButtonActionPerformed
        LoginCustJPanel mspjp = new LoginCustJPanel(userProcessContainer,business);
        userProcessContainer.add("LoginCustomer", mspjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewCustJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL1;
    private javax.swing.JLabel JL2;
    private javax.swing.JButton viewCustJButton;
    // End of variables declaration//GEN-END:variables
}
