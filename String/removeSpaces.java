/*
Given a string, write a program to remove all the whitespaces from the string.
Examples:
Example 1:
Input: str = "Take you forward"
Output: Takeyouforward
Explanation: After removing all the whitespaces Takeyouforward is the result

Time Complexity: O(N)
Space Complexity: O(1)
*/

public class removeSpaces {
  // Function to remove vowels from a string
  public static String RemoveVowels(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
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