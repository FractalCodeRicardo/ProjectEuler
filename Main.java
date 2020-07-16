
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*if (args.length < 1) {
            return;
        }

        int id = tryInt(args[0],0);

        HashMap<Integer, IProblem> problems = getProblems();

        if (!problems.containsKey(id)) {
            System.out.println("El problema no existe.");
            return;
        }*/

        //problems.get(id).solve();
        HashMap<Integer, IProblem> problems = getProblems();
        problems.get(12).solve();
    }

    public static int tryInt(String number, int defaultValue) {
        try {
            return Integer.parseInt(number);
        } catch (Exception ex) {
            return defaultValue;
        }
    }


    public static HashMap<Integer, IProblem> getProblems() {
        HashMap<Integer, IProblem> problems = new HashMap<>();

        problems.put(1, new P001Multiples3And5());
        problems.put(2, new P002EvenFibonacci());
        problems.put(3, new P003LargestPrimeFactor());
        problems.put(4, new P004LargestPalindrome());
        problems.put(5, new P005SmallestMultiple());
        problems.put(6, new P006Squares());
        problems.put(7, new P007Prime());
        problems.put(8, new P008AdjacentDigits());
        problems.put(9, new P009PythagoreanTriplet());
        problems.put(10, new P010SummationPrimes());
        problems.put(11, new P011LargestProject());
        problems.put(12, new P012Triangle());



        return problems;
    }
}
