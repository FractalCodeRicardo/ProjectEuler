public class P016PowerDigitSum implements IProblem {

    private int pow = 1000;

    @Override
    public void solve() {
        
        String number = "2";
        for (int i = 1; i < pow; i++) {
            number = multiply(number);
        }

        long sum = 0;
       for (char d : number.toCharArray()) {
           int digit = Integer.parseInt(d + "");
           sum += digit;
       }

       System.out.println(sum);
    }

    public String multiply(String number) 
    {
        int i = number.length() - 1;
        String result = "";
        int residual = 0;

        while (i >= 0) {

            int digit = Integer.parseInt(number.charAt(i) + "");
            int product = digit * 2;
            
            result =  ((product % 10) + residual) + result;
            residual = product / 10;
            i--;
        }

        if (residual > 0) {
            result = residual + result;
        }

        return result;
    }


    
}