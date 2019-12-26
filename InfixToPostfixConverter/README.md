# CS2400
# Infix To Postfix Converter
This project, in essence, deals with the nature of stack implementation written 
in the java programming language without the usage any of the collections found in the java library.

The abstract data type (ADT) stack organizes based on the order they were added with each new addition 
added to the top of the stack. The ADT stack has several methods - push, pop, peek, isEmpty, and clear. 
The method push adds a new entry to the top of the stack, the method pop removes and 
returns the stack’s top entry, the method peek retrieves the stack’s top entry, isEmpty determines if 
the stack is empty and clear removes all entries from the stack. 

The stack restricts access to its entries, so the client can only look at the top entry through peek or 
remove only the top entry through pop. 
As such, pop and peek have the return a generic type designated T, while push is of return type void. 
However, the parameter of push is of the same generic type as pop and peek. 
The interface StackInterface has the properties of the ADT stack and is used in 
class ArrayStack and class LinkedStack.

The key difference between the two classes is that ArrayStack implements stacks 
with an array and LinkedStack implements stacks with a linked data chain. 
Another notable difference is that the constructor method of ArrayStack class needs 
its array declared with a defined maximum limit while the constructor of the LinkedStack class 
does not need a defined maximum limit. 

As such, if the user is to implement an absurd amount of expressions, the user would 
find the LinkedStack class more convenient to use than the ArrayStack class. 
The class ArrayStack and the class LinkedStack are both used to test the efficiency of 
the class InfixToPostfixConverter.

The class InfixToPostfixConverter converts an infix algebraic expression to that of a postfix algebraic expression. 
For reference, an infix expression is a mathematical expression in which a binary operator is placed between its operands 
while a postfix expression is one where a binary operator is placed after its two operands. 
As such, this class is built around an algorithm that allows such an event to occur. 
This algorithm will append each operand to the end of the output expression.

For each term in the infix expression, if it is a ‘^’ operator, it will push it onto the stack. 
If it is a‘+’, ‘-’, ‘*’, or ‘/’ operator, operators in the stack will be popped and appended to the output 
expression until the stack is empty or the operator on the top stack has a lower precedence than the new operator 
and will push the new operator onto the stack. 

The opening delimiter ‘(‘ will be pushed onto the stack while the closing delimiter ‘)’ will 
cause operators in the stack will be popped and appended to the output expression until the 
opening delimiter has been founded. 

Both delimiters will be discarded and not be appended to the output expression. 
The algorithm will continue if white space is encountered and will throw an InvalidExpressionException 
if the term is not known. 

The InfixToPostfixConverter class implements interface ExpressionConverterInterface. 
This interface has a method that converts one type of expression format to another, 
throwing the class InvalidExpressionException class, which extends runtime.
The InfixToPostfix Converter class has two constructors. 
The default constructor has a private member of type StackInterface that is initialized 
to a new LinkedStack while the other initializes the private member of type StackInterface 
to an object in this constructor’s parameter.
