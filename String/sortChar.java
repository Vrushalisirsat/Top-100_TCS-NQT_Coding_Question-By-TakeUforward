/*
Write a program to sort characters (numbers and punctuation symbols are not included) in a given string.
Examples:
Example 1:
Input: String str = “zxcbg
Output: bcgxz
Explanation: After sorting we get string as bcgxz
*/

/*
Solution 1: 
Approach: This approach uses the sort() function in Java to sort the string.

Time Complexity: O(n * log n)
Space Complexity:  O(n) in Java (because of character array)
*/
/*
import java.util.*;
public class sortChar {
  public static String solve(String str) {
    char[] char_arr = str.toCharArray();
    Arrays.sort(char_arr);
    // Creating object of String class
    String ans = new String(char_arr);
    return ans;
  }

  public static void main(String args[]) {
    String str = "zxcbg";

    System.out.println("String after sorting:");
    System.out.println(solve(str));
  }
}
*/
/*
solution-2
Time Complexity: O(n^2) (nested for loops)
Space Complexity: O(1) in C++
*/
public class sortChar {

  public static String solve(String str, int n) {
    char[] arr = str.toCharArray();
    // bubble sort
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        // swap
        if (arr[j] > arr[j + 1]) {
          char temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    String ans = new String(arr);
    return ans;
  }

  public static void main(String args[]) {
    String str = "zxcbg";
    int n = str.length();

    System.out.println("Before sorting:");
    System.out.println(str);
    System.out.println("After sorting:");
    System.out.println(solve(str, n));
  }
}
