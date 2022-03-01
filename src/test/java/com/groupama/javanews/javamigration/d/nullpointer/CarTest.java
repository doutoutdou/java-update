package com.groupama.javanews.javamigration.d.nullpointer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class CarTest {

    @Test
    void test() {
        // On construit une voiture sans indiquer la liste des owner
        Car car = Car.builder().brand("renault")
            .color("white")
            .build();

        car.getOwner().get(0);

        // On voit que le message d'erreur est bien plus précis qu'avant
        // java.lang.NullPointerException: Cannot invoke "java.util.List.get(int)" 
        // because the return value of "com.groupama.javanews.javamigration.d.nullpointer.Car.getOwner()" is null
        // at com.groupama.javanews.javamigration.d.nullpointer.CarTest.test(CarTest.java:19)

        // auparavant on aurait eu qqch semblable à ça
//        Exception in thread "main" java.lang.NullPointerException
//        at com.groupama.javanews.javamigration.d.nullpointer.CarTest.main(CarTest.java:19)
    }
}
