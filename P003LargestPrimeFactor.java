
public class P003LargestPrimeFactor implements IProblem {

    private static long NumbreToTest = 12L;

    @Override
    public void solve() {
        long largestPrime = 0;
        for (long i = NumbreToTest; i < 1 ; i--) {

            if(NumbreToTest % i == 0 && isPrime(i)) {
                largestPrime = i;
                break;
            }
        }
        System.out.println(largestPrime);
    }

    private boolean isPrime(long number) {
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
