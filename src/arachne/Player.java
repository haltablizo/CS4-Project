
package arachne;

public class Player {
    private String name; 
    private float popMeter = 0; 
    private int atk; //attack with fists
    private int def; //default def  
    private int hp; 
    private int maxHp = 20; 
    private Coat coat; 
    private Needle needle; 
    private boolean curDef = false; //checks if player is "defending" for this round 
    
    public Player(String name, Coat c, Needle n) {
        this.name = name; 
        this.atk = n.getAtkBonus(); 
        this.def = c.getDefBonus(); 
        this.coat = c; 
        this.needle = n;
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
    public Coat getCoat() {
        return this.coat; 
    }
    
    public Needle getNeedle() {
        return this.needle; 
    }
    
    public boolean getCurDef() {
        return this.curDef; 
    }
    
    public void setCoat(Coat c) {
        this.coat = c; 
        this.def = c.getDefBonus();
    }
    public void setNeedle(Needle n){
        this.needle = n; 
        this.atk = n.getAtkBonus(); 
    }
    
    public void reduceHP(int i){
        this.hp-=i;
    }

    public void attack(Spider s) {
        System.out.println(this.getName() + " used attack!"); 
        if (this.getAtk() > s.getDef()) {
            s.reduceHP(this.getAtk()-s.getDef()); 
            System.out.println(s.getName() + " was attacked! Their current HP: " + s.getHp()); 
            
        }
        else {
            System.out.println(this.getName() + " did not do any damage!"); 
        }
    }
    public void defend() { 
        this.curDef = true; 
    }
    public void removeDef() {
        this.curDef = false; 
    }
}
