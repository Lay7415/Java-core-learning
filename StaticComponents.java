public class StaticComponents {
    public static void main(String[] args) {
        System.out.println(Operation.sum(3, 4));
        System.out.println(Operation.substract(3, 4));
        System.out.println(Operation.multiply(3, 4));
        System.out.println(Operation.devide(4, 2));
    }
}

class Operation {
    static int sum(int x, int y) {
        return x + y;
    }

    static int substract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static int devide(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return x / y;
    }
}
