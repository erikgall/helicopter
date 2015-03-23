package helicoptergame;

import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author emg5478
 */
public class SplashPanel extends JPanel {
    
    JLabel title, picture;
    JProgressBar loading;
    
    public SplashPanel() {
        
        super();
     
        setLayout(null);

        title = new JLabel("Helicopter");
        title.setBounds(300, 10, 300, 150);
        title.setFont(new Font("Serif", BOLD, 54));
        this.add(title);

        ImageIcon img = new ImageIcon("../img/helicopter.jpg");

        picture = new JLabel(img);
        picture.setBounds(100, 160, 600, 300);
        this.add(picture);
        
        loading = new JProgressBar(0, 100);
        loading.setValue(0);
        loading.setStringPainted(true);
        loading.setBounds(300, 475, 150, 30);
        this.add(loading);
    }
    
}
