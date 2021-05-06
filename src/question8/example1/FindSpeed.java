/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8.example1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Manoj Nuvvala
 */
public class FindSpeed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArithmeticException,
            InputMismatchException {
        // TODO code application logic here
        double length = 0;
        double time = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter journey length: ");
        length = scan.nextDouble();

        System.out.print("Enter journey time: ");

        time = scan.nextDouble();

        System.out.println("Speed: " + calculateSpeed(length, time));
    }

    public static double calculateSpeed(double length, double time) throws
            ArithmeticException {
        double speed = 0;
        try {
            speed = length / time;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return speed;
    }
}
