/*
Given a number n, express the number as a sum of 2 prime numbers.
Examples:
Example 1:
Input : N = 74
Output : True . 
Explanation: 74 can be expressed as 71 + 3 and both are prime numbers.

Time Complexity: O(sqrt(n))
Reason : We are testing divisors i, 2<=i<=sqrt(n)
Space Complexity: O(1)
Reason : We are just returning boolean value
*/

public class sumOf2PrimeNo {

       static boolean prime(int n) {

              if (n <= 1)
                     return false;

              for (int i = 2; i * i <= n; i++) {
                     if (n % i == 0) {
                            return false;
                     }
              }

              return true;
       }

       static boolean isPrime(int n) {

              if (prime(n) && prime(n - 2)) {
                     return true;
              } else {
                     return false;
              }
       }

       public static void main(String[] args) {

              int n = 19;

              if (isPrime(n)) {
                     System.out.println("Yes");
              } else if (isPrime(n)) {
                     System.out.println("No");
              }
       }
}
