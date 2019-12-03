package doubleList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Moises
 */
public class DoublyLinkedList {
    
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    // Dar valor nulo a la cabecera y al final
    Node head, tail = null;  
  
    //Creación de un nodo
    public void addNode(int data) {
    Node newNode = new Node(data);  
  

        if(head == null) {  
            // Tanto la cabecera como la "cola" se apunta al nuevo nodo
            head = tail = newNode;  
            // La cabecera será null 
            head.previous = null;  
            // El siguiente de la lista será null por que es el final
            tail.next = null;  
        }  
        else {  
            // Se agregará después de la cola, de modo que la cola siguiente apunte a la instacia del nodo
            tail.next = newNode;  
            // Esto apuntará al final de la lista
            newNode.previous = tail;  
            // el último nodo se reemplaza por el nodo creado
            tail = newNode;  
            // Al ser el último, el siguiente pasa a nulo.
            tail.next = null;  
        }  
    }  
  
    // impresión de la lista
    public void display() {  
      	// Colocamos un indice
        Node current = head;  
        if(head == null) {  
            System.out.println("La lista está vacia");  
            return;  
        }  
        System.out.println("Datos de la lista: ");  
        while(current != null) {  
           System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
}
