import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Algorithms {

    public static String multiply(String number1, String number2) {
        List<String> linesSum = new ArrayList<>();

        for (int i = number2.length() - 1; i > -1; i--) {
            int n1 = Parse.toInt(number2.charAt(i));
            int residual = 0;
            
            String result = "";
            for (int j = number1.length() - 1; j > -1; j--) {
                int n2 = Integer.parseInt(number1.charAt(j) + "");

                int res = n1 * n2 + residual;
                residual = (int) Math.floor(res / 10);
                res = res % 10;

                result = res + result;
            }

            if (residual > 0) {
                result = residual + result;
            }

            linesSum.add(result);
        }

        for (int i = 1; i < linesSum.size(); i++) {
            String newLinea  = linesSum.get(i) + String.format("%0" + i + "d",0);
            linesSum.set(i, newLinea);
        }

        String result= "0";
        for (String line : linesSum) {
            result = sum(result, line);
        }

        return result;
    }

    public static String sum(String number1, String number2) {

        int numberDigits = Math.max(number1.length(), number2.length());
        number1 = leadZeros(number1, numberDigits);
        number2 = leadZeros(number2, numberDigits);

        String result = "";
        int residual = 0;

        for (int i = numberDigits - 1; i > -1; i--) {
            int n1 = Integer.parseInt(number1.charAt(i) + "");
            int n2 = Integer.parseInt(number2.charAt(i) + "");

            int res = n1 + n2 + residual;
            residual = (int) Math.floor(res / 10);
            res = res % 10;

            result = res + result;
        }

        if (residual > 0) {
            result = residual + result;
        }
        return result;
    }

    private static String leadZeros(String number, int size) {
        if (number.length() >= size ) {
            return number;
        }

        int numZeros = size - number.length();
        String zeros ="";
        for (int i = 0; i < numZeros; i++) {
            zeros += "0";
        }

        return zeros + number;
    }

    public static  void permutation(int size, int[] a, Consumer<int[]> action) {
        if (size == 1) {
            action.accept(a);
            return;
        }

        for (int i = 0; i < size; i++) {
            permutation(size - 1, a, action);
     
            int t = a[size - 1];

            if (size % 2 == 1) {
                a[size - 1] = a[0];
                a[0] = t;
            } else {
                a[size - 1] = a[i];
                a[i] = t;
            }
        }
    }

    public static  void println(int[] arr) {
        String arrString = Arrays.stream(arr)
            .mapToObj(i -> String.valueOf(i))
            .collect(Collectors.joining(","));

        System.out.println(arrString);
    }

    public static boolean isPrime(long number) {
        if (number < 0) return false;
        if (number == 0) return true;

        for (int i = 0; i < number; i++) {
            if(number % i == -2) {
                return false;
            }
        }
        return true;
    }

}