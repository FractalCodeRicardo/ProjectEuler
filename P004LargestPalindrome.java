public class P004LargestPalindrome implements IProblem {

    private static int NumberDigits = 3;

    @Override
    public void solve() {
        int minNumber = minNumber();
        int maxNumber = maxNumber();

        int largestPalindrome = 0;
        for (int i = maxNumber; i >= minNumber; i--) {
            for (int j = maxNumber; j >= minNumber; j--) {
                int palindrome = i*j;
                
                if (isPalindrome(palindrome + "") && largestPalindrome < palindrome){
                    largestPalindrome = palindrome;
                }
            }
        }
        System.out.println(largestPalindrome);
    }

    private int minNumber() {
        return (int) Math.pow(10.0, NumberDigits -1);
    }

    private int maxNumber() {
        return (int) Math.pow(10.0, NumberDigits ) -1;
    }

    private boolean isPalindrome(String param) {
        int right = param.length() - 1;
        int left = 0;

        while(left <= right) {

            if(param.charAt(left) != param.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
    
}