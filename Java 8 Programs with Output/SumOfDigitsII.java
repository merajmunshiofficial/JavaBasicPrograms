public class SumOfDigitsII {
    public static void main(String[] args) {
        int number = 12345; // The number to find the sum of digits

        // Step 1 & 2: Converting the number to a stream of characters
        int sum = String.valueOf(number)
                        .chars() // Converts the string to an IntStream
                        .map(Character::getNumericValue) // Step 3: Converts each character to an integer
                        .sum(); // Step 4: Sums up the numeric values

        // Step 5: Displaying the sum
        System.out.println("The sum of digits: " + sum);
    }
}