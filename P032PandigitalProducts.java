import java.util.ArrayList;
import java.util.List;

public class P032PandigitalProducts implements IProblem {

    int elements[] = {1,2,3};

    @Override
    public void solve() {     
        combinaciones(1, "");
    }


    public void combinaciones(int i, String combinacion) {
        if (i > 2) {
            System.out.println(combinacion);
            return;
        }

        for (int j = 1; j <= 2 ; j++) {
            String nuevaCombinacion = new String(combinacion);
            if (nuevaCombinacion.indexOf(i + "") < 0) {
                nuevaCombinacion += i;
                combinaciones(i + 1, nuevaCombinacion);   
            }
            

        }
    }

    private void imprimir(List<Integer> lista) {
        for (Integer item : lista) {
            System.out.print(item);
        }
        System.out.println();
    }
}