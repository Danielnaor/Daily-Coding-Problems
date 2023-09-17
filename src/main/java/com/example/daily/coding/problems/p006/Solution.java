package com.example.daily.coding.problems.p006;


/**
 *
 * @author Danielnaor
 */
public class Solution {

    public static void main(String[] args) {
        XORLinkedList list = new XORLinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Get elements from the list
        System.out.println(list.get(0).getValue()); // Output: 1
        System.out.println(list.get(1).getValue()); // Output: 2
        System.out.println(list.get(2).getValue()); // Output: 3
        System.out.println(list.get(3).getValue()); // Output: 4

        // Test exception handling
        try {
            list.get(4);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds"); // Output: Index out of bounds
        }
    }
}