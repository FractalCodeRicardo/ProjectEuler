public class P012Triangle implements IProblem {

    private int NumberDivisors = 500;   

    @Override
    public void solve() {
        long n = 1;
        while(true) {
            long value = (n * (n + 1)) / 2;
            int divisors = numberOfDivisors(value);
            if ( divisors > NumberDivisors) {
                System.out.println(String.format("Valor: %s, divisores: %s", value, divisors));
                break;
            }

            n++;
        }
    }

    private int numberOfDivisors(long number) {
        int nDivisor = 0;
        //System.out.println(number + " Divisores:");
        for (int i = 2; i < Math.sqrt(number); i++) {            
            
            if (number % i == 0) {
                nDivisor++;

                if(number / i != i)
                    nDivisor++;

          //      System.out.println(i);
            }
        }

        return nDivisor + 2;
    }
    
}