
package arachne;

public class Divine extends NPC {
    private Equipment reward; 
    public Divine(String name, String dialogue, Equipment e) {
        super(name, dialogue, e); 
        this.reward = e; 
    }
}
