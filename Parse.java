
public class Parse {

    public static int toInt(String number) {
        return Integer.parseInt(number);
    }
    

    public static int toInt(char digit) {
        return Integer.parseInt(digit + "");
    }

    public static long toLong(String number) {
        return Long.parseLong(number);
    }

}