public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Solution {
	public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
		if (null == l1 || null = l2) {
			return null;
		}

		ListNode newHead = new ListNode(0);
		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode p3 = newHead;

		int val = 0;
		boolean flag = false;

		while (p1 != null || p2 != null) {
			if (p1 != null && p2 != null) {
				if (flag) {
					val = p1.val + p2.val + 1;
				} else {
					val = p1.val + p2.val;
				}

				flag = val >= 10 ? true : false;

				p3.next = new ListNode(val % 10);
				p1 = p1.next;
				p2 = p2.next;
			} else if (p1 != null) {
				if (flag) {
					val = p1.val + 1;
				} else {
					val = p1.val;
				}

				flag = val >= 10 ? true : false;

				p3.next = new ListNode(val % 10);
				p1 = p1.next;
			} else (p2 != null) {
				if (flag) {
					val = p2.val + 1;
				} else {
					val = p2.val;
				}

				flag = val >= 10 ? true : false;

				p3.next = new ListNode(val % 10);
				p2 = p2.next;
			}

			p3 = p3.next;
		}

		if (flag) {
				p3.next = new ListNode(1);
		}

		return newHead.next;
	}

	public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;

		ListNode newHead = new ListNode(0);
		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode p3 = newHead;

		while (p1 != null || p2 != null) {
			if(p1 != null) {
				carry += p1.val;
				p1 = p1.next;
			}

			if (p2 != null) {
				carry += p2.val;
				p2 = p2.next;
			}

			p3.next = new ListNode(carry % 10);
			p3 = p3.next;
			carry = carry / 10;
		}

		if (carry == 1) {
			p3.next = new ListNode(1);
		}

		return newHead.next;

	}
}