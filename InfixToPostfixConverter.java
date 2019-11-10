/**
 * Converts an infix expression to a postfix expression.
 * 
 * @author Parayao_K
 *
 */
public class InfixToPostfixConverter implements ExpressionConverterInterface {
	private StackInterface<String> stackInterface;

	/**
	 * The default constructor objectIni initialized to a new LinkedStack
	 */
	public InfixToPostfixConverter() {
		stackInterface = new LinkedStack<String>();
	}

	/**
	 * An object that is to be initialized to objectIni
	 * 
	 * @param object
	 */
	public InfixToPostfixConverter(StackInterface<String> object) {
		stackInterface = object;
	}

	/**
	 * Checks if object is a blank space.
	 * 
	 * @param infix
	 * @return null
	 */
	public String blankSpace(String infix) {
		return null;
	}

	/**
	 * Checks if the object is a letter operand.
	 * 
	 * @param character
	 * @return Character.isLetter(character)
	 */
	private boolean isOperand(char character) {
		return Character.isLetter(character);
	}

	/**
	 * Checks if the object is a valid operator and assigns a numeric value.
	 * 
	 * @param operator
	 * @return 0 if delimiter, 1 if '+' or '-', 2 if '*' or '/', 3 if '^', -1 if not
	 *         valid.
	 */
	private int getOperatorPrecedence(char operator) {
		switch (operator) {
		case '(':
		case ')':
			return 0;
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	/**
	 * Method accepts an infix expression and converts to a postfix expression.
	 */
	@Override
	public String convert(String expression) throws InvalidExpressionException {
		String postfix = new String();
		int characterCount = expression.length();
		boolean isConverted = true;
		int index = 0;
		Object operator;
		for (index = 0; index < characterCount; index++) {
			char nextCharacter = expression.charAt(index);
			if (isOperand(nextCharacter)) {
				postfix = postfix + nextCharacter;
			} else {
				switch (nextCharacter) {
				case '^':
					String s1 = Character.toString(nextCharacter);
					stackInterface.push(s1);
					break;
				case '+':
				case '-':
				case '*':
				case '/':
					while (!stackInterface.isEmpty() && !isConverted) {
						operator = stackInterface.peek();
						char popCharacter = ((String) operator).charAt(0);
						if (getOperatorPrecedence(nextCharacter) <= getOperatorPrecedence((char) popCharacter)) {
							postfix = postfix + popCharacter;
							stackInterface.pop();
						} else {
							isConverted = true;
						}
					}
					String s2 = Character.toString(nextCharacter);
					stackInterface.push(s2);
					isConverted = false;
					break;
				case '(':
					String s3 = Character.toString(nextCharacter);
					stackInterface.push(s3);
					break;
				case ')':
					operator = stackInterface.pop();
					char popCharacter = ((String) operator).charAt(0);
					while ((char) popCharacter != '(') {
						postfix = postfix + popCharacter;
						operator = stackInterface.pop();
						popCharacter = ((String) operator).charAt(0);
					}
					break;
				case ' ':
					blankSpace(expression);
					break;
				default:
					throw new InvalidExpressionException();
				}
			}
		}
		while (!stackInterface.isEmpty()) {
			operator = stackInterface.pop();
			if (operator.equals('(')) {
				throw new InvalidExpressionException();
			}
			postfix = postfix + operator;
		}
		return postfix.toString();
	}
}