// Print the Fibonacci series up to the Nth term.
//Example 1:  Input: N = 5  ,  Output: 0 1 1 2 3 5

//Time Complexity: O(N).As we are iterating over just one for a loop.
//Space Complexity: O(1).

class fibonacciSeries {
    
    static void fibonacci(int N){
        
           int a=0;
           int b=1;
           int fib=0;
           System.out.print(a + " ");
           System.out.print(b + " ");
           for(int i=0;i<N-2;i++)
           {
            fib = a+b;
            System.out.print(fib + " ");
            a=b;
            b=fib;
           }

    }
    public static void main(String[] args) {

       // Here, let’s take the value of N to be 4.
       int N = 7;
       fibonacci(N);
    }
}