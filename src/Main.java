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