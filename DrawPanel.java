
package switchcase;

import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawPanel extends JPanel{
    int[] xPoints;
    int[] yPoints;
    
    public DrawPanel(int[] xPoints, int[] yPoints){
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
                g.drawPolygon(xPoints,yPoints, xPoints.length);
                        
    }
    
}
