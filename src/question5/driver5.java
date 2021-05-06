/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Manoj Nuvvala
 */
public class driver5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComparableCircle mn1 = new ComparableCircle(6);
        ComparableCircle mn2 = new ComparableCircle(4);

        System.out.println("Answer for question 5: MANOJ NUVVALA");
        int result = mn1.compareTo(mn2);

        if (result == -1) {
            System.out.println("Circle mn1 is having highest Area");
        } else if (result == 0) {
            System.out.println("Area are same");
        } else {
            System.out.println("Circle mn2 is having highest Area");
        }
    }
}
