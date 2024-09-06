import java.util.Scanner;

public class GCDOfTwoNumbersII {
    public static void main(String[] args) {
        // Creating a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt(); // Reading the first number
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt(); // Reading the second number

        // Calculating and displaying the GCD
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close(); // Closing the scanner
    }

    // Method to find the GCD of two numbers using Euclid's algorithm
    public static int findGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1; // Base case: if the second number becomes 0, return the first number
        } else {
            return findGCD(number2, number1 % number2); // Recursive call
        }
    }
}