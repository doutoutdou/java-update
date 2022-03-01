package com.groupama.javanews.javamigration.b.sealed.withrecord;

public record Rectangle(String name) implements Shape {

    // Le record Rectangle étend Shape

    @Override
    public String getName() {
        return "rectangle";
    }

}
