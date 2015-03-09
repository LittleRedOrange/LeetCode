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
	public ArrayList<Integer> postorderTraversal(TreeNode root) {

		ArrayList <Integer> list = new ArrayList<Integer>();
		if (null == root) {
			return list;
		}

		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<Integer> out = new Stack<Integer>();

		stack.push(root);
		while (!stack.empty()) {
			TreeNode n = stack.pop();
			out.push(n.val);

			if (n.left != null) {
				s.push(n.left);
			} else if (n.right != null) {
				s.push(n.right)
			}
		}

		while (!out.empty()) {
			list.add(out.pop());
		}

		return list;

		}

	}
}