public class Interfaces {
    public static void main(String[] args) {
        Goblin gob = new Goblin("Gob", 5, 10);
        gob.attack();
        gob.run();
        gob.defend();
    }
}

interface GoblinInterface {
    void attack();

    void run();

    void defend();
}

class Goblin implements GoblinInterface {
    private String name;
    private int age;
    private int power;

    public Goblin(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
        System.out.printf("Goblin with name %s was created\n", name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPower() {
        return power;
    }

    @Override
    public void attack() {
        System.out.printf("Goblin with name %s attack to someone with power %d\n", this.getName(), this.getPower());
    }

    @Override
    public void run() {
        System.out.printf("Goblin with name %s run from someone\n", this.getName());
    }

    @Override
    public void defend() {
        System.out.printf("Goblin with name %s are defending\n", this.getName());
    }

}