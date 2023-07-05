/*
Given an Octal Number, convert it into Binary Number.
Examples:
Example 1:
Input: 345
Output: 011100101
Explanation: Binary equivalent of given Octal expressionis 011100101


Time Complexity: O(log n) where n is the number 
Space Complexity: O(1)
*/

import java.util.*;
public class octToBin {
  public static int DecimaltoBinary(int decimal) {
    int Binary = 0;
    int i = 0;
    while (decimal != 0) {
      int rem = decimal % 2;
      Binary += (rem * Math.pow(10, i));
      i++;
      decimal = decimal / 2;
    }
    return Binary;
  }
  public static int OctaltoDecimal(int Octal) {
    int Decimal = 0;
    int i = 0;
    while (Octal != 0) {
      int rem = Octal % 10;
      Decimal += rem * Math.pow(8, i);
      i++;
      Octal /= 10;
    }
    return Decimal;
  }
  public static void main(String[] args) {
    int Octal = 345;
    int Decimal = OctaltoDecimal(Octal);
    System.out.println("The binary conversion of the given octal number is "+DecimaltoBinary(Decimal));
  }
 
}
