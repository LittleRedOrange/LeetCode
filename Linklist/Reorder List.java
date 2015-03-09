public class ListNode {
	int val;
	int next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Solution {
	public void reorderList(ListNode l) {
		ListNode slow = l;
		ListNode fast = l;

		// 拆分成两部分
		while (fast != null
			&& fast.next != null
			/* another: && fast.next.next != null */) {
			slow = slow.next;
			fast = fast.next.next;
		}

		ListNode second = slow;
		/* another:  ListNode second = slow.next; */
		slow.next = null;

		// 反转第二部分
		second = reverseOrder(second);

		ListNode p1 = head;
		ListNode p2 = second;

		// 合并
		while (p2 != null) {
			ListNode tmp1 = p1.next;
			ListNode tmp2 = p2.next;

			p1.next = p2;
			p2.next = p1.next;
			p1 = tmp1;
			p2 = tmp2;
		}

	}

	public ListNode reverseOrder(ListNode l) {
		if (null == l && null == l.next) {
			return l;
		}

		ListNode pre = l;
		ListNode cur = l.next;

		while (cur != null) {
			ListNode tmp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = tmp;
		}

		l.next = null;

		return pre;
	}
}