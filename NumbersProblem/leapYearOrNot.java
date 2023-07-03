public class leapYearOrNot {
  public static void main(String args[]) {
    int year = 1992;
    if (((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}

//Time Complexity: O(1).
//Space Complexity: O(1).