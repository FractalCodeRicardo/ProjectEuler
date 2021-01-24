


public class P031CoinsSum implements IProblem {
    int combinaciones = 0;

    @Override
    public void solve() {
        // TODO Auto-generated method stub

        for (int uno= 0; uno <= 200 ; uno++) 
            for (int dos = 0; dos <= 100; dos++) 
                for (int cinco = 0; cinco <= 40; cinco ++) 
                    for (int diez = 0; diez <= 20; diez++) 
                        for (int veinte = 0; veinte <= 10; veinte ++) 
                            for (int cincuenta = 0; cincuenta <= 4; cincuenta++) 
                                for (int cien = 0; cien <= 2; cien++) 
                                    for (int doscientos = 0; doscientos <= 1; doscientos ++) {
                                        combinacion(uno, dos, cinco, diez, veinte, cincuenta, cien, doscientos);        
                                    }   

        System.out.println(combinaciones);
                                
    }

    public void combinacion(int uno, int dos, int cinco,  int diez, int veinte, int cincuenta, int cien, int doscientos) {
        int suma = uno + dos * 2 + cinco * 5 + diez * 10 + veinte * 20 + cincuenta * 50 + cien * 100 + doscientos * 200;
        if (suma == 200) {
            System.out.println("uno " + uno + 
            " dos " + dos + 
            " cinco " + cinco + 
            " diez " + diez + 
            " veinte " + veinte + 
            " cincuenta " + cincuenta + 
            " cien " + cien + 
            " doscientos " + doscientos);

            combinaciones ++;
        }
    }

    

}

