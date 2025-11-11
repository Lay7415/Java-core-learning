public class ArithmeticOperation {
    public static void main(String[] args) {
    int a = 10;
    int b = 7;
    int c = a + b;  // 17
    System.out.println("c = " + c);

    int d = 4 + b;  // 11
    System.out.println("d = " + d);

    int addA = 10;
    int addB = 7;
    int addC = addA - addB;  // 3
    System.out.println("addC = " + addC);

    int addD = 4 - addA;  // -6
    System.out.println("addD = " + addD);

    int mulA = 10;
    int mulB = 7;
    int mulC = mulA * mulB;  // 70
    System.out.println("mulC = " + mulC);

    int mulD = mulB * 5;  // 35
    System.out.println("mulD = " + mulD);

    int divA = 20;
    int divB = 5;
    int divC = divA / divB;  // 4
    System.out.println("divC = " + divC);

    double divD = 22.5 / 4.5;  // 5.0
    System.out.println("divD = " + divD);

    double k1 = 10 / 4;     // 2
    System.out.println("k1 = " + k1);

    double k2 = 10.0 / 4;     // 2.5
    System.out.println("k2 = " + k2);

    int modA = 33;
    int modB = 5;
    int modC = modA % modB;  // 3
    System.out.println("modC = " + modC);

    int modD = 22 % 4; // 2 (22 - 4*5 = 2)
    System.out.println("modD = " + modD);

    int incA = 8;
    int incB = ++incA;
    System.out.println("incA = " + incA);  // 9
    System.out.println("incB = " + incB);  // 9

    int postIncA = 8;
    int postIncB = postIncA++;
    System.out.println("postIncA = " + postIncA);  // 9
    System.out.println("postIncB = " + postIncB);  // 8

    int decA = 8;
    int decB = --decA;
    System.out.println("decA = " + decA);  // 7
    System.out.println("decB = " + decB);  // 7

    int postDecA = 8;
    int postDecB = postDecA--;
    System.out.println("postDecA = " + postDecA);  // 7
    System.out.println("postDecB = " + postDecB);  // 8
    System.out.println(a);  // 7
    System.out.println(b);  // 8
    }
}
