import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long count = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
        }

        scanner.close();

        if (count == 0) {
            System.out.println("SUM = 0 AVG = 0");
        } else {
            long average = Math.round((double) sum / count);
            System.out.println("SUM = " + sum + " AVG = " + average);
        }
    }
}
