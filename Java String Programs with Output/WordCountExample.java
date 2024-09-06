public class WordCountUsingSplit {
    public static void main(String[] args) {
        String input = "Java is great and Java is fun.";
        String[] words = input.split("\\s+");
        System.out.println("Number of words using split(): " + words.length);
    }
}