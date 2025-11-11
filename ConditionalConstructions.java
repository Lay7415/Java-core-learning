public class ConditionalConstructions {
    public static void main(String[] args) {
        String name = "Red Raptor";

        if (name.equals("Red Raptor")) {
            System.out.println("Red Raptor is win!");
        } else {
            System.out.println("Red Raptor is lose!");
        }

        int x = 3;
        int y = 2;
        int z = x < y ? x + y : x - y;
        System.out.println(z);
    }
}
