/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublyCircularLinkedList;

import java.util.Scanner;

/**
 *
 * @author Moises
 */
public class RunDoublyCircularLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Creating object of linkedList */
        LinkedList list = new LinkedList(); 
        System.out.println("Lista Enlazada Doble Circular");          
        char ch;
        do    
        {
            System.out.println("Operaciones de Lista Enlazada Doble Circularw");
            System.out.println("1. Inserte al inicio");
            System.out.println("2. Inserte al final");
            System.out.println("3. Inserte un dato en la posición");
            System.out.println("4. Eliminar un dato de la posición");
            System.out.println("5. Revisar si está vacío");
            System.out.println("6. Obtener tamaño de la lista");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Ingrese número:");
                list.insertAtStart( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Ingrese número:");
                list.insertAtEnd( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Ingrese número:");
                int num = scan.nextInt() ;
                System.out.println("Ingrese posición:");
                int pos = scan.nextInt() ;
                if (pos < 1 || pos > list.getSize() )
                    System.out.println("Posición inválida.");
                else
                    list.insertAtPos(num, pos);
                break;                                          
            case 4 : 
                System.out.println("Ingrese posición");
                int p = scan.nextInt() ;
                if (p < 1 || p > list.getSize() )
                    System.out.println("Posición inválida");
                else
                    list.deleteAtPos(p);
                break;     
            case 5 : 
                System.out.println("Estado de la lista: "+ list.isEmpty());
                break;            
            case 6 : 
                System.out.println("Tamaño de la lista: "+ list.getSize());
                break;                         
            default : 
                System.out.println("Entrada errada");
                break;   
            }
            list.display();
            System.out.println("Desea continuar(Ingrese Y = SI o N = NO)");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');    
    }
    
}
