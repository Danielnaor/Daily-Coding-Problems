/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */

 package com.example.daily.coding.problems.p001;


/**
 *
 * @author carmitnaor
 */

 // Test code



import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    public static boolean passedAllTests = true;
    @Test
    public void testExampleInput() {
     //   assertEquals("10 + 15 = 25", findPairAndReturnResult("10,15,3,7", 25));
     // use int[] list = {10,15,3,7}; and int k = 25; instead of findPairAndReturnResult("10,15,3,7", 25)
        int[] list = {10,15,3,7};
        int k = 25;
       // assertEquals("10 + 15 = 25", findPairAndReturnResult(list, k));
        // ifn faild test
        if (!"10 + 15 = 25".equals(findPairAndReturnResult(list, k))) {
            passedAllTests = false;
        }
    }


    @Test
    public void testEmptyInput() {
        int[] list = {};
        int k = 25;
        //        System.out.print(" there is no combination of any two numbers from the list add up to  " + k);

        assertEquals("there is no combination of any two numbers from the list add up to  " + k, findPairAndReturnResult(list, k));

        // ifn faild test
        if (!("there is no combination of any two numbers from the list add up to  " + k).equals(findPairAndReturnResult(list, k))) {
            passedAllTests = false;
        }
    }

    @Test
    public void testNoSolution() {
        int[] list = {10,15,3,7};
        int k = 100;
        assertEquals("there is no combination of any two numbers from the list add up to  " + k, findPairAndReturnResult(list, k));

        // ifn faild test
        if (!("there is no combination of any two numbers from the list add up to  " + k).equals(findPairAndReturnResult(list, k))) {
            passedAllTests = false;
        }
        
    }

    // if all tests pass
    @Test
    public void testAllTestsPassed() {
        assertEquals(true, passedAllTests);
    }

    

    

    private String findPairAndReturnResult(int[] list, int k) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Solution.solveProblem(list, k);
        return outContent.toString().trim();
    }

    

   
}
