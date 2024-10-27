/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Role.Role;
import Model.WorkQueue.Work_Queue;
import java.util.ArrayList;

/**
 *
 * @author VAMSI VAS
 */
public class MedicalEquipStoreEnterPrise extends EnterPrise {

    private Work_Queue equipmentQueueTask;

    public MedicalEquipStoreEnterPrise(String name) {

        super(name, EnterPrise.EntType.MedicalEquiPantry);
        equipmentQueueTask = new Work_Queue();

    }

//override
    @Override
    public ArrayList<Role> getRole() {
        return null;
    }

    public Work_Queue getEquipmentQueueTask() {
        return equipmentQueueTask;
    }

    public void setEquipmentQueueTask(Work_Queue equipmentQueueTask) {
        this.equipmentQueueTask = equipmentQueueTask;
    }

}
