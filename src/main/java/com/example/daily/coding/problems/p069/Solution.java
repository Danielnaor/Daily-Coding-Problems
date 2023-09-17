
package com.example.daily.coding.problems.p069;


/*
        
        Given a list of integers, return the largest product that can be made by multiplying any three integers.

        For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 * -10 * 5.

        You can assume the list has at least three integers.
       
*/




/**
 *
 * @author Danielnaor
 */
public class Solution {

    public static void main(String[] args) {
        

        int[] list = {-10, -10, 5, 2};

        int largest_product_of_3_Int_from_list = largestProduct3Int(list);
        System.out.println(largest_product_of_3_Int_from_list);
    }

    //return the largest product that can be made by multiplying any three integers from the list
    private static int largestProduct3Int(int[] list) {
        int largest_product = 0;
        int product = 0;
        for (int num = 0; num < list.length; num++) {
            for (int num2 = 0; num2 < list.length; num2++) {
                for (int num3 = 0; num3 < list.length; num3++) {
                    if (num != num2 && num != num3 && num2 != num3) {
                        product = list[num] * list[num2] * list[num3];
                        if (product > largest_product) {
                            largest_product = product;
                        }
                    }
                }
            }

        }
        return largest_product;
    }
}
