package com.doutoutdou.javamigration.e.patternmatching;

import com.doutoutdou.javamigration.e.patternmatching.withclass.ComputeWithClass;
import com.doutoutdou.javamigration.e.patternmatching.withclass.model.Circle;
import com.doutoutdou.javamigration.e.patternmatching.withclass.model.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ComputeWithClassTest {
    
    @Test
    void test() {
        var rectangle = new Rectangle(4, 4);
        var circle = new Circle(3);
        
        
        double rectanglePerimeterBefore = ComputeWithClass.getPerimeterBefore(rectangle);
        Assertions.assertEquals(16, rectanglePerimeterBefore);
        
        double circlePerimeterBefore = ComputeWithClass.getPerimeterBefore(circle);
        Assertions.assertEquals(18, circlePerimeterBefore);

        double rectanglePerimeter = ComputeWithClass.getPerimeter(rectangle);
        Assertions.assertEquals(16, rectanglePerimeter);

        double circlePerimeter = ComputeWithClass.getPerimeter(circle);
        Assertions.assertEquals(18, circlePerimeter);

        double rectanglePerimeterWithSwitch = ComputeWithClass.getPerimeterWithSwitch(rectangle);
        Assertions.assertEquals(16, rectanglePerimeterWithSwitch);

        double circlePerimeterWithSwitch = ComputeWithClass.getPerimeterWithSwitch(circle);
        Assertions.assertEquals(18, circlePerimeterWithSwitch);
        

    }
}
