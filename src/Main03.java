import java.util.Scanner;

public class Main03
{
    public static void main(String[] args)
    {
        double[] doubles = new double[10];
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter a value for doubles[" + i + "]: ");
            doubles[i] = cin.nextDouble();
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println("doubles[" + i + "]: " + doubles[i]);
        }

        int[] integers = {7,9,1,2,6,42,8,8,8};
        String[] words = {"Apples", "Box", "Car", "Dell"};

        System.out.println("integers[" + 0 + "]: " + integers[0]);
        System.out.println("integers[" + 1 + "]: " + integers[1]);

        System.out.println("words[" + 0 + "]: " + words[0]);
        System.out.println("words[" + 1 + "]: " + words[1]);

    }

}
