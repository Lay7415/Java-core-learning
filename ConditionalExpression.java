public class ConditionalExpression {
    public static void main(String[] args) {
        boolean a1 = (5 > 6) || (4 < 6); 
        boolean a2 = (5 > 6) || (4 > 6); 
        // boolean a3 = (5 > 6) && (4 < 6); 
        boolean a4 = (50 > 6) && (4 / 2 < 3); 
        boolean a5 = (5 < 6) ^ (4 > 6); 
        boolean a6 = (50 > 6) ^ (4 / 2 < 3); 
        System.out.println(a1);
        System.out.println(a2);
        // System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
    }
}
