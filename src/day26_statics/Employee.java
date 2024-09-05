package day26_statics;

public class Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    // 1st constructor: initializes name only
    public Employee(String name) {
        this.name = name;
    }

    // 2nd constructor: initializes name and gender
    public Employee(String name, char gender) {
        this(name); // Calls the constructor that initializes name
        this.gender = gender;
    }

    // 3rd constructor: initializes name, gender, and jobTitle
    public Employee(String name, char gender, String jobTitle) {
        this(name, gender); // Calls the constructor that initializes name and gender
        this.jobTitle = jobTitle;
    }

    // 4th constructor: initializes name, gender, jobTitle, and salary
    public Employee(String name, char gender, String jobTitle, double salary) {
        this(name, gender, jobTitle); // Calls the constructor that initializes name, gender, and jobTitle
        this.salary = salary;
    }

    // 5th constructor: initializes name and jobTitle
    public Employee(String name, String jobTitle) {
        this(name); // Calls the constructor that initializes name
        this.jobTitle = jobTitle;
    }

    // 6th constructor: initializes name, jobTitle, and salary
    public Employee(String name, String jobTitle, double salary) {
        this(name, jobTitle); // Calls the constructor that initializes name and jobTitle
        this.salary = salary;
    }

    // toString method to display the Employee object information
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + (gender != '\u0000' ? gender : "N/A") + // '\u0000' is the default value for char
                ", jobTitle='" + (jobTitle != null ? jobTitle : "N/A") + '\'' +
                ", salary=" + (salary != 0 ? salary : "N/A") +
                '}';
    }
}

/*
Employee
	Instance variables:
			name, gender, jobTitle, salary

		1st cosntructor: initializes the name only

		2nd constructor: initializes name and gender

		3rd constructor: initializes name, gender and jobTitle

		4th constructor initializes name, gender, jobTitle, Salary

		5th constructor: initializes name, jobTitle

		6th constructor: initializes name jobTitle, salary

	Instnace methods:
		toString

 */
