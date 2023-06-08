/*
 Rotate array by K elements : Block Swap Algorithm
Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

Examples:

Example 1:
Input: N = 5, array[] = {1,2,3,4,5} K=2
Output: {3,4,5,1,2}
Explanation: Rotate the array to right by 2 elements.




*/
//Method-1 : By using extra array
/*
import java.util.*;
class rotateArray
{
    static int[] rotateArray(int arr[],int k)
    {
        int n=arr.length;
        k=k%n;
        int[] ans = new int[n];
        int j=0;

        for(int i=n-k-1; i<n;i++)
        {
            ans[j++] = arr[i];
        }

        for(int i=0;i<n-k-1;i++)
        {
            ans[j++]=arr[i];
        }
     return ans;
        
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements in an array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();

        System.out.println("Original array : ");
        printArray(arr);

        int[] ans = rotateArray(arr,k);
        System.out.println("Array after Rotation : ");
        printArray(ans);

    }
}



//Method-2 : By using not an extra array
import java.util.*;
class rotateArray
{
    static void swapElement(int arr[] ,int i,int j)
    {
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
        
    }

    static void reverseArray(int arr[] ,int i,int j)
    {
      while(i < j)
      {
        swapElement(arr,i,j);
        i++;
        j--;
      }
    }

    static void rotateArrayInPlace(int arr[],int k)
    {
      int n = arr.length;
      k=k%n;
      reverseArray(arr,0,k-1);
      reverseArray(arr,k,n-1);
      reverseArray(arr,0,n-1);
        
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements in an array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();

        System.out.println("Original array : ");
        printArray(arr);

         rotateArrayInPlace(arr,k);
        System.out.println("Array after Rotation : ");
        printArray(arr);

    }
}

*/


