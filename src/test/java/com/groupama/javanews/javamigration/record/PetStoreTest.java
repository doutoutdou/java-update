package com.groupama.javanews.javamigration.record;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@ExtendWith(MockitoExtension.class)
class PetStoreTest {

    @InjectMocks
    private PetStore petStore;

    @Test
    void test() {
        List<Pet> pets = petStore.createAndReturnPets();
        Pet cat = pets.get(0);
        Pet dog = pets.get(1);
        Pet duck = pets.get(2);

        // le nom des getter correspond aux noms des attributs
        log.info(cat.toString());
        assertEquals(PetType.CAT, cat.petType());
        assertEquals("X", cat.gender().get());
        assertEquals("Milou", cat.name());

        log.info(dog.toString());
        assertEquals(PetType.DOG, dog.petType());
        assertEquals("Y", dog.gender().get());
        assertEquals("Felix", dog.name());

        log.info(duck.toString());
        assertEquals(PetType.DUCK, duck.petType());
        assertEquals("X", duck.gender().get());
        assertEquals("John_doe", duck.name());

    }
}
