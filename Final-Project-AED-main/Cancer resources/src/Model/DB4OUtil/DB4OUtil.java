/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DB4OUtil;

import Model.Design.OperateASystem;
import Model.EcoSystem;
import java.nio.file.Paths;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Predicate;
import com.db4o.ta.TransparentPersistenceSupport;

/**
 *
 * @author goutam
 */
public class DB4OUtil {
    
    private static final String FILENAME = Paths.get("DataBank.db4o").toAbsolutePath().toString(); // path to the data store
    private static DB4OUtil dB4OUtil;

    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    public static synchronized void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    public ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            if (db != null) {
            System.out.println("Database connection successful.");
        } else {
            System.out.println("Database connection failed: ObjectContainer is null.");
        }
            return db;
        } catch (Exception ex) {
        System.out.println("Error connecting to the database: " + ex.getMessage());
        ex.printStackTrace();
     return null;
        }
       // return null;
    }

    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer conn = createConnection();
         if (conn == null) {
        System.out.println("Failed to connect to the database. Exiting storeSystem method.");
        return;
    }
        deleteOldSystem(conn);
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public void deleteOldSystem(ObjectContainer conn) {
        ObjectSet<EcoSystem> systems = conn.query(new Predicate<EcoSystem>() {
            @Override
            public boolean match(EcoSystem et) {
                return true;
            }
        });
        for (EcoSystem ecoSystem : systems) {
            conn.delete(ecoSystem);
        }
    }

    public EcoSystem retrieveSystem() {
        ObjectContainer conn = createConnection();
        if (conn == null) {
        System.out.println("Failed to connect to the database. Exiting retrieveSystem method.");
        return null;
    }
        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class); // Change to the object you want to save
        EcoSystem system;
        if (systems.isEmpty()) {
            system = OperateASystem.configure();  // If there's no System in the record, create a new one
                    conn.store(system);
        conn.commit();
        } else {
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}
