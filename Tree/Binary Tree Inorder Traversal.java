public class TreeNode ｛
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
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		if (null == root) {
			return null;
		}

		Stack<Integer> stack = new Stack<TreeNode>();
		TreeNode p = root;

		while (!stack.empty() || p != null) {
			if (p ! = null) {
				stack.push(p);
				p = p.left;
			} else {
				TreeNode t = stack.pop();
				list.pop(t.val);
				p = t.right;
			}
		}
		return list;
	}
}