public class Solution {
	// 动态规划
	public boolean wordBreak(String s, Set<String> dict) {
		boolean[] t = new boolean[s.length() + 1];
		t[0] = true;		// initial state

		for (int i = 0; i < s.length(); i++) {
			if (!t[i]) {
				continue;
			}

			for (String a : dict) {
				int len = a.length();
				int end = i + len;

				if (end > s.length()) {
					continue;
				}

				// 什么时候会出现这个情况？
				if (t[end]) {
					continue;
				}

				if (s.substring(i, end).equals(a)) {
					t[end] = true;
				}
			}
		}

		return t[s.length()];
	}
}

// 正则匹配
public static void main(String[] args) {
	HashSet<String> dict = new HashSet<String>();
	dict.add("go");
	dict.add("goal");
	dict.add("goals");
	dict.add("sepcial");

	StringBuilder sb = new StringBuilder();
	for (String s : dict) {
		sb.append(s + "|");
	}

	String pattern = sb.toString.substring(0, s.length() - 1);
	pattern = "(" + pattern + ")";
	Pattern p = Pattern.compile(pattern);
	Matcher m = p.match("goalspecial");

	if (m.match()) {
		System.out.println("match");
	}
}