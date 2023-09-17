

package com.example.daily.coding.problems.p023;

/**
 *
 * @author Danielnaor
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String[][] matrix = new String [][] {{"f", "f", "f", "f"},
                                        {"t", "t", "f", "t"},
                                        {"f", "f", "f", "f"},
                                        {"f", "f", "f", "f"}};



        
        
        solveMatrix ref = new solveMatrix(matrix,0, 0);
        
        ref.toString();
        ref.search(3, 0, 0);
        
        System.out.println(ref.getLeastSteps());
        
        
        
    }
}
