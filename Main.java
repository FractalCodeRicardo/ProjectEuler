import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, IProblem> problems = getProblems();
        problems.get(31).solve();
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
        problems.put(13, new P013LargeSum());
        problems.put(15, new P015LatticePaths());
        problems.put(16, new P016PowerDigitSum());
        problems.put(17, new P017NumberLettersCount());
        problems.put(18, new P018MaximunPathSum());
        //Falta el 19
        problems.put(20, new P020Factorial());
        problems.put(21, new P021AmicableNumbers());
        problems.put(22, new P022NameScores());
        problems.put(24, new P024LexiPermutation());
        problems.put(25, new P02510000Fibunacci());
        //Sin resolver
        problems.put(26, new P026ReciprocalCycle());
        problems.put(27, new P027QuadraticPrimes());
        problems.put(28, new P028SpiralDiagonal());
        problems.put(29, new P029DistinctPowers());
        problems.put(30, new P030DigitsPower());
        problems.put(31, new P031CoinsSum());
        return problems;
    }
}
