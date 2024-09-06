import java.util.Arrays;
import java.util.List;

public class PrintEvenNumbersII {
    public static void main(String[] args) {
        // Step 1: Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Step 2 and 3: Using Stream API to filter and print even numbers
        System.out.println("Even numbers in the list:");
        numbers.stream() // Convert the list to a stream
               .filter(n -> n % 2 == 0) // Filter stream to include only even numbers
               .forEach(System.out::println); // Step 4: Print each even number
    }
}