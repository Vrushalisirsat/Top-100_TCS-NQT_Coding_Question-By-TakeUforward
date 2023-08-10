/*
Given a String, write a program to remove vowels from a given String.
Examples:
Example 1:
Input: Str = take u forward
Output: tk  frwrd
Explanation: All vowels are removed from the given String.

Time Complexity: O(N)
Space Complexity: O(1)
*/

public class removeVowels {
  // Function to remove vowels from a string
  public static String RemoveVowels(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
        str = str.substring(0, i) + str.substring(i + 1);
        i--;
      }
    }
    return str;
  }

  public static void main(String[] args) {
    String str = "take u forward";
    System.out.println("String after removing the vowels : "+RemoveVowels(str));
  }
}