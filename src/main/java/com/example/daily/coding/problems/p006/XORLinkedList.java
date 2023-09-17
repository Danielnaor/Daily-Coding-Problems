
package com.example.daily.coding.problems.p006;

/**
 *
 * @author Danielnaor
 */
public class XORLinkedList {
    
    private XORNode head;

    public XORLinkedList() {
        this.head = null;
    }
    
    public XORNode head(){
        return this.head;
    }
    // Method to add a value to the end of the linked list
   public void add(int value) {
    XORNode newNode = new XORNode(value, null, null);
    if (head != null) {
        XORNode current = head;
        while (current.getNext() != null) {
            XORNode Next = current.getNext();
            current = Next;
        }
        current.setNext(newNode);
        newNode.setPrevious(current);
    } else {
        head = new XORNode(value, null, null);
    }
    }
   
   
    public XORNode get(int index) {
        if (index < 0) {
          throw new IndexOutOfBoundsException();
        }
        XORNode current = this.head;
        for (int i = 0; i < index; i++) {
          if (current == null) {
            throw new IndexOutOfBoundsException();
          }
          current = current.getNext();
        }
        if (current == null) {
          throw new IndexOutOfBoundsException();
        }
        return current;
      }
   }
    
    



       


    

  