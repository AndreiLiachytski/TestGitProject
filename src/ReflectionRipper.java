import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionRipper {

    public void showClassName(Object object) {
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }

    public void showClassesName(Object object) {
        Class[] array = object.getClass().getDeclaredClasses();
        for (Class aClass : array) {
            System.out.println(aClass.getName());
        }
    }

    public void showFields(Object object) {
        Class aClass = object.getClass();
        System.out.println(Arrays.toString(aClass.getDeclaredFields()));

    }

    public void showNestedClassFields(Object object) {
        Class[] array = object.getClass().getDeclaredClasses();
        for (Class aClass : array) {
            System.out.println(Arrays.toString(aClass.getDeclaredFields()));
        }
    }

    public void setName(Object object, String name) throws IllegalAccessException {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();
        fields[0].setAccessible(true);
        fields[0].set(object, name);
        fields[0].setAccessible(false);
    }

}
