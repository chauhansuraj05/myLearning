package calculater;

import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("=== Simple Calculator ===");
        System.out.println("Available operations: +, -, *, /, sqrt, power");
        System.out.println("Type 'exit' to quit\n");
        
        while (running) {
            try {
                System.out.print("Enter first number: ");
                String input = scanner.nextLine();
                
                if (input.equalsIgnoreCase("exit")) {
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                }
                
                double num1 = Double.parseDouble(input);
                
                System.out.print("Enter operation (+, -, *, /, sqrt, power): ");
                String operation = scanner.nextLine().trim();
                
                if (operation.equalsIgnoreCase("exit")) {
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                }
                
                double num2 = 0;
                double result = 0;
                
              
                if (!operation.equalsIgnoreCase("sqrt")) {
                    System.out.print("Enter second number: ");
                    input = scanner.nextLine();
                    
                    if (input.equalsIgnoreCase("exit")) {
                        running = false;
                        System.out.println("Goodbye!");
                        break;
                    }
                    
                    num2 = Double.parseDouble(input);
                }
                
                
                switch (operation.toLowerCase()) {
                    case "+":
                        result = num1 + num2;
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case "-":
                        result = num1 - num2;
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case "*":
                        result = num1 * num2;
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        } else {
                            System.out.println("Error: Cannot divide by zero!");
                        }
                        break;
                    case "sqrt":
                        if (num1 >= 0) {
                            result = Math.sqrt(num1);
                            System.out.println("Result: " + num1 + " = " + result);
                        } else {
                            System.out.println("Error: Cannot calculate square root of negative number!");
                        }
                        break;
                    case "power":
                        result = Math.pow(num1, num2);
                        System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                        break;
                    default:
                        System.out.println("Invalid operation! Please use +, -, *, /, sqrt, or power");
                }
                
                System.out.println(); 
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format! Please enter a valid number.\n");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + "\n");
            }
        }
        
        scanner.close();
    }
}