import java.util.stream.Collectors;

public class ReverseStringII {
    public static void main(String[] args) {
        String originalString = "hello"; // The original string to be reversed

        // Step 1 and 2: Converting to stream and reversing
        String reversedString = new StringBuilder(originalString).reverse().toString();

        // Step 3: The stream is implicitly collected back into a string by StringBuilder

        // Step 4: Displaying the reversed string
        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }
}