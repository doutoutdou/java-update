package com.doutoutdou.javamigration.c.switchevolution;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Switch {

    public enum EnumExample {

        A,
        B,
        C,
        D,
        E,
        F;
    }
    
    // Pre JAVA 12
    public String processEnumBefore(EnumExample enumExample) {

        String valueFromSwitch;
        
        switch (enumExample) {
            case A:
            case B:
                valueFromSwitch = "AB";
                break;
            case C:
                valueFromSwitch = "C";
                break;
            case D:
                valueFromSwitch = "D";
                break;
            default:
                valueFromSwitch = "default";
        }
        
        return valueFromSwitch;
    }

    // JAVA 14 avec retour d'une variable
    public String processEnumJava14(EnumExample enumExample) {

        // Passage par une variable intermediaire volontairement pour montrer le retour d'une variable
        // var car j'aime ça ;)
        
        // On retourne directement l'objet sans avoir à l'instancier auparavant
        // plus besoin de break <3
        var valueFromSwitch = switch (enumExample) {
            case A, B -> "AB";
            case C -> "C";
            case D -> "D";
            default -> "default";
        };
        
        // Attention il faut bien mettre un ; à la fin car le switch est maintenant une expression et non plus un statement
        
        return valueFromSwitch;

    }

    // JAVA 14 avec plusieurs opérations
    public String processEnumJava14MultipleOperations(EnumExample enumExample) {

        // Passage par une variable intermediaire volontairement pour montrer le retour d'une variable
        // var car j'aime ça ;)

        // On a ici besoin de réaliser plusieurs opérations, on utilise donc le mot clé yield pour indiquer le retour 
        // a noter qu'il faut bien mettre les opérations entre {}
        var valueFromSwitch = switch (enumExample) {
            case A, B -> {
                log.info("Passage AB");
                yield "AB";
            }
            case C -> "C";
            case D -> "D";
            default -> "default";
        };

        // Attention il faut bien mettre un ; à la fin car le switch est maintenant une expression et non plus un statement

        return valueFromSwitch;

    }
}
