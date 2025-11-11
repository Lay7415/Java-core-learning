package person;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.printf("Name is %s\nAge is %d\n", name, age);
    }
}