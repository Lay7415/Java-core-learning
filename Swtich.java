public class Swtich {
    public static void main(String[] args) {
        int operation = 1;
        int a = 10, b = 6;

        int result = switch (operation) {
            case 1 -> {
                System.out.println("a+b");
                yield a + b;
            }
            case 2 -> {
                System.out.println("a-b");
                yield a - b;
            }
            default -> {
                System.out.println("Unknown operation");
                yield 0;
            }
        };
        System.out.println(result);

        switch (operation) {
            case 1 -> System.out.println("a + b = " + (a + b));
            case 2 -> System.out.println("a - b = " + (a - b));
            default -> System.out.println("Unknown operation");
        }
    }
}
