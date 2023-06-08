/*
Problem Statement: Search an element in an array and return its position
Examples:
Example 1:
Input: array[] = {1,2,3,4,5} k=3                                                                              
Output: 2                                                                                                             
Explanation: The answer is 2 because 3 is present at 2nd index.

Example 2:
Input: array[]={6,7,9,5,3,10} k=10
Output: 5
Explanation: The answer is 5 because 10 is present at 5th index.
*/

/*
Solution 1: Linear Search
Intuition: Simply traverse through the array and check if k matches the element of the array, if it matches return the index of that element.
Approach:
Traverse through the array.
If arr[i] matches k then return i.

Time Complexity: O(n)
Space Complexity: O(1).
*/

/*
import java.util.*;
class searchEle {

   static int searchEle(int arr[] ,int n,int x)
   {
     for(int i=0;i<n;i++)
     {
        if(x == arr[i])
        {
            return i;
        }
     }
     return -1;
   }
      
     
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array Element : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be search : ");
        int k = sc.nextInt();
        
        System.out.println("Element found at index : " + searchEle(arr,n,k));
       
    }
}
*/

/*
Solution 2: Optimized solution(provided the array is sorted)
Intuition: If the array is already sorted we can find the index of the element in O(logn).
Approach:
Use the binary search algorithm.
Maintain two variables low and high.Initially low is 0 and high is n-1.low to high is the range of the index where the elements can possibly lie.
Take another variable mid.mid = (low+high)/2.
If the element at mid is less than k,then the required index should obviously be between mid+1 to r,so make l=mid+1.
If the element at mid is greater than k,then the required index should obviously be between l to mid-1,so make r=mid-1.
If the element at mid is equal to k then return mid.
This way we go on reducing the range.If at some point r>l then the element is not present in the array.


Time Complexity: O(logn).
Space Complexity: O(1)
*/

//--------Iterative method-----------
/*
import java.util.*;
class searchEle {

   static int searchEle(int arr[] ,int n,int x)
   {
    int low=0;
    int high=n-1;
     int ans=-1;
    while(low <= high)
    {
        int mid = low + (high - low) / 2;

        if(arr[mid] == x)
        {
            ans = mid;
            return ans;
        }

        if(arr[mid] < x)
        {
          low = mid+1;
        }
        else{
            high = mid-1;
        }
    }
    return ans;
   }
      
     
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array Element : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be search : ");
        int k = sc.nextInt();

        System.out.println("Element found at index : " + searchEle(arr,n,k));
       
    }
}

*/

//--------Recursive method-----------
import java.util.*;
class searchEle {

   static int searchEle(int arr[] ,int n,int x,int low,int high)
   {
    
    while(low <= high)
    {
        int mid = low + (high - low) / 2;

        if(arr[mid] == x)
        {
            return mid;
        }

        if(arr[mid] < x)
        {
          low = mid+1;
        }
        else{
            high = mid-1;
        }
    }
    return ans;
   }
      
     
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array Element : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be search : ");
        int k = sc.nextInt();

        System.out.println("Element found at index : " + searchEle(arr,n,k,0,n-1));
       
    }
}