
package com.example.daily.coding.problems.p007;

import java.util.HashMap;

/**
 *
 * @author Danielnaor
 */

/* 
   Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
   For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
   You can assume that the messages are decodable. For example, '001' is not allowed. 
 */
public class encodeAndDecod {



    private HashMap<String, Integer> lettersToNum;
    private HashMap<Integer, String> numToletters;

    public encodeAndDecod() {
        buildMaps();
    }

    public void buildMaps() {
      

            numToletters = new HashMap<>();
            lettersToNum = new HashMap<>();

            // loop through all the letters and add them to the map

            for(int i = 1; i <= 26; i++){
                numToletters.put(i, String.valueOf((char) (i + 96)));
                lettersToNum.put(String.valueOf((char) (i + 96)), i);
            }
            

        
    }

    public int decodeMessage(String message) {
        try {
            String[] letters = message.split("");
            String messageAsString = "";
            for (String letter : letters) {

                if (lettersToNum.containsKey(letter)) {
                    messageAsString += lettersToNum.get(letter);

                } else {
                    System.out.println("unknown char");
                }
            }

            return Integer.parseInt(messageAsString);
        } catch (Exception e) {
            System.out.println("failed to decode");
        }

        return 0;

    }

    public int countNumWayCanBeDecoded(String message) {

        return countNumWayCanBeDecoded(message.toCharArray(), message.length());
    }

    private int countNumWayCanBeDecoded(char[] chars, int len) {
        //base case

        if (len == 1 || len == 0) {
            return 1;
        }
        int count = 0;

        if (chars[len - 1] > '0') {
            count += countNumWayCanBeDecoded(chars, len - 1);
        }

        if (chars[len - 2] == '1' || (chars[len - 2] == '2' && chars[len - 1] <= '6')) {
            count += countNumWayCanBeDecoded(chars, len - 2);
        }

        return count;
    }

}
