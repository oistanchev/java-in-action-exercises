package jia.exercises.basics.orlin.stanchev.lecture2;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: stanchev
 * Date: Nov 12, 2010
 * Time: 12:30:37 PM
 */

/**
 * PROBLEM DEFINITION:
 * Find the sum of all digits of 100!
 */

public class SumOfDigitsOfFactorial {

    public static BigInteger factorialWithRecursion(BigInteger number) {

        BigInteger one = BigInteger.ONE;

        if (number.compareTo(one) < 1) {
            return one;
        } else {
            return number.multiply(factorialWithRecursion(number.subtract(one)));
        }
    }


    public static BigInteger factorialWithOutRecursion(int number) {

        BigInteger factorial = BigInteger.valueOf(1);

        for (int i = number; i > 1; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }


    public static int sumDigits(BigInteger number) {

        // convert to string:
        String factorialAsString = number.toString();

        // convert to array of chars:
        char[] factorialAsCharArray = factorialAsString.toCharArray();

        // define variable for the sum:
        int sumOfFactorialDigits = 0;

        // iterate through the char array and compute teh sum of all digits:
        for (char digit : factorialAsCharArray) {
            sumOfFactorialDigits += Integer.parseInt(Character.toString(digit));
        }

        return sumOfFactorialDigits;
    }


    public static void main(String[] arg) {

        BigInteger factOfOneHundredRecursion = factorialWithRecursion(BigInteger.valueOf(100));
        BigInteger factOfOneHundredNoRecursion = factorialWithOutRecursion(100);

        // print the results:
        System.out.println();
        System.out.println("100! with recursion    = " + factOfOneHundredRecursion);
        System.out.println("100! without recursion = " + factOfOneHundredNoRecursion + "\n");

        System.out.println("Sum of all digits of 100! (recursion)    is: " + sumDigits(factOfOneHundredRecursion));
        System.out.println("Sum of all digits of 100! (no recursion) is: " + sumDigits(factOfOneHundredNoRecursion));

    }

}
