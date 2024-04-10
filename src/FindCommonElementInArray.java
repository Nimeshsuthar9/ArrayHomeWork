public class FindCommonElementInArray
{
  public static void main(String[] args)
  {
    String[] Array1 = {"Raj", "Nimesh", "Anil", "Ankita"};
    String[] Array2 = {"Nimesh", "Dixit", "Dhruv", "Ravi", "Ankita"};

    for (int i = 0; i < Array1.length; i++)
    {
      for (int j = 0; j < Array2.length; j++)
      {
        // Check if elements in array1 and array2 are equal.
        if (Array1[i] == (Array2[j]))
        {
          // Print the common element.
          System.out.println("Common element is : " + (Array1[i]));
        }
      }
    }
  }
}