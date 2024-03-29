public class P027QuadraticPrimes implements IProblem {

    @Override
    public void solve() {


        int rb = 0;
        int ra = 0;
        int max = 0;
        for (int a = -999; a < 1000; a++) {
            for (int b = -1000; b <= 1000; b++) {

                int numberPrimes = getNumberPrimes(a, b);
                if (numberPrimes > max) {
                    max = numberPrimes;
                    rb = b ;
                    ra = a;
                }

            }
        }

        System.out.println(max +" " + rb + " " + ra + " " + ra * rb);

    }

    private int quadraticFunction(int n, int a, int b) {
        return n * n + a * n + b;
    }

    private int getNumberPrimes(int a, int b) {
        int  n = 0;
        while (true) {
            int result = quadraticFunction(n, a, b);

            if (isPrime(result)) {
                n ++;
                continue;
            }

            break;
        }
        return n;
    }

    private boolean isPrime(long number) {
        return Algorithms.isPrime(number);
    }


}