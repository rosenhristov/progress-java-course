
package inscript;

import javax.swing.JFrame;
public class InscriptTest {
    public static void main(String[] args) {
      Inscript panel = new Inscript();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 450);
        application.setVisible(true);    
    }
    



}
