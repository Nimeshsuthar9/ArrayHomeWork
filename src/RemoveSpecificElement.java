import java.util.Scanner;

public class RemoveSpecificElement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int array, no2, temp = 1, loc = 0;
        System.out.print("Enter no. of elements you want in array:");
        array = scanner.nextInt();
        int no[] = new int[array];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < array; i++)
        {
            no[i] = scanner.nextInt();
        }
        System.out.print("Enter the element you want to delete:");
        no2 = scanner.nextInt();
        for (int i = 0; i < array; i++)
        {
            if(no[i] == no2)
            {
                temp =1;
                loc = i;
            }
            else
            {
                temp = 0;
            }
        }
        if(temp == 1)
        {
            for(int i = loc+1; i < array; i++)
            {
                no[i-1] = no[i];
            }
            System.out.print("After Deleting:");
            for (int i = 0; i < array-2; i++)
            {
                System.out.print(no[i]+",");
            }
            System.out.print(no[array-2]);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}