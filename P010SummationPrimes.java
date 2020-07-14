import java.util.HashMap;

public class P010SummationPrimes implements IProblem {

    private static long top = 2000000;

    @Override
    public void solve() {
        // TODO Auto-generated method stub

        HashMap<Long, Boolean> primes = new HashMap<>();
        for (long i = 2; i < top; i++) {    
            long j = i;
            while(i*j < top) {
                primes.put(i*j, false);
                j++;
            }
        }

        long sum = 0;
        for (long i = 2; i < top; i++) {
            if (!primes.containsKey(i)) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }



}