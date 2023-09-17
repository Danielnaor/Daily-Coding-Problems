
package com.example.daily.coding.problems.p006;

/**
 *
 * @author Danielnaor
 */
public class XORNode {
  private int value;
  private XORNode next;
  private XORNode Previous;

  // Constructors
  
  
  public XORNode(int value){
    this.value = value;
    this.Previous = null;
    this.next = null;
  }
          
  public XORNode(int value, XORNode Previous, XORNode next) {
    this.value = value;
    this.Previous = Previous;
    this.next = next;
  }

  // Getters and setters
  public int getValue() {
    return this.value;
  }

  public XORNode getNext() {
    return this.next;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setNext(XORNode next) {
    this.next = next;
  }
  public XORNode getPrevious(){
      return this.Previous;
  }
  public void setPrevious(XORNode previous){
      this.Previous = previous;
  }
}