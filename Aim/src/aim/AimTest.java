
package aim;

import javax.swing.JFrame;
public class AimTest {
    
    public static void main(String[] args) {
        
        Aim panel = new Aim();
        JFrame application = new JFrame();
        
        application.setTitle("Aim For The Center!");
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(600,600);
        application.setVisible(true);
    
    
    }



}
