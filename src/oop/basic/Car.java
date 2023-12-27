package oop.basic;

public class Car {
    private String engine;
    private String transmission;
    private Integer wheels;

    public Car(String engine) {
        this.engine = engine;
    }

    public Car(String engine, String transmission, Integer wheels) {
        if (wheels < 0) {
            throw new RuntimeException("Incorrect count of wheels");
        }
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
    }

    public Car(Integer wheels) {
        this.wheels = wheels;
    }

    public Car(String engine, String transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public Car() {

    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        if (wheels < 0) {
            throw new RuntimeException("Incorrect count of wheels");
        }
        this.wheels = wheels;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Car)) return false;
        Car car = (Car) obj;
        return this.engine.equals(car.engine);
    }

    @Override
    public String toString() {
        return "oop.basic.Car{" +
                "engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
