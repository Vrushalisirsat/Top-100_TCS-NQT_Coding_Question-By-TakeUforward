/*
Given a string of characters from a to z. Print the duplicate characters(which are occurring more than once) in the given string with their occurrences count.
Examples:
Example 1:
Input:
 str= "sinstriiintng"
Output:
i - 4
n - 3
s - 2
t - 2
Explanation:
In the above example, 's' occurs twice, 'i' occurs four times, 't' occurs twice and 'n' occurs thrice. 'r' and 'g' occur only one time and hence are not considered.

Time Complexity: O(n), we traverse each character in the string, and accessing the array takes only constant time (n is the length of the string).
Space Complexity: O(1), since the string has only characters from ‘a’ to ‘z’, the maximum size of the array is 26.
*/

class printDuplicate {
    public static void main(String[] args) {
        String str = "sinstriiintng";

        int[] counts = new int[26];

        for (int i = 0; i < str.length(); i++)
            counts[str.charAt(i) - 'a']++;

        for (int i = 0; i < 26; i++)
            if (counts[i] > 1)
                System.out.println((char)(i + 'a') + " - " + counts[i]);
    }
}