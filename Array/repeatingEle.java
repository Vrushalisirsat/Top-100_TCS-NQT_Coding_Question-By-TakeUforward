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


import java.util.*;
class removeDuplicatesUS
{

    static void removeDuplicates(int[] arr,int n) {
      
      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

      for(int i=0;i<n;i++)
      {
        if(!map.containsKey(arr[i]))
        {
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