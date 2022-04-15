package com.doutoutdou.javamigration.e.patternmatching;

import com.doutoutdou.javamigration.e.patternmatching.withrecord.ComputeWithRecord;
import com.doutoutdou.javamigration.e.patternmatching.withrecord.model.Circle;
import com.doutoutdou.javamigration.e.patternmatching.withrecord.model.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ComputeWithRecordTest {
    
    @Test
    void test() {
        var rectangle = new Rectangle(4, 4);

        double rectanglePerimeterWithSwitch = ComputeWithRecord.getPerimeterWithSwitch(rectangle);
        Assertions.assertEquals(16, rectanglePerimeterWithSwitch);

        double rectanglePerimeterWithSwitchAndConditions = ComputeWithRecord.getPerimeterWithSwitchAndConditions(rectangle);
        Assertions.assertEquals(16, rectanglePerimeterWithSwitchAndConditions);

        // On vérifie que notre condition est bien respectée
        var otherRectangle = new Rectangle(2, 2);
        double otherRectanglePerimeterWithSwitchAndConditions = ComputeWithRecord.getPerimeterWithSwitchAndConditions(otherRectangle);
        Assertions.assertEquals(4, otherRectanglePerimeterWithSwitchAndConditions);

        var circle = new Circle(3);
        double circlePerimeterWithSwitch = ComputeWithRecord.getPerimeterWithSwitch(circle);
        Assertions.assertEquals(18, circlePerimeterWithSwitch);

        double circlePerimeterWithSwitchAndConditions = ComputeWithRecord.getPerimeterWithSwitchAndConditions(circle);
        Assertions.assertEquals(18, circlePerimeterWithSwitchAndConditions);
        

    }
}
