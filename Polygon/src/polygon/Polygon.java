package polygon;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Polygon extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.MAGENTA);

    int[]xPoints = {20, 30, 120, 400, 200};
    int[]yPoints = {100, 400, 300, 200, 30};
    
    g.drawPolygon(xPoints, yPoints, xPoints.length);
    
    }
}
