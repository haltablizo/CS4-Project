
package arachne;

public class Quest {
   private String title; 
   private int reqSilk; 
   private double reward; 
   private boolean questDone = false; 
   
   public Quest(String t, int r, int re) {
       this.title = t; 
       this.reqSilk = r;
       this.reward = re; 
   }
   
   public String getTitle() { 
       return this.title; 
   }
   public int getReqSilk() {
       return this.reqSilk; 
   }
   public double getReward() {
       return this.reward; 
   }
   public void complete() {
       questDone = true; 
   }
}
