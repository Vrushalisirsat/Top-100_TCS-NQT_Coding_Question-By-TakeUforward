/*
Q. Find the Power of a number.
Example 1:
Input: N = 5, k=3
Output: 125
Explanation: Since 5*5*5 is 125.

*/


//Method-1 :- Iterative Method
//Time Complexity: O(k).
//Space Complexity: O(1)
/*
class power {
    
    static int power(int N,int k)
    {     
           int pow=1;
           for(int i=1;i<=k;i++)
           {
            pow = N*pow;
           }
        return pow;
    }
    public static void main(String[] args)
    {

       int N = 5;
       int k=3;
       System.out.println(power(N,k));
    }
}

*/

//Method-2 :- Recursive Method
//Time Complexity: O(k)
//Space Complexity: O(1)
/*
class power {
    
    static int power(int N,int k)
    {     
          if(k == 0)
          return 1;

          return N*power(N,k-1);
    }
    public static void main(String[] args)
    {

       int N = 5;
       int k=3;
       System.out.println(power(N,k));
    }
}

*/

//Method-3 :- Recursive Method
//Time Complexity: O(log n)
//Space Complexity: O(1)

public class power {
  public static void main(String args[]) {
    double n = 2, k = 3;
    double ans=Math.pow(n,k);

    System.out.print(n+" raised to the power "+k+" is "+ans);
  }
}
