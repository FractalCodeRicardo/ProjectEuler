import java.time.format.DecimalStyle;

public class P026ReciprocalCycle implements IProblem {

    private int d = 1000;

    @Override
    public void solve() {
        
        int longest = 0;
        int longestD = 0;
        for (int i = 2; i <= d; i++) {
            double number = 1.0 / i;
            int ocurrences = getMaxOcurrences(number);

            if (ocurrences > longest) {
                longest = ocurrences;
                longestD = i;
            }

            System.out.println(i + " " + number + " " + ocurrences);
        }
        
        System.out.println(longestD);

    }

    private int getMaxOcurrences(double number) {
        String decimals = (number + "").split("\\.")[1];
        
        int size = 1;
        int t = (int)Math.floor(decimals.length() / 2);
        while (size <= t) {

            for (int i = 0; i < decimals.length() - size; i++) {

                String first = decimals.substring(i, i + size);
                String second = decimals.substring(i + size , Math.min(i + size + size, decimals.length()));

                if (first.equals(second)) {
                    return count(first);
                }
            }

            size++;
        }

        return 0;
    }


    private int count(String l) {
        char current = l.charAt(0);
        int c = 1;
        
        for (int i = 1; i < l.length(); i++) {
            if (current != l.charAt(i)) {
                c++;
                current = l.charAt(i);
                continue;
            }

            break;
        }
        return c;
    }

    
    
}
