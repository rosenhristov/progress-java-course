
package coordinates;

import javax.swing.JFrame;
public class CoordinatesTest {
    
    public static void main(String[] args) {
     Coordinates panel = new Coordinates();
        JFrame application = new JFrame();   
    
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(600,600);
        application.setVisible(true);
    
    }


}
