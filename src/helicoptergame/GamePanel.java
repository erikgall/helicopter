
package helicoptergame;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


 public class GamePanel extends JPanel implements KeyListener, ActionListener {

    
     JLabel topObstacle, bottomObstacle, timerScoreLabel, helicopterLabel;
     
     
    Image background;
    ImageIcon helicopterIcon;
   
  
    Timer timer;
    TimerListener listener;
    int helicopterX, helicopterY;
     
    public GamePanel(int difficulty) throws IOException
    {
     
        super();
        
        Timer tim = new Timer(1000, this);
        tim.start();
        
        //setting helicopter photo
        helicopterIcon = new ImageIcon("../Helicopter_isolated_preview.jpg");
        helicopterLabel = new JLabel(helicopterIcon);
       
        
        //setting where the helicopter will show up and adding it to the panel
        helicopterLabel.setBounds(50, 50, 50, 50);
        add(helicopterLabel);
        
    }
     @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void keyPressed(KeyEvent e) {
      
           int key = e.getKeyCode();
           
            if (key == KeyEvent.VK_UP) {
                    ActionListener existAction = new ActionListener() {
                    
                        public void actionPerformed(ActionEvent evt) {
                        
                      
                           helicopterY = helicopterLabel.getY() + 5;
                           helicopterLabel.setBounds(50, 50, 50, helicopterY);
                           add(helicopterLabel);
                           repaint();
                          
                            
                    }};
                    Timer existTimer = new Timer(50, existAction);
                    existTimer.start();
           

        }
            if (key == KeyEvent.VK_DOWN) {
                    ActionListener existAction = new ActionListener() {
                    
                        public void actionPerformed(ActionEvent evt) {
                        
                      
                           helicopterY = helicopterLabel.getY() + -5;
                           helicopterLabel.setBounds(50, 50, 50, helicopterY);
                           add(helicopterLabel);
                           repaint();
                          
                            
                    }};
                    Timer existTimer = new Timer(50, existAction);
                    existTimer.start();
           

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    private static class TimerListener {

        public TimerListener() {
        }
    }
    
    
   }

