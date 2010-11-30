package jia.exercises.basics.orlin.stanchev.lecture4;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: stanchev
 * Date: Nov 29, 2010
 * Time: 4:07:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestFigureHierarchy {

    public static void objectFactory (Figure[] shapes) {

        // create random generator instance
        Random randomGenerator = new Random();

        // start counting from 1 to 10 (need 10 random objects)
        int oneToTen = 1;
        while (oneToTen <= 10) {
            
            // generate random index to choose figure to be generated:
            // the flags are as follows: 0 - Circle, 1 - Square. 2 - Rectangle
            int randomFigureIndex = randomGenerator.nextInt(3);
            double randomConstructorParameter = randomGenerator.nextDouble()*5;

            switch (randomFigureIndex) {
                case 0:
                    try {
                        Circle myCircle = new Circle(randomConstructorParameter);
                        shapes[oneToTen-1] = myCircle;
                    }
                    catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 1:
                    try {
                        Square mySquare = new Square(randomConstructorParameter);
                        shapes[oneToTen-1] = mySquare;
                    }
                    catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        Rectangle myRectangle = new Rectangle(randomConstructorParameter,
                                                              randomConstructorParameter+2);
                        shapes[oneToTen-1] = myRectangle;
                    }
                    catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
            oneToTen += 1; // increment the counter
        }
    }

    public static void main (String[] arg) {

        // an array where the randomly generated figures will be appended
        Figure[] shapes = new Figure[10];

        // generate the figures
        TestFigureHierarchy.objectFactory(shapes);

        // print the objects description
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Description of Object " + (i+1) + ":\n" + shapes[i].toString() + "\n");
        }
    }
}
