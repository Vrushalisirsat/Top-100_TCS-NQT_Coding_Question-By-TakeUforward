/*
Find all the non-repeating elements in an array
Problem Statement: Find all the non-repeating elements for a given array. Outputs can be in any order.

Examples:

Example 1:
Input:
 Nums = [1,2,-1,1,3,1]
Output:
 2,-1,3
Explanation:
 1 is the only element in the given array which occurs thrice in the array. -1,2,3 occurs only once and hence, these are non-repeating elements of the given array.

 */

/*
Solution 1: Brute-Force
Approach:
Following are the steps to the approach:
Start iterating the array to pick an element.
Use another nested loop to check if picked elements repeat in the array.
If the inside nested loop reaches the end of the array for a picked element, it indicates it is a non-repeating element and we print it.
If not, we move to pick another element.

Time Complexity: O(N2)
Reason: We are using two loops nested.

Space Complexity: O(1)
Reason: No extra data structure is used for computation.
*/

/*
import java.util.*;
class nonRepeatingEle
{

    static void findNonRepeatingElement(int[] arr,int n) {
      
     boolean chk;
     for(int i=0;i<n;i++)
     {
        chk=false;
        for(int j=0;j<n;j++)
        {
            if(i != j && arr[i] == arr[j])
            {
                chk=true;
                break;
            }
        }
        if(!chk)
        {
          System.out.print(arr[i]+" ");
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
      
        System.out.println("The array of Non-Repeating elements is ");
        findNonRepeatingElement(arr,n);
        
       
    }
}
*/

//--------------------------------------------------------------------------------------------------------------------------------------------

/*
Solution 2: Using Sorting

Approach:

Following are the steps to the approach:

Sort the given array.
Iterate from 1st position to (n-2)th position(0-index). 
If the previous element, current element and next element are totally different. It is a non-repeating element. 
For edge cases, i.e, 0th and (n-1)th element. If the 0th element is not equal to the 1st element, then the 0th element is non-repeating. Similarly if (n-1)th element is not equal to (n-2)th element, (n-1)th element is non-repeating element. 

*/
/*
import java.util.*;
class repeatingEle
{

 static void repeatingElement(int[] arr,int n) {
    Arrays.sort(arr);
        if(arr[0] != arr[1])
        {
            System.out.print(arr[0] + " ");
        }
         
     for(int i=0;i<n-1;i++)
     {
        if(arr[i-1] != arr[i])
        {
            System.out.print(arr[i] + " ");
        }

        if(arr[n-2] != arr[n-1])
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

//--------------------------------------------------------------------------------------------------------------------------------------
/*
Solution 3: Using Maps
Approach:
Following are the steps to the approach:
Declare a hashmap for storing elements as the key and their number of occurrences as value..
Iterate through the array and store elements and their occurrences in the map.
Print elements whose occurrences were equals to 1.

Time Complexity: O(N)
Reason: Iterating once through the array once.

Space Complexity: O(N)
Reason: Map is used to insert elements.
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
	        if(entry.getValue() == 1)
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