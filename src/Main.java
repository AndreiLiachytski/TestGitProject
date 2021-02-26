public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        ReflectionRipper ripper = new ReflectionRipper();

        Car car1 = new Car("Ferrari", 2, 4);
        car1.drive();
        Car car2 = new Car("Mazda", 4, 4);
        car2.drive();

        ripper.showClassName(car1);
        ripper.showFields(car1);
        ripper.showClassesName(car1);
        ripper.showNestedClassFields(car1);
        ripper.setName(car1, "Mercedes-Benz");
        car1.drive();

    }
}
