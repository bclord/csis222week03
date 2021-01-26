import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        double number1 = 0.0;
        double number2 = 0.0;
        double number3 = 0.0;
        double number4 = 0.0;
        double number5 = 0.0;
        double number6 = 0.0;
        double number7 = 0.0;

        System.out.print("Enter a decimal number for number1: ");
        number1 = cin.nextDouble();

        System.out.print("Enter a decimal number for number2: ");
        number2 = cin.nextDouble();

        System.out.print("Enter a decimal number for number3: ");
        number3 = cin.nextDouble();

        System.out.print("Enter a decimal number for number4: ");
        number4 = cin.nextDouble();

        System.out.print("Enter a decimal number for number5: ");
        number5 = cin.nextDouble();

        System.out.print("Enter a decimal number for number6: ");
        number6 = cin.nextDouble();

        System.out.print("Enter a decimal number for number7: ");
        number7 = cin.nextDouble();

        double sum = number1 + number2 + number3 + number4 + number5 + number6 + number7;
        double average = sum / 7.0;

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
