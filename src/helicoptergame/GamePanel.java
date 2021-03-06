package helicoptergame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.Random;

public class GamePanel extends JPanel implements KeyListener, ActionListener {

    JLabel topObstacle, bottomObstacle, timerScoreLabel, helicopterLabel;

    Image background;
    ImageIcon helicopterIcon;
    Random rdm;
    Timer tim;
    int helicopterX, helicopterY;
    int obstacleSeparator = 0;
    JLabel block1, block2, block3, block4;
    int block1X = 800;
    int block2X = 800;
    int block3X = 1000;
    int block4X = 1000;
    int block1Y = 0;
    int block2Y = 400;
    int block3Y = 0;
    int block4Y = 400;
    int delay = 100;
    int jumpX = 7;

    public GamePanel(String difficulty) throws IOException {

        super();
        setLayout(null);
        
        switch(difficulty) {
            
            case "Easy": 
            default:
                delay = 100;
                break;
            case "Normal":
                delay = 65;
                jumpX = 6;
                break;
            case "Hard":
                delay = 30;
                jumpX = 5;
                break;
            
            
        }

        rdm = new Random();
        
        //setting helicopter photo
        helicopterIcon = new ImageIcon("img/helicoptor-animation.gif");
        helicopterLabel = new JLabel();

        //setting where the helicopter will show up and adding it to the panel
        helicopterLabel.setBounds(new Rectangle(50, 50, 75, 35));
        helicopterLabel.setIcon(helicopterIcon);
        add(helicopterLabel);
        addKeyListener(this);
        setFocusable(true);
        
        block1 = new JLabel("");
        block2 = new JLabel("");
        block3 = new JLabel("");
        block4 = new JLabel("");
        
        block1.setBounds(800, 0, 30, 350);
        block2.setBounds(800, 400, 30, 400);
        block3.setBounds(700, 0, 30, 350);
        block4.setBounds(700, 400, 30, 400);

        block1.setOpaque(true);
        block2.setOpaque(true);
        block3.setOpaque(true);
        block4.setOpaque(true);
        
        block1.setBackground(Color.black);
        block2.setBackground(Color.black);
        block3.setBackground(Color.red);
        block4.setBackground(Color.red);
        
        setBackground(Color.white);
        
        add(block1);
        add(block2);
        add(block3);
        add(block4);

        tim = new Timer(delay, this);
        tim.start();

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        requestFocusInWindow();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP) {

            helicopterY = helicopterLabel.getY();
            helicopterY -= 20;
            helicopterLabel.setBounds(new Rectangle(50, helicopterY, 75, 35));

        }

        if (key == KeyEvent.VK_DOWN) {

            helicopterY = helicopterLabel.getY();
            helicopterY += 20;
            helicopterLabel.setBounds(new Rectangle(50, helicopterY, 75, 35));

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object obj = e.getSource();

        if (obj == tim) {

            block1X -= jumpX;
            block2X -= jumpX;
            block3X -= jumpX;
            block4X -= jumpX;
            
            
            if (block1X <= 0) {
                
                int opening1 = rdm.nextInt(400);
                
                block1X = 800;
                block2X = 800;
                
                block2Y = opening1 + 50;
            
            }
            if (block3X <= 0) {
            
                int opening2 = rdm.nextInt(400);
                
                block3X = 800;
                block4X = 800;
                
                block4Y = opening2 + 50;
            }
            block1.setBounds(block1X, 0, 30, block2Y-50);
            block2.setBounds(block2X, block2Y, 30, 800 - block2Y);

            block3.setBounds(block3X, 0, 30, block4Y-50);
            block4.setBounds(block4X, block4Y, 30, 800 - block4Y);
            

            validate();
            repaint();
          
            
            
        }
    }
}