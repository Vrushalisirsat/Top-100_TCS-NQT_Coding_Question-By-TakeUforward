/*
Write a program that reverses a given string (in-place).

Time Complexity: O(N)
Reason: The while loop will iterate n/2 time
Space Complexity: O(1)
Reason: We are not using any extra space.

Solution : Using the two-pointer Approach
Intuition: 
To reverse a string we need to think in terms of swapping the characters. The first index character needs to be swapped with the last character. Similarly, the second character needs to be swapped with the second last character and so on.
*/

class reverseString {
  public static String swap(String s, int i, int j) {
    StringBuilder str = new StringBuilder(s);
    str.setCharAt(i, s.charAt(j));
    str.setCharAt(j, s.charAt(i));

    return str.toString();
  }
  public static void main(String[] args) {
    String str = "HELLO";
    int i = 0;
    int j = str.length() - 1;

    // reversing a String
    while (i < j) {
      str = swap(str, i, j);
      i++;
      j--;
    }

    System.out.print("The reversed string is- "+ str);
  }
}

