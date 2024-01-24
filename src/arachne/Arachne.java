
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
        
        arachne.attack(jadeneus); 
        jadeneus.attack(arachne); 
        arachne.defend(); 
        jadeneus.attack(arachne); 
        arachne.use(springWater, 1);  
        jadeneus.attack(arachne); 
        arachne.attack(jadeneus); 
        jadeneus.attack(arachne); 
        arachne.attack(jadeneus); 
        
    }
    
}
