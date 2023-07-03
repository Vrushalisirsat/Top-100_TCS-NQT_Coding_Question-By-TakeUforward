/*
Given an integer Print YES if it is a strong number else print NO.
Note :
When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number. 
Strong number is also known as Krishnamurthi number/Peterson Number.
Examples:
Examples 1:
Input: N = 145
Output: Yes
Explanation: 1! + 4! + 5! = 145. Hence 145 is a strong number. 

Time Complexity: O( N * M) where N is the number of digits and M  is the time taken to compute the factorial of the digit.
Space Complexity: O(1)

*/

class strongNo {
    
    static int factorial(int N)
    {     
        if(N == 1)
        return 1;
        return N*factorial(N-1);
    }

    static void strongNo(int n)
    {
        int m=n;
        int rem=0;
        int strong=0;
        int sum=0;
        while(n > 0)
        {
            rem = n%10;
            sum += factorial(rem);
            n=n/10;
        }
        if(sum == m)
        System.out.println("Strong Number");
        else
        System.out.println("Not a Strong Number");
    }
    public static void main(String[] args) {

       
       int N = 145;
      strongNo(N);
    }
}