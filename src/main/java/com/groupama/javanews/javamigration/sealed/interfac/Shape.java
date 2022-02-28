package com.groupama.javanews.javamigration.sealed.interfac;

public sealed interface Shape permits Circle, Rectangle {
    
    // L'interface est scellée 
    // Elle doit donc déclarer les classes qui peuvent l'implémenter
    // Ici Circle & Rectangle
    String getName();
}
