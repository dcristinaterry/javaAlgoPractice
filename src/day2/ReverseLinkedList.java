package day2;

import java.util.LinkedList;

public class ReverseLinkedList {
	
	public static ListNode mainHead;
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		mainHead=reverseList(node1);
		
		ListNode node = mainHead;
		
		while(node!=null) {
			System.out.println(node.val);
			node = node.next;
		}
		
	}
	
	
	public static class ListNode {

		int val;
		ListNode next;

	

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
//  3      4    ->	 2->1  
//	
//	4 ->3 ->2 ->1
	
	 public static ListNode reverseList(ListNode head) {
		
		 
	        if(head==null){
	            return null;
	        }
	        
	        ListNode currentNode =head.next;
	        head.next = null;
	       
	        
	        while(currentNode != null){
	            ListNode previousHead = head;
	        
	            head = currentNode;
	            currentNode = currentNode.next;
	           
	        
	            head.next = previousHead;
	        
	        }
	        return head;
	 }
	 
	 
//	 4 <-3 <-2 ->1
	 
	 public static ListNode reverseListIterative(ListNode head) {
	        /* Iterative algorithm to reverse nodes in linked list. 
	            Time complexity: O(n).
	            Space complexity: O(1).
	         */
	        ListNode prev = null;
	        ListNode curr = head;

	        // Keep going until the head node is null, that is, 
	        // keep going until we reach the end of the list.
	        while (curr != null) {
	            ListNode nextTemp = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = nextTemp;
	        }
	        return prev;
	    }

	    public static ListNode reverseListRecursive(ListNode head) {
	        /* Recursive algorithm to reverse nodes in linked list. 
	            Time complexity: O(n).
	            Space complexity: O(n).
	         */
	        if (head == null || head.next == null) {
	            return head;
	        }
	        ListNode p = reverseListRecursive(head.next);
	        head.next.next = head;
	        head.next = null;
	        return p;
	    }


}
