import java.util.ArrayList;
import java.util.List;

public class P020Factorial implements IProblem {

    private int number = 100;

    @Override
    public void solve() {

        String result = "1";
        for (int i = 1; i <= number; i++) {
            result = multiply(result, i + "");
            System.out.println(result);
        }

        long sum = 0;
        for (int i = 0; i < result.length(); i++) {
            char digit = result.charAt(i);
            sum += Parse.toInt(digit);
        }
    
        System.out.println(sum);
       
    }

    public String multiply(String number1, String number2) {
        return Algorithms.multiply(number1, number2);
    }


}
