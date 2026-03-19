
package com.mycompany.linkedlist;

public class LL {
        Node head;
        private int size;
        
        //constructor
        LL(){
            this.size = 0;
        }
    
    class Node{
        String data;
        Node next;
        
       //Constructor
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

//Add at first node
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
      newNode.next = head;
      head = newNode;

    }

//Add at last node
   public void addLast(String data){
    Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        //Traverse
     Node currNode = head;
     while(currNode.next!=null){
        currNode = currNode.next;
     }
      currNode.next = newNode;
   }
   //Delete first node
   public void deleteFirst(){
       if(head == null){
           System.out.println("List is empty");
           return;
       }
       size--;
       head = head.next;
       
   }
   //Delete last node
   public void deleteLast(){
       //corner cases
       if(head == null){
           System.out.println("List is empty");
           return;
       }
       size--;
       if(head.next == null){
           head = null;
           return;
       }
       Node secondLastNode = head;
       Node lastNode = head.next;
       //Traverse
       while(lastNode.next != null){
           lastNode = lastNode.next;
           secondLastNode = secondLastNode.next;
       }
       secondLastNode.next = null;
   }
   //Get size
   public int getSize(){
       return size;
   }
   
   //Print list
   public void printList(){
    if(head == null){
        System.out.println("Empty List...");
        return;
    }
    //Traverse
    Node currNode = head;
    while(currNode!=null){
        System.out.print(currNode.data+"->"); 
        currNode = currNode.next;
    }
      System.out.println("NULL");
   }
}

