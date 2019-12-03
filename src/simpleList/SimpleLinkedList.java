/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleList;

import java.util.LinkedList;

/**
 *
 * @author lperezp
 */
public class SimpleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList <Integer> myList = new LinkedList <Integer>();
        myList.add(1); 
        myList.add(2);
        myList.addLast(3);
        myList.addFirst(4);
        myList.add(2, 5);
        myList.add(6);
        myList.add(7);
        myList.add(1,8);
        System.out.println(myList);
        myList.remove(2);
        System.out.println(myList);
    }
    
}
