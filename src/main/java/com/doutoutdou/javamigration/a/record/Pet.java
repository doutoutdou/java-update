package com.doutoutdou.javamigration.a.record;

import org.apache.commons.lang3.StringUtils;

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

    // Constructeur qui permet d'ajouter une règle de gestion
    // commenté car celui en dessous est un équivalent (proposé automatiquement par Intellij
//    public Pet(String name, PetType petType, Gender gender) {
//        if (StringUtils.isBlank(name)) {
//            throw new IllegalArgumentException("name must not be empty");
//        }
//        this.name = name;
//        this.petType = petType;
//        this.gender = gender;
//    }

    public Pet {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("name must not be empty");
        }
    }
}
