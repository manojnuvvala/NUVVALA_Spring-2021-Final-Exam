/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3.wib;

/**
 *
 * @author MANOJ NUVVALA
 */
public class Oil {

    private String oilType;

    public Oil(String oilType) {

        this.oilType = oilType;
    }

    public String getOilType() {
        return oilType;
    }

    @Override
    public String toString() {
        return "THIS " + this.getOilType() + " used";

    }

}
