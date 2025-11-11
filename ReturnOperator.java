public class ReturnOperator {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.asString(7));
        System.out.println(time.asString(13));
        System.out.println(time.asString(18));
        System.out.println(time.asString(2));
    }
}

class Time {
    String asString(int hour) {

        if (hour > 24 || hour < 0)
            return "Invalid data";

        else if (hour > 21 || hour < 6)
            return "Good night";

        else if (hour >= 15)
            return "Good evening";

        else if (hour >= 11)
            return "Good after noon";

        else
            return "Good morning";
    }
}