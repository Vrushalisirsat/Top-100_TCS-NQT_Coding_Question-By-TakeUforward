/*
Given a string, print non-repeating characters of the string.
Examples:
Example 1:
Input: string = google
Output: l,e
Explanation: Non repeating characters are l,e.

Time complexity: O(n)
Reason: We make a single iteration to fill up the frequency array
Space complexity: O(n)
Reason: We are using an array to store the frequency of each character.
*/

class nonRepChar
{
    static void printFrequency(String str,int n)
    {
      int freq[] = new int[200];
      char s[] = str.toCharArray();
      for(int i=0;i<n;i++)
      {
        if(str.charAt(i) == ' ')
        continue;
        else
        freq[(int) str.charAt(i)]++;
      }

      //printing the frequency of the string
      for(int i=0;i<n;i++)
      {
        if(freq[(int)str.charAt(i)] == 1 && s[i] != ' ')
        {
            System.out.print(s[i] + " ");
        }
      }
    }

    public static void main(String[] args) {
        String st = "take u forward";

        int n = st.length();

        System.out.print("Non-Repeating characters: ");
        printFrequency(st, n);

    }
}