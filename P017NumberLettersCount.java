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
        for (int i = 342 ; i <= 342  ; i++) {
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

        int hundreds = (number - (thounsands * 1000)) / 100;
        if (hundreds > 0) {
            numberString += numberString.isEmpty() ? "" : " and ";
            numberString += Numbers[hundreds - 1] + " hundred";
        }

        int tens = (number - (thounsands * 1000) - (hundreds * 100)) / 10;
        if (tens >= 2) {
            numberString += numberString.isEmpty() ? "" : " and ";
            numberString += TensNumbers[tens - 1];
        }

        int units = (number - (thounsands * 1000) - (hundreds * 100)) - 20;
        if (units > 0 && units<= 20) {
            numberString += numberString.isEmpty() ? "" : 
                            (thounsands> 0 || hundreds>0) && tens <=0 ? " and " : "";
            numberString += Numbers[units - 1];
        }

        
        return numberString;
    }
    
}