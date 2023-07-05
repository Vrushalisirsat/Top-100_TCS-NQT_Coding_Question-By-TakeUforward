/*
Convert a binary number to a decimal number.
Examples:
Example 1:
Input: N = 1011
Output: 11
Explanation: 1011 when converted to decimal number is 11.

Time Complexity: O(N), as we are iterating over just one for a loop.
Space Complexity: O(1).
*/

public class binToDec {
  public static void main(String args[]) {
    String s = "1011";
    int n = s.length();
    int base = 1;
    int ans = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (s.charAt(i) == '1') {
        ans += base;
      }
      base *= 2;
    }
    System.out.print(ans);
  }
}

//-----------------------------------------------------------------------------------------------------------------------------------------

//Solution 2: Using predefined functions.
//Time Complexity: O(N).
//Space Complexity: O(1).

public class binToDec {
  public static void main(String args[]) {
    String s = "1011";
    System.out.print(Integer.parseInt(s, 2));
  }
}