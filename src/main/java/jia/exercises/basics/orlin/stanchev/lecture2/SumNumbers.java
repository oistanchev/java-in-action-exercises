package jia.exercises.basics.orlin.stanchev.lecture2;

/**
 * Created by IntelliJ IDEA.
 * User: stanchev
 * Date: Nov 12, 2010
 * Time: 11:01:21 PM
 */

/**
 * PROBLEM DEFINITION:
 * Find the sum of the numbers from 1 to 1000
 */
public class SumNumbers {

    public static void main(String[] arg) {

        int number = 1;
        int sum = 0;

        while (number <= 1000) {
            sum = sum + number;
            number++;
        }

        System.out.println("\nThe sum of all numbers from 1 to 100 = " + sum);

    }

}
