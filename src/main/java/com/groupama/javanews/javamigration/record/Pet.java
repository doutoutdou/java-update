package com.groupama.javanews.javamigration.record;

public record Pet(String name, PetType petType, Gender gender) {
    // On défini un record qui a 3 attributs
    // Un objet
    // Une enum
    // Un objet custo 
    
    // On ajoute un attribut static pour avoir un nom par défaut

    private static final String UNKNOWN_NAME = "John_doe";

    public static Pet unnamedPet(PetType petType, Gender gender) {
        return new Pet(UNKNOWN_NAME, petType, gender);
    }
}
