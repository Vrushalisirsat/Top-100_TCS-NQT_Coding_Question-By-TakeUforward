/*
Find permutations in which n people can occupy r seats in a classroom.
Examples:
Example 1:
Input: N = 5, r = 3
Output: 60
Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.

Time Complexity: O(n),as we are running a for loop from n to (n-r+1) 
Space Complexity: O(1)
*/

public class permutution {
  public static void main(String args[]) {
    int n = 6, r = 4;
    int ans = 1;
    for (int i = n; i >= n - r + 1; i--) {
      ans *= i;
    }
    System.out.print(ans);
  }
}


