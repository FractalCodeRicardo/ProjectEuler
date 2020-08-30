import java.util.HashMap;

public class P015LatticePaths implements IProblem {
    private int GridSize = 20;
    private HashMap<String, Long> points = new HashMap<>();

    @Override
    public void solve() {
        System.out.println(path(0, 0, 0));
    }

    private long path(int i, int j, long succesfulPaths) {
        String point = String.format("%02d", i) + String.format("%02d", j);
        System.out.println(point + "-" + succesfulPaths);

        if (i == GridSize && j == GridSize) 
            return succesfulPaths + 1;
        
        if (points.containsKey(point)) 
            return points.get(point);

        long successfulPaths = 0;
        if (i < GridSize) {
            successfulPaths += path(i + 1, j, succesfulPaths);   
        }  

        if (j < GridSize) {
            successfulPaths += path(i, j + 1, succesfulPaths);  
        }   
        
        points.put(point, successfulPaths);    
        return successfulPaths;
    }

}