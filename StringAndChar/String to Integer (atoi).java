public class Solution {
	public int atoi(String s) {
		if (null == s) {
			return 0;
		}

		str = str.trim();
		char flag = '+';

		int i = 0;
		if (str.charAt(0) == '+') {
			i++
		} else if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		} else {
			return 0;	//非法字符
		}

		// use double to restore result
		double result = 0;

		while (str.lenght() > i) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				result = result * 10 + (c - '0');
				i++；
			} else {
				reutrn 0;	//非法字符
			}
		}

		if (flag == '-') {
			result = -result;
		}

		// 异常处理
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} else if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}

		return (int)result;
	}
}