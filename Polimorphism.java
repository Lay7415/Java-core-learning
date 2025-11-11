public class Polimorphism {
    public static void main(String[] args) {
        Person person1 = personDefault(0);
        person1.print();

        System.out.println();

        Person person2 = personDefault(1);
        person2.print();
    }

    static Person personDefault(int type) {
        if(type ==0) {
            return new Person("Tom");
        }
        return new Employee("Tom", "OOO Undefinded");
    }
}


class Person {
    private String name;
    Person(String name) {
        this.name = name;
    }

    void print(){
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
    void print(){
        super.print();
        System.out.println("Company: " + company);
    }
}