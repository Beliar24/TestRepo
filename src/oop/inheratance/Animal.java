package oop.inheratance;

public abstract class Animal {

    void eat() {
        System.out.println("The animal is eating");
    }
    abstract void drink();
}

abstract class Mammal extends Animal {
}

class Dog extends Mammal {


    @Override
    void drink() {
        System.out.println("The dog is drinking");
    }
}

class Cat extends Mammal {

    @Override
    void drink() {
        System.out.println("The cat is drinking");
    }
}

//abstract class Error {
//    String statusCode;
//    String message;
//
//    public Error(String statusCode, String message) {
//        this.statusCode = statusCode;
//        this.message = message;
//    }
//
//
//}
//
//class ErrorResource extends Error {
//
//    public ErrorResource(String statusCode, String message) {
//        super(statusCode, message);
//    }
//
//    String errorResource;
//}
//
//class ErrorUserCreator extends Error {
//
//    public ErrorUserCreator(String statusCode, String message) {
//        super(statusCode, message);
//    }
//
//}



class TestAnimal {
    public static void main(String[] args) {
       Mammal animal = new Dog();

       animal.drink();

       animal = new Cat();

       animal.drink();
    }
}



