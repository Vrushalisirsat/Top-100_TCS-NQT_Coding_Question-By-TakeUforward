/*
Given a string, write a program to count the number of vowels, consonants, and spaces in that string.
Examples:
Example 1:
Input: string str="Take u forward is Awesome"
Output: 
Vowels: 10
Consonants: 11
White spaces: 4

Time Complexity: O(n), n is the length of string
Space Complexity: O(1)
*/

public class countVCW {
  public static void solve(String str, int length) {
    int vowels = 0, consonants = 0, whitespaces = 0;
    str = str.toLowerCase(); // converting given string to lowercase
    for (int i = 0; i < length; i++) {
      char ch = str.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        vowels++;
      else if (ch >= 'a' && ch <= 'z')
        consonants++;
      else if (ch == ' ')
        whitespaces++;
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
    System.out.println("White spaces: " + whitespaces);
  }
  public static void main(String args[]) {
    String str = "Take u forward is Awesome";
    int length = str.length();
    solve(str, length);
  }
}