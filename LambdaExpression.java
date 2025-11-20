import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaExpression {
    public static void main(String[] args) {
        Operationable op;
        doOperation(getOperation(1), 3, 4);

        Predicate<Integer> predicate = (x) -> String.valueOf(x) == "4";
        System.out.println(predicate.test(4));

        BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;
        UnaryOperator<Double> unaryOperator = (x) -> Math.sqrt(x);
        Function<Integer, String> funcation = (x) -> String.valueOf(x) + "$";
        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y;
        Consumer<String> consumer = (x) -> System.out.println(x);
        Supplier<String> supplier = () -> "Hello";
        System.out.println(binaryOperator.apply(3, 4));
        System.out.println(unaryOperator.apply(4.3));
        System.out.println(funcation.apply(5));
        System.out.println(biFunction.apply(3, 4));
        consumer.accept("lasjdfk");
        System.out.println(supplier.get());

    };

    public static Operationable getOperation(int operation) {
        switch (operation) {
            case 1:
                return (x, y) -> x + y;
            case 2:
                return (x, y) -> x - y;
            case 3:
                return (x, y) -> x * y;
            default:
                return (x, y) -> 0;
        }
    }

    public static void doOperation(Operationable op, int x, int y) {
        System.out.println(op.execute(x, y));
    }
}

interface Operationable {
    int execute(int x, int y);
}