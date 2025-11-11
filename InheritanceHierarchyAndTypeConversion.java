public class InheritanceHierarchyAndTypeConversion {

    public static void main(String[] args) {

        Person tom = new Person("Tom");
        tom.print();
        Person sam = new Employee("Sam", "Yandex");
        sam.print();
        Person bob = new Client("Bob", "SberBank");
        bob.print();

        printClient(bob);
    }

    static void printClient(Person person) {
        if (person instanceof Client) {
            System.out.println("this class belongs to Client");
        }
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    void print() {
        System.out.printf("Person name is %s", this.name);
    }

    public String getName() {
        return this.name;
    }

}

class Employee extends Person {
    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    void print() {
        System.out.printf("Person name is %s\n Person company is %s\n", super.getName(), this.getCompany());
    }
}

class Client extends Person {

    private String bank;

    String getBank() {
        return bank;
    }

    public Client(String name, String bank) {
        super(name);
        this.bank = bank;
    }

    @Override
    void print() {
        System.out.printf("Client %s has account in %s \n", super.getName(), this.bank);
    }
}