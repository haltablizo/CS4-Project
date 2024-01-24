
package arachne;

public abstract class NPC {
    private String name;
    private String dialogue; 
    private Storeable rewardType; 
    
    public NPC(String name, String dialogue, Storeable reward) {
        this.name = name; 
        this.dialogue = dialogue; 
        this.rewardType = reward; 
    }
    
    public String getName() {
        return this.name; 
    }     
    public String getDialogue() {
        return this.dialogue; 
    }    
    public Storeable getRewardType() {
        return this.rewardType; 
    }
}
