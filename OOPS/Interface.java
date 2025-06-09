package OOPS;

interface Animal {
    void bark();

    default void sleep() {
        System.out.println("Sleeping...");
    }

}

class Dog implements Animal {
    public void bark() {
        System.out.println("WOOF");
    }

    @Override
    public void sleep() {
        System.out.println("The Dog is Sleeping!!!");
    }
}

class Cat implements Animal {
    public void bark() {
        System.out.println("MEOW");
    }
}

public class Interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.sleep();

        System.out.println();

        Cat cat = new Cat();
        cat.bark();
        cat.sleep();
    }
}
