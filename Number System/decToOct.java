/*
Given a decimal number, convert it into Octal Number.
Examples:
Example 1:
Input:  17
Output: 21
Explanation: Octal Equivalent of 17 is 21

Time Complexity: O(log n) where n is the number 
Space Complexity: O(1)
*/

import java.util.*;
public class decToOct {
  public static int DecimaltoOctal(int Decimal) {
    int i = 0;
    int Octal = 0;
    while (Decimal != 0) {
      int rem = Decimal % 8;
      Octal += rem * Math.pow(10, i);
      i++;
      Decimal /= 8;
    }
    return Octal;
  }
  public static void main(String[] args) {
    int Decimal = 136;
    System.out.println("The Octal conversion of the given decimal number is 
    "+DecimaltoOctal(Decimal));
  }
}