
package helicoptergame;

import java.awt.Graphics;
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
import java.util.Random;


 public class GamePanel extends JPanel implements KeyListener, ActionListener {

    
     JLabel topObstacle, bottomObstacle, timerScoreLabel, helicopterLabel;
     
     
    Image background;
    ImageIcon helicopterIcon;
   
  
    Timer tim;
    TimerListener listener;
    int helicopterX, helicopterY;
     
    public GamePanel(int difficulty) throws IOException
    {
     
        super();
        setLayout(null);
        
        //setting helicopter photo
        helicopterIcon = new ImageIcon("img/helicoptor-animation.gif");
        helicopterLabel = new JLabel();
       
        
        //setting where the helicopter will show up and adding it to the panel
        helicopterLabel.setBounds(new Rectangle(50, 50, 75, 35));
        helicopterLabel.setIcon(helicopterIcon);
        add(helicopterLabel);
        addKeyListener(this);
        setFocusable(true);
        
        tim = new Timer (1000, this);
        tim.start();
       
    }
   
    public void paintComponent(Graphics g)
    {
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
        
        if(obj == tim)
                {
                    
                  Random rnd = new Random();
                  int randomInt = rnd.nextInt(10);
                  System.out.println(randomInt);
                }
    }

  

     private class TimerListener implements ActionListener
        {
           
            public void actionPerformed(ActionEvent e)
            {

                 if (e.getSource() == tim)
                {
                   
                
                    
                }

            
                
            
            }

        }
    
    
   }

