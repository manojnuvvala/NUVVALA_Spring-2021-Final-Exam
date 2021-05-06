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
public class SearchingElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        int numbersarray[] = new int[]{12, 145, 6, 60, 10};
        System.out.println("By Manoj Nuvvala question 10");
        System.out.print("Enter the element : ");
        int element = scan.nextInt();
        int indexInList = recursiveSearch(numbersarray, 0, numbersarray.length - 1, element);
        if (indexInList != -1) {
            System.out.println("Element " + element + " is present at index "
                    + indexInList);
        } else {
            System.out.println("Element " + element + " is not present in the list");
        }
    }

    private static int recursiveSearch(int[] ary, int a, int b, int c) {
        if (b < a) {
            return -1;
        }
        if (ary[a] == c) {
            return a;
        }
        if (ary[b] == c) {
            return b;
        }
        return recursiveSearch(ary, a + 1, b - 1, c);
    }
}
