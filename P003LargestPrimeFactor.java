
public class P003LargestPrimeFactor implements IProblem {

    private static long NumberToTest = 600851475143L;

    @Override
    public void solve() {
        for (long i = 2; i < NumberToTest ; i++) {

            if(NumberToTest % i == 0 ) {
                long t = NumberToTest / i;
                
                if(isPrime(t)) {
                    System.out.println(t);
                    break;
                }    
            }
        }
    }

    private boolean isPrime(long number) {
       return Algorithms.isPrime(number); 
    }
}
