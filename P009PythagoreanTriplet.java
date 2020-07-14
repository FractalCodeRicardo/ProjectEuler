public class P009PythagoreanTriplet implements IProblem {

    /**
     * Two equations with three variables
     * a + b + c = 1000
     * a^2 + b^2 - c^2 = 0
     */

    @Override
    public void solve() {
        
        for (int a = 0; a < 1000; a ++) {
            
            //I 'll give values to a an then a solve the equations

            // c = 1000 - b -a
            // b^2 = (1000 - b - a)^2 - a^2
            // b = 1000^2 - 2000a / 2000 - 2a
            // 0 = 2ab−2000a−2000b+1000000
            // 
            double b =  ((Math.pow(1000, 2) - 2000*a) / 2000 - 2*a);
            double c =  Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));

            if (isPythagorean(a, b, c)) {                      
                System.out.println(a + " + " + b + "+" + c + "=" + (a+b+c));
                System.out.println(Math.pow(a, 2) + " ^2  + " + Math.pow(b,2) + " ^2 = " + (Math.pow(a, 2) + Math.pow(b, 2)) + " = " + Math.pow(c,2));
            }
        }

        for (int c = 0; c < 1000; c ++) {
            // a + b + c =1000
            //a = 1000 - b - c
            //b^2 = c^2 - a^2
            // b^2 = c^2 - (1000 - b - c)^2
            double b =(double) (-0.5 * (c - 1000 + (Math.sqrt(Math.pow(c, 2) + 2000*c  - 1000000) )));
            double a = (double) Math.sqrt(Math.pow(c, 2) - Math.pow(b,2));

            if (isPythagorean(a, b, c)) { 
                System.out.println(a + " + " + b + "+" + c + "=" + (a+b+c));
                System.out.println(Math.pow(a, 2) + " ^2  + " + Math.pow(b,2) + " ^2 = " + (Math.pow(a, 2) + Math.pow(b, 2)) + " = " + Math.pow(c,2));
    
            }

        }


        for (int b = 0; b < 1000; b++) {
            // a + b + c =1000
            // a = 1000 -b -c
            //c^2 = b^2 + (1000 -b -c)^2

            double c = (-1*Math.pow(b,2) + b *1000 - 500000) / (-1000 + b);
            double a = (double) Math.sqrt(Math.pow(c, 2) - Math.pow(b,2));

            if (isPythagorean(a, b, c)) { 
                System.out.println(a + " + " + b + "+" + c + "=" + (a+b+c));
                System.out.println(Math.pow(a, 2) + " ^2  + " + Math.pow(b,2) + " ^2 = " + (Math.pow(a, 2) + Math.pow(b, 2)) + " = " + Math.pow(c,2));
                System.out.println(a + " * " + b + " * " + c + "=" + (a*b*c));
            }

        }

    }

    private boolean isNatural(double d) {
        return  d - Math.floor(d) == 0;
    }

    private boolean isPythagorean(double a, double b, double c) {
        if(!isNatural(a)) return false;
        if(!isNatural(b)) return false;
        if(!isNatural(c)) return false;


        if (!(a < b && b < c)) {
            return false;
        }

        if (a+b+c != 1000) {
            return false;
        }

        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);
        return (a2 + b2) == c2;
    }

}