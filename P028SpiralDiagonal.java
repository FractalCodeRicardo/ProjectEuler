public class P028SpiralDiagonal implements IProblem {

    

/*

1, 3,6

73 74 75 76 77 78 79 80 81 
72 43 44 45 46 47 48 49 50
71 42 21 22 23 24 25 26 51
70 41 20  7  8  9 10 27 52
69 40 19  6  1  2 11 28 53
68 39 18  5  4  3 12 29 54
67 38 17 16 15 14 13 30 55
66 37 36 35 34 33 32 31 56
65 64 63 62 61 60 59 58 57

1, 0-0   0
3, 1-8,  9 - 1 
5, 9-24  25 - 1
7, 25-48 49 
9, 49-82 

*/
    private int size = 1001;
    @Override
    public void solve() {
 
        

        int[] spiral = new int[size*size];

        for (int i = 0; i < spiral.length; i++) {
            spiral[i] = i + 1;
        }

        int i = 1;
        int ratio = 3;
        int sum = 1;
        while(true) {
            if (i> size * size -1) {
                break;
            }

            int k = 1;
            for (int j = (int)Math.pow((ratio - 2), 2); j < Math.pow(ratio, 2); j++) {
                
                if (k % (ratio - 1) == 0) {
                    System.out.print(spiral[j] + " ");
                    sum += spiral[j];
                }
                

                k++;
                i++;
            }
            
            System.out.println("");
            ratio += 2;

        }

        System.out.println(sum);
    }


    



}