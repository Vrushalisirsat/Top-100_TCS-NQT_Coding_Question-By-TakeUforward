// Method-1 :- by using formula
//Time Complexity: O(1) since direct formula is applied.
//Space Complexity: O(1)

import java.util.*;
public class Main {
  public static float SumofGP(float a, float r, int n) {
    float sum = a * ((float) Math.pow(r, n) - 1) / (r - 1);
    return sum;
  }

  public static void main(String args[]) {
    float a = 2; // First term of G.P.
    float r = 2; // common ratio of G.P.
    int n = 4; // Number of terms of G.P.
    System.out.println("Sum of GP Series is "+SumofGP(a, r, n));
  }
}

//-----------------------------------------------------------------------------------------------------
// Method-1 :- by using loop
//Time Complexity: O(n) since total number of iterations required are number of terms
//Space Complexity: O(1)

import java.util.*;
public class Main {
  public static double SumofGP(double a, double r, int n) {
    double sum = 0.0;
    for (int i = 0; i < n; i++) {
      sum += a;
      a = a * r;
    }
    return sum;
  }
  public static void main(String args[]) {
    double a = 2.0; // First term of G.P.
    double r = 1.5; // common ratio of G.P.
    int n = 4; // Number of terms of G.P.
    System.out.println("Sum of GP Series is "+SumofGP(a, r, n));
  }
}