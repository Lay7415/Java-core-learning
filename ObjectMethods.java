import java.util.Objects;

public class ObjectMethods {
    public static void main(String[] args) {

        Person tom = new Person("Tom");
        tom.toString();
        System.out.println(tom.hashCode());
        Person tom2 = new Person("Tome");
        System.out.println(tom.equals(tom2));

    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    };

    void print() {
        System.out.println("Person: " + name);
    }

    @Override
    public String toString() {
        return this.name;
    }

    // @Override
    // public int hashCode() {
    // return Objects.hash(this.name);
    // }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;
        if (otherObject == null)
            return false;
        if (getClass() != otherObject.getClass())
            return false;
        Person person = (Person) otherObject;

        return this.name == person.name;
    }

}
