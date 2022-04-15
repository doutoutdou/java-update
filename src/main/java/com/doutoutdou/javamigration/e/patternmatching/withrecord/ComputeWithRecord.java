package com.doutoutdou.javamigration.e.patternmatching.withrecord;

import com.doutoutdou.javamigration.e.patternmatching.withrecord.model.Shape;
import com.doutoutdou.javamigration.e.patternmatching.withrecord.model.Circle;
import com.doutoutdou.javamigration.e.patternmatching.withrecord.model.Rectangle;

public class ComputeWithRecord {

    // A regarder après avoir regardé la partie withclass

    // JAVA 17 With PREVIEW 
    public static double getPerimeterWithSwitch(Shape shape) throws IllegalArgumentException {
       var perimeter = switch (shape) {
            case Rectangle rectangle -> 2 * rectangle.length() + 2 * rectangle.width();
            case Circle circle -> 2 * circle.radius() * 3;
            // Plus besoin d'avoir un default, car Shape connait les implementations possibles
       };
        
        return  perimeter;
    }

    // Ici on ajoute une condition sur le premier case
    // Il faut donc rajouter un default ou alors un cas par défaut pour rectangle
    public static double getPerimeterWithSwitchAndConditions(Shape shape) throws IllegalArgumentException {
        var perimeter = switch (shape) {
            case Rectangle rectangle && rectangle.length() <= 2 -> 1 * rectangle.length() + 1 * rectangle.width();
            case Rectangle rectangle -> 2 * rectangle.length() + 2 * rectangle.width();
            case Circle circle -> 2 * circle.radius() * 3;
        };

        return  perimeter;
    }

   
}
