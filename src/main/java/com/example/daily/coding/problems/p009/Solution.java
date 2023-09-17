

package com.example.daily.coding.problems.p009;

import java.util.Arrays;

/**
 *
 * @author Danielnaor
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] list = {2, 4, 6, 2, 5};
        System.out.println("for list: " + Arrays.toString(list) + " the largest sum of non-adjacent numbers is " + findTheLargestSum(list));
        int[] list2 = {5, 1, 1, 5};
        System.out.println("for list: " + Arrays.toString(list2) + " the largest sum of non-adjacent numbers is " + findTheLargestSum(list2));

    }
    
    public static int findTheLargestSum(int[] list){
        int len = list.length;
        
        if(len == 0){
            return 0;
        }
        
        if(len == 1){
            return list[0];
        }
         
        int[] sum = new int[len];
        
        sum[len-1] = list[len-1];
        sum[len-2] = Math.max(list[len-1], list[len-2]);
  
        for(int i=len-3;i>=0;i--) {
          sum[i] = Math.max(list[i] + sum[i+2], sum[i+1]);
        }
  
        return sum[0];
    }
}

