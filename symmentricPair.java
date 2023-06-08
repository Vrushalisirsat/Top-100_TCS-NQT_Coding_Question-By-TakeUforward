/*
Find all Symmetric Pairs in the array of pairs

In this article, we will solve the problem: “Find all Symmetric Pairs in the array of pairs

Problem Statement: Given an array of pairs, find all the symmetric pairs in the array.

Examples:

Example 1:
Input: (1,2),(2,1),(3,4),(4,5),(5,4)
Output: (2,1) (5,4)
Explanation: Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4) are symmetric pairs.

*/

/*
Solution 1: Brute force
Intuition: For every pair check in the vector pair if the symmetric pair is present or not.
Approach:
First use a for loop and traverse through every pair in the vector.
Then use another for loop and check if the symmetric pair of that pair is present in the rest of the vector or not.
If the symmetric pair is present print the pair and break from the second for loop.so as to avoid repetitive printing of answers in case of duplicate pair.
If the symmetric pair is not present,move to the next pair.

Time Complexity: O(N*N).
Space Complexity: O(1).
*/
/*
import java.util.*;
class symmentricPair
{
 public static void main(String args[])
   {
        int n = 5;
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
      
         System.out.println("Symmetric Pairs in the array : ");
        
       for(int i=0;i<n;i++)
       {
        for(int j=i+1;j<n;j++)
        {
            if(arr[j][0] == arr[i][1] && arr[i][0] == arr[j][1])
            {
                System.out.println(" ( " + arr[j][0] + " , " + arr[j][1] + " ) ");
            }
        }
       }
     
        
       
    }
}
*/
//--------------------------------------------------------------------------------------------------------------------------------------

/*
Solution: Time optimized

Intuition: We will store the pairs in a hash map and then check if the symmetric pair exists or not.

Approach:

Store pairs in the hashmap.
Let “first" be the first element of the pair and “second" be the second element of the pair.
While iterating through the pairs we will check if {second,first} exists by using map.
If {second,first} exists then print the pair,else store it in the map.

*/


import java.util.HashMap;
public class symmentricPair {
  public static void main(String args[]) {
    
    int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};

    HashMap < Integer, Integer > mp = new HashMap < Integer, Integer > ();
    System.out.println(arr.length);

    System.out.println("The Symmetric Pairs are: ");
    for (int i = 0; i < arr.length; i++) {
      int first = arr[i][0];
      int second = arr[i][1];
      if (mp.get(second) != null && mp.get(second) == first) {
        System.out.print("("+first + " " + second+") ");
      } else {
        mp.put(first, second);
      }
    }

  }
}