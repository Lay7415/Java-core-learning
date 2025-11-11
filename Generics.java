public class Generics {
    public static void main(String[] args) {
        Person<Integer> tom = new Person<Integer>(455, "Tom");
        Person<String> bob = new Person<String>("h324", "Bob");
        Integer tomId = tom.getId();
        String bobId = bob.getId();
        System.out.println(tomId);
        System.out.println(bobId);
    }
}

class Person<T> {
    private T id;
    private String name;

    T getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    Person(T id, String name){
        this.id = id;
        this.name = name;
    }
}

