import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsCaseInsensitiveII {

    public static void main(String[] args) {
        // Example: Case-insensitive sorting
        List<String> fruits = Arrays.asList("Banana", "apple", "Mango", "grapes");

        // Sort the list alphabetically in a case-insensitive manner
        List<String> sortedFruits = fruits.stream()
                                          .sorted(String.CASE_INSENSITIVE_ORDER)
                                          .collect(Collectors.toList());

        // Display the sorted list
        System.out.println("Case-insensitive sorted fruits: " + sortedFruits);
    }
}