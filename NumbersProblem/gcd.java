/*
 Find the gcd of two numbers.
Example 1:
Input: num1 = 4, num2 = 8
Output: 4
Explanation: Since 4 is the greatest number which divides both num1 and num2.

Time Complexity: O(logɸmin(a,b)), where ɸ is 1.61.
Space Complexity: O(1).
*/

public class gcd {
  static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }

    if(a == 0)
	return b;

    return gcd(b, a % b);
  }
  public static void main(String args[]) {
    int a = 4, b = 8;
    int ans = gcd(a, b);
    System.out.print("The GCD of the two numbers is "+ans);
  }
}
