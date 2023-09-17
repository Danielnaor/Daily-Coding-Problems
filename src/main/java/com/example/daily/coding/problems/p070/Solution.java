
package com.example.daily.coding.problems.p070;

/**
 *
 * @author Danielnaor
 */
public class Solution {

    public static void main(String[] args) {
        Integer n = 1; // Given a positive integer n, return the n-th perfect number.
        System.out.println(getN_thPerfectNumber(n));

        n = 2;
        System.out.println(getN_thPerfectNumber(n));

        n = 10;
        System.out.println(getN_thPerfectNumber(n));

        n=199;
        System.out.println(getN_thPerfectNumber(n));


    }
    
    
    private static int getN_thPerfectNumber(int n) {
        int NthPerfectNumber = 19; 
        int count = 1;
        while (n > count) {
            NthPerfectNumber++;
            if (SumOfDigits(NthPerfectNumber) == 10) {
                count++;

            }
        }
        return NthPerfectNumber;

    }

    private static int SumOfDigits(int NthPerfectNumber) {
        int SumOfDigit = 0;

        String NthPerfectNumberString = Integer.toString(NthPerfectNumber);
        for (int i = 0; i < NthPerfectNumberString.length(); i++) {
            SumOfDigit += Character.getNumericValue(NthPerfectNumberString.charAt(i));

        }

        return SumOfDigit;

    }
}
