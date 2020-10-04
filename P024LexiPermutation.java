import java.security.Permission;

public class P024LexiPermutation implements IProblem {

    private int N = 10;
    private int size = 10;

    private int current = 0;

    @Override
    public void solve() {
        
      String s = "";
      int d = 0;  
     
      s = fill("", 0);
    }



    private String fill(String permutation, int digit) {
        if (permutation.contains("" + digit)) 
            return permutation;

        int d = 0;
        while(permutation.length() < size) {
            permutation = fill(permutation, d++);
        }

        return permutation;
    }
    
}
