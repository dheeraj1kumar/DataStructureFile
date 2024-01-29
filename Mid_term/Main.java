package Mid_term;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class Test {

    // A utility function to return
    // precedence of a given operator
    // Higher returned value means
    // higher precedence
    static int Prec(char ch) {
        switch (ch) {
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

    // The main method that converts
    // given infix expression
    // to postfix expression.
    static String infixToPostfix(String exp) {
        // initializing empty String for result
        String result = new String("");

        // initializing empty stack
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;

            // If the scanned character is an '(',
            // push it to the stack.
            else if (c == '(')
                stack.push(c);

            // If the scanned character is an ')',
            // pop and output from the stack
            // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.isEmpty()
                        && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }

                stack.pop();
            } else // an operator is encountered
            {
                while (!stack.isEmpty()
                        && Prec(c) <= Prec(stack.peek())) {

                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }

        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.peek();
            stack.pop();
        }

        return result;
    }

    // Driver's code
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";

        // Function call
        System.out.println(infixToPostfix(exp));
    }
}

// import java.util.*;

// public class Main {

// public static int precedence(char ch) {
// if (ch == '+' || ch == '-')
// return 1;

// else if (ch == '*' || ch == '/')
// return 2; // * and / divide have higher precedence.

// return 0;
// }

// public static String convertToPostfix(String exp) {
// Stack<Character> operators = new Stack<>();
// Stack<String> postFix = new Stack<>();

// for (int i = 0; i < exp.length(); i++) {
// char ch = exp.charAt(i);

// {
// char op = operators.pop();

// String first = postFix.pop();
// String second = postFix.pop();

// String new_postFix = second + first + op;

// postFix.push(new_postFix);
// }
// }
// return postFix.pop(); // return resultant Postfix.
// }

// public static void main(String args[]) {
// // We pass Uppercase Infix
// String infixExpression = "((a+(b*c))-d)";
// System.out.println("The Infix Expression is: " + infixExpression);
// String result = convertToPostfix(infixExpression);
// System.out.println("The Postfix of the given Infix Expression is: " +
// result);

// System.out.println();
// }
// }