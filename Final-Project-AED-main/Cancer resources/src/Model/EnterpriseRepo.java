/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author VAMSI VAS
 */
public class EnterpriseRepo {
    
private ArrayList<EnterPrise> enterpRepo;


public EnterpriseRepo(){

enterpRepo = new ArrayList<>();

}

    public ArrayList<EnterPrise> getEnterpRepo() {
        return enterpRepo;
    }


  public EnterPrise AddEnterPrise(String name, EnterPrise.EntType type){
  EnterPrise enterprise = null;
 if (null != type)switch (type) {
        case Hospital:
            enterprise = new HospitalEnterPrise(name);
            enterpRepo.add(enterprise);
            break;
        case Supplier:
            enterprise = new EnterpriseWholesale(name);
            enterpRepo.add(enterprise);
            break;
        case Logistics:
            enterprise = new EnterpriseWholesale(name);
            enterpRepo.add(enterprise);
            break;
        case MedicalEquiPantry:
            enterprise = new MedicalEquipStoreEnterPrise(name);
            enterpRepo.add(enterprise);
            break;
        case Pharmacy:
            enterprise = new Drug_Ent(name);
            enterpRepo.add(enterprise);
            break;
        default:
            break;
    }

return enterprise;
}
  public boolean removeEnterprise(String enterpriseName) {
        return enterpRepo.removeIf(enterprise -> enterprise.getOrgName().equals(enterpriseName));
    }

}
