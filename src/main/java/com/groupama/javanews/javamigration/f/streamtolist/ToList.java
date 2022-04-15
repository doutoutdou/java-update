package com.groupama.javanews.javamigration.f.streamtolist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToList {
    
    public void StreamToList() {
        List<String> integersAsString = Arrays.asList("1", "2", "3");
        
        // PRE JAVA 16
        List<Integer> ints = integersAsString.stream().map(Integer::parseInt).collect(Collectors.toList());
        
        // JAVA 16
        List<Integer> intsEquivalent = integersAsString.stream().map(Integer::parseInt).toList();
    }
}
