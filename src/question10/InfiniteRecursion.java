/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.Scanner;

/**
 *
 * @author MANOJ NUVVALA
 */
public class InfiniteRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("By Manoj Nuvvala");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter the number: ");
            int number = scan.nextInt();
            long rec = infiniteRecursion(number);
            System.out.println(number + "! = " + rec);

        } catch (StackOverflowError st) {
            System.out.println("Over flow error occurs");
        }
    }
    // example for infinite recursion

    public static long infiniteRecursion(int num) {
        return num * infiniteRecursion(num);
    }

}
