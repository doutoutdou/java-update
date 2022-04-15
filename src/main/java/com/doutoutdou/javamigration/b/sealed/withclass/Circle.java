package com.doutoutdou.javamigration.b.sealed.withclass;

public non-sealed class Circle extends Shape{

    // La classe Circle étend Shape
    // Elle doit donc être final / sealed / no-sealed
    // Ici elle est non scellée et se comporte comme une classe normale niveau héritage
    
    @Override
    String getName() {
        return "Circle";
    }
    
    String getValue() {
        return "CircleValue";
    }
}
