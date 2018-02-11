package com.brainacademy.labwork2_16_4;

public class Main {
    public static void foo(Animal a) {
        System.out.println("Animal");
    }

    public static void foo(Dog d) {
        System.out.println("Dog");
    }

    public static void foo(Puppy p) {
        System.out.println("Puppy");
    }

    public static void main(String[] strings) {

        System.out.println("******************************************");
        System.out.println("Labwork 2.16.4");
        System.out.println("-------------------------------------------");
        foo(new Animal());
        foo(new Dog());
        foo(new Puppy());
        System.out.println("******************************************");
    }

}
