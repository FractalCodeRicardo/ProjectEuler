import java.util.ArrayList;
import java.util.List;

public class P020Factorial implements IProblem {

    private int number = 100;

    @Override
    public void solve() {
        // TODO Auto-generated method stub

        String result = "1";
        for (int i = 1; i <= number; i++) {
            result = multiply(result, i + "");
            System.out.println(result);
        }

        long sum = 0;
        for (int i = 0; i < result.length(); i++) {
            sum += Integer.parseInt(result.charAt(i) + "");
        }
    
        System.out.println(sum);
       
    }

    public String multiply(String number1, String number2) {

        List<String> linesSum = new ArrayList<>();
        for (int i = number2.length() - 1; i > -1; i--) {
            int n1 = Integer.parseInt(number2.charAt(i) + "");

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

    private String sum(String number1, String number2) {

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

    private String leadZeros(String number, int size) {
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

}
