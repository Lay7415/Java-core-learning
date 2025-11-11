public class Cycles {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    continue; 
                }
                if (i % j != 0) {
                    continue;
                }
                System.out.print(i * j);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("_______________");
        int c = 0;
        do{
            c++;
            System.out.println(c);
        } while(c < 10);
    }
}
