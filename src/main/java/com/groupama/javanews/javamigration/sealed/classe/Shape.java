package com.groupama.javanews.javamigration.sealed.classe;

public abstract sealed class Shape permits Circle, Rectangle {
    
    // La classe est scellée 
    // Elle doit donc déclarer les classes qui peuvent l'étendre
    // Ici Circle & Rectangle
    abstract String getName();
}
