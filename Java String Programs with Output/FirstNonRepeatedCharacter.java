import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Java Program to Find the First Non-Repeated Character in a String
 * Author: https://www.javaguides.net/
 */
public class FirstNonRepeatedCharacter {

    public static char findFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> characterCountMap = new LinkedHashMap<>();

        // Populate the map with character counts
        for (char ch : str.toCharArray()) {
            characterCountMap.put(ch, characterCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeated character
        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If no non-repeated character is found, return a null character
        return '\0';
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatedCharacter(input);

        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}