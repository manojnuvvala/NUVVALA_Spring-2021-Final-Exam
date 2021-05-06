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
public class BallotDriver {

    public static void main(String[] args) throws ArithmeticException,
            NullPointerException {
        System.out.println("Answer for question 8: Raghavendra Reddy");
        Ballot ele = new Ballot("rakesh");
        ele.setAge(35);
        System.out.println(ele);

        Ballot ele1 = new Ballot("manoj");
        ele1.setAge(20);

        Ballot ele2 = null;
        ele2.setAge(20);
    }

}
