import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Java Program to Count Occurrences of Words in a String
 * Author: https://www.javaguides.net/
 */
public class WordFrequencyCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Split the string into words
        String[] words = input.toLowerCase().split("\\s+");

        // Step 3: Use a HashMap to track word frequencies
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Step 4: Display the word frequencies
        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}