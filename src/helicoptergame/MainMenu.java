package helicoptergame;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
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
    JComboBox difficulty;
    JLabel picture, difficultyLabel;
    String[] difficulties = {"Easy", "Normal", "Hard"};
    
    public MainMenu() {
        
        super();
        
        setLayout(null);
        
        ImageIcon img = new ImageIcon("../img/helicopter.jpg");
        
        picture = new JLabel();
        picture.setIcon(img);
        picture.setBounds(100, 10, 600, 300);
        this.add(picture);
        
        difficultyLabel = new JLabel("Difficulty: ");
        difficultyLabel.setBounds(275, 325, 75, 30);
        this.add(difficultyLabel);
        
        difficulty = new JComboBox(difficulties);
        difficulty.setBounds(350, 325, 100, 30);
        this.add(difficulty);
        
        startGame = new JButton("Start Game");
        startGame.setBounds(325, 375, 150, 30);
        this.add(startGame);
        
        
        
        
    }
}
