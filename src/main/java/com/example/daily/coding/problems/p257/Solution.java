
package com.example.daily.coding.problems.p257;

import java.util.Arrays;

/**
 *
 * @author Danielnaor
 */


 /*
Given an array of integers out of order, determine the bounds of the smallest window that must be sorted in order for the entire array to be sorted. 
For example, given [3, 7, 5, 6, 9], you should return (1, 3).

  */

public class Solution {

    public static void main(String[] args) {

        // 3, 7, 5, 6, 9
        Integer[] arr = {3, 7, 5, 6, 9};
        System.out.println(findSmallestWindow(arr)); // (1, 3)
        //3, 5, 6, 7, 9
        arr = new Integer[]{3, 5, 6, 7, 9};
        System.out.println(findSmallestWindow(arr)); // the array is already sorted

        //5, 4, 3, 2, 1
        arr = new Integer[]{5, 4, 3, 2, 1};
        System.out.println(findSmallestWindow(arr)); // (0, 4)


        //1,2,4,3,5,6
        arr = new Integer[]{1,2,4,3,5,6};
        System.out.println(findSmallestWindow(arr)); // (2, 3)



        
      
    }

    private static String findSmallestWindow(Integer[] arr) {
        // get the sorted array
        Integer[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        // compare the sorted array with the original array
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] == sortedArr[start]) {
                start++;
            } else if (arr[end] == sortedArr[end]) {
                end--;
            } else {
                break;
            }
        }

        if (start < end) {
            return "(" + start + ", " + end + ")";
        } else {
            return "the array is already sorted";
        }

    }

}