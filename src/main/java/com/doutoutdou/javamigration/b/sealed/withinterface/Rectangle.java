package com.doutoutdou.javamigration.b.sealed.withinterface;

public sealed interface Rectangle extends Shape permits SmallRectangle {

    // L'interface Rectangle étend Shape
    // Elle doit donc être final / sealed / no-sealed
    // Ici elle est scellée et elle autorise SmallRectangle à en hériter
    
    @Override
    default String getName() {
        return "rectangle";
    }

    String getValue();
}
