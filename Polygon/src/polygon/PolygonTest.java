
package polygon;

import javax.swing.JFrame;
public class PolygonTest {
    

    public static void main(String[] args) {
        
    Polygon panel = new Polygon();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 450);
        application.setVisible(true); 
    
    
    }



}
