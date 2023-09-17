package com.example.daily.coding.problems.p008;

/**
 *
 * @author Danielnaor
 */

public class UnivalTree {
    private UnivalNode root;
 
     public void setRoot(UnivalNode root) {
         this.root = root;
     }
 
     
    public int count_the_number_of_unival_subtrees() {
          if (root == null) {
             return 0;
         }
         return  count_the_number_of_unival_subtrees(root);
         
     }
         
     
     
    private int count_the_number_of_unival_subtrees(UnivalNode root) {
     if(root == null) return 0;
         int count = count_the_number_of_unival_subtrees(root.getLeft()) + count_the_number_of_unival_subtrees(root.getRight());
         if(isUnival(root))
             count += 1;
         return count;
    }
    
    private boolean isUnival(UnivalNode node){
       if(node == null){
           return true;
       }
       if(node.getLeft() != null && node.getLeft().getValue() != node.getValue()){
           return false;
       }
       if(node.getRight() != null && node.getRight().getValue() != node.getValue()){
           return false;
       }
       if(isUnival(node.getLeft()) && isUnival(node.getRight())) {
           return true;
       }
  
       return false; 
    }
 }
     