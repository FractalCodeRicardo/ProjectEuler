public class P026ReciprocalCycle implements IProblem {

    @Override
    public void solve() {
        
        int longestCycle = 0;
        int d = 0;
        for (int i = 7; i <= 7; i++) {
            double number = 1.0/(double)i;
        
            int tLongestCycle = getRecurringCycle(i, number);

            if (tLongestCycle > 0 && longestCycle < tLongestCycle) {
                longestCycle = tLongestCycle;
                d = i;
            }
            
        }

        System.out.println(d);
    }

    private int isCycle(double number) {
        String decimals = (number + "").split("\\.")[1];
    
        for (int i = 1; i < decimals.length() / 2; i--) {
            

            
            
            
        }
        
        return 0;
    }

    
    
}
