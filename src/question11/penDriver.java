/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Manoj Nuvvala
 */
public class penDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question:11 By MANOJ NUVVALA");
        pen pen1 = new pen("Reynolds", "blue");
        pen pen2 = new pen("Reynolds", "blue");
        pen pen3 = new pen("Bic", "black");
        System.out.println("*** pen1 compared with pen2 using .equals ***");
        System.out.println(pen1.equals(pen2));
        System.out.println(pen1.equals(pen3));
    }

}
