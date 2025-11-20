public class LambdaExpression {
    public static void main(String[] args) {
        Operationale op;
        op = (x, y) -> x+y;

        int result = op.execute(3,4);
        System.out.println(result);
    }
}

interface Operationable {
    int execute(int x, int y);
}