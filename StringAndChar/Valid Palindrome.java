public class Solution {
	public boolean isValidPalindrome(String s) {
		if (null == s || 0 == s.length()) {
			return false;
		}

		s = s.replaceAll("[^0-9A-Za-z]", "").toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() -i -1)) {
				return false;
			}

			i++;
		}

		return true;
	}
}