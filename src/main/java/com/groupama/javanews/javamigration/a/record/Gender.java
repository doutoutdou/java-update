package com.groupama.javanews.javamigration.a.record;

public record Gender(String gender) {
    
    // Permet d'éviter de faire monObjet.gender().gender() ...
    // On peut aussi renommer le nom de l'objet evidemment
    public String get() {
        return gender();
    }
}
