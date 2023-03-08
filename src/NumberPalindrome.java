public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return true; // negative numbers are not palindromes
        }else{
            int original = number;
            int reversed = 0;

            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            return original == reversed;
        }


    }

}