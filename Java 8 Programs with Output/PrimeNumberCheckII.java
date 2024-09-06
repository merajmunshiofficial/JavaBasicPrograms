import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Java 8 Program to Check if a Number is Prime
 * Author: https://www.javaguides.net/
 */
public class PrimeNumberCheckII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Check if the number is prime using Java 8 streams
        boolean isPrime = isPrime(number);

        // Step 3: Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime using Java 8 streams
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))  // Stream of numbers from 2 to sqrt(number)
                .noneMatch(divisor -> number % divisor == 0);    // Check if any number divides the input
    }
}