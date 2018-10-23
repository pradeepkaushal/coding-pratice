package practice.algorithm;

import java.util.Stack;

public class InfixToPostfixExpression {
    public static void main(String[] args) {
        InfixToPostfixExpression infixToPostfixExpression = new InfixToPostfixExpression();
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        String out = infixToPostfixExpression.infixToPostifx(exp);
        System.out.println(out);
    }

    private String infixToPostifx(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder builder =new StringBuilder();
        for (int i = 0; i < infix.length(); i++) {
            char ch=infix.charAt(i);
            if(isOperand(ch)){
                builder.append(ch);
            }else if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                while(!stack.isEmpty()&&stack.peek()!='('){
                    builder.append(stack.pop());
                }
                stack.pop();
            }else if(!stack.isEmpty()&&precedende(ch) < stack.peek()){
                while (!stack.isEmpty()&&precedende(ch)>precedende(stack.peek())){
                    builder.append(stack.pop());
                }
                stack.push(ch);
            }


        }
        while (!stack.isEmpty()){
            builder.append(stack.pop());
        }

        return builder.toString();
    }

    private int precedende(char ch) {
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

    private boolean isOperand(char ch) {
        return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
    }
}
