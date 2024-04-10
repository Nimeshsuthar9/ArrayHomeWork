public class FindTwoArrayEqual
{
    public static void main(String[] args)
    {
        //Define Two Array
        int Array1[] = new int[] {2,3,4,5,6,7};

        int Array2[] = new int[] {2,3,4,5,6,7,8};

        // Check Both Are Equal Or Not Using Operator
        if(Array1.length == Array2.length)
        {
              System.out.println("Arrays Are Equal");
        }
        else
        {
            System.out.println("Arrays Are Not Equal");
        }
    }
}