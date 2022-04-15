package com.doutoutdou.javamigration.b.sealed.withrecord;

public sealed interface Shape permits Circle, Rectangle {
    
    // L'interface est scellée
    // Elle doit donc déclarer les classes qui peuvent l'étendre
    // Ici Circle & Rectangle
    String getName();
}
