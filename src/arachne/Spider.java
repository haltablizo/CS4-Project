
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
        return this.atk; 
    }     
    public int getHp() {
        return this.atk; 
    }    
    public int getMaxHp() {
        return this.atk; 
    }
    public int getAmtOfSilk() {
        return this.amtOfSilk; 
    }
    
    public void reduceHP(int i){
        this.hp-=i;
    }
   
    
    
}
