
package inscript;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Inscript extends JPanel {

   public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.MAGENTA); 
    

   Font f = new Font ("My Font", Font.ITALIC, 30);
   g.setFont(f);
   g.drawString("This is my Java Application!", 40, 40);
   
   
   }
}
    

