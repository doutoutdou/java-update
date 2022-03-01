package com.groupama.javanews.javamigration.d.nullpointer;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Car {
    
    private List<String> owner;
    private String color;
    private String brand;
}
