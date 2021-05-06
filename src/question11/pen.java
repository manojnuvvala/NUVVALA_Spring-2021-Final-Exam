/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Objects;

/**
 *
 * @author Manoj Nuvvala
 */
public class pen {

    private String brand;
    private String ink;

    public pen(String brand, String ink) {
        this.brand = brand;
        this.ink = ink;
    }

    public String getBrand() {
        return brand;
    }

    public String getInk() {
        return ink;
    }

    @Override
    public String toString() {
        return "Pen{" + "brand=" + brand + ", ink=" + ink + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.brand);
        hash = 41 * hash + Objects.hashCode(this.ink);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        /*
         Step 1: this check. if yes , then return true.
         In this step the references of pen1 and pen2 are compared.If equal return true.
         */
        if (this == obj) {
            return true;
        }
        /*
         Step 2: null check. if yes , then return false.
         In this step,we will check if object is null.If null return false.
         */
        if (obj == null) {
            return false;
        }
        /*
         Step 3: getClass check.if not equal then return false.
        We need to check if both the objects being compared are of same class type or not.
        In this example we will compare pen1 and pen2 are of same class type,if not will return false.

         */

        if (getClass() != obj.getClass()) {
            return false;
        }
        /*
         Step 4: Typecast the object.
        This step must be done after getClass check
         */
        final pen other = (pen) obj;
        /*
        Step 5: Comparing Objects
        Here we need to make a decision to consider the class member variables,
        when comparing two objects of a class.
        For example:
        As per the below code,two pen objects are equal, only if ink and brand
        member variables are equal.And will return false, if any one of them is not equal.
         */
        if (this.ink != other.ink) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        return true;
    }

}
