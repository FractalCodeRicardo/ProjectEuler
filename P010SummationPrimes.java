
public class P010SummationPrimes implements IProblem {

    @Override
    public void solve() {
        // TODO Auto-generated method stub

        long sum = 0;
        for (long i = 2; i < 2000000; i++) {
            
            if (isPrime(i)) {
                System.out.println(i + " " + sum);
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }

    private boolean isPrime(long number) {
        for (long i = 2; i < number; i++) {
            
            if (number%i == 0) {
                return false;
            }
        }

        return true;
    }

}