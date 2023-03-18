/*
 Given an array, we have found the number of occurrences of each element in the array.

Examples:

Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	 5  2
        15  1
Explanation: 10 occurs 3 times in the array
	         5 occurs 2 times in the array
              15 occurs 1 time in the array
*/

/*
Solution 1: Use of two loops
Intuition: We can simply use two loops, in which the first loop points to one element and the second loop finds that element in the remaining array. We will keep track of the occurrence of that same element by maintaining a count variable. We also have to maintain a visited array so that it will keep track of the duplicate elements that we already count.  
Approach: 
Make a visited array of type boolean.
Use the first loop to point to an element of the array.
Initialize the variable count to 1.
Make that index true in the visited array.
Run second loop, if we find the element then mark the visited index true and increase the count.
If the visited index is already true then skip the other steps.

Time Complexity: O(N*N)
Space Complexity:  O(N)
*/

/*
import java.util.*;
class freqCount
{
    static void countFrequency(int[] arr , int n)
    {
          boolean visited[] = new boolean[n];
          
       for(int i=0;i<n;i++)
       {
        // Skip this element if already processed
        if (visited[i] == true)
            continue;
 
        // Count frequency
        int count = 1;

         for(int j=i+1;j<n;j++)
         {
            if(arr[i] == arr[j])
            {
               visited[j] = true;
               count++;
            }
         }
         System.out.println(arr[i] + " Occurs " + count + " Times in the array.");
       }
    }

     
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter an array element : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

         countFrequency(arr,n);
       

        
    }
}
*/
//---------------------------------------------------------------------------------------------------------------------------------------

/*
Solution 2: Using Map
Intuition: We can use a map of value and frequency pair, in which we can easily update the frequency of an element if it is already present in the map, if it is not present in the map then insert it in the map with frequency as 1. After completing all the iterations, print the value frequency pair. 
Approach:
Take a unordered_map/HashMap of <Integer , Integer> pair.
Use a for loop to iterate the array.
If the element is not present in the map then insert it with frequency 1, otherwise increase the existing frequency by 1.
Print the value frequency pair.

Time Complexity: O(N)

Space Complexity: O(n)
*/

import java.util.*;
class freqCount
{
    static void countFrequency(int[] arr , int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
               map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                   map.put(arr[i] , 1);
            }
        }
        //Traverse through the map and print the frequency
        for(Map.Entry<Integer,Integer> entry : map.entrySet() )
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

     
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter an array element : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

         countFrequency(arr,n);
       
    }
}