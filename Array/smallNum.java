/* Q.1  Given an array, we have to find the smallest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array.

*/

/*
Solution1: Sorting
Intuition: We can sort the array in ascending order, hence the smallest element will be at the 0th index. 
Approach: 
Sort the array in ascending order.
Print the 0th index.

Time Complexity: O(N*log(N))

Space Complexity: O(n)
*/

/*
import java.util.*;
class smallNum
{
   static int printSmallNum(int[] arr , int n)
   {
    Arrays.sort(arr);
    return arr[0];
   }
    

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(printSmallNum(arr,n));

    }
}
*/
//---------------------------------------------------------------------------------------------------------------------------------------------
/*
Solution2: Using a min variable
Intuition: We can maintain a min variable which will update whenever the current value is less than the value in the min variable.  
Approach: 
Create a min variable and initialize it with arr[0].
Use a for loop and compare it with other elements of the array
If any element is less than the min value, update min value with element’s value
Print the min variable.

Time Complexity: O(N)

Space Complexity: O(1)

*/
/*
import java.util.*;
class smallNum
{
   static int printSmallNum(int[] arr , int n)
   {
    int min=arr[0];
    for(int i=0;i<n;i++)
    {
        if(arr[i] < min)
        {
            min = arr[i];
        }
    }
    return min;
   }
    

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(printSmallNum(arr,n));

    }
}
/*