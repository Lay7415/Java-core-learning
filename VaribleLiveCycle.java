public class VaribleLiveCycle {
    public static void main(String[] args) {
        Person.printCount();
        Person bob = new Person("Bob");
        {
            Person tom = new Person("Tom");
            tom.printName();
        }
        bob.printName();
        Person.printCount();
    }
}

class Person {
    String name;
    static int count = 0;

    public Person(String name) {
        this.name = name;
        count++;
    }

    public void printName() {
        System.out.printf("Name is %s", name);
        System.out.println();
    }

    public static void printCount() {
        System.out.printf("Count: %d", count);
        System.out.println();
    }
}