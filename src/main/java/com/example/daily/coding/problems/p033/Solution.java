

package com.example.daily.coding.problems.p033;

import java.util.Arrays;

/**
 *
 * @author Danielnaor
 */
public class Solution {
    /*
    Compute the running median of a sequence of numbers. That is, given
    a stream of numbers, print out the median of the list so far on 
    each new element.
    
    Recall that the median of an even-numbered list is the average of the
    two middle numbers.
    
    */
    
    int median;
    public static void main(String[] args) {
        // first way using a for loop 
        int[] list = new int[]{2, 1, 5, 7, 2, 0, 5};
        for(int i = 0; i < list.length; i++) {
            int[] listNew = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                listNew[j] = list[j];

            }
            int len = listNew.length ;
            //odd
             Arrays.sort(listNew);
            if(len == 1){
                System.out.println(listNew[0]);
            }
            else if(len % 2 != 0) {
            System.out.println(listNew[len / 2]);
        }
        else if(len % 2 == 0) {
            int numOne = listNew[(len / 2) - 1];
            int numTwo = listNew[len / 2];
            if(numOne == numTwo) {
            System.out.println(numOne);
        }
        else {
            double result = ((double)numOne + (double)numTwo) / 2;
            System.out.println(result);
        }
        }
           
        }
        
        
        //secound way using recursion; 
        
        
        System.out.println("secound way using recursion");
                 RunningMedian(list);
               
    }
    
    public static void RunningMedian(int[] listNew) {
    RunningMedian(listNew, 1);
}

public static void RunningMedian(int[] listNew, int limit) {
    if (limit > listNew.length) {
        return;
    }
    int[] sublist = Arrays.copyOfRange(listNew, 0, limit);
    int len = sublist.length;
    Arrays.sort(sublist);
    if (len == 1) {
        System.out.println(sublist[0]);
    } else if (len % 2 != 0) {
        System.out.println(sublist[len / 2]);
    } else if (len % 2 == 0) {
        int numOne = sublist[(len / 2) - 1];
        int numTwo = sublist[len / 2];
        if (numOne == numTwo) {
            System.out.println(numOne);
        } else {
            double result = ((double) numOne + (double) numTwo) / 2;
            System.out.println(result);
        }
    }
    RunningMedian(listNew, limit + 1);
}
}
        
        
    