/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        if (null == root) {
			return true;
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = root;

		// 少了p != null就挂了，Why
		while (!stack.empty() || p != null) {
			if (null != p) {
				stack.push(p);
				p = p.left;
			} else {
				TreeNode t = stack.pop();
				list.add(t.val);
				p = t.right;
			}
		}

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) >= list.get(i + 1)) {
				return false;
			}
		}
 
		return true;
    }
}