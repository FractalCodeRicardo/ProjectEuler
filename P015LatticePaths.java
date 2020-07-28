public class P015LatticePaths implements IProblem {
    private int GridSize = 10;

    @Override
    public void solve() {
        System.out.println(path(0, 0, 0));
    }

    private int path(int i, int j, int numberPaths) {
        System.out.println(String.format("%s    %s", i, j));
        if (i == GridSize  && j == GridSize ) {
            return numberPaths + 1;
        }

        if (i > GridSize || j > GridSize ) {
            return 0;
        }

        return path(i + 1, j, numberPaths) + path(i, j + 1, numberPaths);
    }
    
}