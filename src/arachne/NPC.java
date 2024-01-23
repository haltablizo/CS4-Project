
package arachne;

public abstract class NPC {
    private String name;
    private String dialogue; 
    private String rewardType; 
    
    public NPC(String name, String dialogue, String rewardType) {
        this.name = name; 
        this.dialogue = dialogue; 
        this.rewardType = rewardType; 
    }
    
    public String getName() {
        return this.name; 
    }     
    public String getDialogue() {
        return this.name; 
    }    
    public String getRewardType() {
        return this.name; 
    }
}
