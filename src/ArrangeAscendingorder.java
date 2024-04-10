import java.util.Scanner;

public class ArrangeAscendingorder
{
    public static void main(String[] args)
    {
        int size, temp;
        //User inputs the array size
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        size = scan.nextInt();

        int no[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++)
        {
            no[i] = scan.nextInt();
        }
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++) {
                if (no[i] > no[j])
                {
                    temp = no[i];
                    no[i] = no[j];
                    no[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < size - 1; i++)
        {
            System.out.print(no[i] + ", ");
        }
        System.out.print(no[size - 1]);
  }
}