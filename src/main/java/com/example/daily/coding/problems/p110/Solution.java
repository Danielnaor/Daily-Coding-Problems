
package com.example.daily.coding.problems.p110;

/**
 *
 * @author Danielnaor
 */
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
      
     Node root = new Node(1);
     BST tree = new BST();
    tree.add(1);
    tree.add(2);
    tree.add(3);

    tree.add(4);
    tree.add(5);
    
    

List<int[]> paths = tree.getLeavesPath();

for (int[] path : paths) {
    System.out.println(Arrays.toString(path));
}

System.out.println(tree);
    }



    private static Node createTree() {
        Node two = new Node(2);
        Node four = new Node(4);
        Node five = new Node(5);

        Node three = new Node(3);
        three.left = four;
        three.right = five;

        Node root = new Node(1);
        root.left = two;
        root.right = three;

        return root;
    }

    
    

    

    
    
    }
    
    

