// Method-1 : by using formula of AP
//Time Complexity: O(1) since we are using direct formula
//Space Complexity: O(1) since no extra space is required

import java.util.*;
class sumOfAPseries
{
static double sumofAp(double a, double d, int n)
{
   double sum = (n / 2.0) * (2.0 * a + (n - 1) * d);
    return sum;
}
public static void main(String args[])
{
    double a = 1.5, d = 3;
    int n = 5;
    System.out.println("Sum of Given Ap Series: "+sumofAp(a, d, n));
}
}

//----------------------------------------------------------------------------------------------------------
//Method-2 : By using loop
//Time Complexity: O(n) since total number of iterations required are number of terms
// Space Complexity :- O(1)

import java.util.*;
class TUF{
static double sumofAp(double a, double d, int n)
{
    double sum = 0.0;
    for (int i = 1; i <= n; i++)
    {
        sum += a;
        a += d;
    }
    return sum;
}
public static void main(String args[])
{
    double a = 1.5, d = 3;
    int n = 5;
    System.out.println("Sum of Given Ap Series: "+sumofAp(a, d, n));
}
}