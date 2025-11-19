package test3;

import java.util.Scanner;
import java.util.Stack;

public class EvaluvateExpression {

    public static  void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String expression = scan.nextLine();
        String parsedExpression = parse(expression);
        System.out.println(solve(parsedExpression));
    }

    public static String parse(String exp)
    {
        if(isGood(exp))
        {
            return exp;
        }

        StringBuilder expression = new StringBuilder();
        int i = 0;
        while(i < exp.length())
        {
            while( i < exp.length() && exp.charAt(i) != '(')
            {
                expression.append(exp.charAt(i));
                i++;
            }
            int openCount = 1;
            StringBuilder bracketExp = new StringBuilder();
            i++;
            while( i < exp.length() && openCount != 0)
            {
                if(exp.charAt(i) == '(')
                    openCount++;
                else if(exp.charAt(i) == ')')
                    openCount--;
                if(openCount != 0)
                    bracketExp.append(exp.charAt(i));
                i++;
            }
            String expandedExp = parse(bracketExp.toString());
            int solvedValue = solve(expandedExp);
            expression.append(solvedValue);

        }

        return expression.toString();
    }

    private static boolean isGood(String exp) {

        for(int i = 0 ; i < exp.length() ; i++)
        {
            if(exp.charAt(i) == '(') return false;
        }
        return true;
    }

    public static int solve(String exp)
    {
        int ptr = 0;
        Stack<Character> operatorStack = new Stack<>();
        Stack<Integer> operandStack = new Stack<>();

        while(ptr < exp.length())
        {
            StringBuilder operand1 = new StringBuilder();
            while(ptr < exp.length() && Character.isDigit(exp.charAt(ptr)))
            {
                operand1.append(exp.charAt(ptr));
                ptr++;
            }
            operandStack.add(Integer.parseInt(operand1.toString()));

            if(  operandStack.size() >= 2 && !operatorStack.isEmpty() && (operatorStack.peek() == '*' || operatorStack.peek() == '/'))
            {
                int op2 = operandStack.pop();
                int op1 = operandStack.pop();
                int ans = operatorStack.pop() == '*' ? op1 * op2 : op1 / op2;
                operandStack.push(ans);
            }

            if(ptr < exp.length())
                operatorStack.add(exp.charAt(ptr));
            ptr++;

        }
        while(!operatorStack.isEmpty())
        {
            char operation = operatorStack.pop();
            int op2 = operandStack.pop();
            int op1 = operandStack.pop();
            int ans = operation == '+' ? op1 + op2 : op1 - op2;
            operandStack.push(ans);
        }
        return operandStack.peek();

    }
}
