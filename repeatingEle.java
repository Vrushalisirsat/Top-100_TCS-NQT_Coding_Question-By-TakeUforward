/*
Find all repeating elements in an array
Problem Statement: Find all the repeating elements present in an array.

Examples:

Example 1:
Input: 
Arr[] = [1,1,2,3,4,4,5,2]
Output:
 1,2,4
Explanation:
 1,2 and 4 are the elements which are occurring more than once.


*/
/*
Solution 1: Brute Force
Approach:
The process is as follows:-

Use an array to store all repeating elements. These elements are not distinct in the array. This is because for every pair of repeating elements it will store elements in the array.
Start iterating the array. This will pick up an element for which we want to find its duplicates.
Iterate another nested loop for finding all pairs. Pairs which have both elements are repeating elements and store them in the array created in the initial step.
Start iterating in the array containing repeating elements. 
If the current element is not equal to the next element in the array then we print the current element. This is to ensure all unique repeating elements.

Time Complexity: O(N2)+O(N)
Reason: We are taking one element and searching its repeating element again in the array. Also, iterating through the dup array which contains repeating elements to find unique repeating elements.
Space Complexity: O(N)
Reason: We are using an array for storing all repeating elements.
*/
/*
import java.util.*;
class repeatingEle
{

    static void repeatingElement(int[] arr,int n) {
      
     int count=0;
     int dup[] = new int[n];

     for(int i=0;i<n-1;i++)
     {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i] == arr[j])
            {
                dup[count++] = arr[i];
            }
        }
     }

     for(int i=0;i<count;i++)
     {
        if(dup[i] != dup[i+1])
        {
            System.out.print(dup[i] + " ");
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
      
        System.out.println("The array of repeating elements is ");
         repeatingElement(arr,n);
        
       
    }
}
*/
//----------------------------------------------------------------------------------------------------------------------------------------

/*
Solution 2: Sorting
Approach:
The process is as follows:-
Sort the given array.
Start iterating in the sorted array.
If the current element and the next element are the same, return the repeating element.

Time Complexity: O(NlogN)+O(N)
Reason: O(NlogN) for sorting. O(N) for iterating again in the array for finding a loop.

Space Complexity: O(1)
Reason: No extra spaces are used.
*/

/*
import java.util.*;
class repeatingEle
{

 static void repeatingElement(int[] arr,int n) {
    Arrays.sort(arr);
     for(int i=0;i<n-1;i++)
     {
        if(arr[i] == arr[i+1])
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
      
        System.out.println("The array of repeating elements is ");
         repeatingElement(arr,n);
        
       
    }
}
*/

//--------------------------------------------------------------------------------------------------------------------------------

/*
Solution 3: Maps

Approach:

The process is as follows :-

Store the elements in the hashmap with its frequency of occurrence.
Iterate through the hashmap. If occurrence is more than 1, return the element.

Time Complexity: O(N)
Reason: Entire array is traversed to insert them in the map.

Space Complexity: O(N)
Reason: Map is used to store the count of each element.
*/


import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
class removeDuplicatesUS
{

   static void findRepeatingElements(int arr[]) {
	    HashMap<Integer,Integer> elementCount = new HashMap<>();
	    
	    for(int i:arr) {
	        if(elementCount.get(i) == null) 
            elementCount.put(i,1);
	        else 
            elementCount.put(i,elementCount.get(i)+1);
	    }
	    System.out.print("The repeating elements are: ");
	    for(Entry<Integer,Integer> entry: elementCount.entrySet()) {
	        if(entry.getValue()>1)
	            System.out.print(entry.getKey()+" ");
	    }
	    
	}
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Element in an array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 
		findRepeatingElements(arr);
	}
}