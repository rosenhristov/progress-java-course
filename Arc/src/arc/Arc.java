package arc;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Arc extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    g.setColor (Color.YELLOW);
    g.fillArc (getWidth ()/4, getHeight ()/4, getWidth ()/2, getHeight ()/2, 45, 280);
    
    g.setColor (Color.BLACK);
    g.fillArc(getWidth()/2-getWidth()/12, getHeight()/3, getWidth()/9, getHeight()/10, 0, 360);
    
    
    }
}
