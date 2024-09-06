import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateStreamsII {
    public static void main(String[] args) {
        // Step 1: Creating two streams
        Stream<String> stream1 = Stream.of("Java", "Python", "C++");
        Stream<String> stream2 = Stream.of("JavaScript", "TypeScript", "Kotlin");

        // Step 2: Concatenating the two streams
        Stream<String> concatenatedStream = Stream.concat(stream1, stream2);

        // Step 3: Collecting the concatenated stream into a list
        List<String> resultList = concatenatedStream.collect(Collectors.toList());

        // Step 4: Displaying the result
        System.out.println("Concatenated Stream Result: " + resultList);
    }
}