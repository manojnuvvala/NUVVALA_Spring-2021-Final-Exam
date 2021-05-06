/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.util.Scanner;

/**
 *
 * @author Manoj Nuvvala
 */
public class throwexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Question:9 By MANOJ NUVVALA");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of m :");
        int m = scan.nextInt();
        System.out.print("Enter the value of n :");
        int n = scan.nextInt();

        try {
            if (n == 0) {
                throw new ArithmeticException("Cannot divide by Zero");
            }
            int output = m / n;
            System.out.println("Output : " + output);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
