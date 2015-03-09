public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}

public class Solution {
	public void flatten(TreeNode root) {
		Stack<Integer> stack = new Stack<Integer>();
		TreeNode p = root;

		while (p != null || stack.empty()) {
			if (p.right != null) {
				stack.push(p.right);
			}

			if (p.left != null) {
				p.right = p.left;
				p.left = null;
			} else if (!stack.empty()) {
				TreeNode tmp = stack.pop();
				p.right = tmp;
			}

			p = p.right;
		}
	}
}