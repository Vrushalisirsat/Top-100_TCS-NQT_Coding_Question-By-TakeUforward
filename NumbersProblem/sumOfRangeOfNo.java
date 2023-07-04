/*
Find the sum of numbers in the given range.
Examples:
Example 1:
Input: l=2, r=7
Output: 27
Explanation: 2+3+4+5+6+7=27. Therefore 27 is the answer.

*/

public class sumOfRangeOfNo {
  public static void main(String args[]) {
    int l = 2, r = 7;
    int sum = 0;
    for (int i = l; i <= r; i++) {
      sum += i;
    }
    System.out.print("The sum of the numbers in the given range is " + sum);
  }
}