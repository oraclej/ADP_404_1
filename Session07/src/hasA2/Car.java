package hasA2;

public class Car {
    private String name;
    private Engine engine;

    public Car(int engineVolume){
        this.engine = new Engine(engineVolume);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
