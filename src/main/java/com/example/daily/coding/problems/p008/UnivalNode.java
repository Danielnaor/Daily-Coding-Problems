package com.example.daily.coding.problems.p008;

/**
 *
 * @author Danielnaor
 */

 public class UnivalNode {
        public int value;
       public UnivalNode left;
       public UnivalNode right;
   
       public UnivalNode(int value, UnivalNode left, UnivalNode right) {
           this.value = value;
           this.left = left;
           this.right = right;
       }
   
       public int getValue() {
           return value;
       }
   
       public void setValue(int value) {
           this.value = value;
       }
   
       public UnivalNode getLeft() {
           return left;
       }
   
       public void setLeft(UnivalNode left) {
           this.left = left;
       }
   
       public UnivalNode getRight() {
           return right;
       }
   
       public void setRight(UnivalNode right) {
           this.right = right;
       }

       
   }