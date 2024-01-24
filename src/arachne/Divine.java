
package arachne;

public class Divine extends NPC {
    private Equipment reward; 
    public Storage dStorage; 
    private Powerup requirement; 
    private Needle owned; 
    
    public Divine(String name, String dialogue, Equipment e, Powerup p, Storage s) {
        super(name, dialogue, e); 
        this.reward = e; 
        this.requirement = p;
        this.dStorage = s; 
    }
    
    public Powerup getRequirement(){
        return this.requirement; 
    }
    
    public Equipment getReward() {
        return this.reward; 
    }
    
}
