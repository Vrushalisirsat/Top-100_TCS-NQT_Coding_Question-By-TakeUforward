/*
Write a program to remove all characters from a string except alphabets in a given string.
Examples:
Example 1:
Input: string str = "take12% *&u ^$#forward"
Output: takeuforward
Explanation:
Characters 1,2,%,*,&,^,$,# along with whitespaces are 
removed but the order of remaining alphabets is preserved.

Time Complexity: O(n)
Space Complexity: O(n) 
*/

class removeChar
{
    static String removeCharacter(String str,int n)
    {
        StringBuffer ans = new StringBuffer();
        for(int i=0;i<n;i++)
        {
            int ascii = (int)str.charAt(i);
            if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122))
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String args[])
    {
        String str = "take12% *&u ^$#forward";
        int n = str.length();
        System.out.println(removeCharacter(str,n));
    }
}