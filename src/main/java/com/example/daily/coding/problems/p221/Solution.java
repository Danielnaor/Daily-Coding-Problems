
package com.example.daily.coding.problems.p221;

/**
 *
 * @author Danielnaor
 */


 /*
    Let's define a "sevenish" number to be one which is either a power of 7, or the sum of unique powers of 7. 
    The first few sevenish numbers are 1, 7, 8, 49, and so on. Create an algorithm to find the nth sevenish number.
  */

public class Solution {

    public static void main(String[] args) {

        // print the first 10 sevenish numbers
        for (int i = 1; i <= 10; i++) {
            System.out.println(getSevenishNumber(i));
        }

        
      
    }


    public static int getSevenishNumber(int n) {
        int result = 0;
        int power = 0;

        
        while (n > 0) { // while n is greater than 0
            if (n % 2 == 1) { // check if the numebr is odd
                result += Math.pow(7, power); // add the power of 7 to the result
            }
            power++; 
            n /= 2;
        }
        return result;
    }

    



}
