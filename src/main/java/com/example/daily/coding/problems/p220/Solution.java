
package com.example.daily.coding.problems.p220;

/**
 *
 * @author Danielnaor
 */


 /*
In front of you is a row of N coins, with values v1, v1, ..., vn.

You are asked to play the following game. You and an opponent take turns choosing either the first or last coin from the row, 
removing it from the row, and receiving the value of the coin.

Write a program that returns the maximum amount of money you can win with certainty, if you move first, assuming your opponent plays optimally.
 */

 import java.util.ArrayList;
public class Solution {

    public static void main(String[] args) {
            
            int[] coins = {8, 15, 3, 7};
            System.out.println(getMaxMoney(coins));

    }

    // returns the maximum amount of money you can win with certainty, if you move first, assuming your opponent plays optimally.
    public static int getMaxMoney(int[] coins) {

            int len = coins.length;

            // store the coins you have taken in an ArrayList
            ArrayList<Integer> myCoins = new ArrayList<Integer>();

            // store the coins your opponent has taken in an ArrayList
            ArrayList<Integer> opponentCoins = new ArrayList<Integer>();

            // store the total value of the coins you have taken
            int myTotal = 0;

            // calulate the total amount of turns
            int totalTurns = len / 2;

            // iterate all the turns  
            for( int i = 0; i < totalTurns; i++) {

                // check if the first coin is greater than the last coin
                if(coins[0] > coins[len - 1]) {

                    // pick the first coin
                    myCoins.add(coins[0]);

                    // remove the first coin from the array
                    coins = removeFirst(coins);

                    // add the value of the coin to the total
                    myTotal += myCoins.get(i);

    
                }

                // check if the first coin is less than the last coin
                else if(coins[0] < coins[len - 1]) {

                    // pick the last coin
                    myCoins.add(coins[len - 1]);

                    // remove the last coin from the array
                    coins = removeLast(coins);

                    // add the value of the coin to the total
                    myTotal += myCoins.get(i);
                }





            

            
            
            


       

                    
        }


        return 0;

    }


    

    // remove the first element from an array
    public static int[] removeFirst(int[] arr) {

        int[] newArr = new int[arr.length - 1];

        for(int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }

        return newArr;

    }

    // remove the last element from an array
    public static int[] removeLast(int[] arr) {

        int[] newArr = new int[arr.length - 1];

        for(int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i];
        }

        return newArr;

    }
    



}
