/* package whatever; // don't place package name! */

import java.io.*; 

// Java program to implement 
// a Singly Linked List 
 class LinkedList { 

	Node head; // head of list 

	// Linked list Node. 
	// This inner class is made static 
	// so that main() can access it 
	static class Node { 

		int data; 
		Node next; 

		// Constructor 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	public static LinkedList insertAtPosition(LinkedList list,int data,int index){
		Node new_node = new Node(data); 
		new_node.next = null; 
		if(index <=1) {
			new_node.next = list.head;
			list.head = new_node;
		}
		else {
		int position = 1;
		Node temp = list.head;
		boolean insertAtEnd = false;
		while(position<index-1){
			if(temp.next != null){
			temp = temp.next;
			position ++;
			}
			else {
				insertAtEnd = true;
				break;
			}
		}
		if(!insertAtEnd){
		Node right = temp.next;
		temp.next = new_node;
		new_node.next = right;
		}
		else {
			temp.next = new_node;
		}
		}
		return list;
		
	}
	// Method to insert a new node 
	public static LinkedList insert(LinkedList list, int data) 
	{ 
		// Create a new node with given data 
		Node new_node = new Node(data); 
		new_node.next = null; 

		// If the Linked List is empty, 
		// then make the new node as head 
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			// Else traverse till the last node 
			// and insert the new_node there 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			// Insert the new_node at last node 
			last.next = new_node; 
		} 

		// Return the list by head 
		return list; 
	} 

	// Method to print the LinkedList. 
	public static void printList(LinkedList list) 
	{ 
		Node currNode = list.head; 

		System.out.print("LinkedList: "); 

		// Traverse through the LinkedList 
		while (currNode != null) { 
			// Print the data at current node 
			System.out.print(currNode.data + " "); 

			// Go to next node 
			currNode = currNode.next; 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		LinkedList list = new LinkedList(); 

		// 
		// ******INSERTION****** 
		// 

		// Insert the values 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		list = insert(list, 8); 
		list = insertAtPosition(list,10,35);
		// Print the LinkedList 
		printList(list); 
	} 
} 
