package com.example.daily.coding.problems.p002;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Danielnaor
 */
public class Solution {

static int[] newArray;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("what would be the list? (example: 10,15,3,7) :" );
        
        String[] listArrystring = scan.nextLine().split(",");
        

    
        int[] input = new int[listArrystring.length];

        // Loop trough the String array and convet each value to int and adds int to the int[] list 
        for (int i = 0; i < listArrystring.length; i++) {
            input[i] = Integer.parseInt(listArrystring[i].trim());
        }
        
        
            Solution ref = new Solution();
            ref.solve(input);
            System.out.println(Arrays.toString(newArray));

    }
    public  void solve(int[] input){
        Solution.newArray = new int[input.length];
        for(int i = 0; i < input.length; i++){
                    int result = 1;

            for(int j = 0; j < input.length; j++){
                if(!(j == i)){

                    result  *= input[j];
                    
                    
                }
                
                
            }
            newArray[i] = result;
            
        }
    }

    public Solution() {
    }
}
