/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */
package UserInterface.SupplierRole;

import Business.ProductClass;
import Business.SuppClass;
import Business.Utils.MyDbleVerifClass;
import Business.Utils.MyIntgrVerifClass;
import Business.Utils.MyStrngVerifClass;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ajayr
 */
public class CrteNewProdJPanel extends javax.swing.JPanel {

    private SuppClass supplier;
    private JPanel userProcessContainer;

    /**
     * Creates new form CreateProductJPanel
     */
    public CrteNewProdJPanel(JPanel userProcessContainer, SuppClass supplier) {
        initComponents();
        this.supplier = supplier;
        this.userProcessContainer = userProcessContainer;
        MyStrngVerifClass myStringVerifier= new MyStrngVerifClass();
        productNameField.setInputVerifier(myStringVerifier);
        MyDbleVerifClass myDoubleVerifier= new MyDbleVerifClass();
        floorPriceJTextField.setInputVerifier(myDoubleVerifier);
        targetPriceJTextField.setInputVerifier(myDoubleVerifier);
        ceilingPriceJTextField.setInputVerifier(myDoubleVerifier);
        MyIntgrVerifClass myIntegerVerifier = new MyIntgrVerifClass();
        availabilityField.setInputVerifier(myIntegerVerifier);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        targetPriceJTextField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        productNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        availabilityField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        floorPriceJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ceilingPriceJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create New Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Product ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 100, 30));

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 210, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Target Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 110, 30));

        targetPriceJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(targetPriceJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 160, 30));

        createButton.setBackground(new java.awt.Color(255, 204, 204));
        createButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createButton.setText("Add Product");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        backButton1.setBackground(new java.awt.Color(255, 204, 204));
        backButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Product Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 30));

        productNameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(productNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Product Avail:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 110, 30));

        availabilityField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(availabilityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Floor Price:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 110, 30));

        floorPriceJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(floorPriceJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ceiling Price:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 110, 30));

        ceilingPriceJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(ceilingPriceJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 160, 30));
    }// </editor-fold>//GEN-END:initComponents
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        if(productNameField.getText().trim().length()==0 
                || availabilityField.getText().trim().length()==0 
                || targetPriceJTextField.getText().trim().length()==0 
                || ceilingPriceJTextField.getText().trim().length()==0 
                || floorPriceJTextField.getText().trim().length()==0 )
        {
            JOptionPane.showMessageDialog(this, "Please enter all the values.","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int avail = Integer.parseInt(availabilityField.getText());
        Double targetPrice= Double.parseDouble(targetPriceJTextField.getText());
        Double ceilingPrice= Double.parseDouble(ceilingPriceJTextField.getText());
        Double floorPrice= Double.parseDouble(floorPriceJTextField.getText());
        
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
        
        ProductClass product = supplier.getProCatal().addProduct();
        product.setProdName(productNameField.getText());
        product.setRate(targetPrice);
        product.setCeiligRate(ceilingPrice);
        product.setFloorRate(floorPrice);
        product.setAvail(avail);
        JOptionPane.showMessageDialog(this,"Product Created!!", "Information",JOptionPane.INFORMATION_MESSAGE);

}//GEN-LAST:event_createButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availabilityField;
    private javax.swing.JButton backButton1;
    private javax.swing.JTextField ceilingPriceJTextField;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField floorPriceJTextField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField productNameField;
    private javax.swing.JTextField targetPriceJTextField;
    // End of variables declaration//GEN-END:variables
}
