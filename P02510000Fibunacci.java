public class P02510000Fibunacci implements IProblem {

    @Override
    public void solve() {
        
        
        String current = "1";
        String next = "1";
        int index = 2;

        while (true) {
            String t = current;
            current = next;
            next = Algorithms.sum(t,current);

            index ++;
            if (next.length() == 1000) {
                System.out.println(next);
                System.out.println(index);
            }
        }
    }
    
}
