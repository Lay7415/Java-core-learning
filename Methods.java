public class Methods {
    public static void main(String[] args) {
        Person tom = new Person();
        tom.name = "Tom";
        tom.age = 4;
        tom.print();
    }

}

class Person {
    String name;
    int age;

    void printName() {
        System.out.printf("Name is %s\n", name);
    }

    void printAge() {
        System.out.printf("Age is %d\n", age);
    }

    void print() {
        printName();
        printAge();
    }
}