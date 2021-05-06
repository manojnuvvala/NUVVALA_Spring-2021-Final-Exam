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
public class ComparableCircle extends Circle implements Comparable<Circle> {

    public ComparableCircle(int radius) {
        super(radius);

    }

    @Override
    public int compareTo(Circle arg0) {
        Circle mn1 = this;
        Circle mn2 = arg0;

        Integer Area1 = (int) mn1.area();
        Integer Area2 = (int) mn2.area();
        Integer Result = -(Area1.compareTo(Area2));
        return Result;
    }
}
