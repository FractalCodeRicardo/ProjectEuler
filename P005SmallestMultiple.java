public class P005SmallestMultiple implements IProblem{

    int maxNumer = 20;

    @Override
    public void solve() {
        long number = maxNumer;
        while (true) {

            if (isEvenlyDivisible(number)) {
                System.out.println(number);
                return;
            }

            number++;
        }
    }


    private boolean isEvenlyDivisible(long number) {
        for (long i = 2; i < maxNumer; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }

}