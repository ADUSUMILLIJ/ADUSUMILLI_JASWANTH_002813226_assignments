/*
 * LoginSPJPanel.java
 *
 * Created on October 10, 2008, 8:51 AM
 */

package UserInterface.SalesPersonRole;
import Business.BusinessClass;
import Business.CustomerClass;
import Business.SalesPersonClass;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author goutam
 */
public class LoginSPJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private BusinessClass business;

    /** Creates new form LoginSupplier */
    public LoginSPJPanel(JPanel upc, BusinessClass business) {
        initComponents();
       userProcessContainer = upc;
       this.business=business;
       salesPersonJComboBox.removeAllItems();
       for(SalesPersonClass salesPerson : business.getSalesPersonDir().getSalesPrsnDir()) {
           salesPersonJComboBox.addItem(salesPerson);
       }
       populateCustomerTable();
    }
    
    private void populateCustomerTable()
    {
        DefaultTableModel dtm= (DefaultTableModel) customersJTable.getModel();
        dtm.setRowCount(0);
        
        for(CustomerClass customer:business.getCustomerDir().getCustomerDirectory())
        {
            Object row[]= new Object[2];
            row[0]=customer;
            row[1]=customer.getCustName();
            dtm.addRow(row);
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        findButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        salesPersonJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customersJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sales Person Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        findButton1.setBackground(new java.awt.Color(255, 204, 204));
        findButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        findButton1.setText("GO>>");
        findButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButton1ActionPerformed(evt);
            }
        });
        add(findButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Sales Person Login");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        salesPersonJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(salesPersonJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 150, 30));

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Please select Customer");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        customersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customersJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void findButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButton1ActionPerformed
        // TODO add your handling code here:
 SalesPersonClass salesPerson = (SalesPersonClass)salesPersonJComboBox.getSelectedItem();
        if(salesPerson==null)
        {
            JOptionPane.showMessageDialog(this,"Please select a Sales Person.","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        int selectedRow= customersJTable.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(this,"Please select a Customer.","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        CustomerClass customer=(CustomerClass) customersJTable.getValueAt(selectedRow, 0);
        BrseProdJPanel bpjp = new BrseProdJPanel(userProcessContainer, business, salesPerson,customer);
        userProcessContainer.add("BrowseProductsCustomer", bpjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_findButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable customersJTable;
    private javax.swing.JButton findButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox salesPersonJComboBox;
    // End of variables declaration//GEN-END:variables
    
}
