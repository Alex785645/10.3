import java.time.LocalDate;
public final class Manager extends Employee {
    private double bonus;

    public Manager(String firstName, String lastName, int birthdayYear,  LocalDate hireDate, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return salary + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", birthdayYear=" + birthdayYear +
                ", age=" + getAge() +
                ", hireDate=" + hireDate +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", totalSalary=" + getSalary() +
                ", jobSeniority=" + getJobSeniority() +
                '}';
    }
}
