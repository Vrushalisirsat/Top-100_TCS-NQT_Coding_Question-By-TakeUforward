/*
Check if array is subset of another array.
Write a program to find whether an array is a subset of another array or not.
Given arr1[] and arr2[], we need to find whether arr1[] is a subset of arr2[]. An array is called a subset of another if all of its elements are present in the other array.
Note: Array elements are assumed to be unique.
Examples:
Example 1:
Input: arr1[]= [1,3,4,5,2]
       arr2[]= [2,4,3,1,7,5,15]
Output: arr1[] is a subset of arr2[]

Example 2:
Input: arr1[]= [1,3,4,5,2]
       arr2[]= [4,5,2]
Output: arr1[] is not a subset of arr2[]

Example 3:
Input: arr1[]= [1,3,4,5,2]
       arr2[]= [11,12,13,15,16]
Output: arr1[] is not a subset of arr2[]

*/

/*
Solution 1: Using two loops
We can use two nested loops. The outer loop iterates over the elements of arr1[] and the inner loop checks for that element in arr2[] by simple linear search.

Time Complexity: O(M*N)
Reason: The outer loop runs for M times and for every iteration inner loop runs N times.
Space Complexity: O(1)
*/
/*
import java.util.*;
class isSubset {

   static boolean isSubset(int arr1[] ,int m,int arr2[],int n)
   {
    if(m > n)
    return false;
   

    for(int i=0;i<m;i++)
    {
       boolean present = false;
       for(int j=0;j<n;j++)
       {
        if(arr2[j] == arr1[i])
        {
            present = true;
            break;
        }
       }
       if(present == false)
       return false;
    }
    return true;
   }
      
     
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array-1 : ");
        int m = sc.nextInt();
        System.out.println("Enter the array-1 Element : ");
        int arr1[] = new int[m];
        for(int i=0;i<m;i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of an array-2 : ");
        int n = sc.nextInt();
        System.out.println("Enter the array-2 Element : ");
        int arr2[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr2[i] = sc.nextInt();
        }

        boolean ans = isSubset(arr1,m,arr2,n);

        if(ans == true)
        System.out.print("arr1[] is a subset of arr2[]");
        else 
        System.out.print("arr1[] is not a subset of arr2[]");
       
    }
}
*/

/*
Solution 2: Using Hashing
We can further improve the time complexity by using hashing. We first store the elements of arr2[] in a hashmap and then we can set a loop to traverse the elements of arr1[] and search for them in arr2[] in constant time( from hashmap).

*/

import java.util.*;
class isSubset {

   static boolean isSubset(int arr1[] ,int m,int arr2[],int n)
   {
    if(m > n)
    return false;

    HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
    for(int i=0;i<n;i++)
    {
        map.put(arr2[i],true);
    }   

    for(int j=0;j<m;j++)
    {
      if(map.containsKey(arr1[j]) == false)
      {
        return false;
      }
    }
    return true;
   }
      
     
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array-1 : ");
        int m = sc.nextInt();
        System.out.println("Enter the array-1 Element : ");
        int arr1[] = new int[m];
        for(int i=0;i<m;i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of an array-2 : ");
        int n = sc.nextInt();
        System.out.println("Enter the array-2 Element : ");
        int arr2[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr2[i] = sc.nextInt();
        }

        boolean ans = isSubset(arr1,m,arr2,n);

        if(ans == true)
        System.out.print("arr1[] is a subset of arr2[]");
        else 
        System.out.print("arr1[] is not a subset of arr2[]");
       
    }
}