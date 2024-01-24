
package arachne;

import java.util.*; 

public class Arachne {

    public static void main(String[] args) {
        Coat handMeDown = new Coat("Hand-Me-Down", 1);
        Needle stick = new Needle("Stick", 3); 
        Storage playerStorage = new Storage("Arachne", 5); 
        Player arachne = new Player("Arachne", handMeDown, stick, playerStorage); 
        Spider jadeneus = new Spider("Jadeneus", 2, 1, 5, 5, 3); 
        Powerup springWater = new Powerup("Spring water", 3, 0, 0, 0, 0); 
        playerStorage.store(springWater, 1);
        
        System.out.println("\nFirst scenario"); 
        arachne.attack(jadeneus); 
        jadeneus.attack(arachne); 
        arachne.defend(); 
        jadeneus.attack(arachne); 
        arachne.use(springWater, 1);  
        jadeneus.attack(arachne); 
        arachne.attack(jadeneus); 
        jadeneus.attack(arachne); 
        arachne.attack(jadeneus); 
        
        
        
        System.out.println("\nSecond scenario"); 

        Powerup peristalsis = new Powerup("Peristalsis", 0, 0, 5, 0, 0);
        Human francesca = new Human("Francesca", "Please get me 3 pieces of silk.", 
                peristalsis, 1); 
        Quest francescaQuest = new Quest("From Francesca to Paolo", 3, 15);
        
        arachne.interact(francesca);
        francesca.give(arachne, francescaQuest); 
        arachne.pursueQuest(); 
        francesca.reward(arachne); 
        
        
        System.out.println("\nThird scenario"); 
        Needle goldenStick = new Needle("Golden Stick", 10); 
        Storage erosStorage = new Storage("Eros", 5); 
        erosStorage.store(goldenStick, 1);

        Divine eros = new Divine("Eros", "I want peristalsis. "
                + "I will give you a golden stick in return.", 
                goldenStick, peristalsis, erosStorage); 
        arachne.trade(eros); 
        
    }
}
