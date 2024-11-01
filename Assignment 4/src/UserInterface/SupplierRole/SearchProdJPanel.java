package UserInterface.SupplierRole;

import Business.ProductClass;
import Business.SuppClass;
import Business.Utils.MyIntgrVerifClass;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author goutam
 */
public class SearchProdJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    SuppClass supplier;

    public SearchProdJPanel(JPanel upc, SuppClass s) {
        initComponents();
        userProcessContainer = upc;
        supplier = s;
        MyIntgrVerifClass myIntegerVerifier = new MyIntgrVerifClass();
        txtId.setInputVerifier(myIntegerVerifier);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Search for Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 25, -1, 52));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product Id");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 116, -1, -1));

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 145, 250, -1));

        btnSearch.setBackground(new java.awt.Color(255, 204, 204));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setText("Search Now >>");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 144, 160, -1));

        btnBack.setBackground(new java.awt.Color(255, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       int productId = Integer.parseInt(txtId.getText());
ProductClass p = supplier.getProCatal().searchProduct(productId);
CardLayout layout = (CardLayout) userProcessContainer.getLayout();

if (p != null) {
    ViewProductDetailJPanel vpdjp = new ViewProductDetailJPanel(userProcessContainer, p);
    userProcessContainer.add("SearchResultJPanel", vpdjp);
    layout.next(userProcessContainer);
} else {
    JOptionPane.showMessageDialog(null, "Nothing found", "No result found matching your criteria!!", JOptionPane.WARNING_MESSAGE);
}

}//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProdCatalJPanel manageProductCatalogJPanel = (ManageProdCatalJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
