package com.groupama.javanews.javamigration.sealed.classe;

public sealed class Rectangle extends Shape permits SmallRectangle {

    // La classe Rectangle étend Shape
    // Elle doit donc être final / sealed / no-sealed
    // Ici elle est scellée et elle autorise  SmallRectangle à en hériter
    
    @Override
    String getName() {
        return "rectangle";
    }

    String getValue() {
        return "RectangleValue";
    }
}
