/*
Find lcm of two numbers.
Examples:
Example 1:
Input: num1 = 4,num2 = 8
Output: 8

Time Complexity: O(logɸmin(a,b)), where ɸ is 1.61.
Space Complexity: O(1).
*/

public class lcm {
  static int gcd(int a, int b) {
    if (b == 0) 
      return a;
    if(a == 0)
	  return b;

    return gcd(b, a % b);
  }

  static int lcm(int a,int b)
  {
    int lcm = (a * b) / gcd(a,b);
    return lcm;
  }

  public static void main(String args[]) {
    int a = 4, b = 8;
    int ans = lcm(a, b);
    System.out.print("The GCD of the two numbers is "+ans);
  }
}
