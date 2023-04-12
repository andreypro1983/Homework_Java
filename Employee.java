import java.util.Objects;

public class Employee {
    private int age;
    private String name;
    private String surName;
    private String fatherName;
    private double salary;
    private String job;

    public Employee(int age, String name, String surName, String fatherName, double salary, String job) {
        this.age = age;
        this.name = name;
        this.surName = surName;
        this.fatherName = fatherName;
        this.salary = salary;
        this.job = job;

    }

    public Employee(int age, String name, String surName, String fatherName, String job) {
        this(age, name, surName, fatherName, 50.0, job);

    }

    @Override
    public String toString() {
        return String.format("%s %s - %d лет, профессия - %s, ставка - %.1f", surName, name, age, job, salary);
    }

    public String getFullName() {
        return String.format("%s %s %s", surName, name, fatherName);
    }

    public boolean olderThan(Employee e) {
        if (age > e.age) {
            return true;
        } else {
            return false;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void upgrade(double salary) {
        if (salary != 0) {
            this.salary += salary;
        }

    }

    @Override
    public boolean equals(Object obj) {

        if ((obj instanceof Employee Employee)) {
            return (name.equals(Employee.name)) && (surName.equals(Employee.surName))
                    && (fatherName.equals(Employee.fatherName)) && (age == Employee.age);
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, fatherName, age, salary, job);
    }

}
