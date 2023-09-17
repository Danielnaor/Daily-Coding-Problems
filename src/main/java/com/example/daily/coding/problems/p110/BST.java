
package com.example.daily.coding.problems.p110;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author carmitnaor
 */
public class BST {

    private static Node root;

    public BST() {
        root = null;
    }

    public BST(Node root){
        this.root = root;
    }
    

    

    public void add(Integer val) {
        root = add(root , val);
    }

  
    private Node add(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) {
            root.left = add(root.left, key);
            
            System.out.println("key: " + key);
            System.out.println("data: " + root.data);
            System.out.println("key < root.data" + ( key < root.data));
            
            
        } else if (key > root.data) {
            root.right = add(root.right, key);
            
            System.out.println("key: " + key);
            System.out.println("data: " + root.data);
            System.out.println("key > root.data" + ( key > root.data));
        }

        return root;
    }
        


    public static List<int[]> getLeavesPath() {
        
        return getLeavesPath(root);
    }
    
    // for example // [[1, 2], [1, 3, 4], [1, 3, 5]]
    public static List<int[]> getLeavesPath(Node root) {

    List<int[]> res = new LinkedList<>();
        dfs(root, new LinkedList<>(), res);
        return res;
    }

    private static void dfs(Node node, Deque<Node> stack, List<int[]> res) {
        if (node == null)
            return;

        stack.push(node);
        dfs(node.left, stack, res);
        dfs(node.right, stack, res);

        if (node.left == null && node.right == null) {
            int[] path = new int[stack.size()];
            int i = path.length;

            for (Node parent : new ArrayList<>(stack))
                path[--i] = parent.data;

            res.add(path);
        }

        stack.pop();
    }
    
    @Override
    public String toString() {
        processTree(root);
        return "";
    }
    public void processTree(Node Root) {
    if (Root != null) {
        this.root = Root;
        printTree(root, 0);
    }
}

private void printTree(Node node, int depth) {
    if (node == null) {
        return;
    }
    String indent = "  ".repeat(depth);
    System.out.println(indent + node.getData());

    printTree(node.getLeft(), depth + 1);
    printTree(node.getRight(), depth + 1);
}
}



    


    


