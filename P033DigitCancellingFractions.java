public class P033DigitCancellingFractions implements IProblem {

    private float rNum = 1;
    private float rDen = 1;

    @Override
    public void solve() {
        for (float den = 99; den >= 10; den--) {
            for (float num = den - 1 ; num >= 10 ; num--) {
                findCancelable(num, den);
            }
        }

        simplifyFracction();
    }

    public void findCancelable(float num, float den) {
        String strNum = num + "";
        String strDen = den + "";
        float expected = num / den;

        String d1 = strNum.substring(0, 1);
        String d2 = strNum.substring(1, 2);

        checkCancelable(expected, strNum, strDen, d1);
        checkCancelable(expected, strNum, strDen, d2);
    }

    public void checkCancelable(float expected, String num, String den, String cancel){
        if (cancel.equals("0")) return;

        if (den.contains(cancel)) {
            String newNum = num.replace(cancel, "");
            String newDen = den.replace(cancel, "");

            if (checkDivision(expected, newNum, newDen)) {
                System.out.println(num + "/" + den + " = " + newNum + "/" + newDen + " = " + expected );

                rDen = rDen * Float.parseFloat(den);
                rNum = rNum * Float.parseFloat(num);
            }
        }
    }

    public boolean checkDivision(float expected, String num, String den) {
         return (Float.parseFloat(num) / Float.parseFloat(den)) == expected;
    }

    public void simplifyFracction() {
        for (float i = (float)Math.floorDiv((int)rNum, 2); i >= 2; i--) {
            if( rDen % i == 0  && rNum % i == 0) {
                System.out.println(rNum + "/" + rDen + " = " + rNum / i + "/" + rDen / i + " = " + rNum / rDen );
                break;
            }
        }
    }
    
}
