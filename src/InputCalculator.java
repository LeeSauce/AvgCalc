import java.util.Scanner;

public class InputCalculator
{
    public static void main(String[]args)
    {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage()
    {
        int count = 0;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            boolean isInt = scanner.hasNextInt();
            if(isInt)
            {
                int number = scanner.nextInt();
                sum += number;
                count++;
            }
            else
            {
                break;
            }
            scanner.nextLine();
        }

        double rounded = Math.round(sum/count);
        int sumInt = (int)sum;
        int roundedInt = (int)rounded;
        System.out.println("SUM = " + sumInt + " AVG = " + roundedInt);
        scanner.close();
    }
}
