/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Analytics;

import Business.BusinessClass;
import Business.CustomerClass;
import Business.ProductClass;
import Business.SalesPersonClass;
import java.util.Collections;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author goutam
 */
public class SalesAnalyticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesAnalyticsJPanel
     */
    private JPanel userProcessContainer;
    private BusinessClass business;
    public SalesAnalyticsJPanel(JPanel userProcessContainer, BusinessClass business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        populateSaleCountAnalysis();
        populateTop3SalePersons();
        populateTopSoldProduct();
        populateSalePersonCommissions();
        populateTopCustomer();
    }
    
    private void populateTop3SalePersons()
    {
        Collections.sort(business.getSalesPersonDir().getSalesPrsnDir(), new SalesPersonClass());
        DefaultTableModel dtm=(DefaultTableModel) tSPJTable.getModel();
        dtm.setRowCount(0);
        int i=0;
        for(SalesPersonClass sp:business.getSalesPersonDir().getSalesPrsnDir())
        {
            Object row[]=new Object[3];
            row[0]=sp;
            row[1]=sp.getSalesPersId();
            row[2]=sp.getAbvTrgt()+sp.getBlwTrgt();
            dtm.addRow(row);
            i++;
            if(i==3)
            {
                break;
            }
        }
    }
    
    private void populateTopSoldProduct()
    {
      DefaultTableModel dtm = (DefaultTableModel) TSP1JTable.getModel();
dtm.setRowCount(0);

Collections.sort(business.getXeroxSupplier().getProCatal().getProductcatalog());
int i = 0;
for (ProductClass p : business.getXeroxSupplier().getProCatal().getProductcatalog()) {
    if (i == 1) {
        break;
    }

    Object[] row = new Object[2];
    row[0] = p;
    row[1] = p.getSoldCountNumber();
    dtm.addRow(row);

    i++;
}

    }
    
    private void populateSaleCountAnalysis()
    {
        DefaultTableModel dtm=(DefaultTableModel) SCAJTable.getModel();
        dtm.setRowCount(0);
        for(SalesPersonClass sp:business.getSalesPersonDir().getSalesPrsnDir())
        {
            Object row[]=new Object[4];
            row[0]=sp;
            row[1]=sp.getSalesPersId();
            row[2]=sp.getAbvTrgt();
            row[3]=sp.getBlwTrgt();
            dtm.addRow(row);
        }
    }
    
    private void populateSalePersonCommissions()
    {
        Collections.sort(business.getSalesPersonDir().getSalesPrsnDir());
        DefaultTableModel dtm=(DefaultTableModel) SPCJTable.getModel();
        dtm.setRowCount(0);
        for(SalesPersonClass sp:business.getSalesPersonDir().getSalesPrsnDir())
        {
            Object row[]=new Object[3];
            row[0]=sp;
            row[1]=sp.getSalesPersId();
            row[2]=sp.getTotalComm();
            dtm.addRow(row);
        }
    }
    
    private void populateTopCustomer()
    {
        Collections.sort(business.getCustomerDir().getCustomerDirectory());
        DefaultTableModel dtm=(DefaultTableModel) bestCustJTable.getModel();
        dtm.setRowCount(0);
        int i=0;
        for(CustomerClass c:business.getCustomerDir().getCustomerDirectory())
        {
            Object row[]=new Object[3];
            row[0]=c;
            row[1]=c.getCustID();
            row[2]=c.getBuyCountNumber();
            dtm.addRow(row);
            i++;
            if(i==1)
            {
                break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tSPJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TSP1JTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        SCAJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        SPCJTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        bestCustJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sales Analytics");

        jLabel2.setText("Top 3 Sales Persons By Sales Volume:");

        tSPJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales Person Name", "ID", "Sales Volume"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tSPJTable);

        jLabel3.setText("Top Product By Sales Volume:");

        TSP1JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Sold Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TSP1JTable);

        SCAJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales Person Name", "ID", "Above Target", "Below Target"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(SCAJTable);

        jLabel4.setText("Sales Person Sale Counts:");

        SPCJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales Person Name", "ID", "Commission"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(SPCJTable);

        jLabel5.setText("Commission Paid to each Sales Person:");

        jLabel6.setText("Best Customer:");

        bestCustJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Customer ID", "Sales Volume"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(bestCustJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SCAJTable;
    private javax.swing.JTable SPCJTable;
    private javax.swing.JTable TSP1JTable;
    private javax.swing.JTable bestCustJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tSPJTable;
    // End of variables declaration//GEN-END:variables
}
