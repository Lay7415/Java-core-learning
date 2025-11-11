public class BitwiseOpertaion {
    public static void main(String[] args) {
        int value1 = 3;
        int value2 = 2;
        int value3 = 1;
        int result = 0b0000_0000;
        result = result | value1;
        result = result << 2;
        result = result | value2;
        result = result << 2;
        result = result | value3;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));

        int newVal1 = result & value1;
        result = result >> 2;
        int newVal2 = result & value1;
        result = result >> 2;
        int newVal3 = result & value1;
        System.out.println(newVal1);
        System.out.println(newVal2);
        System.out.println(newVal3);
        
    }
}
