public class P030DigitsPower implements IProblem {

    private int size = 5;

    @Override
    public void solve() {

        int i = 2;
        int sum = 0;
        while(true) {
            int r = getPowerSum(i);

            if (i == 777777) {
                break;
            }

            if (r == i) {
                sum += i;
                System.out.println(i);
            }


            i++;
        }

        System.out.println(sum);

    }

    private int getPowerSum(int number) {
        String numberString = number + "" ;
        int sum = 0;
        for (char digit: numberString.toCharArray()) {
            int r = (int) Math.pow(Double.parseDouble(digit + ""), size);
            sum += r;
        }

        return sum;
    }
    
}
