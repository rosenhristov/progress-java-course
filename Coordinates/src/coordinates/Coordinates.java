package coordinates;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Coordinates extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int x = 0;
        int y = 0;

        while (x < getWidth()) {
            g.drawLine(x, 0, x, getHeight());
            x += 30;
        }

        while (y < getHeight()) {
            g.drawLine(0, y, getWidth(), y);
            y += 30;
        }

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));

        g2.drawRect(getWidth() / 10, getHeight() / 10, 60, 90);

        g2.drawArc(getWidth() / 10, (getHeight() / 10) * 4, getWidth() / 5, getHeight() / 5, 0, 360);

        g2.drawArc(getWidth() / 10, (getHeight() / 10) * 8, getWidth() / 5, getHeight() / 5, 90, 75);

        g2.drawArc(getWidth()/2, getHeight()/10*8, getWidth() / 5, getHeight() / 5, 0, 180);
        g2.drawLine (300,510,405,510);

    
        g2.drawLine(420, 390, 510, 480);
        g2.drawLine(510, 480, 600, 390);
    
    g2.drawArc(420, 360, 180, 60, 0, 180);
    
    }
}
