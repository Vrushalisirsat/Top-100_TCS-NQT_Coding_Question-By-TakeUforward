/*
Adding Element in an Array
Problem Statement: Given an array of N integers, write a program to add an array element at the beginning, end, and at a specific position.

Example:
Input: N = 5, array[] = {1,2,3,4,5}
insertbeginning(6)
insertending(7)
insertatpos(8,4)
Output: 6,1,2,8,3,4,5,7
Explanation: 6 is added at the beginning and 7 is added at the end and 8 is added at position 4 
*/

/*
import java.util.*;
class addEle
{
    static void insertatbegin(int arr[],int n ,int beg)
    {
       for(int i=n-1;i>=0;i--)
    {
        arr[i+1]=arr[i];
    }
    arr[0]=beg;
    }

    static void insertatposition(int arr[],int n,int value,int pos)
    {
      for(int i=n;i>=pos;i--)
      {
        arr[i]=arr[i-1];
      }
      arr[pos-1] = value;
    }

    static void insertatend(int arr[],int n,int end)
    {
      arr[n] = end;
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
    System.out.println("Before inserting the value at beginning:");
     for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();

    System.out.println("Enter Element to be inserted at begining : ");
    int beg = sc.nextInt();

    // System.out.println("Enter Element and position to be inserted at specific position : ");
    // int value = sc.nextInt();
    // int pos = sc.nextInt();

    // System.out.println("Enter Element to be inserted at ending : ");
    // int end = sc.nextInt();


    insertatbegin(arr,n,beg);
    // insertatposition(arr,n,value,pos);
    // insertatend(arr,n,end);
    System.out.println("After inserting the value at beginning:");
    for(int i=0;i<=n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();

}
}

*/

import java.util.*;
class addEle{
static void insertatbegin(int[] arr,int n,int value)
{
    for(int i=n-1;i>=0;i--)
    {
        arr[i+1]=arr[i];
    }
    arr[0]=value;
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
    System.out.println("Before inserting the value at beginning:");
     for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();

    System.out.println("Enter Element to be inserted at begining : ");
    int beg = sc.nextInt();
    
    insertatbegin(arr,n,value);
    System.out.println("After inserting the value at beginning:");
    for(int i=0;i<=n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    
}
}