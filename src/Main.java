import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;
        int num1, num2, num3;
        double numd1;
        System.out.println("Hello world!");

        System.out.println("Selecione a tarefa: ");
        System.out.println(" 1 - Positive, Negative or Zero");
        System.out.println(" 2 - Speed Converter");
        System.out.println(" 3 - MegaBytes Converter");
        System.out.println(" 4 - Barking Dog");
        System.out.println(" 5 - Leap Year Calculator");
        System.out.println(" 6 - Decimal Comparator");
        System.out.println(" 7 - Equal Sum Checker");
        System.out.println(" 8 - Teen Number Checker");
        System.out.println(" 9 - Area Calculator");
        System.out.println(" 10 - Minutes to Years and Days Calculator");
        System.out.println(" 11 - Equality Printer");
        System.out.println(" 12 - Playing Cat");
        System.out.println(" 13 - Number in Word");
        System.out.println(" 14 - Number of Days in Month");
        System.out.println(" 15 - Sum Odd");
        System.out.println(" 16 - Number Palindrome");
        System.out.println(" 17 - First And Last Digit Sum");
        System.out.println(" 18 - Event Digit Sum");
        System.out.println(" 19 - Shared Digit");
        System.out.println(" 20 - Last Digit Checker");
        System.out.println(" 21 - All Factors");
        System.out.println(" 22 - Greatest Common Divisor");
        System.out.println(" 23 - Perfect Number");
        System.out.println(" 24 - Number To Words");
        System.out.println(" 25 - Flour Pack Problem");
        System.out.println(" 26 - Largest Prime");
        System.out.println(" 27 - Diagonal Star");
        System.out.println(" 28 - Input Calculator");
        System.out.println(" 29 - Paint Job");
        System.out.println(" 30 - Sum Calculator");
        System.out.println(" 31 - Person");
        System.out.println(" 32 - Wall Area");
        System.out.println(" 33 - Point");
        System.out.println(" 34 - Carpet Cost Calculator");
        System.out.println(" 35 - Complex Operations");
        System.out.println(" 36 - Cylinder");
        System.out.println(" 37 - Pool Area");
        opcao = sc.nextInt();

        switch (opcao){

            case 1:
                System.out.println("Digite um numero inteiro");
                num1 = sc.nextInt();
                PositiveNegativeZero.checkNumber(num1);
            case 2:
                System.out.println("Digite um numero inteiro");
                numd1 = sc.nextDouble();
                SpeedConverter.printConversion(numd1);
            case 3:
                System.out.println("Digite um numero inteiro");
                num1 = sc.nextInt();
                MegaBytesConverter.printMegaBytesAndKiloBytes(num1);
            case 4:
        }


    }
}