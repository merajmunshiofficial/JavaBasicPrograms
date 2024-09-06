import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapExampleII {
    public static void main(String[] args) {
        // Step 1: Create a list of strings
        List<String> items = List.of("apple", "banana", "cherry");

        // Step 2 & 3: Convert the list to a stream and collect elements into a map
        Map<String, Integer> itemMap = items.stream()
                .collect(Collectors.toMap(item -> item, String::length));

        // Step 4: Display the resulting map
        System.out.println(itemMap);
    }
}