
package arachne;

public class Needle extends Weapon {
    private int atkBonus; 
    
    public Needle(String name, int atkBonus) {
        super(name); 
        this.atkBonus = atkBonus; 
    }
    
    public int getAtkBonus() {
        return this.atkBonus; 
    }
}
