public class P009PythagoreanTriplet implements IProblem {

    @Override
    public void solve() {
        int c = 2;
        while (c < 998) {

            int b = 1000 - c ;
            while (b > 0 && b < c) {

                int a = 1000 - c - b;
                if (a < c) {

                    int product = a * b * c;
                    int sum = a + b + c;
    
                    System.out.println(a + " + " + b + " + " + c + " = " + sum);
                    if (isPythagorean(a, b, c)) {
                        System.out.println(product);
                        return;
                    }

                }
                b--;
            }
            c++;
        }

    }

    private boolean isPythagorean(int a, int b, int c) {
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);

        return (a2 + b2) == c2;
    }

}