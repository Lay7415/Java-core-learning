public class Incapsulation {
    public static void main(String[] args) {
        Person tom = new Person("Tom", 4);
        tom.print();
    }
}

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.printf("Name is %s\nAge is %d\n", this.getName(), this.getAge());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 && age > 110)
            this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
