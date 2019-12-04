/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleList;

/**
 *
 * @author lperezp
 */
public class RunDoublyLinkedList {

    public static void main(String[] args) {  
        
        DoublyLinkedList dList = new DoublyLinkedList();  
        
        // Añadimos datos a la lista
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  
        
        // Imprimimos la lista
        dList.display();  
    }  
}  

