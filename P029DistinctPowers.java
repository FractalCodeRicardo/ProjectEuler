import java.util.HashSet;
import java.util.function.Consumer;

public class P029DistinctPowers implements IProblem {

    private int size = 100;

    @Override
    public void solve() {
        // TODO Auto-generated method stub

        HashSet<String> set =  new HashSet<>();

        for (int a = 2; a <=  size; a++) {
            for(int b =2; b <= size; b++) {
                String result = pow(a, b);

                if (!set.contains(result)) {
                    set.add(result);
                }
            }
        }

       /* set.forEach(new Consumer<String>(){f
            @Override
            public void accept(String arg0) {
                System.out.print(arg0 + " ");
            }
        });*/

        System.out.print(set.size());

    }

    private String pow(int a, int b) {
        int i = 1;
        String result = a + "";
        while (i < b) {
            result = Algorithms.multiply(result, a + "");
            i ++;
        }
        return result;
    }
    
}
