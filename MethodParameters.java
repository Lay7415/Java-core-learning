public class MethodParameters {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum("+", 1, 2, 3, 4);
    }
}

class Calculator {
    void sum(String message, int... numbers) {
        System.out.println(message);

        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        System.out.println(result);
    }
}