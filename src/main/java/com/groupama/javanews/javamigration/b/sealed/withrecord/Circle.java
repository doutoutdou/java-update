package com.groupama.javanews.javamigration.b.sealed.withrecord;

public record Circle(String name, String value) implements Shape {

    // Le record Circle étend Shape
    // Ici elle est non scellée et se comporte comme une classe normale niveau héritage
    
    @Override
    public String getName() {
        return "Circle";
    }
    
}
