package com.groupama.javanews.javamigration.c.switchevolution;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class SwitchTest {
    
    @Test
    void test() {
        Switch mySwitch = new Switch();
        
        // PRE JAVA 14
        assertEquals("default", mySwitch.processEnumBefore(Switch.EnumExample.E));
        assertEquals("AB", mySwitch.processEnumBefore(Switch.EnumExample.B));
        assertEquals("AB", mySwitch.processEnumBefore(Switch.EnumExample.A));
        assertEquals("C", mySwitch.processEnumBefore(Switch.EnumExample.C));

        // JAVA 14
        assertEquals("default", mySwitch.processEnumJava14(Switch.EnumExample.E));
        assertEquals("AB", mySwitch.processEnumJava14(Switch.EnumExample.B));
        assertEquals("AB", mySwitch.processEnumJava14(Switch.EnumExample.A));
        assertEquals("C", mySwitch.processEnumJava14(Switch.EnumExample.C));

        // JAVA 14 multi opération
        assertEquals("default", mySwitch.processEnumJava14MultipleOperations(Switch.EnumExample.E));
        assertEquals("AB", mySwitch.processEnumJava14MultipleOperations(Switch.EnumExample.B));
        assertEquals("AB", mySwitch.processEnumJava14MultipleOperations(Switch.EnumExample.A));
        assertEquals("C", mySwitch.processEnumJava14MultipleOperations(Switch.EnumExample.C));
    }
}
