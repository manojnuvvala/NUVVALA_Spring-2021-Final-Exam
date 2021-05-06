/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1_abstract;

/**
 *
 * @author Manoj Nuvvala
 */
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer by MNAOJ NUVVALA question 1");
        automotive car1 = new car();
        car1.automobile();
        car1.vehicle();

        automotive boat1 = new boat();

        boat1.automobile();
    }

}
