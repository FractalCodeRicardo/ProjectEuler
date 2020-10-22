
public class P024LexiPermutation implements IProblem {

    private int N = 10;

    @Override
    public void solve() {

        int count = 1;

        for (int j1 = 0; j1 < N; j1++) {

            for (int j2 = 0; j2 < N; j2++) {
                if (j1 == j2) continue;

                for (int j3 = 0; j3 < N; j3++) {
                    if (j1 == j3 || j2 == j3) continue;

                    for (int j4 = 0; j4 < N; j4++) {
                        if (j1 == j4 || j2 == j4 || j3 == j4) continue;
                        
                        for (int j5 = 0; j5 < N; j5++) {
                            if (j1 == j5 || j2 == j5 || j3 == j5 || j4==j5) continue;

                            for (int j6 = 0; j6 < N; j6++) {
                                if (j1 == j6 || j2 == j6 || j3 == j6 || j4==j6 || j5==j6) continue;

                                for (int j7 = 0; j7 < N; j7++) {
                                    if (j1 == j7 || j2 == j7 || j3 == j7 || j4==j7 || j5==j7 || j6 == j7) continue;
                                
                                    for (int j8 = 0; j8 < N; j8++) {
                                        if (j1 == j8 || j2 == j8 || j3 == j8 || j4==j8 || j5==j8 || j6 == j8 || j7 == j8) continue;

                                        for (int j9 = 0; j9 < N; j9++) {
                                            if (j1 == j9 || j2 == j9 || j3 == j9 || j4==j9 || j5==j9 || j6 == j9 || j7 == j9 || j8 == j9 ) continue;

                                            for (int j10 = 0; j10 < N; j10++) {
                                                if (j1 == j10 || j2 == j10 || j3 == j10 || j4==j10 || j5==j10 || j6 == j10 || j7 == j10 || j8 == j10 || j9 == j10 ) continue;
                                                    
                                                if (count == 1000000) {
                                                    System.out.println( 
                                                    j1 + "" +  
                                                    j2 + "" +
                                                    j3 + "" +
                                                    j4 + "" +
                                                    j5 + "" +
                                                    j6 + "" +
                                                    j7 + "" +
                                                    j8 + "" +
                                                    j9 + "" +
                                                    j10);
                                                }

                                                count ++;
                                            }

                                        }
                                        
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
