package jia.exercises.basics.orlin.stanchev.lecture3;

/**
 * Created by IntelliJ IDEA.
 * User: Orlin_2
 * Date: 2010-11-16
 * Time: 22:37:12
 */
public class Rational {

    private int numerator;
    private int denominator;

    //-------------------------
    // CONSTRUCTOR
    //-------------------------
    /**
     * Sets up the rational number (the fraction) by checking for zero denominator
     * and making only the numerator signed.
     * @param numerator of the new rational number
     * @param denominator of the new rational number
     */
    public Rational(int numerator, int denominator) {

        // check for zero denominator:
        if (denominator == 0){
            throw new RuntimeException("Argument divisor is 0");
        }

        // Make the numerator store the sign:
        if (denominator < 0){
            numerator   = numerator   * (-1);
            denominator = denominator * (-1);
        }

        // set up values for the numerator and denominator:
        this.numerator = numerator;
        this.denominator = denominator;

        this.reduce();
    }

    /**
     * Create a new Rational with the value numerator/1
     * @param numerator of the new rational number
     */
    public Rational (int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }
    //------------------------------
    // GETTERS
    //------------------------------
    /**
     * @return the numerator of this rational number
     */
    public int getNumerator () {
        return this.numerator;
    }

    /**
     * @return the denominator of this rational number
     */
    public int getDenominator () {
        return this.denominator;
    }

    //--------------------------------
    // OPERATIONS ON RATIONAL NUMBERS
    //--------------------------------
    /**
     * @return the reciprocal of this rational number
     */
    public Rational reciprocal () {
        return new Rational(this.denominator, this.numerator);
    }

    /**
     * Assumes both rationals are reduced
     * @param rn2 the rational number 2 for comparison
     * @return true if both rationals equals.
     */
    public boolean equals(Rational rn2) {
        return (this.numerator == rn2.getNumerator() && this.denominator == rn2.getDenominator());
    }

    @Override
    /**
     * @return this rational  number as a string
     */
    public String toString () {

        String result;

        if (this.numerator == 0) {
            result = "0";
        } else {
            if (this.denominator == 1) {
                result = this.numerator + "";
            } else {
                result = this.numerator + "/" + this.denominator;
            }
        }
     return result;
    }

    /**
     * @return a String representation of this rational number
     */
    public String toDecimalString () {
        return "" + (this.numerator/this.denominator);
    }

    
    //--------------------------------
    // OPERATIONS ON RATIONAL NUMBERS
    //--------------------------------
    /**
     * @param rn2 the second operand (rational number)
     * @return the resultant rational number after addition
     */
    public Rational add(Rational rn2) {

        int commonDenominator = denominator * rn2.getDenominator();
        int numerator1 = numerator * rn2.getDenominator();
        int numerator2 = rn2.getNumerator() * denominator;
        int sum = numerator1 + numerator2;

        return new Rational(sum, commonDenominator);
    }

    /**
     * Increment the value of this rational number by 1.
     */
    public void increment () {
        this.numerator = this.numerator + this.denominator;
    }

    /**
     * Decrement the value of this rational number by 1.
     */
    public void decrement () {
        this.numerator = this.numerator - this.denominator;
    }

    /**
     * @param rn2 the second operand (rational number)
     * @return the resultant rational number after subtraction
     */
    public Rational subtract(Rational rn2) {

        int commonDenominator = denominator * rn2.getDenominator();
        int numerator1 = numerator * rn2.getDenominator();
        int numerator2 = rn2.getNumerator() * denominator;
        int difference = numerator1 - numerator2;

        return new Rational(difference, commonDenominator);
    }

    /**
     * @param rn2 the second operand (rational number)
     * @return the resultant rational number after multiplication
     */
    public Rational multiply(Rational rn2) {

        int numerator   = this.numerator   * rn2.getNumerator();
        int denominator = this.denominator * rn2.getDenominator();

        return new Rational(numerator, denominator);
    }

    /**
     * @param rn2 the second operand (rational number)
     * @return the resultant rational number after division
     */
    public Rational divide(Rational rn2) {
        return multiply(rn2.reciprocal());
    }


    // PRIVATE METHODS:
    private void reduce () {
        // find the greatest common divisor
        if (numerator != 0) {
            int gcm     = greatestCommonDivisor (Math.abs(numerator), denominator);
            numerator   = numerator   / gcm;
            denominator = denominator / gcm;
        }
    }

    /**
     * @param number1 positive number
     * @param number2 positive number
     * @return the greatest common divisor of the two positive numbers.
     */
    private int greatestCommonDivisor(int number1, int number2) {

        while (number1 != number2) {

            if (number1 > number2)
                number1 = number1 - number2;
            else
                number2 = number2 - number1;
        }
        return number1;
    }


    //-----------------------------------------------------------------
    //  Creates some rational number objects and performs various
    //  operations on them.
    //-----------------------------------------------------------------

    public static void main(String[] args) {

        Rational rn1 = new Rational(5, 2);
        Rational rn2 = new Rational(7, 8);
        Rational rn3, rn4, rn5, rn6, rn7;

        System.out.println("First rational number: " + rn1);
        System.out.println("Second rational number: " + rn2);

        if (rn1.equals(rn2))
            System.out.println("rn1 and rn2 are equal.");
        else
            System.out.println("rn1 and rn2 are NOT equal.");

        rn3 = rn1.reciprocal();
        System.out.println("The reciprocal of rn1 is: " + rn3);

        rn4 = rn1.add(rn2);
        rn5 = rn1.subtract(rn2);
        rn6 = rn1.multiply(rn2);
        rn7 = rn1.divide(rn2);

        System.out.println("rn1 + rn2: " + rn4);
        System.out.println("rn1 - rn2: " + rn5);
        System.out.println("rn1 * rn2: " + rn6);
        System.out.println("rn1 / rn2: " + rn7);
    }

}
