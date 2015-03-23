package helicoptergame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erik
 */
public class MainFrame extends JFrame implements ActionListener {
        
    MainMenu menu;
    SplashPanel sp;
    Timer time;
    int timeCounter = 0;
    
    public MainFrame() {
        
        super("Helicopter Game");
        
        getContentPane().setLayout(new BorderLayout());
        
        sp = new SplashPanel();
        menu = new MainMenu();
        time = new Timer(1000, this);
        getContentPane().add(sp);
        time.start();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object obj = e.getSource();

        if (obj == time) {
            
            if (timeCounter == 5) {
            
                getContentPane().remove(sp);
                getContentPane().add(menu);
                
                time.stop();
                
                validate();
                repaint();
            }
            
            timeCounter++;
            
            sp.loading.setValue(timeCounter * 19);
                    
            
        }
    
    }
    
    
}
