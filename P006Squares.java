public class P006Squares implements IProblem {

    int topNumber = 100;

    @Override
    public void solve() {
        // TODO Auto-generated method stub

        long sumSquare = sumSquares();
        long squareSum = squareSum();

        System.out.println(squareSum - sumSquare);
    }

    private long sumSquares() {
        long result = 0;
        for (int i = 1; i <= topNumber; i++) {
            result = result + (long)Math.pow(i, 2);
        }
        return result;
    }

    private long squareSum() {
        long result = 0;
        for (int i = 1; i <= topNumber; i++) {
            result = result + i;
        }
        return (long)Math.pow(result, 2);
    }
    
}