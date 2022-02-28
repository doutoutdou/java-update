package com.groupama.javanews.javamigration.record;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class PetStore {

    public List<Pet> createAndReturnPets() {

        Gender genderX = new Gender("X");
        Pet cat = new Pet("Milou", PetType.CAT, genderX);

        Gender genderY = new Gender("Y");
        Pet dog = new Pet("Felix", PetType.DOG, genderY);

        Pet duck = Pet.unnamedPet(PetType.DUCK, genderX);

        return Arrays.asList(cat, dog, duck);
    }
   
}
