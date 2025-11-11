public class MultipleImplementation {
    public static void main(String[] args) {
        Console book = new EBook();
        book.print();
    }
}

interface Printable {
    default void print() {
        System.out.println("Печатаем на принтере");
    }
}

interface Console {
    default void print() {
        System.out.println("Печатаем на консоли");
    }
}

class EBook implements Printable, Console {
    public void print() {
        Printable.super.print();
    }
}