public class P007Prime implements IProblem {
    
    private static int NthPrime = 10001;

    @Override
    public void solve() {
        int count = 1;
        int iPrime = 2;

        while (count <= NthPrime) {
            if (isPrime(iPrime)) {
                if (count == NthPrime) {
                    System.out.println(iPrime);
                }
                count ++;
            }
            iPrime ++;
        }
    }

    private boolean isPrime(long number) {
        return Algorithms.isPrime(number);
    }

}