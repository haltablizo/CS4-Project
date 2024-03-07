/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arachne.Screens;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author asus
 */
public class MainMenuScreen extends JFrame {
    public MainMenuScreen() {
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 750);
        
        // Creating menuPanel with GridBagLayout
        JPanel menuPanel = new JPanel(new GridBagLayout());
        menuPanel.setPreferredSize(new Dimension(250, 750));
        menuPanel.setBackground(Color.WHITE);
        
        // Adding title label
        JLabel titleLabel = new JLabel("Game Title");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setPreferredSize(new Dimension(250, 50));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(10, 0, 10, 0);
        menuPanel.add(titleLabel, gbc);
        
        // Adding buttons (non-functional)
        JButton newGameButton = new JButton("New Game");
        JButton loadGameButton = new JButton("Load Game");
        JButton settingsButton = new JButton("Settings");
        JButton exitButton = new JButton("Exit");
        
        Dimension buttonSize = new Dimension(200, 30); // Set preferred size for buttons
        newGameButton.setPreferredSize(buttonSize);
        loadGameButton.setPreferredSize(buttonSize);
        settingsButton.setPreferredSize(buttonSize);
        exitButton.setPreferredSize(buttonSize);
        
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 5, 0); // Add some spacing between buttons
        menuPanel.add(newGameButton, gbc);
        
        gbc.gridy = 2;
        menuPanel.add(loadGameButton, gbc);
        
        gbc.gridy = 3;
        menuPanel.add(settingsButton, gbc);
        
        gbc.gridy = 4;
        gbc.insets = new Insets(0, 0, 0, 0); // Reset insets for the last button
        menuPanel.add(exitButton, gbc);
        
        // Adding menuPanel to the west side of BorderLayout
        getContentPane().add(menuPanel, BorderLayout.WEST);
        
        // Adding image to the east side of BorderLayout
        ImageIcon originalImageIcon = new ImageIcon(MainMenuScreen.class.getResource("wireframe.jpg"));
        ImageIcon resizedImageIcon = resizeImageIcon(originalImageIcon, 750, 750); // Change dimensions as needed
        JLabel imageLabel = new JLabel(resizedImageIcon);
        getContentPane().add(imageLabel, BorderLayout.EAST);
        
        setVisible(true);
    }
    private ImageIcon resizeImageIcon(ImageIcon imageIcon, int width, int height) {
        Image image = imageIcon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
    
  
 }
