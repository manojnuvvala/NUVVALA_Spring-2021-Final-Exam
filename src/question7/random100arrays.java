/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Manoj Nuvvala
 */
public class random100arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numbers[] = new int[100];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("Answer by MANOJ NUVVALA: question7");

        System.out.print("Enter an index to find the integer in the array list of 100: ");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        try {
            System.out.println("Integer at index " + index + " is "
                    + numbers[index]);
        } catch (Exception m) {
            System.out.println(m.getMessage());
        }
    }

}
