
package arachne.Screens;

import javax.swing.*;
import java.awt.*;

public class InventoryScreen extends JFrame {
    public InventoryScreen() {
        
        //setups
        super("Inventory");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 750);
        this.setResizable(false);
        
        //creating panels
        JPanel north = new JPanel();         
        JPanel west = new JPanel(); 
        JPanel east = new JPanel(); 
        JPanel center = new JPanel(); 
        
        //north
        JLabel screenTitle = new JLabel();
        screenTitle.setText("INVENTORY");
        JButton closeButton = new JButton("CLOSE");
        north.add(screenTitle);
        north.add(closeButton); 
        
        //west
        west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
        JButton potionButton = new JButton("potion"); 
        JButton weaponButton = new JButton("weapon"); 
        west.setPreferredSize(new Dimension(200, 750));
        potionButton.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        weaponButton.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        west.add(potionButton);     
        west.add(weaponButton);
        
        //east
        east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));

        ImageIcon image = new ImageIcon(InventoryScreen.class.getResource("wireframe.jpg"));
        JLabel itemImg = new JLabel(image);
        itemImg.setSize(200,200);
        
        JPanel eastButtons = new JPanel(); 

        JButton useButton = new JButton("USE"); 
        JButton dropButton = new JButton("DROP");
        
        
        eastButtons.add(useButton);
        eastButtons.add(dropButton);
        
        JLabel itemDesc = new JLabel(); 
        itemDesc.setText("Lorem ipsum dolor");
        
        east.add(itemImg);
        east.add(itemDesc);
        east.add(eastButtons);
        
        //center        

        center.setLayout(new GridLayout(4,4));

        for (int i=0; i<16; i++) {
            JButton centerButton = new JButton("" + i);
            center.add(centerButton);
        }
        
        //adding panels 
        this.add(north, BorderLayout.NORTH);        
        this.add(west, BorderLayout.WEST);
        this.add(east, BorderLayout.EAST);
        this.add(center, BorderLayout.CENTER);


    }
}
