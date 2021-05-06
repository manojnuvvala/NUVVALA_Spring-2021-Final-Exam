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
public class engineoil extends Oil {

    private boolean s4toil;

    public engineoil(boolean s4toil, String oilType) {
        super(oilType);
        this.s4toil = s4toil;
    }

    public boolean isgood() {
        return s4toil;
    }

    @Override
    public String toString() {
        String safe = "";
        if (s4toil) {
            safe = "Safe";
        } else {
            safe = "Not Safe";
        }
        return super.toString()
                + " and it is "
                + safe;
    }

}
