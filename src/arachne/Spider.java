
package arachne;


public class Spider {
    private String name; 
    private int atk; 
    private int def; 
    private int hp;
    private int maxHp; 
    private int amtOfSilk; 
    
    public Spider(String n, int a, int d, int h, int m, int amt) {
        this.name = n; 
        this.atk = a; 
        this.def = d; 
        this.hp = h; 
        this.maxHp = m; 
        this.amtOfSilk = amt; 
    }
    
    public String getName() {
        return this.name; 
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
    public int getAmtOfSilk() {
        return this.amtOfSilk; 
    }
    
    public void reduceHP(int i){
        this.hp-=i;
    }
   
    public void attack(Player p) {
        if (this.getAtk() > p.getDef()) {
            if (p.getCurDef()) {
                p.reduceHP(this.getAtk()-p.getDef());
                p.removeDef();
            } 
            else {
                p.reduceHP(this.getAtk());

            }
            System.out.println(p.getName() + " was attacked! Their current HP: " + p.getHp()); 
            
        }
        else {
            System.out.println(this.getName() + " did not do any damage!"); 
        }
    }
    
}
