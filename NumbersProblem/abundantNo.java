/*
Check if the number is an abundant number or not.
Examples:
Example 1:
Input: 18
Output: Abundant Number
Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater than 18, 18 is an abundant number.

Time Complexity: O(N)
Space Complexity: O(1).
*/


public class abundantNo {
  public static void main(String args[]) {
    int n = 18;
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }
    sum-=n;
    if (sum > n) {
      System.out.print("Abundant Number");
    } else {
      System.out.print("Not Abundant Number");
    }
  }
}