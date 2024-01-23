
package arachne;

public class Player {
    private String name; 
    private float popMeter = 0; 
    private int atk = 2; //attack with fists
    private int def = 1; //default def  
    private int hp; 
    private int maxHp = 20; 
    private Needle needle = null; 
    private Coat coat = null; 
    
    public Player(String name) {
        this.name = name; 
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
    
    public void setCoat(Coat c) {
        this.coat = c; 
    }
    public void setNeedle(Needle n){
        this.needle = n; 
    }
    
    public void reduceHP(int i){
        this.hp-=i;
    }

}
