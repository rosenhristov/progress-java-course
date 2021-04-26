package aim;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Aim extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        boolean venus = true;

        for (int i = 0; i < getHeight() / 2; i += 10) {
            if (venus) {
                g.setColor(Color.red);
            } else {
                g.setColor(Color.WHITE);
            }

            g.fillArc(i, i, getWidth()-2*i, getHeight()-2*i, 0, 360);

            venus = !venus;

            g.setColor(Color.black);
            g.drawString("Bull's Eye!", getWidth()/2-30, getHeight()/2);
            
        
        }

    }
}
