public class P014Collatz implements IProblem {

    @Override
    public void solve() {
        // TODO Auto-generated method stub

        long largest = 0;
        int largestSecuence = 0;
        for (long i = 1; i <= 1000000; i++) {
            
            int numberSecuence = collatz(i);

            if (largestSecuence < numberSecuence) {
                largestSecuence = numberSecuence;
                largest =  i;
            }
        }

        System.out.println(largest);

    }


    private int collatz(long number) {
       // System.out.println(number);
        if (number == 1) return 1;

        return number % 2 == 0 ? 
        collatz(number/2) + 1 : 
        collatz(number*3 + 1) + 1;
    }
    
}