/*
Remove Duplicates From an Unsorted Array
Problem Statement: Given an unsorted array, remove duplicates from the array.

Examples:

Example 1:
Input: arr[]={2,3,1,9,3,1,3,9}
Output:  {2,3,1,9}

Explanation: Removed all the duplicate elements
*/

/*
Solution 1: Brute Force Approach
Intuition:
-> We can use an array to store non-duplicate and will return this array
-> This array will be a boolean array. Corresponding to each index, true means element is Unique else it’s duplicate.
Approach: 
-> We will place true from i to  n-1 in the mark array
-> We will use a nested loop. In the outer loop, we will iterate the given array. Let the current number be ‘x’. Now in the inner loop, we will iterate from the given ‘x’ to the end of the array.
-> If we find ‘x’, we will mark x as false
-> Same can be done throughout for each element of the array


Time complexity :  O(n*n) + O(n) 
-> O(n*n) for updating boolean array
-> O(n) for the printing of non-duplicates

Space complexity: O(n) + O(n) 
-> O(n) marking array 
-> O(n) answer array
*/
/*
import java.util.*;
class removeDuplicatesUS
{

    static void removeDuplicates(int[] arr,int n) {
       int mark[] = new int[n];

       for(int i=0;i<n;i++)
       {
        mark[i] = 1;
       }

       for(int i=0;i<n;i++)
       {
        if(mark[i] == 1)
        {
            for(int j=i+1;j<n;j++)
            {
             if(arr[i] == arr[j])
              {
                 mark[j] = 0;
              }
            }
       }
    }

    for (int i = 0; i < n; i++) {
        if(mark[i] == 1)
        {
            System.out.print(arr[i] + " ");
        }
    }
    }

 public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Element in an array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 
      
        System.out.println("The array after removing duplicate elements is ");
         removeDuplicates(arr,n);
        
       
    }
}


*/

//---------------------------------------------------------------------------------------------------------------------------
/*
Solution 2:  Hashtable Method
Intuition: 
-> We can use Hashtable ( map in C++, HashMap in Java) to check duplicate elements of the array. 
-> In Hashtable, insertion and searching in O(1) average.

Approach:
-> We will create a hash table of size n and store elements in it. Before inserting a new element in the hash table, if it already exists in the hash table.
-> If the current element is not present we will print it else will move on. 

Time Complexity: O(n) + O(n) = O(n)

Reason:Iteration in array , searching hash table

Space Complexity : O(n) 
*/


import java.util.*;
class removeDuplicatesUS
{

    static void removeDuplicates(int[] arr,int n) {
      
      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

      for(int i=0;i<n;i++)
      {
        if(!map.containsKey(arr[i]))
        {
            System.out.print(arr[i] + " ");
            map.put(arr[i],1);
        }
      }
    }

 public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Element in an array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 
      
        System.out.println("The array after removing duplicate elements is ");
         removeDuplicates(arr,n);
        
       
    }
}