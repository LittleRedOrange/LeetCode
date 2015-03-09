public class Solution {
	public String strStr(String hayStack, String needle) {
		if (hayStack == null || needle == null) {
			return null;
		}

		if (hayStack.equals("")) {
			return ""
		}

		if (needle.equals("")) {
			return hayStack;
		}

		int hayStackLen = hayStack.length();
		int needleLen = needle.length();

		for (int i = 0; i < hayStackLen - needleLen; i++) {
			if (hayStack.charAt[i] != needle.charAt(0)) {
				continue;
			}

			int k = i;
			for (int j = 0; j < needleLen; j++) {
				if (hayStack.charAt(k) != needle.charAt(j)) {
					break;
				}
				k++;
				j++;
			}

			// 找到了
			/*
				var str = "0123456789";
				alert(str.substring(0));------------"0123456789"
		　　	alert(str.substring(5));------------"56789"
				alert(str.substring(2,5));----------"234"
			*/
			if (j == needleLen) {
				return hayStack.substring(i);
			}
		}
	}
}