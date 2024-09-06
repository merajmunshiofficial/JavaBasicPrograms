import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RetrieveLastElementII {
    public static void main(String[] args) {
        // Step 1: Creating a list of strings
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");

        // Step 2 and 3: Using Stream API to retrieve the last element
        Optional<String> lastElement = listOfStrings.stream()
                                                    .reduce((first, second) -> second); // Using reduce to get the last element

        // Step 4: Displaying the last element
        lastElement.ifPresent(element -> System.out.println("The last element is: " + element));
    }
}