import java.util.*;

class Box<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

public class WildcardsExample {

    public static void printBox(Box<?> box) {
        System.out.println("Содержимое: " + box.get());
        // box.put("что-то");
    }

    public static void processNumber(Box<? extends Number> box) {
        Number num = box.get(); 
        System.out.println("Число × 2 = " + (num.doubleValue() * 2));
        // box.put(42);
    }

    // — Можно записывать Integer, читать только как Object
    public static void addInteger(Box<? super Integer> box, int value) {
        box.put(value);
        System.out.println("Добавлено: " + value);
       
        Object obj = box.get();
        System.out.println("Теперь в коробке (как Object): " + obj);
    }

    public static void main(String[] args) {
       
        Box<String> stringBox = new Box<>();
        stringBox.put("Привет!");
        printBox(stringBox);

       
        Box<Integer> intBox = new Box<>();
        intBox.put(10);
        processNumber(intBox);

        Box<Double> doubleBox = new Box<>();
        doubleBox.put(3.14);
        processNumber(doubleBox);

       
        Box<Integer> intContainer = new Box<>();
        Box<Number> numContainer = new Box<>();
        Box<Object> objContainer = new Box<>();

        addInteger(intContainer, 100); 
        addInteger(numContainer, 200); 
        addInteger(objContainer, 300); 
    }
}