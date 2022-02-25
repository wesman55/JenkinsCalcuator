import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Welcome to the Jenkins Calculator!");
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Enter a command:");
            String operation = "";
            int leftOperand = 0;
            int rightOperand = 0;
            String input = scanner.nextLine();
            String[] strings = input.split("\\s+");

            operation = strings[0];
            if (strings.length > 1) {
                leftOperand = Integer.parseInt(strings[1]);
            } if (strings.length == 3) {
                rightOperand = Integer.parseInt(strings[2]);
            }

            if (operation.equals("add")) {
                System.out.println(calculator.add(leftOperand, rightOperand));
            } else if (operation.equals("subtract")) {
                System.out.println(calculator.subtract(leftOperand, rightOperand));
            } else if (operation.equals("multiply")) {
                System.out.println(calculator.multiply(leftOperand, rightOperand));
            } else if (operation.equals("divide")) {
                System.out.println(calculator.divide(leftOperand, rightOperand));
            } else if (operation.equals("fibonacci")) {
                System.out.println(calculator.fibonacciNumberFinder(leftOperand));
            } else if (operation.equals("binary")) {
                System.out.println(calculator.intToBinaryNumber(leftOperand));
            } else if (operation.equals("end")) {
                System.out.println("Thanks for playing!");
                break;
            } else {
                System.out.println("Not a valid operation! \n Please enter add, subtract, multiply, divide, fibonacci," +
                        "binary or end");
            }
        }
    }
}
