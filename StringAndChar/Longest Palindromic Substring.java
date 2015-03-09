/* Solution 1 */
public String longestPalindrome(String s) {
	if (s.isEmpty()) {
		return null;
	}

	if (s.length() == 1) {
		return s;
	}

	String longest = s.substring(0, 1);
	for (int i = 0; i < s.length(); i++) {
		String tmp = helper(s, i, i);
		if (tmp.length() > longest.length()) {
			longest = tmp;
		}

		tmp = helper(s, i, i + 1);
		if (tmp.length() > longest.length()) {
			longest = tmp;
		}
	}

	return longest;
}

public String helper(String s, int begin, int end) {
	if (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
		begin--;
		end++;
	}

	return s.substring(begin + 1, end);
}


/* Solution 2 */
public static String longestPalindrome(String s) {
	if (null == s) {
			return null;
		}	

	if (s.length() <= 1) {
		return s;
	}

	String longestStr = null;
	int len = s.length();
	int[][] table = new int table[len][len];

	// every single letter is palindrome
	for (int i = 0; i < length; i++) {
		table[i][i] = 1
	}

	// interval = 2
	for (int i = 0; i <= length - 2; i++) {
		if (s.charAt(i) == s.charAt(i + 1)) {
			table[i][i + 1] = 1;
			longestStr = s.substring(i, i + 2);
		}
	}

	// interval = 3, 4, 5...
	for (int interval = 3; interval <= length; i++) {
		for (int i = 0; i <= len - interval; i++) {
			int j = i + interval - 1;
			if (s.charAt(i) == s.charAt(j)) {
				table[i][j] = table[i + 1][j - 1];
				if (table[i][j] == 1) {
					longestStr = s.substring(i, j + 1);
				}
			} else {
				table[i][j] = 0;
			}
		}
	}

	return longestStr;
}

public static void printTable(int[][] x) {
	for (int[] y : x) {
		for (int z : y) {
			System.out.print(z + "");
		}
		System.out.println();
	}
}