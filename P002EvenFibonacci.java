
public class P002EvenFibonacci implements IProblem {
    @Override
    public void solve() {
        int current = 1;
        int next = 2;
        int sum = 0;

        while (current < 4000000) {

            if (current % 2 == 0) {
                sum = sum + current;
            }
            
            int t = current;
            current = next;
            next = t + current;
        }

        System.out.println(sum);
    }
}
