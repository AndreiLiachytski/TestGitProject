public class Car {
    private final String name;
    private final int doorsCount;
    private final int wheelCount;


    public Car(final String name, final int doorsCount, final int wheelCount) {
        this.name = name;
        this.doorsCount = doorsCount;
        this.wheelCount = wheelCount;
    }

    public void drive() {
        System.out.println(getName() + " is going.");
        Engine engine = new Engine();
        engine.work();
    }

    public String getName() {
        return name;
    }

    private class Engine {
        private int power;
        private int rpm;

        public void work() {
            System.out.println(getName() + "'s engine is working.");
        }

    }
}
