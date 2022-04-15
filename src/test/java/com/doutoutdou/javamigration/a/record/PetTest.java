package com.doutoutdou.javamigration.a.record;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@ExtendWith(MockitoExtension.class)
class PetTest {

    @Test
    void test() {

        Gender genderX = new Gender("X");
        var cat = new Pet("Milou", PetType.CAT, genderX);

        Gender genderY = new Gender("Y");
        var dog = new Pet("Felix", PetType.DOG, genderY);

        var duck = Pet.unnamedPet(PetType.DUCK, genderX);

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Pet("", PetType.CAT, genderX));
        
        // le nom des getter correspond aux noms des attributs
        assertEquals(PetType.CAT, cat.petType());
        // Ici on utilise une méthode custo pour récupérer le type sans avoir un gender().gender()
        assertEquals("X", cat.gender().get());
        assertEquals("Milou", cat.name());

        assertEquals(PetType.DOG, dog.petType());
        assertEquals("Y", dog.gender().get());
        assertEquals("Felix", dog.name());

        assertEquals(PetType.DUCK, duck.petType());
        assertEquals("X", duck.gender().get());
        // Nom par défaut
        assertEquals("John_doe", duck.name());

    }
}
