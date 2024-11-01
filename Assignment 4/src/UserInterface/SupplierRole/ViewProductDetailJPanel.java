package UserInterface.SupplierRole;

import Business.ProductClass;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author goutam
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ProductClass product;
    public ViewProductDetailJPanel(JPanel upc, ProductClass p) {
        initComponents();
        userProcessContainer = upc;
        product = p;
        prodNameField.setText(p.getProdName());
        idField.setText(String.valueOf(p.getModelNumb()));
        TPJTextField.setText(String.valueOf(p.getRate()));
        FPJTextField.setText(String.valueOf(p.getFloorRate()));
        CPJTextField.setText(String.valueOf(p.getCeiligRate()));
        availField.setText(String.valueOf(p.getAvail()));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TPJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        prodNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        availField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FPJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CPJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Product Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 25, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Update Product");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 176, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 70, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Product ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 100, 30));

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 210, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Target Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 110, 30));

        TPJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(TPJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 160, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Product Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 30));

        prodNameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(prodNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Product Avail:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 110, 30));

        availField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(availField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Floor Price:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 110, 30));

        FPJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(FPJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ceiling Price:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 110, 30));

        CPJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(CPJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        prodNameField.setEditable(true);
        FPJTextField.setEditable(true);
        TPJTextField.setEditable(true);
        CPJTextField.setEditable(true);
        availField.setEditable(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
}//GEN-LAST:event_btnUpdateActionPerformed

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
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(prodNameField.getText().trim().length()==0 
                || availField.getText().trim().length()==0 
                || TPJTextField.getText().trim().length()==0 
                || CPJTextField.getText().trim().length()==0 
                || FPJTextField.getText().trim().length()==0 )
        {
            JOptionPane.showMessageDialog(this, "Please enter all the values.","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int avail = Integer.parseInt(availField.getText());
        Double targetPrice= Double.parseDouble(TPJTextField.getText());
        Double ceilingPrice= Double.parseDouble(CPJTextField.getText());
        Double floorPrice= Double.parseDouble(FPJTextField.getText());
        
        if(ceilingPrice<targetPrice)
        {
            JOptionPane.showMessageDialog(this,"Ceiling price cannot be less than Target Price", "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(floorPrice>targetPrice)
        {
            JOptionPane.showMessageDialog(this,"Floor price cannot be greater than Target Price", "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        product.setRate(targetPrice);
        product.setFloorRate(floorPrice);
        product.setCeiligRate(ceilingPrice);
        product.setProdName(prodNameField.getText());
        product.setAvail(avail);
        
        prodNameField.setEditable(false);
        FPJTextField.setEditable(false);
        TPJTextField.setEditable(false);
        CPJTextField.setEditable(false);
        availField.setEditable(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPJTextField;
    private javax.swing.JTextField FPJTextField;
    private javax.swing.JTextField TPJTextField;
    private javax.swing.JTextField availField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField prodNameField;
    // End of variables declaration//GEN-END:variables
}
