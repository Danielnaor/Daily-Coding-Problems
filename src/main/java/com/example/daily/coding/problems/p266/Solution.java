
package com.example.daily.coding.problems.p266;

/**
 *
 * @author Danielnaor
 */


 /*
A step word is formed by taking a given word, adding a letter, and anagramming the result. For example, starting with the word "APPLE", you can add an "A" and anagram to get "APPEAL".

Given a dictionary of words and an input word, create a function that returns all valid step words.

  */

public class Solution {



    public static void main(String[] args) {

        // given a dictionary of words "APPEAL", "APPLE", "APPPLE", "APPLME", "APLE", "APPLICT"
        // and an input word "APPLE"

        // define a dictionary
        String[] dictionary = {"APPEAL", "APPLE", "APPPLE", "APPLME", "APLE", "APPLICT"};

        // define an input word
        String inputWord = "APPLE";






        
      
    }

    private static String[] findStepWords(String[] dictionary, String inputWord) {
        // iterate over the dictionary
        // for each word in the dictionary, check if it is a step word
        // if it is a step word, add it to the result array
        // return the result array

        for(String word : dictionary) {
            if(isStepWord(word, inputWord)) {
                // add the word to the result array
            }
        }

        return null;
    }

   



        

    

}