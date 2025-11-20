public class RecordsEx {
    
    public static void main(String[] args) {
        Person tom = new Person("tom", 41);
        System.out.println(tom);
        System.out.println(tom.name());
    }
}

record Person(String name, int age) {
    public String name() {
        return this.name + "lasjdflkasjdf";
    }

    public String toString() {
        return String.format("Person %s, age %d", this.name(), this.age());
    }
}

