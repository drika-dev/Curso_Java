public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        while (reversedNumber > 0) {
            int digit = reversedNumber % 10;
            String digitWord = "";
            switch (digit) {
                case 0:
                    digitWord = "Zero";
                    break;
                case 1:
                    digitWord = "One";
                    break;
                case 2:
                    digitWord = "Two";
                    break;
                case 3:
                    digitWord = "Three";
                    break;
                case 4:
                    digitWord = "Four";
                    break;
                case 5:
                    digitWord = "Five";
                    break;
                case 6:
                    digitWord = "Six";
                    break;
                case 7:
                    digitWord = "Seven";
                    break;
                case 8:
                    digitWord = "Eight";
                    break;
                case 9:
                    digitWord = "Nine";
                    break;
            }
            System.out.print(digitWord + " ");
            reversedNumber /= 10;
        }

        // add any necessary trailing zeroes
        for (int i = 0; i < digitCount - reversedDigitCount; i++) {
            System.out.print("Zero ");
        }
    }

    public static int reverse(int number) {
        boolean isNegative = number < 0;
        if (isNegative) {
            number *= -1;
        }

        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number /= 10;
        }

        return isNegative ? reversedNumber * -1 : reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 1;
        while (number / 10 > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

}
