/*Write a program that acts as a simple calculator. It should accept two numbers and an operator
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested ifelse to check if division by zero is attempted and display an error message. */

//Program Code:

public class SimpleCalculator {
    public static void main(String[] args) {
        double num1 = 10, num2 = 5; 
        char operator = '/'; 
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operator! Use +, -, *, or /.");
        }
    }
}


//Output: Result: 2.0