import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ReflectionRipperTest {

    Car testCar = new Car("Lada", 4, 4);
    ReflectionRipper reflectionRipper = new ReflectionRipper();

    @Test
    public void showClassName() {
        String expected = "Car";
        String result = reflectionRipper.showClassName(testCar);
        assertEquals(expected, result);
    }

    @Test
    public void showFields() {
        String expected = "[private final java.lang.String Car.name, private final int Car.doorsCount, private final int Car.wheelCount]";
        Field[] result = reflectionRipper.showFields(testCar);
        assertEquals(expected, Arrays.toString(result));
    }

    @Test
    public void showClassesName() {
        String expected = "[class Car$Engine]";
        String result = reflectionRipper.showClassesName(testCar);
        assertEquals(expected, result);
    }

    @Test
    public void showNestedClassFields() {
        String expected = "[[private int Car$Engine.power, private int Car$Engine.rpm, final Car Car$Engine.this$0]]";
        String[] result = reflectionRipper.showNestedClassFields(testCar);
        assertEquals(expected, Arrays.toString(result));
    }

    @Test
    public void setName() throws IllegalAccessException {
        String expected = "someName";
        reflectionRipper.setName(testCar, expected);
        String result = testCar.getName();
        assertEquals(expected, result);
    }

}
