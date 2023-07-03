/*
Given a number n. Print all Prime Factors of the given number n.
Examples:
Example 1:
Input: N = 12
Output: 2,2,3

*/

class allPrimeFactor {

  public static void primeFactor(int n) {
    System.out.print("Prime Factors : ");
    for (int i = 2; n > 1; i++) {

      if (n % i == 0) {

        while (n % i == 0) {

          System.out.print(i + " ");
          n = n / i;
        }
      }

    }
  }
  public static void main(String args[]) {
    int n = 60;
    primeFactor(n);
  }
}


/*
Time Complexity: O(n)
Space Complexity: O(1)

*/