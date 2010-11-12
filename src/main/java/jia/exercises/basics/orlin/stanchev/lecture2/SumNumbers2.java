package jia.exercises.basics.orlin.stanchev.lecture2;

/**
 * Created by IntelliJ IDEA.
 * User: stanchev
 * Date: Nov 12, 2010
 * Time: 11:10:09 PM
 */

/**
 * PROBLEM DEFINITION:
 * Find the sum of all numbers (from 1 to 1000) under the conditions:
 * 1. number < 1000
 * 2. number % 3 = 0 and number % 5 = 0
 */

public class SumNumbers2 {

    public static void main(String[] arg) {

        int number = 1;
        int sum = 0;

        while (number <= 1000) {
            if ((number % 3 == 0) && (number % 5 == 0)) {
                sum += number;
            }
            number++;
        }

        System.out.println("\nThe sum of all numbers (1 to 1000) under the required conditions = " + sum);

    }
}
