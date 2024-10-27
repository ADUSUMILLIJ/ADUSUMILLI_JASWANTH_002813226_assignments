/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Organization.Organization;
import Model.Role.Role;
import Model.Role.SystemAdmin_Role;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jaswa
 */
public class EcoSystem extends Organization  implements Serializable{
    
    private ArrayList<Network> networks;

    private static EcoSystem business;

    public static EcoSystem getReferrence() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public EcoSystem() {
        super(null);
        networks = new ArrayList<>();
    }

    public ArrayList<Network> getNetworks() {
        return networks;
    }

    public Network addBuildedNetwork() {
        Network n = new Network();
        networks.add(n);
        return n;
    }

    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SystemAdmin_Role());
        return roles;
    }

    public boolean uniqueUserCheck(String u) {

        if (!this.getUserAccDir().uniqueAccountCheck(u)) {
            return false;
        }
        return true;
    }
    public boolean removeNetwork(String networkName) {
        for (Iterator<Network> it = networks.iterator(); it.hasNext(); ) {
            Network network = it.next();
            if (network.getNetwork_name().equals(networkName)) {
                it.remove();
                return true; // Return true when network is successfully removed
            }
        }
        return false; // Return false if network not found
    }
   public void saveEcoSystem() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ecosystem.dat"))) {
            out.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static EcoSystem loadEcoSystem() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ecosystem.dat"))) {
            return (EcoSystem) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new EcoSystem(); // create a new EcoSystem if file doesn't exist
        }
    }

}
