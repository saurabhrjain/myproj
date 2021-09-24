package myproj;

import java.util.LinkedList;

public class Question7 {
	public static Node head;
	public Node tail = null;   
	    static class Node {
	 
	        int data;
	        Node next;
	 
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }

	    public void addNode(int data) {    
	        //Create a new node    
	        Node newNode = new Node(data);    
	            
	        //Checks if the list is empty    
	        if(head == null) {    
	            //If list is empty, both head and tail will point to new node    
	            head = newNode;    
	            tail = newNode;    
	        }    
	        else {    
	            //newNode will be added after tail such that tail's next will point to newNode    
	            tail.next = newNode;    
	            //newNode will become new tail of the list    
	            tail = newNode;    
	        }    
	    }    
	    
	        
	public static void main(String[] args) {
		Question7 list = new Question7();
      //  list.head = new Node(85);
        list.addNode(85);
        list.addNode(15);
        list.addNode(4);
        list.addNode(20);
        
       
       //
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
	}


	private Node reverse(Node head) {
		 Node prev = null;
	        Node current = head;
	        Node next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        head = prev;
	        return head;
	}


	private void printList(Node head) {
		 while (head != null) {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	}



	private void display() {
		 Node current = head;    
         
	        if(head == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	        System.out.println("Nodes of singly linked list: ");    
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	            System.out.print(current.data + " ");    
	            current = current.next;    
	        }    
	        System.out.println();    
		
	}
	

}
