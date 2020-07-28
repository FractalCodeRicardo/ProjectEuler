public class P015LatticePaths implements IProblem {
    private int GridSize = 3;

    @Override
    public void solve() {
        System.out.println(path(0, 0, 0));
    }

    private int path(int i, int j, int numberPaths) {
        //System.out.println(String.format("%s    %s  %s", i, j, numberPaths));
        if (i == GridSize  && j == GridSize ) {
            return  numberPaths + 1;
        }

        if (i < GridSize) {
            numberPaths =  path(i + 1, j, numberPaths);
        }

        if (j < GridSize) {
            numberPaths =  path(i, j + 1, numberPaths);
        }

        return numberPaths;
    }
    
}