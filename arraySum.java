/*
Calculate Sum of the Elements of the Array
Problem Statement: Given an array, we have to find the sum of all the elements in the array.

*/

/*
Solution 1: Using for loop                                                                                                                                             

Approach: 

Using for loop traverse through the array and while traversing  maintain  a variable for storing sum of the elements in the array.
After completing the traversal simply print the sum.

*/
/*
import java.util.*;
class arraySum
{
    static int arraySum(int[] arr,int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
        }
        return sum;
    }

    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

 public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 

     int sum = arraySum(arr,n);
   System.out.print(sum);
       
    }
}
*/

//---------------------------------------------------------------------------------------------------------------------

/*
Solution 2: Using collection in Java or STL in C++

Approach:

 

For Java: Instream sum() gives the sum of all the elements in the stream.

*/

import java.util.*;
import java.util.stream.IntStream;
public class arraySum {
  public static void main(String args[]) {
    int n = 5;
    int arr[] = {1,2,3,4,5};
    int sum = IntStream.of(arr).sum();
    System.out.println("The sum of the elements of the array is "+sum);
  }
}