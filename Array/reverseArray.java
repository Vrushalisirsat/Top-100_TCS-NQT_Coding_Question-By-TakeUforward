/* You are given an array. The task is to reverse the array and print it. 
Example :
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
*/
/*
Solution 1: Using an extra array.

Approach: Declare an array,ans[] of the same size as the input array. Iterate from the back of the input array while storing the elements in ans[]  in opposite direction.

Time Complexity: O(n), single-pass for reversing array.
Space Complexity: O(n), for the extra array used.
*/

/*

import java.util.*;
class reverseArray
{
    static int[] printReverseArray(int[] arr , int n)
    {
        int ans[] = new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--)
        {
            ans[j++] = arr[i];
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
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

         int[] ans = printReverseArray(arr,n);
        printArray(ans);

        
    }
}
*/
//-------------------------------------------------------------------------------------------------------------------------------------

/*
Solution 2:  Space optimized iterative method

Approach: Unlike the previous method we use the same array to obtain the result. Follow the steps below.

Keep a pointer p1  at the first index and another p2 at the last index of array. 
Swap the elements  pointed by p1 and p2,Post swapping increment p1 and decrement p2.
This process is repeated for only the first n/2 elements where n is the length of array.
Note: Swapping all the n elements instead of n/2 elements leaves the array unaltered.

Time Complexity: O(n), single-pass involved.
Space Complexity: O(1) 
*/

/*
import java.util.*;
class reverseArray
{

   static void swap(int[] arr, int n)
   {
     int first=0;
     int last=n-1;

    while(first<last)
        {
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
        first++;
        last--;
        }
   }

    static void printReverseArray(int[] arr , int n)
    {
            swap(arr,n);   
            printArray(arr);    
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
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

         printReverseArray(arr,n);
        
    }
}
*/
//-------------------------------------------------------------------------------------------------------------------------------------

/*
Solution 3: Recursive method
Approach: The recursive method has an approach almost similar to the iterative one. The approach has been broken down into some steps for simplicity.
Create a function that takes an array ,start index and end index of the array as parameters.
Swap the elements present  at start and end index, 
The portion of array left to be reversed is arr[start+1,end-1]. 
Make a recursive call to reverse the rest of array.
While calling recursion pass start +1  and end – 1 as parameters for the shrinked array. Repeat step 2.
Continue recursion as long as ‘start < end’ condition is satisfied. This is the base case for our recursion.

Time Complexity: O(n)
Space Complexity: O(1)
*/

/*
import java.util.*;
class reverseArray
{
    static void printReverseArray(int[] arr , int start,int end)
    {
             if(start < end)
             {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                 printReverseArray(arr,start+1 ,end-1);
             }

    
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
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int first=0;
         int last=n-1;

         printReverseArray(arr,0,n-1);
         printArray(arr);
        
    }
}
*/

//---------------------------------------------------------------------------------------------------------------------------------------

/* Solution 4: Using library function (New Approach)
Approach: C++ and Java have inbuilt functions to reverse an array.

For Java:-
The reverse method in java can be imported from the Collections class present in java.util package. 
Note:
Since this method expects an object as a parameter we have to convert the array into a list object using asList().
Java collections require wrapper classes instead of primitive data type.In order to  reverse an integer array use Integer instead of int.
Syntax: Collections.reverse(class_obj); 

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;
public class reverseArray {
   //Function to print array
   static void printArray(Integer arr[], int n) {
      System.out.print("Reversed array is:- \n");
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
   }
   //Reverse array using library function
   static void reverseArray(Integer arr[]) {
      //fetching array as list object
      //reversing the fetched object
      Collections.reverse(Arrays.asList(arr));
   }
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

      reverseArray(arr);
      printArray(arr, n);
   }
}