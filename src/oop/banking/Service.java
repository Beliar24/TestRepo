package oop.banking;

public class Service {
    public static void main(String[] args) {
        Bill johnAccount = new Bill(10000);
        Bill aliceAccount = new Bill(12000);

        Person john = new Person("John", johnAccount);
        Person alice = new Person("Alice", aliceAccount);

        sum(john, 2000);

    }


    static void sum(Person person, int amount) {
        int currentSum = person.getAccount().getAmount();
        System.out.println("Current sum before operation - " + currentSum);

        person.getAccount().setAmount(currentSum + amount);

        System.out.println("Current sum is - " + person.getAccount().getAmount());
    }


}
