package helicoptergame;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erik
 */
public class MainFrame extends JFrame {
        
    MainMenu menu;
    
    public MainFrame() {
        
        super("Helicopter Game");
        
        getContentPane().setLayout(new BorderLayout());
        
        menu = new MainMenu();
        
        getContentPane().add(menu);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
        
        
    }
    
    
}
