public class Recursion {
    public static void main(String[] args) {
        int fib2 = MyMath.fibCycle(2);
        int fib4 = MyMath.fib(4);
        System.out.println(fib2);
        System.out.println(fib4);
    }
}

class MyMath {
    static int fibCycle(int n) {
        int result = 0;
        int b = 1;
        int tmp;

        for (int i = 0; i < n; i++) {
            tmp = result;
            result = b;
            b += tmp;
        }

        return result;
    }

    static int fib(int n) {

        if (n == 0 || n == 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

}