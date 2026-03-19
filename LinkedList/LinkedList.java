package com.mycompany.linkedlist;

public class LinkedList {
  // main file
    public static void main(String[] args) {
        LL list = new LL();
        //add
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.printList();
        

        list.addLast("list");
        list.printList();
        // delete
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
        //get size
        System.out.println(list.getSize());
        list.addFirst("This");
        list.printList();
        System.out.println(list.getSize());
        list.getSize();
    }
}
