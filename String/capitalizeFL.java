/*
Given a string, write a program to Capitalize the first and last character of each word of that string.
Examples:
Example 1:
Input: String str = "take u forward is awesome"
Output: “TakE U ForwarD IS AwesomE
Explanation: We get the result after capitalizing the first and last character of each word of a string

Time Complexity: O(n), n is the length of string
Space Complexity: O(n), because of StringBuffer
*/
//Using Character.toUpperCase() in Java

public class capitalizeFL {
  public static String Capitalize(String str, int size) {
    StringBuffer sb = new StringBuffer(str);

    for (int i = 0; i < size; i++) {
      if (i == 0 || i == (size - 1)) // Converting first and last index character to uppercase
      {
        sb.setCharAt(i, Character.toUpperCase((char)(int) str.charAt(i)));
      } else if (str.charAt(i) == ' ') // Converting characters present before and after space to uppercase
      {
        sb.setCharAt(i - 1, Character.toUpperCase((char)(int) str.charAt(i - 1)));
        sb.setCharAt(i + 1, Character.toUpperCase((char)(int) str.charAt(i + 1)));
      }
    }
    return sb.toString();
  }

  public static void main(String args[]) {
    String str = "Take u Forward is Awesome";
    int size = str.length();

    System.out.println("String after capitalizing first and last letter of each word of the string: ");
    System.out.println(Capitalize(str, size));
  }
}