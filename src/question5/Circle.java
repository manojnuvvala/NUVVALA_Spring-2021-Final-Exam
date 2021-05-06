/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Manoj Nuvvala
 */
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getradius() {
        return radius;
    }

    public double getpi() {
        return Math.PI;
    }

    public double area() {
        return getpi() * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with" + radius + "has area : " + area();
    }

}
