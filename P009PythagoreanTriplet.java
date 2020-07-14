public class P009PythagoreanTriplet implements IProblem {

    /**
     * Two equations with three variables
     * a + b + c = 1000
     * a^2 + b^2 - c^2 = 0
     */

    @Override
    public void solve() {
        
        for (int a = 1; a < 1000; a ++) {
            
            //I 'll give values to a an then a solve the equations

            // c = 1000 - b -a
            // b^2 = (1000 - b - a)^2 - a^2
            // b = 1000^2 - 2000a / 2000 - 2a
            // 0 = 2ab−2000a−2000b+1000000
            // 
            int b = (int) ((Math.pow(1000, 2) - 2000*a) / 2000 - 2*a);
            int c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));

            if (isPythagorean(a, b, c)) {                      
                System.out.println(a + " + " + b + "+" + c + "=" + (a+b+c));
                System.out.println(Math.pow(a, 2) + " ^2  + " + Math.pow(b,2) + " ^2 = " + (Math.pow(a, 2) + Math.pow(b, 2)) + " = " + Math.pow(c,2));
            }
        }

        for (int c = 1; c < 1000; c ++) {

            //a = b - 1000 + c
            //b^2 = c^2 - a^2
            // b^2 = c^2 - (b - 1000 + c)^2
            int b =(int) (0.5 * (Math.sqrt(Math.pow(c, 2) + 2000*c  + 1000000 ) -c + 1000));
            int a = (int) Math.sqrt(Math.pow(c, 2) - Math.pow(b,2));

            System.out.println(a + " + " + b + "+" + c + "=" + (a+b+c));
            System.out.println(Math.pow(a, 2) + " ^2  + " + Math.pow(b,2) + " ^2 = " + (Math.pow(a, 2) + Math.pow(b, 2)) + " = " + Math.pow(c,2));

        }

    }

    private boolean isPythagorean(int a, int b, int c) {
        if (!(a < b && b < c)) {
            return false;
        }

        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);
        return (a2 + b2) == c2;
    }

}