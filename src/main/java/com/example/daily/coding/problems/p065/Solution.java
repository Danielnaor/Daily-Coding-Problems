
package com.example.daily.coding.problems.p065;

/**
 *
 * @author Danielnaor
 */
/*


Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.

For example, given the following matrix:

[[1,  2,  3,  4,  5],
 [6,  7,  8,  9,  10],
 [11, 12, 13, 14, 15],
 [16, 17, 18, 19, 20]]
You should print out the following:

1
2
3
4
5
10
15
20
19
18
17
16
11
6
7
8
9
14
13
12
 */
public class Solution {

    private static String result = "";

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };

        // print out the matrix in a clockwise spiral.
        printMatrix(matrix);

    }

    //  print out the matrix in a clockwise spiral.
    private static void printMatrix(int[][] matrix) {

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        // repeat until there are no more rows or columns to process
        while (rowStart <= rowEnd && colStart <= colEnd) {

            // print the first row
            for (int i = colStart; i <= colEnd; i++) {
                result += matrix[rowStart][i] + " ";
                System.out.println(matrix[rowStart][i] + " ");
            }
            rowStart++; //  move to the next row

            //  print the last columm
            for (int i = rowStart; i <= rowEnd; i++) {
                result += matrix[i][colEnd] + " ";
                System.out.println(matrix[i][colEnd] + " ");
            }
            colEnd--; // move to the previous column

            // print the last row
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    result += matrix[rowEnd][i] + " ";
                    System.out.println(matrix[rowEnd][i] + " ");
                }
                rowEnd--; // move to the previous row
            }

            // print the first column
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result += matrix[i][colStart] + " ";
                    System.out.println(matrix[i][colStart] + " ");
                }
                colStart++; // move to the next column
            }
        }

    }

}
