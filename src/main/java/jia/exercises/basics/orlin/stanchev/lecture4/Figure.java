package jia.exercises.basics.orlin.stanchev.lecture4;

/**
 * Created by IntelliJ IDEA.
 * User: stanchev
 * Date: Nov 29, 2010
 * Time: 3:19:00 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Figure {

    // The Geometric figure has Name, Area, Circumference:
    private String name;
    private double area, circumference;

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea(){
        return this.area;
    }

    public void setCircumference(double circumference){
        this.circumference = circumference;
    }

    public double getCircumference(){
        return this.circumference;
    }
}
