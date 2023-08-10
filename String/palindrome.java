/* Q.1 Check a given string is palindrome or not.

Given a string, check if the string is palindrome or not.  A string is said to be palindrome if the reverse of the string is the same as the string.
Example 1:
Input: Str =  ABCDCBA"
Output: Palindrome
Explanation: String when reversed is the same as string.

Time Complexity: O(N) { Precisely, O(N/2) as we compare the elements N/2 times and swap them}.
Space Complexity: O(1) { The elements of the given array are swapped in place so no extra space is required}.
*/

// Method-1 : using recursion
class palindrome
{
    static boolean isPalindrome(int i,String str)
    {
        if(i >= str.length()-1)
        return true;

        if(str.charAt(i) != str.charAt(str.length()-i-1))
        return false;
        return isPalindrome(i+1,str);
    }
    public static void main(String args[])
    {
        String str = "ABCDCBA";
      
        if(isPalindrome(0,str))
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}