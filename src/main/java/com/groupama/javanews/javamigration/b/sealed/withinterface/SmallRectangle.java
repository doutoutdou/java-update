package com.groupama.javanews.javamigration.b.sealed.withinterface;

public final class SmallRectangle implements Rectangle {
    
    // La classe est finale et donc non "étendable"
    // Elle hérite de rectangle et doit donc être déclarée dans celle ci ;)

    @Override
    public String getValue() {
        return "SmallRectangleValue";
    }
}
