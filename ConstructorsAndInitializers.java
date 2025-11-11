public class ConstructorsAndInitializers {
    public static void main(String[] args) {
        Person tom = new Person();
        Person bob = new Person();
        Person sam = new Person();

        tom.print();
        bob.print();
        sam.print();
    }
}

class Person {
    String name;
    int age;

    {
        name = "Undefind";
        age = 18;
    }

    Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    void print() {
        System.out.printf("Name %s; Age %d\n", name, age);
    }
}

