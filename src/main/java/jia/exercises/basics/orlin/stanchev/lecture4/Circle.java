package jia.exercises.basics.orlin.stanchev.lecture4;

import java.text.DecimalFormat;

/**
 * Created by IntelliJ IDEA.
 * User: stanchev
 * Date: Nov 29, 2010
 * Time: 3:45:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Circle extends Figure {

    private double radius;
    private final String figType = "Circle";
    final double pi = Math.PI;

    // The default unit circle
    public Circle () {
        this.radius = 1.0;
        this.setName(figType);
        this.calculateArea();
        this.calculateCircumference();
    }

    // Constructor
    public Circle (double radius) throws IllegalArgumentException {

        if (radius < 0){
            throw new IllegalArgumentException("Radius can not be negative!");
        }

        this.radius = radius;
        this.setName(figType);
        this.calculateArea();
        this.calculateCircumference();
    }

    private void calculateArea () {
        this.setArea((pi * Math.pow(this.radius, 2)));
    }

    private void calculateCircumference () {
        this.setCircumference( (2.0 * pi * this.radius) );
    }

    @Override
    public String toString () {
        String result;
        DecimalFormat numberFormatter = new DecimalFormat("#0.00");
        result = "Type:           " + this.getName() + "\n" +
                 "Area:           " + numberFormatter.format(this.getArea()) + "\n" +
                 "Circumference:  " + numberFormatter.format(this.getCircumference()) + "\n" +
                 "Radius:         " + numberFormatter.format(this.radius);
        return result;  
    }
}
