package com.doutoutdou.javamigration.b.sealed.withinterface;

public non-sealed interface Circle extends Shape {

    // L'interface circle étend Shape
    // Elle doit donc être final / sealed / no-sealed
    // Ici elle est non scellée et se comporte comme une interface normale

    @Override
    default String getName() {
        return "Circle";
    }
    
    String getValue();
}
