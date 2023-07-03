/*
Given a number X,  print its factorial.
To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.
Note: X  is always a positive number. 

Example 1:
Input: X = 5
Output: 120
Explanation: 5! = 5*4*3*2*1
*/

//Method-1 :- Iterative Method
//Time Complexity: O(n)
//Space Complexity: O(1)
/*
class factorial {
    
    static int factorial(int N)
    {     
           int fact=1;
           for(int i=1;i<=N;i++)
           {
            fact = fact*i;
           }
        return fact;
    }
    public static void main(String[] args) {

       // Here, let’s take the value of N to be 4.
       int N = 5;
       System.out.println(factorial(N));
    }
}
*/

//Method-1 :- Recursive Method
//Time Complexity: O(n)
//Space Complexity: O(1)

class factorial {
    
    static int factorial(int N)
    {     
        if(N == 1)
        return 1;
        return N*factorial(N-1);
    }
    public static void main(String[] args) {

       // Here, let’s take the value of N to be 4.
       int N = 5;
       System.out.println(factorial(N));
    }
}