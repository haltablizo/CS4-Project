
package arachne;

public class Player {
    private String name; 
    private float popMeter = 0; 
    private int atk = 10; 
    private int def = 7; 
    private int hp; 
    private int maxHp = 20; 
    
    public Player(String name, int hp) {
        name = this.name; 
        hp = maxHp; 
    }   
    
    public String getName() {
        return this.name; 
    }
    
    public float getPopMeter() {
        return this.popMeter; 
    }
    
    public int getAtk() {
        return this.atk; 
    }
    public int getDef() {
        return this.def; 
    }    
    public int getHp() {
        return this.hp; 
    }    
    public int getMaxHp() {
        return this.maxHp; 
    }
}
