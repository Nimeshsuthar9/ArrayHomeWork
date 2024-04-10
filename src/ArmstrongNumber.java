import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int no, count = 0, no1, no2, no3, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        no = scanner.nextInt();
        no1 = no;
        no3 = no;
        while(no1 > 0)
        {
            no1 = no1 / 10;
            count++;
        }
        while(no > 0)
        {
            no2 = no % 10;
            sum = (int) (sum+Math.pow(no2, count));
            no = no / 10;
        }
        if(sum == no3)
        {
            System.out.println(no3+ " is an Armstrong number");
        }
        else
        {
            System.out.println(no3+ " is not an Armstrong number");
        }
    }
}