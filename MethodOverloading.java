public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2, 3));
        System.out.println(calculator.sum(5.5, 4.4));
        System.out.println(calculator.sum(3, 2, 4));
    }
}

class Calculator {
    int sum(int x, int y) {
        return x + y;
    }

    double sum(double x, double y) {
        return x + y;
    }

    int sum(int x, int y, int z) {
        return x + y + z;
    }
}