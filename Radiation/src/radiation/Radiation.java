package radiation;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Radiation extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    g.setColor (Color.BLACK);
    g.fillArc (getWidth ()/4, getHeight ()/4, getWidth ()/2, getHeight ()/2, 0,65);
    
    g.setColor (Color.BLACK);
    g.fillArc (getWidth ()/4, getHeight ()/4, getWidth ()/2, getHeight ()/2, 115,65);
    
    g.setColor (Color.BLACK);
    g.fillArc(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2,240 ,65);
    
    g.setColor (Color.YELLOW);
    g.fillArc((getWidth()/10)*4, (getHeight()/10)*4, getWidth()/5, getHeight()/5, 0, 360);
    
    g.setColor (Color.BLACK);
    g.fillArc((getWidth()/12)*6-35, (getHeight()/12)*6-35, getWidth()/7, getHeight()/7, 0, 360);
    
    setBackground (Color.YELLOW);
    }
}
