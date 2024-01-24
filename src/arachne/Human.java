
package arachne;

public class Human extends NPC {
    private Powerup reward; 
    private int amtOfReward; 
    
    public Human(String name, String dialogue, Powerup p, int amt) {
        super(name, dialogue, p); 
        this.reward = p; 
        this.amtOfReward = amt; 
    }

    public void give(Player p, Quest q) {
        p.setQuest(q);
    }
    
    public void reward(Player p) {
        System.out.print(p.getName() + " has completed the quest! They have been rewarded with: "); 
        System.out.println(amtOfReward + " " + reward.getName()); 
        p.pStorage.store(this.reward, amtOfReward); 
    }
}
