/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arachne.Screens;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author SantosKids
 */
public class DivineBattleScreen extends JFrame {
    private JPanel oppPanel, controlPanel, west, east;
    private JPanel playerDeck, oppDeck, movesPanel, exitPanel;
    private JLabel playerCard1, playerCard2, playerCard3;
    private JLabel oppName, oppAvatar; //oppDialogue
    private JLabel oppCard1, oppCard2, oppCard3;
    private JLabel turn;
    private JButton exit, hit, stand;
    
    public DivineBattleScreen(/*Player p, Divine d*/){
        super("Divine Battle");
        oppPanel = new JPanel();
        controlPanel = new JPanel();
        west = new JPanel();
        east = new JPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 750);
        this.setLayout(new BorderLayout(10, 10));
        this.add(oppPanel, BorderLayout.CENTER);
        this.add(controlPanel, BorderLayout.SOUTH);
        
        //setting values to oppPanel components
        //resizing avatar
        ImageIcon avatar = new ImageIcon(DivineBattleScreen.class.getResource("wireframe.jpg"));
        Image image = avatar.getImage();
        Image newimg = image.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        avatar = new ImageIcon(newimg);
        this.oppAvatar = new JLabel(avatar);
        this.oppName = new JLabel("Tyche");
        this.turn = new JLabel("Your turn");
        
        //resizing cards 
        ImageIcon card = new ImageIcon(DivineBattleScreen.class.getResource("wireframe.jpg"));
        Image image2 = card.getImage();
        Image newimg2 = image2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        card = new ImageIcon(newimg2);
        this.oppCard1 = new JLabel(card); //placeholder, will change to array
        this.oppCard2 = new JLabel(card);
        this.oppCard3 = new JLabel(card);
        
        //setting values to controlPanel components
        this.playerCard1 = new JLabel(card); //placeholder, will change to array
        this.playerCard2 = new JLabel(card);
        this.playerCard3 = new JLabel(card);
        this.exit = new JButton("EXIT");
        this.hit = new JButton("HIT");
        this.stand = new JButton("STAND");
        
        //setting up opponent deck
        oppDeck = new JPanel();
        oppDeck.setLayout(new FlowLayout(FlowLayout.CENTER));
        oppDeck.add(oppCard1);
        oppDeck.add(oppCard2);
        oppDeck.add(oppCard3);
        
        //setting up player deck
        playerDeck = new JPanel();
        playerDeck.setLayout(new FlowLayout(FlowLayout.CENTER));
        playerDeck.add(playerCard1);
        playerDeck.add(playerCard2);
        playerDeck.add(playerCard3);
        
        //setting up west of oppPanel
        west.setLayout(new BorderLayout(10, 250));
        west.add(oppName, BorderLayout.NORTH);
        west.add(oppDeck, BorderLayout.CENTER);
        
        //setting up east of oppPanel
        east.setLayout(new BorderLayout(10, 250));
        east.add(turn, BorderLayout.NORTH);
        
        //setting up moves panel
        movesPanel = new JPanel();
        movesPanel.setLayout(new BoxLayout(movesPanel, BoxLayout.Y_AXIS));
        movesPanel.add(hit);
        movesPanel.add(stand);
        
        //setting up exit panel
        exitPanel = new JPanel();
        exitPanel.setLayout(new BoxLayout(exitPanel, BoxLayout.Y_AXIS));
        exitPanel.add(exit);
        
        //oppPanel setup
        oppPanel.setLayout(new BorderLayout(5, 5));
        oppPanel.add(west, BorderLayout.WEST);
        oppPanel.add(east, BorderLayout.EAST);
        oppPanel.add(oppAvatar, BorderLayout.CENTER);
        
        controlPanel.setLayout(new BorderLayout(5, 5));
        controlPanel.add(playerDeck, BorderLayout.CENTER);
        controlPanel.add(movesPanel, BorderLayout.WEST);
        controlPanel.add(exitPanel, BorderLayout.EAST);
    }
}

