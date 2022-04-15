package com.doutoutdou.javamigration.g.textblock;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@Slf4j
@ExtendWith(MockitoExtension.class)
class ParseStringText {
    
    @Test
    void test() {
        
        String parserDuJsonEstUnePlaie = 
            "{\n" +
            " \"id\" : \"a9065e9f-7bed-4c0e-a78f-288c6b359f69\",\n" +
            " \"failureFactor\" : \"3\",\n" +
            " \"password\" : \"youwillneverknown\"\n" +
            "}";

        log.info(parserDuJsonEstUnePlaie);


        // il faut 
        // """ comme délimiteur de début
        // """ comme délimiteur de fin
        
        String cestMieuxAvecUnTextBlock =
            """
                {
                 "id" : "a9065e9f-7bed-4c0e-a78f-288c6b359f69",
                 "failureFactor" : "3",
                 "password" : "youwillneverknown"
                }""";

        log.info(cestMieuxAvecUnTextBlock);

        Assertions.assertEquals(parserDuJsonEstUnePlaie, cestMieuxAvecUnTextBlock);

        // On peut aussi jouer sur l'indentation mais c'est plus rapide de voir par ici si besoin
        // https://blog.oxiane.com/2020/06/24/java-14-text-blocks/
        
    }
}
