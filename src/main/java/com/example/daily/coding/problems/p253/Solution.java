
package com.example.daily.coding.problems.p253;

/**
 *
 * @author Danielnaor
 */


 /*
  Given a string and a number of lines k, print the string in zigzag form. 
  In zigzag, characters are printed out diagonally from top left to bottom right until reaching the kth line, then back up to top right, and so on.

  For example, given the sentence "thisisazigzag" and k = 4, you should print:

t     a     g
 h   s z   a
  i i   i z
   s     g
  */

public class Solution {

    public static void main(String[] args) {

         String input = "thisisazigzag";
         int k = 4;

            printZigZag(input, k);

        
      
    }


    public static void printZigZag(String input, int k) {
         
            int n = input.length(); // length of input 
            char[] inputArray = input.toCharArray(); // convert input to chars 
    
            

            int row = 0; 
            int col = 0; 
            boolean goingDown = false;
    
          //  char[][] matrix = new char[k][n]; // initialize matrix
            
          char[][] matrix = new char[k][n];

    
            for (int i = 0; i < n; i++) {
     
                // add character to matrix
                matrix[row][col] = inputArray[i];
                // print matrix[row][col];
                 System.out.println(matrix[row][col]);

                // if we are at the buttom of matrix (line number is k), we need to go up
                if (row == 0 || row == k - 1) {
                    goingDown = !goingDown;
                }
    
                row += goingDown ? 1 : -1; // if going down, row++, else row--
                col++;
            }

                
                
    
               
        

            // print matrix as a zigzag
            for (int c = 0; c < k; c++) {
            for (int j = 0; j < n; j++) {
                if (matrix[c][j] != 0) {
                    System.out.print(matrix[c][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        }

       
        
       
}