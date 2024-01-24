
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
    
    public void store(Storeable item, int amt) {
        inventory.put(item, amt); 
    }
    
    public void discard(Storeable item, int amt) {
        inventory.put(item, (inventory.get(item)-amt)); 
    }
    public void use(Powerup n, int amt) {
        inventory.put(n, inventory.get(n)-amt); 
    }
}
