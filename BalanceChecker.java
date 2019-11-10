public class BalanceChecker {
	public static boolean checkBalance(String expression) {

		// works with linked stack but not array stack
		StackInterface<Character> openDelimiterStack = new ArrayStack<Character>();

		int characterCount = expression.length();
		boolean isBalanced = true;
		int index = 0;
		char nextCharacter = ' ';

		while (isBalanced && (index < characterCount)) {
			nextCharacter = expression.charAt(index);
			switch (nextCharacter) {
			case '(':
			case '[':
			case '{':
				openDelimiterStack.push(nextCharacter);
				break;
			case ')':
			case ']':
			case '}':
				if (openDelimiterStack.isEmpty()) {
					isBalanced = false;
				} else {
					char openDelimiter = openDelimiterStack.pop();
					isBalanced = isPaired(openDelimiter, nextCharacter);
				}
				break;
			default:
				break;
			}
			index++;
		}
		if (!openDelimiterStack.isEmpty()) {
			isBalanced = false;
		}

		return isBalanced;

	}

	private static boolean isPaired(char open, char close) {
		return ((open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}'));
	}

	public static void main(String[] args) {
		String expression = "a {b [c ( d + e )/2 - f] + 1}";
		boolean isBalanced = BalanceChecker.checkBalance(expression);
		if (isBalanced) {
			System.out.println(expression + " is balanced");
		} else {
			System.out.println(expression + " is not balnaced");
		}

	}
}