import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P034CircularPrimes implements IProblem {

    private boolean allCombinationsArePrime = true;

    @Override
    public void solve() {
        var testedNumbers = new HashSet<String>();
        int counter = 0;
        for (int i = 2; i < 1000; i++) {

            if (!Algorithms.isPrime(i)) {
                continue;
            }

            if (!allDigitsPrimeOrOne(i)) {
                continue;
            }

            System.out.println("Testing: " + i);

            allCombinationsArePrime = true;
            String number = i + "";
            number = removeDuplicated(number);

            if (testedNumbers.contains(number)) {
                return;
            }

            testCombinations("", number, number.length());

            if (allCombinationsArePrime) {

                System.out.println("Prime: " + number);
                counter++;
            }

            testedNumbers.add(number);
        }

        System.out.println(counter);
    }

    private String removeDuplicated(String number) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            String digit = number.charAt(i) + "";

            if (result.contains(digit)) {
                continue;
            }
            result.add(digit);
        }

        var ordered = result.stream().sorted().toList();
        String finalResult = String.join("", ordered);

        return finalResult;
    }

    private boolean allDigitsPrimeOrOne(int number) {
        Set<Integer> values = Set.of(
                1, 2, 3, 5, 7);

        String stringNumber = "" + number;
        for (int i = 0; i < stringNumber.length(); i++) {
            char digit = stringNumber.charAt(i);
            int intDigit = Integer.valueOf(digit + "");

            if (!values.contains(intDigit)) {
                return false;
            }

        }

        return true;
    }

    private String removeAt(String string, int i) {
        return string.substring(0, i) +
                string.substring(i + 1, string.length());

    }

    private void testCombinations(String result, String elements, int size) {

        if (!allCombinationsArePrime) {
            return;
        }

        if (result.length() == size) {

            if (!Algorithms.isPrime(Parse.toLong(result))) {
                allCombinationsArePrime = false;
            }

            return;
        }

        for (int i = 0; i < elements.length(); i++) {
            char digit = elements.charAt(i);
            String newElements = removeAt(elements, i);
            String newResult = result + digit;

            testCombinations(newResult, newElements, size);
        }
    }
}
