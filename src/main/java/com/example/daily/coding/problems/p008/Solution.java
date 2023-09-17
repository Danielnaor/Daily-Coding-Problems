package com.example.daily.coding.problems.p008;

/**
 *
 * @author Danielnaor
 */
public class Solution {
    

    public static void main(String[] args) {
        UnivalNode root = 
        new UnivalNode(0,
            new UnivalNode(1, null, null), new UnivalNode(0, 
                new UnivalNode(1, new UnivalNode(1, null, null), 
                    new UnivalNode(1, null, null)), new UnivalNode(0, null, null)));
        UnivalTree tree = new UnivalTree();
        tree.setRoot(root);
        System.out.println(tree.count_the_number_of_unival_subtrees());


        /*
         * node_a = Node('0')
node_b = Node('1')
node_c = Node('0')
node_d = Node('1')
node_e = Node('0')
node_f = Node('1')
node_g = Node('1')
node_a.left = node_b
node_a.right = node_c
node_c.left = node_d
node_c.right = node_e
node_d.left = node_f
node_d.right = node_g

assert count_unival_trees(None) == 0
assert count_unival_trees(node_a) == 5
assert count_unival_trees(node_c) == 4
assert count_unival_trees(node_g) == 1
assert count_unival_trees(node_d) == 3
         */

            UnivalNode node_a = new UnivalNode(0, null, null);
            UnivalNode node_b = new UnivalNode(1, null, null);
            UnivalNode node_c = new UnivalNode(0, null, null);
            UnivalNode node_d = new UnivalNode(1, null, null);
            UnivalNode node_e = new UnivalNode(0, null, null);
            UnivalNode node_f = new UnivalNode(1, null, null);
            UnivalNode node_g = new UnivalNode(1, null, null);
            node_a.setLeft(node_b);
            node_a.setRight(node_c);
            node_c.setLeft(node_d);
            node_c.setRight(node_e);
            node_d.setLeft(node_f);
            node_d.setRight(node_g);
            UnivalTree tree2 = new UnivalTree();
            tree2.setRoot(node_a);


            //assertaions
            assert tree2.count_the_number_of_unival_subtrees() == 5 : "count_the_number_of_unival_subtrees() should return 5 but returned " + tree2.count_the_number_of_unival_subtrees();

            tree2.setRoot(node_a); // meainingless as the root is already node_a but just to be sure it works
            assert tree2.count_the_number_of_unival_subtrees() == 5 : "count_the_number_of_unival_subtrees(node_a) should return 5 but returned " + tree2.count_the_number_of_unival_subtrees();

            tree2.setRoot(node_c); 
            assert tree2.count_the_number_of_unival_subtrees() == 4 : "count_the_number_of_unival_subtrees(node_c) should return 4 but returned " + tree2.count_the_number_of_unival_subtrees();
            
            tree2.setRoot(node_g);
            assert tree2.count_the_number_of_unival_subtrees() == 1 : "count_the_number_of_unival_subtrees(node_g) should return 1 but returned " + tree2.count_the_number_of_unival_subtrees();

            tree2.setRoot(node_d);
            assert tree2.count_the_number_of_unival_subtrees() == 3 : "count_the_number_of_unival_subtrees(node_d) should return 3 but returned " + tree2.count_the_number_of_unival_subtrees();

            // if all assert pass, print success
            System.out.println("success");

            
    }
    
    

    
   
    
    
    
   
         
         
 
 
    
    
    
    
    
    
}
