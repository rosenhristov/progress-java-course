package rectangle;

import javax.swing.JFrame;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle panel = new Rectangle();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 450);
        application.setVisible(true);
    }

}
