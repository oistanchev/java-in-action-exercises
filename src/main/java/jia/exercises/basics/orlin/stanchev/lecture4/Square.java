package jia.exercises.basics.orlin.stanchev.lecture4;

import java.text.DecimalFormat;

/**
 * Created by IntelliJ IDEA.
 * User: stanchev
 * Date: Nov 29, 2010
 * Time: 4:42:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Square extends Rectangle{

    private double side;
    private final String figType = "Square";

    public Square () {
        this.side = 1.0;
        this.setName();
        this.calculateArea();
        this.calculateCircumference();
    }

    public Square (double side) throws IllegalArgumentException {
        if (side < 0){
            throw new IllegalArgumentException("The side of the Square can not be negative!");
        }

        this.side = side;
        this.setName();
        this.calculateArea();
        this.calculateCircumference();
    }

    private void setName () {
        super.setName(figType);
    }

    private void calculateArea () {
        super.setArea(Math.pow(this.side, 2));
    }

    private void calculateCircumference () {
        super.setCircumference(4.0 * this.side);
    }

    @Override
    public String toString () {
        String result;
        DecimalFormat numberFormatter = new DecimalFormat("#0.00");
        result = "Type:           " + this.getName() + "\n" +
                 "Area:           " + numberFormatter.format(this.getArea()) + "\n" +
                 "Circumference:  " + numberFormatter.format(this.getCircumference()) + "\n" +
                 "Square's side:  " + numberFormatter.format(this.side);

        return result;
    }
}
