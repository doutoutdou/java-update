package com.groupama.javanews.javamigration.sealed.classe;

public non-sealed class SmallRectangle extends Rectangle {
    
    // La classe est finale et donc non "étendable"
    // Elle hérite de rectangle et doit donc être déclarée dans celle ci ;)

    @Override
    String getValue() {
        return "SmallRectangleValue";
    }
}
