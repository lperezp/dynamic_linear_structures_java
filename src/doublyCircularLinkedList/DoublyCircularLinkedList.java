/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublyCircularLinkedList;
/**
 *
 * @author lperezp
 */
public class DoublyCircularLinkedList{
    protected int data;
    protected DoublyCircularLinkedList next, prev;
 
    /* Constructor */
    public DoublyCircularLinkedList()
    {
        next = null;
        prev = null;
        data = 0;
    }
    /* Constructor */
    public DoublyCircularLinkedList(int d, DoublyCircularLinkedList n, DoublyCircularLinkedList p)
    {
        data = d;
        next = n;
        prev = p;
    }
    /* Function to set link to next node */
    public void setLinkNext(DoublyCircularLinkedList n)
    {
        next = n;
    }
    /* Function to set link to previous node */
    public void setLinkPrev(DoublyCircularLinkedList p)
    {
        prev = p;
    }    
    /* Funtion to get link to next node */
    public DoublyCircularLinkedList getLinkNext()
    {
        return next;
    }
    /* Function to get link to previous node */
    public DoublyCircularLinkedList getLinkPrev()
    {
        return prev;
    }
    /* Function to set data to node */
    public void setData(int d)
    {
        data = d;
    }
    /* Function to get data from node */
    public int getData()
    {
        return data;
    }
}
 
/* Class linkedList */
class LinkedList
{
    protected DoublyCircularLinkedList start;
    protected DoublyCircularLinkedList end ;
    public int size;
 
    /* Constructor */
    public LinkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    /* Function to check if list is empty */
    public boolean isEmpty()
    {
        return start == null;
    }
    /* Function to get size of list */
    public int getSize()
    {
        return size;
    }
    /* Function to insert element at begining */
    public void insertAtStart(int val)
    {
        DoublyCircularLinkedList nptr = new DoublyCircularLinkedList(val, null, null);    
        if (start == null)
        {            
            nptr.setLinkNext(nptr);
            nptr.setLinkPrev(nptr);
            start = nptr;
            end = start;            
        }
        else
        {
            nptr.setLinkPrev(end);
            end.setLinkNext(nptr);
            start.setLinkPrev(nptr);
            nptr.setLinkNext(start);
            start = nptr;        
        }
        size++ ;
    }
    /*Function to insert element at end */
    public void insertAtEnd(int val)
    {
        DoublyCircularLinkedList nptr = new DoublyCircularLinkedList(val, null, null);        
        if (start == null)
        {
            nptr.setLinkNext(nptr);
            nptr.setLinkPrev(nptr);
            start = nptr;
            end = start;
        }
        else
        {
            nptr.setLinkPrev(end);
            end.setLinkNext(nptr);
            start.setLinkPrev(nptr);
            nptr.setLinkNext(start);
            end = nptr;    
        }
        size++;
    }
    /* Function to insert element at position */
    public void insertAtPos(int val , int pos)
    {
        DoublyCircularLinkedList nptr = new DoublyCircularLinkedList(val, null, null);    
        if (pos == 1)
        {
            insertAtStart(val);
            return;
        }            
        DoublyCircularLinkedList ptr = start;
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
                DoublyCircularLinkedList tmp = ptr.getLinkNext();
                ptr.setLinkNext(nptr);
                nptr.setLinkPrev(ptr);
                nptr.setLinkNext(tmp);
                tmp.setLinkPrev(nptr);
            }
            ptr = ptr.getLinkNext();            
        }
        size++ ;
    }
    /* Function to delete node at position  */
    public void deleteAtPos(int pos)
    {        
        if (pos == 1) 
        {
            if (size == 1)
            {
                start = null;
                end = null;
                size = 0;
                return; 
            }
            start = start.getLinkNext();
            start.setLinkPrev(end);
            end.setLinkNext(start);
            size--; 
            return ;
        }
        if (pos == size)
        {
            end = end.getLinkPrev();
            end.setLinkNext(start);
            start.setLinkPrev(end);
            size-- ;
        }
        DoublyCircularLinkedList ptr = start.getLinkNext();
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
                DoublyCircularLinkedList p = ptr.getLinkPrev();
                DoublyCircularLinkedList n = ptr.getLinkNext();
 
                p.setLinkNext(n);
                n.setLinkPrev(p);
                size-- ;
                return;
            }
            ptr = ptr.getLinkNext();
        }        
    }    
    /* Function to display status of list */
    public void display()
    {
        System.out.print("\nCircular Doubly Linked List = ");
        DoublyCircularLinkedList ptr = start;
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLinkNext() == start) 
        {
            System.out.print(start.getData()+ " <-> "+ptr.getData()+ "\n");
            return;
        }
        System.out.print(start.getData()+ " <-> ");
        ptr = start.getLinkNext();
        while (ptr.getLinkNext() != start) 
        {
            System.out.print(ptr.getData()+ " <-> ");
            ptr = ptr.getLinkNext();
        }
        System.out.print(ptr.getData()+ " <-> ");
        ptr = ptr.getLinkNext();
        System.out.print(ptr.getData()+ "\n");
    }
}