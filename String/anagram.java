/*
Given two strings, check if two strings are anagrams of each other or not.
Examples:
Example 1:
Input: CAT, ACT
Output: true
Explanation: Since the count of every letter of both strings are equal

Time Complexity: O(nlogn) since sorting function requires nlogn iterations.
Space Complexity: O(1)
*/

import java.util.*;
class anagram
{
    static String sortString(String str)
    {
        char c[] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    static boolean checkAnagrams(String str1,String str2)
    {
        //case-1 : check length of both string is same or diff
        if(str1.length() != str2.length())
        return false;

        //sort both the string
        str1 = sortString(str1);
        str2 = sortString(str2);

        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i) != str2.charAt(i))
            return false;
        }
        return true;

    }
    public static void main(String args[])
    {
        String str1 = "CAT";
        String str2 = "ACT";
        System.out.println(checkAnagrams(str1, str2));
    }
}