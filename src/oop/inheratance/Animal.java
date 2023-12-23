package oop.inheratance;

public class Animal {

    String name;
    String age;

    public void sleep() {
        System.out.println("The animal sleeping");
    }

    public void eat() {
        System.out.println("The animal eating");
    }

}

interface Flyable {
    void fly();

    default void fall() {
        System.out.println("animal is falling");
    }
}

interface Swimable {
    void swim();
}

interface Actions extends Swimable, Flyable {
}

class Dog extends Animal {

}

class Cat extends Animal {

}

class Duck extends Animal implements Actions {

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming");
    }
}

class DF extends Duck {
    @Override
    public void fall() {
        System.out.println("");
    }
}

class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Duck duck = new Duck();

        dog.eat();
        duck.fly();
        duck.swim();
    }
}



