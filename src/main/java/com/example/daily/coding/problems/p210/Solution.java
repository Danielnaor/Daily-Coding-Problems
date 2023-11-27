
package com.example.daily.coding.problems.p210;

/**
 *
 * @author Danielnaor
 */


 /*
A Collatz sequence in mathematics can be defined as follows. Starting with any positive integer:

if n is even, the next number in the sequence is n / 2
if n is odd, the next number in the sequence is 3n + 1
It is conjectured that every such sequence eventually reaches the number 1. Test this conjecture.

Bonus: What input n <= 1000000 gives the longest sequence?

 */
public class Solution { 

    private static int maxLen = 1000000;
    private static int maxNum = 0;
    
    public static void main(String[] args) {

        // test the conjecture with multiple numbers
       Boolean result = false;

         for(int i = 113383; i <= 113384; i++) {
            System.out.println(i);
              result = testConjecture(i);
         }



            System.out.println("Max number: " + maxNum + " Max length: " + maxLen);

       



            
           

    }

    // test the conjecture
    public static boolean testConjecture(int n) {
        int len = 0;
        // iterate until n is 1
        while(n != 1) {
            // check if n is even
            if(n % 2 == 0) {
                // divide n by 2
                n = n / 2;
            } else {
                // multiply n by 3 and add 1
                n = (n * 3) + 1;
            }
            // increment the length of the sequence
            len++;
        }

        if(len > maxLen){
            maxLen = len;
            maxNum = n;
        }


        return n==1;
    }

    

}