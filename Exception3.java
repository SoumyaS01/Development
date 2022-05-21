import java.lang.*;
import java.util.*;

///Without exception handling

class Exception3
{
    public static void main(String a[])
    {
        int Arr[] = {10,20,30,40,50};
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the index");
        int index = sobj.nextInt();

        System.out.println("Elements at that index is : "+Arr[index]);
    }
}