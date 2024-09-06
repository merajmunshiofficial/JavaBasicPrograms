import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Java 8 Program to Count Characters in a String
 * Author: https://www.javaguides.net/
 */
public class CharacterCountII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Count the characters using Java 8 streams
        Map<Character, Long> characterCounts = countCharacters(input);

        // Step 3: Display the result
        characterCounts.forEach((character, count) -> 
            System.out.println(character + ": " + count));
    }

    // Method to count characters in a string
    public static Map<Character, Long> countCharacters(String input) {
        return input.chars()  // Convert the string to an IntStream of character codes
                .mapToObj(c -> (char) c)  // Convert character codes to characters
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));  // Group by character and count
    }
}