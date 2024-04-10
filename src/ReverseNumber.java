import java.util.Scanner;

public class ReverseNumber
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int no;
        System.out.println("Please enter the number");
        no = scanner.nextInt();
        int temp = 0;
        int reverse = 0;
        String st = "";
        System.out.println("The number before getting reversed " + no);
        while (no != 0)
        {
            temp = no % 10;
            reverse = reverse*10 + temp;
            no = no/10;
            st = Integer.toString(reverse);
        }
        //String str = Integer.toString(reverse);
        System.out.println("The reversed number is " + st);
    }
}
