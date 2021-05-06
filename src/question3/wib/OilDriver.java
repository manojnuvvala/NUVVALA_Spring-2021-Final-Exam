/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3.wib;

/**
 *
 * @author Jeevan Bodigam
 */
public class OilDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassCastException {
        // TODO code application logic here
        System.out.println("Answer by MANOJ NUVVALA question 3");
        Oil eo = new engineoil(true, "Synthtic oil");
        Oil o = eo;   //implicit conversion parent type will automatically hold child object
        try {
            System.out.println("o is parent object but calling childs");
            System.out.println(o.toString());

            System.out.println("engoil is child object but calling childs");
            Oil oil = new Oil("4toil");
            engineoil engoil = (engineoil) eo; //Explict COnversion of parent to child type
            System.out.println(engoil.toString());
            engineoil engoil1 = (engineoil) oil;
            //we get an exception here because we are converting from parent to child
            System.out.println(engoil1.toString());
        } catch (ClassCastException e) {
            System.out.println(e);
        }
    }

}
