public class Incheritance {
    public static void main(String[] args) {
        Goblin goban = new Goblin("Goban", 44);
        goban.print();
    }
}

class Mammal {
    private String name;

    Mammal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Goblin extends Mammal {
    private int strength;

    Goblin(String name, int strength) {
        super(name);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void print() {
        System.out.printf("Name is %s\n Strength is %d\n", super.getName(), this.getStrength());
    }

}