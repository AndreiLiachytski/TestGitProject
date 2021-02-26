import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionRipper {

    public String showClassName(Object object) {
        Class aClass = object.getClass();
        System.out.println(aClass.getName());
        return aClass.getName();
    }

    public String showClassesName(Object object) {
        Class[] array = object.getClass().getDeclaredClasses();
        System.out.println(Arrays.toString(array));
        return Arrays.toString(array);
    }

    public Field[] showFields(Object object) {
        Class aClass = object.getClass();
        System.out.println(Arrays.toString(aClass.getDeclaredFields()));
        return aClass.getDeclaredFields();

    }

    public String[] showNestedClassFields(Object object) {
        Class[] arrayClasses = object.getClass().getDeclaredClasses();
        String[] arrayFields = new String[arrayClasses.length];
        for (int i = 0, j = 0; i < arrayClasses.length; i++, j++) {
            Field[] arr = arrayClasses[i].getDeclaredFields();
            arrayFields[i] = Arrays.toString(arr);
        }
        return arrayFields;
    }

    public void setName(Object object, String name) throws IllegalAccessException {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();
        fields[0].setAccessible(true);
        fields[0].set(object, name);
        fields[0].setAccessible(false);
    }

}
