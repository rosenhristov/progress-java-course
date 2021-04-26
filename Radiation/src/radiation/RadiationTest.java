
package radiation;

import javax.swing.JFrame;
public class RadiationTest {
    
    public static void main(String[] args) {
     Radiation panel = new Radiation();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(600, 600);
        application.setVisible(true);    
    
    
    
    }



}
