
package arc;

import javax.swing.JFrame;
public class ArcTest {
    
    public static void main(String[] args) {
      Arc panel = new Arc();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 400);
        application.setVisible(true);  
    
    
    
    }

}
