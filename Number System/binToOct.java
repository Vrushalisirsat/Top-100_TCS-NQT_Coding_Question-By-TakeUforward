/*
Convert a binary number to an octal number
Examples:
Example 1:.
Input: N = 1100110
Output: 146
Explanation: 1100110 when converted to octal number is “146”.

Time Complexity: O(n), As we are traversing through only one for a loop.
Space Complexity: O(1).
*/

public class binToOct {
  public static void main(String args[]) {
    String s = "1100110";
    int n = s.length();
    //adding appropriate "0" to the left of
    //string to make the length divisible by 3.
    if (n % 3 == 1) {
      s = "00" + s;
    } else if (n % 3 == 2) {
      s = "0" + s;
    }
    n = s.length();
    String ans = "";
    for (int i = 0; i < n; i += 3) {
      int temp = (s.charAt(i) - '0') * 4 + (s.charAt(i + 1) - '0') * 2 + (s.charAt(i + 2) - '0') * 1;
      ans = ans + Integer.toString(temp);
    }
    System.out.print(ans);
  }
}