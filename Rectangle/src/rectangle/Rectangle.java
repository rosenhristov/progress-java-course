
package rectangle;

import java.awt.Graphics;
import javax.swing.JPanel;
public class Rectangle extends JPanel {

    
    public void paintComponent (Graphics g){
    super.paintComponent (g);    
    
    g.drawRect(getWidth ()/4, getHeight ()/4, getWidth ()/2, getHeight ()/2);
    
    
    }
    
}
