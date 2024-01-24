
package arachne;

import java.util.*;

public class Storage {
    private int maxNum; //max number of storeable items, array list 
    private String ownerName; 
    private Dictionary<Storeable, Integer> inventory = new Hashtable<>(); 

    private int silk; 
    
    public Storage(String owner, int max) {
        this.ownerName = owner; 
        this.maxNum = max; 
    }
    
    public void pickUpSilk(int amt) {
        silk += amt; 
    }
    
    public void store(Powerup item, int amt) {
        inventory.put(item, amt); 
        System.out.println("Stored " + item.getName() + " in inventory"); 
    }
    
    public void discard(Storeable item, int amt) {
        inventory.put(item, (inventory.get(item)-amt)); 
        System.out.println("Discarded " + item + " in inventory"); 
    }
    public void use(Powerup n, int amt) {
        inventory.put(n, inventory.get(n)-amt); 
    }
}
