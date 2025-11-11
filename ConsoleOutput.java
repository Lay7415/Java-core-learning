import java.util.Scanner;

public class ConsoleOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.printf("your name is %s", name);

        System.out.print("enter you number: ");
        int number = scanner.nextInt();
        System.out.println();
        System.out.printf("your number is %d", number);
        System.out.println();
        scanner.close();
    }
}
