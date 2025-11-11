public class ClassesAndObjects {
    public static void main(String[] args) {
        Person tom = new Person();
        Person bob = new Person();

        tom.name = "Tom";
        tom.age = 5;

        bob.name = "Bob";
        bob.age = 46;

        System.out.println(tom.name);
        System.out.println(tom.age);

        System.out.println(bob.name);
        System.out.println(bob.age);
    }
}

class Person {
    String name;
    int age;
}
