import java.time.LocalDate;

public class Employee extends Person {
    protected LocalDate hireDate;
    protected String companyName;
    protected double salary;

    public Employee(String firstName, String lastName, int birthdayYear, LocalDate hireDate , String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - hireDate.getYear();
    }

    public double getSalary() {
        return salary;
    }
}
