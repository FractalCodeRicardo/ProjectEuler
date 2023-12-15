import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P034CircularPrimes implements IProblem {

    @Override
    public void solve() {
        var counter = 0;
        for (int i = 0; i < 1000000; i++) {

            if (testRotations(i + "")) {
                System.out.println("Found " + i);
                counter++;
            }

        }

        System.out.println(counter);
    }

    public boolean testRotations(String number) {

        if (number.length() == 1) {
            return Algorithms.isPrime(number);
        }

        int c = 0;
        while (c < number.length()) {
            if (!Algorithms.isPrime(number)) {
                return false;
            }

            char first = number.charAt(0);
            number = number.substring(1, number.length()) + first;
            c++;
        }

        return true;
    }
}
