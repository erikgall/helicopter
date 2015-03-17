/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helicoptergame;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Erik
 */
public class MainMenu extends JPanel {
    JButton startGame;
    JComboBox settings, difficultySelector;
    JLabel picture;
    int difficulty;
    
    public MainMenu() {
        
        super();
        
        setLayout(new GridLayout(5, 1));
        
        
    }
}
