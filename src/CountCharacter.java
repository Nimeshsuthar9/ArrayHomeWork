import java.util.Scanner;

public class CountCharacter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Enter The String Value : ");
       String Word = scanner.nextLine();

       int count =0;
       for(int i=0; i< Word.length(); i++)
       {
           if(Word.charAt(i) == 'a')
           {
               count++;

           }
       }
        System.out.println("Total no of 'a' in line is : " + count);
  }
}