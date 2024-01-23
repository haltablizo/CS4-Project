
package arachne;

public class Weapon implements Storeable {
    private String name; 
    
    public Weapon(String name) {
        this.name = name; 
    }
    
    public String getName() {
        return this.name; 
    }
    @Override
    public void store() {
        System.out.println("Weapon " + name + " was stored."); 
    }
}
