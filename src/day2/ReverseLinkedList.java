package day2;

public class ReverseLinkedList {
	
	
	class ListNode {

		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
//	1 -> 2 ->3 -> 4 
//	
//	4 ->3 ->2 ->1
	
	 public ListNode reverseList(ListNode head) {
	        
	        if(head==null){
	            return null;
	        }
	        
	        ListNode node =head.next;
	        head.next = null;
	       
	        
	        while(node != null){
	            ListNode previousHead = head;
	        
	            head = node;
	            node = node.next;
	            System.out.println(head.val);
	        
	            head.next = previousHead;
	        
	        }
	        return head;
	 }
	 
	 
	 
	 
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
