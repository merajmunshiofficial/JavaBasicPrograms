import java.time.LocalDate;
import java.time.Period;

public class CalculateAgeII {
    public static void main(String[] args) {
        // Step 1: Defining the birthday
        LocalDate birthday = LocalDate.of(1990, 5, 24);

        // Step 2: Obtaining the current date
        LocalDate today = LocalDate.now();

        // Step 3: Calculating the period between the birthday and today
        Period age = Period.between(birthday, today);

        // Step 4: Extracting the years from the period to get the age
        int years = age.getYears();

        // Step 5: Displaying the age
        System.out.println("Age is: " + years + " years.");
    }
}