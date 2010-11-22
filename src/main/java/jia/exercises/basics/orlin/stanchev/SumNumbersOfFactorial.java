package jia.exercises.basics.orlin.stanchev;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: stanchev
 * Date: Nov 10, 2010
 * Time: 2:18:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class SumNumbersOfFactorial {

    public static BigInteger factorial(BigInteger number) {

        BigInteger one = BigInteger.ONE;

        if (number.compareTo(one) < 1) {
            return one;
        }
        else {
            return number.multiply(factorial(number.subtract(one)));
        }
    }

    
    public static void main (String[] arg) {

        //System.out.println("100! = " + factorial(BigInteger.valueOf(100)));
//        long start = System.currentTimeMillis();
//
//        BigInteger res = factorial(BigInteger.valueOf(8000));
//
//        long end = System.currentTimeMillis();
//        System.out.println("(" + (end-start)  + ") 10000! = " + res.toString());

        // NO RECURSION
        long start2 = System.currentTimeMillis();
        int i; BigInteger x;
        x = BigInteger.valueOf(1);

        //for (int c = 1; c <= 1000; c++){
            for (i=100000; i>1; i--) {
                x = x.multiply(BigInteger.valueOf(i));

            }
        //}
        
        long end2 = System.currentTimeMillis();
        System.out.println("("+(end2-start2)+") N = "+x);

    }
}
