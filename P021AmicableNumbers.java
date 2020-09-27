import java.util.ArrayList;
import java.util.List;

public class P021AmicableNumbers implements IProblem {

    @Override
    public void solve() {

        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            if (isAmicable(i)) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    private boolean isAmicable(int a) {
        int b = d(a);

        return a != b && d(b) == a;
    }

    private int d(int a) {
        return sumDivisors(a);
    }

    private List<Integer> findDivisors(int number) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= number/2; i++) {
            if(number%i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    private int sum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    private int sumDivisors(int number) {
        List<Integer> divirsors = findDivisors(number);
        return sum(divirsors);
    }

}
