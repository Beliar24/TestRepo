package oop.basic;

public class MainOppClass {
    public static void main(String[] args) {

        Car car2 = new Car();
        Car car3 = new Car("V6", "auto", 3);
        Car car4 = new Car("V6", "auto");
        Car car6 = new Car("V6", "manual");

        /*
        * {
        *   "engine" : "V8",
        *   "transmission": "auto",
        *   "wheels" : 4
        * }
        * */

        System.out.println(car3);

        car3.setWheels(2);

        System.out.println(car3);
    }
}
