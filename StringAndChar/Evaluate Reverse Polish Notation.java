public class Test {

	public static void main(String[] args) {
		String[] tokens = new String[] {"2", "1", "+", "3", "*"};
		System.out.println(evalRPN(tokens));
	}

	public static int evalRPN(String[] tokens) {
		String operators = "+-*/";
		Stack<String> stack = new Stack<String>();

		for (String t : tokens ) {
			if (!operators.contains(t)) {
				stack.push(t);
			} else {
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());

				// int index = operators.indexOf(t);
				switch (t) {
					case '+':
						stack.push(String.valueOf(a + b));
						break;
					case '-':
						stack.push(String.valueOf(a - b));
						break;
					case '*':
						stack.push(String.valueOf(a * b));
						break;
					case '/':
						stack.push(String.valueOf(a / b));
						break;
				}
			}
		}

		return Integer.valueOf(stack.pop());
	}
}