
package com.example.daily.coding.problems.p004;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Danielnaor
 */
public class Solution {

    static int[] input;
    static boolean hasnoPOS = false;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("what would be the list? (example: 10,15,3,7) :");

        String[] listArrystring = scan.nextLine().split(",");

        input = new int[listArrystring.length];

        // Loop trough the String array and convet each value to int and adds int to the int[] list 
        for (int i = 0; i < listArrystring.length; i++) {
            input[i] = Integer.parseInt(listArrystring[i].trim());
        }

        int i = LowestIntNotInList();
        if (!hasnoPOS) {
            System.out.println(i);
        } else {
            System.out.println("No positive values so defult will be 1");
        }

    }

    public static int LowestIntNotInList() {
        //  List inputaslist = Arrays.asList(input);
        int firstPos = findFirstPOS(input);
        if (!hasnoPOS) {
            int[] inputNew = Arrays.copyOfRange(input, firstPos, input.length);

            int currentPOS = inputNew[0];
            for (int i = 0; i < inputNew.length; i++) {
                if (inputNew[i] != (currentPOS + 1) && inputNew[i] != currentPOS) {
                    currentPOS += 1;
                    return currentPOS;
                } else if (inputNew[i] != currentPOS) {

                    currentPOS += 1;

                } else {

                }

            }
        }

        return 0;
    }

    public static int findFirstPOS(int[] input) {
        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                return i;
            }
        }
        // If no positive integer is found, return -1 or throw an exception
        hasnoPOS = true;
        return -1;
    }
}
