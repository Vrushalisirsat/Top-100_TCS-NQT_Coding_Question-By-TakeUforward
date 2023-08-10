/*
Given a string, return the character that occurs the maximum number of times in the string. If the maximum occurrence of two or more characters is the same, return any one of them. 
Examples:
Example 1:
Input: str = “takeuforward
Output: a
Explanation: The character 'a' and 'r’ have the same  maximum occurrence i.e 2. Hence we can print any one of them

Time Complexity: O(N) to iterate through an array of size N.
Space Complexity: O(1) because for any input string only a fixed-size array is being allocated.
*/

public class maxOccurChar {
   static char maxOccurringChar(String str) {
      char ans = 'a';
      int maxfreq = 0, n = str.length();
      int count[] = new int[256];
      for (int i = 0; i < n; i++) {
         count[str.charAt(i)]++;
         if (count[str.charAt(i)] > maxfreq) {
            maxfreq = count[str.charAt(i)];
            ans = str.charAt(i);
         }
      }
      return ans;
   }
   public static void main(String[] args) {
      String str = "takeuforward";
      System.out.println("Maximum occurring character is " + maxOccurringChar(str));
   }
} 