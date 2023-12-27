package oop.inheratance;

public class A {
    void method() {
        System.out.println("method A");
    }

    void method_2() {

    }
}

class B extends A {

    final void method() {
        System.out.println("method B");
    }

    void method_s() {
        super.method();
    }
}

class C extends B {
//    void method() {
//        System.out.println("method C");
//    }

    void method_s() {
        super.method_s();
    }
}

class S {
    public static void main(String[] args) {
//        B b = new B();
//        C c = new C();
//
//        b.method();
//        b.method_s();
//
//        c.method();
//        c.method_s();
//        c.method_2();

        final int a = 10;

        System.out.println(a);
    }
}