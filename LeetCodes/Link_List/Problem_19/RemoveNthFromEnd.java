package Problem_19;

public class RemoveNthFromEnd {
	/**
	 * Definition for singly-linked list.
	 */
	public class ListNode {
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

	class Solution {

		public ListNode removeNthFromEnd(ListNode head, int n) {
			int count = 0;
			
			//count the total number of nodes
			ListNode temp = head;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			
			//select the node just before the target
			int target = count - n; // 5 - 2 = 4

			// additional case 
			if (target == 0) {
				return head.next;
			}
			temp = head;
			for (int i = 1; i < target; i++) {
				temp = temp.next;
			}
			
			//Remove the node 
			temp.next = temp.next.next;
			return head;
		}
	}

}
