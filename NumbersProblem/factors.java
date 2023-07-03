/*
Find all factors of a number or find all distinct divisors of a natural number.
Examples:
Example 1:
Input: n = 6
Output: 1,2,3,6
Explanation: 6 is divisible by 1,2,3,6

*/

//Method-1 :- Iterative Method
//Time Complexity: O(n).
//Space Complexity: O(1)

class factors {
    
    static void factors(int n)
    {     
           int fac=1;
           for(int i=1;i<=n;i++)
           {
            if(n%i == 0)
            System.out.print(i + " ");
           }
       
    }
    public static void main(String[] args)
    {

       int N = 6;
      factors(N);
    }
}