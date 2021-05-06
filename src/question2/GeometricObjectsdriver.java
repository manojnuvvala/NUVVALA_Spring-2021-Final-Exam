/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Manoj Nuvvala
 */
public class GeometricObjectsdriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObjects go[] = new GeometricObjects[5];
        GeometricObjects s1 = new square(1);
        GeometricObjects s2 = new square(2);
        GeometricObjects s3 = new square(3);
        GeometricObjects s4 = new square(4);
        GeometricObjects s5 = new square(5);
        go[0] = s1;
        go[1] = s2;
        go[2] = s3;
        go[3] = s4;
        go[4] = s5;
        System.out.println("Answer for question 2: MANOJ NUVVALA");
        for (GeometricObjects g : go) {
            System.out.println("Area of Square: " + g.getArea());
            g.howToColor();
        }

    }
}
