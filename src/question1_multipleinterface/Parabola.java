/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1_multipleinterface;

/**
 *
 * @author MANOJ NUVVALA
 */
public interface Parabola {

    double area();

    default double directrix(int a) {
        double directrixOfParabola = -a;
        return directrixOfParabola;
    }

}
