/*
Given an algebraic expression, we need to simplify the expression and remove the brackets.
Examples:
Example 1:
Input: “a+((b-c)+d)
Output: “a+b-c+d
Explanation: Removed all the brackets in the algebric expression.

Time Complexity: O(N)
Reason: We iterate from 0 to n-1.
Space Complexity: O(1)
Reason: We are  not using any extra space.
*/

class removeBracket
{
    static String solve(String str)
    {
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) != ')' && str.charAt(i) != '(')
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) 
    {
    String input = "a+((b-c)+d)";

    System.out.println("Original String: "+input);
    System.out.println("After removing brackets: "+solve(input));
    
  }
}