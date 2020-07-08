package euler;

public class P003LargestPrimeFactor implements IProblem {
    @Override
    public void solve() {
        long largestPrime = 0;
        for (long i = 600851475142L; i < 1 ; i--) {

            if(600851475143L % i == 0 && isPrime(i)) {
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
