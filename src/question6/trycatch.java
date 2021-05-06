/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Manoj Nuvvala
 */
public class trycatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer by MANOJ NUVVALA question 6");
        try {
            Scanner scan = new Scanner(new File("manoj.txt"));
        } catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
        }
    }

}
