package day26_statics.StudentTask;

public class TestObject {
    public static void main(String[] args) {
        // Create initial Student objects
        Student student1 = new Student("Yusuf", 21, 'M', "A16");
        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        // Add them to an array
        Student[] students = {student1, student2, student3, student4, student5};

        // Create and manage a StudentsGroup
        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);
        group1.addStudent(students); // Add all students at once
        group1.addStudent("Volkan", 19, 'M', "B13"); // Add a single student

        System.out.println(group1); // Print the group details

        // Remove specific students by ID
        group1.removeStudent("E27");
        group1.removeStudent("A16");

        // Display group details after removal
        System.out.println(group1);

        // Loop through and print each student's name and age
        for (Student each : group1.students) {
            System.out.println(each.name + " : " + each.age);
        }

        // Create another StudentsGroup
        StudentsGroup group2 = new StudentsGroup("Java Leon", 2);
        group2.addStudent("Jhon", 31, 'M', "F32");
        group2.addStudent("Maria", 41, 'F', "T23");
        group2.addStudent("Alice", 25, 'F', "ID001");
        group2.addStudent("Bob", 30, 'M', "ID002");

        // Print each student's name and age in group2
        for (Student each : group2.students) {
            System.out.println(each.name + " : " + each.age);
        }

        // Create more student groups
        StudentsGroup group3 = new StudentsGroup("Java Rabbit", 3);
        group3.addStudent("Henry", 26, 'M', "ID008");
        group3.addStudent("Grace", 23, 'F', "ID007");

        for (Student each : group3.students) {
            System.out.println(each.name + " : " + each.id);
        }

        StudentsGroup group4 = new StudentsGroup("Java Python", 4);
        group4.addStudent("Ahmet", 30, 'M', "BJK23");
        System.out.println(group4);

        // Store all groups in an array
        StudentsGroup[] groupsArray = {group1, group2, group3, group4};
        System.out.println("Total number of groups: " + groupsArray.length);

        // Example: Loop through each group and print group details
        for (StudentsGroup group : groupsArray) {
            System.out.println(group.groupName + " : " + group.groupId);
            for (Student student : group.students) {
                System.out.println(student.name + " : " + student.id);
            }
            System.out.println();
        }
        // Print number of students in each group
        for (StudentsGroup group : groupsArray) {
            System.out.println("Group: " + group.groupName + " | Number of students: " + group.students.size());
        }
    }
}
