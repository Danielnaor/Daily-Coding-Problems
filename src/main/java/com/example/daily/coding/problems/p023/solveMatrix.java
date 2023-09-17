
package com.example.daily.coding.problems.p023;

import java.util.Arrays;




public class solveMatrix{
 private String[][] matrix; // for searching
    private String[][] originalMatrix; // for printing
    boolean exitFound;
    int leastSteps = 0;
    int exitRow ;
    int exitCol;
    
    
    public solveMatrix( String[][] inputMatrix ,int exitRow, int exitCol) {
        this.matrix = inputMatrix;
         this.exitRow = exitRow;
         this.exitCol = exitCol;
        this.originalMatrix = Arrays.copyOf(inputMatrix, inputMatrix.length);
        exitFound = false;
        leastSteps = 0;
    }

    public String[][] getMatrix() {
        return matrix;
    }

    public boolean isExitFound() {
        return exitFound;
    }

    public int getLeastSteps() {
        return leastSteps;
    }

    public void setExitRow(int exitRow) {
        this.exitRow = exitRow;
    }

    public void setExitCol(int exitCol) {
        this.exitCol = exitCol;
    }
    
    
    
    
   public void search(int row, int col, int numSteps){
       if(numSteps >= leastSteps && leastSteps > 0){
           return;
       }
        
        if (row >= 0 && col >= 0 && row < matrix.length && col < matrix[row].length && matrix[row][col] == "f" ){

            if (col == exitCol && row == exitRow) {

                exitFound = true;
                
                if(leastSteps == 0){
                    leastSteps = numSteps;
                }
                
                else if(leastSteps > 0 && numSteps < leastSteps){
                    leastSteps = numSteps;
                }

            }
            

            else {
                numSteps++;
                matrix[row][col] = "t"; //marking

                search(row+1, col,numSteps);

                search(row-1, col,numSteps);

                search(row, col+1,numSteps);

                search(row, col-1,numSteps);
                
                 matrix[row][col] = "f";
            }

        }

    }

    @Override
    public String toString() {
        String output = "";
        for(int row = 0; row < originalMatrix.length; row++){
            for(int col = 0; col < originalMatrix[row].length; col++){
                output +=    originalMatrix[row][col] + " ";
            }
            output+= "\n";
        }
        return output;
    }
   
   
}