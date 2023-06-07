/*
Sort Elements of an Array by Frequency

Problem Statement: Given an array of integers, having some duplicate elements, sort the array by frequency.

Examples:

Example 1:
Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
Output: 2 2 2 1 1 3 3 4 
Explanation: Since  2 is present 3 times in an array , so print it 3 times ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency, it will be printed at last.

*/

import java.util.*;

class sortArrFreqCount
{

    static void sortByFrequency(int arr[])
    {
        int n = arr.length;
        // Step 1: Create a HashMap to store frequency counts
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // Step 2: Update frequency counts
        for(int i=0;i<n;i++)
        {
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        }
        
        // Step 3: Sort the array based on frequency count using a custom comparator
        Arrays.sort(arr, (a, b) -> {
            if (map.get(a) != map.get(b)) {
                return map.get(b) - map.get(a); // Sort by frequency count in descending order
            } else {
                return a - b; // If frequency count is the same, sort in ascending order
            }
        });
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

        sortByFrequency(arr);

        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}