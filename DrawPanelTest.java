/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author boris
 */
public class DrawPanelTest {

    public static void main(String[] args) {
        int[] xPoints, yPoints;
        Scanner input = new Scanner(System.in);

        System.out.println("How many points do you want to add?");
        int numPoints = input.nextInt();

        xPoints = new int[numPoints];
        yPoints = new int[numPoints];
        
        System.out.println("X points:");
        initializeArr(xPoints);
        
        System.out.println("Y points:");
        initializeArr(yPoints);
        
        DrawPanel picture = new DrawPanel(xPoints, yPoints);
        
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(picture);
        application.setVisible(true);
        application.setSize(500,500);
                
    }

    public static void initializeArr(int[] arr) {
        Scanner input = new Scanner(System.in);

        for (int counter = 0; counter < arr.length; counter++) {
            System.out.println("Vyvedete chislo za " + (counter + 1) + " element:");
            arr[counter] = input.nextInt();
        }
    }

}
