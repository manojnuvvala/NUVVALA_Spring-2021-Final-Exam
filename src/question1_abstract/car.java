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
public class car extends automotive {

    public void vehicle() {
        System.out.println("IT IS A FOUR WHEEL VEHICLE");
    }

    @Override
    public void automobile() {
        System.out.println("This is automotive abstract method");
    }

}
