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
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		if (root == null) {
			return list;
		}

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);

		while (!stack.empty()) {
			TreeNode n = stack.pop();
			list.add(n.val);

			// 必须先右后左
			if (n.right != null) {
				stack.push(n.right);
			}

			if (n.left) {
				stack.push(n.left);
			}
		}

		return list;
	}

	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		rec(root, list);
		return list;
	}

	public void rec(TreeNode root, ArrayList<Integer>list) {
		if (null == root) {
			return;
		}

		list.add(root.val);
		rec(root.left, list);
		rec(root.right, list);
	}
}