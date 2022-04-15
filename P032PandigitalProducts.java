import java.util.HashSet;
import java.util.Set;

public class P032PandigitalProducts implements IProblem {

    String digits[] = {"1", "2" ,"3", "4", "5", "6", "7", "8", "9"};
    int sum = 0;
    Set<Integer> sums = new HashSet<>();

    @Override
    public void solve() {     
        combinations("");
        System.out.println(sum);
    }


    public void combinations(String c) {

        if (c.length() > 0 && c.length() == digits.length) {
            if (isPandigital(c)) {
                System.out.println(c);
            }
            
            return;
        }
        
        for(String d: digits) {

            if (!c.contains(d)) {
                combinations(c + d);
            }

        }
    }

    public boolean isPandigital(String number) {
        for (int i = 1; i <= number.length() - 2; i++ ) {
            for (int j = 1; j <= number.length() - i - 1; j++ ) {
                if (isPandigital(number, i, j)) return true;
            }
        }

        return false;
    }

    public boolean isPandigital(String number, int s1, int s2) {
        int n1 = Integer.parseInt(number.substring(0, s1));
        int n2 = Integer.parseInt(number.substring(s1, s1 + s2));
        int n3 = Integer.parseInt(number.substring(s1 + s2));

        boolean is =  n1 * n2 == n3;

        if (is) {
            if (!sums.contains(n3)) {
                sums.add(n3);
                sum += n3;
            }
        }

        return is;
    }

}