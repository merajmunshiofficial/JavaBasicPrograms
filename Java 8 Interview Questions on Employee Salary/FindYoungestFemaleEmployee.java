// File: FindYoungestFemaleEmployee.java
import java.util.*;
import java.util.stream.Collectors;

// File: Employee.java
 class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private String deptName;
    private String city;

    public Employee(int id, String name, int age, long salary, String gender, String deptName, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.deptName = deptName;
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", salary=" + salary +
               ", gender='" + gender + '\'' +
               ", deptName='" + deptName + '\'' +
               ", city='" + city + '\'' +
               '}';
    }
}



public class FindYoungestFemaleEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai"),
            new Employee(2, "Rahul", 25, 130000, "M", "Engineering", "Bangalore"),
            new Employee(3, "Vishal", 34, 110000, "M", "Engineering", "Mumbai"),
            new Employee(4, "Lakshmi", 28, 150000, "F", "HR", "Bangalore"),
            new Employee(5, "Priya", 24, 90000, "F", "Marketing", "Delhi")
        );

        Employee youngestFemale = employees.stream()
                                           .filter(e -> "F".equals(e.getGender()))
                                           .min(Comparator.comparingInt(Employee::getAge))
                                           .orElse(null);

        if (youngestFemale != null) {
            System.out.println("Youngest female employee: " + youngestFemale);
        } else {
            System.out.println("No female employees found.");
        }
    }
}
