/*
 * LoginSalesPerson.java
 *
 * Created on October 10, 2008, 8:51 AM
 */
package UserInterface.CustomerRole;

import Business.BusinessClass;
import Business.CustomerClass;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ajayr
 */
public class LoginCustJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private BusinessClass business;

    /**
     * Creates new form LoginSupplier
     */
    public LoginCustJPanel(JPanel upc, BusinessClass business) {
        initComponents();
        userProcessContainer = upc;
        this.business = business;
        SPJComboBox.removeAllItems();
        for (CustomerClass customer : business.getCustomerDir().getCustomerDirectory()) {
            SPJComboBox.addItem(customer);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl1 = new javax.swing.JLabel();
        fb1 = new javax.swing.JButton();
        jl2 = new javax.swing.JLabel();
        SPJComboBox = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl1.setText("Customer Name");
        add(jl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        fb1.setText("GO>>");
        fb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb1ActionPerformed(evt);
            }
        });
        add(fb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, 30));

        jl2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl2.setText("Customer Login");
        add(jl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        SPJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(SPJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void fb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb1ActionPerformed
       // TODO add your handling code here:
CustomerClass customer = (CustomerClass) SPJComboBox.getSelectedItem();
CardLayout layout = (CardLayout) userProcessContainer.getLayout();

if (customer == null) {
    JOptionPane.showMessageDialog(this, "Please select a Customer.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

ViewCustOrdersJPanel mspjp = new ViewCustOrdersJPanel(userProcessContainer, business.getMasterOrderCatal(), customer);
userProcessContainer.add("ViewCustomerOrdersJPanel", mspjp);
layout.next(userProcessContainer);

    }//GEN-LAST:event_fb1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox SPJComboBox;
    private javax.swing.JButton fb1;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    // End of variables declaration//GEN-END:variables

}