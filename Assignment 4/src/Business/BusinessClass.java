package Business;

/**
 *
 * @author ajayr
 */
public class BusinessClass {

    private SuppClass xeroxSupplier;
    private MasterOrderCatalClass masterOrderCatal;
    private CustDir customerDir;
    private SalesPersonDirClass salesPersonDir;
    
    public BusinessClass() {
        xeroxSupplier= new SuppClass();
        masterOrderCatal = new MasterOrderCatalClass();
        customerDir= new CustDir();
        salesPersonDir= new SalesPersonDirClass();
        inFile();
    }

    public MasterOrderCatalClass getMasterOrderCatal() {
        return masterOrderCatal;
    }

    public void setMasterOrderCatal(MasterOrderCatalClass masterOrderCatal) {
        this.masterOrderCatal = masterOrderCatal;
    }

    public SuppClass getXeroxSupplier() {
        return xeroxSupplier;
    }

    public void setXeroxSupplier(SuppClass xeroxSupplier) {
        this.xeroxSupplier = xeroxSupplier;
    }

    public CustDir getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(CustDir customerDir) {
        this.customerDir = customerDir;
    }

    public SalesPersonDirClass getSalesPersonDir() {
        return salesPersonDir;
    }

    public void setSalesPersonDir(SalesPersonDirClass salesPersonDir) {
        this.salesPersonDir = salesPersonDir;
    }
    
    private void inFile()
    {
        CustomerClass c1= customerDir.addCustData();
c1.setCustName("AlphaOne");
c1.setAddr("GalaxyWay 101");
c1.setPhnNumb("1122334455");

CustomerClass c2= customerDir.addCustData();
c2.setCustName("BetaTwo");
c2.setAddr("StarRoute 202");
c2.setPhnNumb("2233445566");

SalesPersonClass sp1= salesPersonDir.addSalesPrsnData();
sp1.setSalesPersName("OrionX");
sp1.setFloorComm(3);
sp1.setCeilComm(10);

SalesPersonClass sp2= salesPersonDir.addSalesPrsnData();
sp2.setSalesPersName("CassiopeiaY");
sp2.setFloorComm(4);
sp2.setCeilComm(11);

SalesPersonClass sp3= salesPersonDir.addSalesPrsnData();
sp3.setSalesPersName("AndromedaZ");
sp3.setFloorComm(5);
sp3.setCeilComm(13);

SalesPersonClass sp4= salesPersonDir.addSalesPrsnData();
sp4.setSalesPersName("SiriusV");
sp4.setFloorComm(6);
sp4.setCeilComm(12);


ProductClass p1= xeroxSupplier.getProCatal().addProduct();
p1.setProdName("NovaA");
p1.setRate(200);
p1.setFloorRate(180);
p1.setCeiligRate(220);
p1.setAvail(60);

ProductClass p2= xeroxSupplier.getProCatal().addProduct();
p2.setProdName("PulsarB");
p2.setRate(350);
p2.setFloorRate(330);
p2.setCeiligRate(380);
p2.setAvail(30);

ProductClass p3= xeroxSupplier.getProCatal().addProduct();
p3.setProdName("QuasarC");
p3.setRate(500);
p3.setFloorRate(470);
p3.setCeiligRate(550);
p3.setAvail(40);

        
    }
}
