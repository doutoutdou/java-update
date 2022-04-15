package com.groupama.javanews.javamigration.e.patternmatching.withclass;

import com.groupama.javanews.javamigration.e.patternmatching.withclass.model.Circle;
import com.groupama.javanews.javamigration.e.patternmatching.withclass.model.Rectangle;
import com.groupama.javanews.javamigration.e.patternmatching.withclass.model.Shape;

public class ComputeWithClass {

    // Pre JAVA 17
    public static double getPerimeterBefore(Shape shape) throws IllegalArgumentException {

        if (shape instanceof Rectangle) {
            // obligé de réaliser un cast :/
            Rectangle rectangleCast = (Rectangle) shape;
            return 2 * rectangleCast.getLength() + 2 * rectangleCast.getWidth();
        } else if (shape instanceof Circle) {
            Circle circleCast = (Circle) shape;
            return 2 * circleCast.getRadius() * 3;
        } else {
            // obligé d'avoir un else :/
            throw new IllegalArgumentException("Unrecognized shape");
        }
    }

    // JAVA 17
    public static double getPerimeter(Shape shape) throws IllegalArgumentException {
        // A pattern is a combination of a predicate, or test, that can be applied to a target and a set of local 
        // variables, called pattern variables, that are assigned values extracted from the target only if the test is successful
        // si shape est de type Rectangle alors rectangle est l'objet résultat
        // On peut également faire des vérifications comme ici avec la longueur
        if (shape instanceof Rectangle rectangle && rectangle.getLength() > 0) {
            return 2 * rectangle.getLength() + 2 * rectangle.getWidth();
        } else if (shape instanceof Circle circle) {
            return 2 * circle.getRadius() * 3;
        } else {
            // toujours obligé d'avoir un else :/
            throw new IllegalArgumentException("Unrecognized shape");
        }
    }

    // JAVA 17 With PREVIEW 
    public static double getPerimeterWithSwitch(Shape shape) throws IllegalArgumentException {
       var perimeter = switch (shape) {
            case Rectangle rectangle -> 2 * rectangle.getLength() + 2 * rectangle.getWidth();
            case Circle circle -> 2 * circle.getRadius() * 3;
            // toujours obligé d'avoir un default :/ voir withRecord
           default -> throw new IllegalStateException("Unexpected value: " + shape);
       };
        
        return  perimeter;
    }

   
}
