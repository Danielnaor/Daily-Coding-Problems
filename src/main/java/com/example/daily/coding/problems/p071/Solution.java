
package com.example.daily.coding.problems.p071;

import java.util.Random;

/**
 *
 * @author Danielnaor
 */
public class Solution {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("rand5() = " + rand5());
        }

    }

    public static int rand5() {
        int randNumUpTo7 = rand7();
        if (randNumUpTo7 <= 5) {
            return randNumUpTo7;
        }

        return rand5();

    }

    public static int rand7() {
        Random random = new Random();

        return random.nextInt(7) + 1;

    }

}
