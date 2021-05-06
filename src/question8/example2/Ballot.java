/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8.example2;

/**
 *
 * @author Manoj Nuvvala
 */
public class Ballot {

    private String voterName;
    private int age;

    public Ballot(String voterName) {
        this.voterName = voterName;
    }

    public void setAge(int age) {
        if (age < 18) {
            throw new ArithmeticException(voterName + " not eligible for voting");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Election: " + "voterName=" + voterName + ", age=" + age;
    }
}
