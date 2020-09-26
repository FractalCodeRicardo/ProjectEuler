public class P017NumberLettersCount implements IProblem {

    private String[] Numbers = new String[] {"One", "Two", "Three",
    "Four",
    "Five",
    "Six",
    "Seven",
    "Eight",
    "Nine",
    "Ten",
    "Eleven",
    "Twelve",
    "Thirteen",
    "Fourteen",
    "Fifteen",
    "Sixteen",
    "Seventeen",
    "Eighteen",
    "Nineteen"};

    private String[] TensNumbers = new String[] {"",
        "twenty",
        "thirty",
        "forty",
        "fifty",
        "sixty",
        "seventy",
        "eighty",
        "ninety"
    };

    @Override
    public void solve() {
        long count = 0;
        for (int i = 1; i <= 1000; i++) {
            System.out.println(toString(i));
            count += toString(i).replace(" ", "").length();
        }
        System.out.print(count);
    }

    private String toString(int number) {
        String numberString = "";

        int thounsands = number / 1000;
        if (thounsands > 0){
            numberString += numberString.isEmpty() ? "" : " and ";
            numberString = Numbers[thounsands - 1] + " thousand";
        }

        number -= thounsands * 1000;
        int hundreds = number / 100;
        if (hundreds > 0) {
            numberString += numberString.isEmpty() ? "" : " and ";
            numberString += Numbers[hundreds - 1] + " hundred";
        }

        number -= hundreds * 100;
        int tens = number / 10;
        if (tens >= 2) {
            numberString += numberString.isEmpty() ? "" : " and ";
            numberString += TensNumbers[tens - 1];
        }

        number -= (tens >= 2 ? tens * 10 : 0);
        int units = number;
        if (units > 0 && units<= 20) {
            numberString += numberString.isEmpty() ? "" : 
                            tens < 2 && units<20 ? " and " : "";
            numberString += Numbers[units - 1];
        }
       
        return numberString;
    }
    
}