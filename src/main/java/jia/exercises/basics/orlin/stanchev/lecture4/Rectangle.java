package jia.exercises.basics.orlin.stanchev.lecture4;

import java.text.DecimalFormat;

/**
 * Created by IntelliJ IDEA.
 * User: stanchev
 * Date: Nov 29, 2010
 * Time: 6:06:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rectangle extends Figure{

    private double width, height;
    private final String figType = "Rectangle";

    // The defaut constructor
    public Rectangle () {
        this.width = 1.0;
        this.height = 1.0;
        this.setName();
        this.calculateArea();
        this.calculateCircumference();
    }

    // Initialize a rectangle with given width and height:
    public Rectangle (double width, double height) throws IllegalArgumentException {
        
        if ((width < 0) || (height < 0)){
            throw new IllegalArgumentException("Width and Height can not be negative!");
        }

        this.width = width;
        this.height = height;
        this.setName();
        this.calculateArea();
        this.calculateCircumference();
    }

    private void setName () {
        super.setName(figType);
    }

    private void calculateArea () {
        super.setArea(width * height);
    }

    private void calculateCircumference () {
        super.setCircumference(2.0 * (width + height));
    }

    @Override
    public String toString () {
        String result;
        DecimalFormat numberFormatter = new DecimalFormat("#0.00");
        result = "Type:           " + this.getName() + "\n" +
                 "Area:           " + numberFormatter.format(this.getArea()) + "\n" +
                 "Circumference:  " + numberFormatter.format(this.getCircumference()) + "\n" +
                 "Width:          " + numberFormatter.format(this.width) + "\n" +
                 "Height:         " + numberFormatter.format(this.height);

        return result;
    }

}
