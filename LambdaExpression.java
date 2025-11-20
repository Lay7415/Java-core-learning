public class LambdaExpression {
    public static void main(String[] args) {
        Operationable op;
        doOperation(getOperation(1), 3,4);
    };

    public static Operationable getOperation(int operation) {
        switch(operation){
            case 1: return (x, y) -> x + y; 
            case 2: return (x, y) -> x - y; 
            case 3: return (x, y) -> x * y; 
            default: return (x,y) -> 0;
        }
    }

    public static void doOperation(Operationable op, int x, int y) {
        System.out.println(op.execute(x, y));
    }
}

interface Operationable {
    int execute(int x, int y);
}