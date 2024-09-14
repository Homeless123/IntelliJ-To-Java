package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Employee extends Person {
    public Employee(String name, char gender, LocalDate birthday, String jobTitle, double salary) {
        super(name, gender, birthday);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    private String jobTitle;

    private double salary;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+" is working.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" +getBirthday() +
                " jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
