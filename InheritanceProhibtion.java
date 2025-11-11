public class InheritanceProhibtion {
    public static void main(String[] args) {
        Employee bob = new Employee("Bob", "Google");
        bob.print();
    }
}

class Person {

    private String name;

    Person(String name) {

        this.name = name;
        print();
    }

    // final void print(){

    // System.out.println("Name: " + name);
    // }

    void print() {

        System.out.println("Name: " + name);
    }
}

class Employee extends Person {

    private String company;

    Employee(String name, String company) {

        super(name);
        this.company = company;
    }

    @Override
    void print() {
        super.print();
        System.out.println("Company: " + company);
    }
}