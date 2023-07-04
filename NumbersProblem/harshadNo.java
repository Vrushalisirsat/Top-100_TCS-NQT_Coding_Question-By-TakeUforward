/*
Check if the number is a Harshad(or Niven) number or not.
Examples:
Example 1:
Input: 378
Output: Yes it is a Harshad number.
Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

Time Complexity: O(N), where N is the number of digits
Space Complexity: O(1).
*/

class harshadNo {
    
    static void harshadNo(int N){
        int rem=0;
        int sum=0;

        while(N > 0)
        {
          rem = N%10;
          sum += rem;
          N = N/10;
        }
        if(N % 2 == 0)
        System.out.println("Yes it is a Harshad number.");
        else 
        System.out.println("No it's not a Harshad number.");
       
    }
    public static void main(String[] args) {
       int N = 378;
       harshadNo(N);
    }
}