package OOPS;

class Add {
    public int sum(int n1, int n2) { // Parameterized Method/Function;
        return n1 + n2;
    }
}

class Age {
    int age;

    public void getAge(int num) {
        age = num;
    }
}

class Test {
    public static void print() {
        System.out.println("Hello");
    }
}

class Test2 {

    public void print2() { // Without Static;
        System.out.println("bye");
    }
}

public class OOPS {
    public static void main(String[] args) {
        /*
         * Test.print();
         * 
         * Test2 test2 = new Test2(); // An Object
         * test2.print2();
         * 
         * Age age1 = new Age();
         * age1.getAge(15);
         * 
         * Age age2 = new Age();
         * age2.getAge(11);
         * 
         * System.out.println(age2.age);
         * System.out.println(age1.age);
         */

        // Add add = new Add();
        // System.out.println(add.sum(14, 13));

    }
}