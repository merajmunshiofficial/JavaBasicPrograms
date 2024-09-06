// File: SalaryStatistics.java
import java.util.*;

// File: Employee.java
 class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private String deptName;
    private String city;
    private int yearOfJoining;

    public Employee(int id, String name, int age, long salary, String gender, String deptName, String city, int yearOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.deptName = deptName;
        this.city = city;
        this.yearOfJoining = yearOfJoining;
    }

    public long getSalary() {
        return salary;
    }
}



public class SalaryStatistics {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai", 1995),
            new Employee(2, "Rahul", 25, 130000, "M", "Engineering", "Bangalore", 2000),
            new Employee(3, "Vishal", 34, 110000, "M", "Engineering", "Mumbai", 1998),
            new Employee(4, "Lakshmi", 28, 150000, "F", "HR", "Bangalore", 1992),
            new Employee(5, "Priya", 24, 90000, "F", "Marketing", "Delhi", 2005)
        );

        long totalSalary = employees.stream()
                                    .mapToLong(Employee::getSalary)
                                    .sum();

        double averageSalary = employees.stream()
                                        .mapToLong(Employee::getSalary)
                                        .average()
                                        .orElse(0);

        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Average Salary: " + averageSalary);
    }
}