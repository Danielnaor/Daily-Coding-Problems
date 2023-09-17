
package com.example.daily.coding.problems.p001;

/**
 *
 * @author Danielnaor
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("what would be the list? (example: 10,15,3,7) :");

        String listString = input.nextLine();

        // check if the string is empty and if so put in the defult list 10,15,3,7
        if (listString.isEmpty()) {
            listString = "10,15,3,7";
        }


        String[] listArrystring = listString.split(",");

        int[] list = new int[listArrystring.length];

        // Loop trough the String array and convet each value to int and adds int to the int[] list 
        for (int i = 0; i < listArrystring.length; i++) {
            list[i] = Integer.parseInt(listArrystring[i].trim());
        }
        // k will be the value we want the numbers to add up to.
        System.out.print("whats k= (a number that the two numbers from the list will add up to): ");
        int k = input.nextInt();

        int num1;
        int num2;
        for (int i = 0; i < list.length; i++) {
            num1 = list[i];
            for (int i2 = 0; i2 < list.length; i2++) {
                num2 = list[i2];
                if ((num1 + num2) == k) {
                    System.out.println(num1 + " + " + num2 + " = " + k);
                    return;

                }

            }

        }
        System.out.print(" there is no combination of any two numbers from the list add up to  " + k);

    }
}
