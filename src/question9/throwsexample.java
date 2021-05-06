/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Manoj Nuvvala
 */
public class throwsexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        System.out.println("Question:6 By MANOJ NUVVALA");
        try {
            Class c = Class.forName("incorrectPackage.IncorrectClass");
        } catch (Exception e) {
            System.out.println("Unable to load the Class.");
        }
    }

}
