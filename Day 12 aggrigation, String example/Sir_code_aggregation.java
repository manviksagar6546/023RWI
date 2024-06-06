// Class representing a student
class Student {
    // Private fields for student ID and name
    private int sid;
    private String sname;

    // Constructor to initialize student ID and name
    public Student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    // Getter for student ID
    public int getSid() {
        return sid;
    }

    // Setter for student ID
    public void setSid(int sid) {
        this.sid = sid;
    }

    // Getter for student name
    public String getSname() {
        return sname;
    }

    // Setter for student name
    public void setSname(String sname) {
        this.sname = sname;
    }

    // Override toString method to provide string representation of Student
    @Override
    public String toString() {
        return "Student ID: " + sid + ", Student Name: " + sname;
    }
}

// Class representing a department
class Department {
    // Private fields for department name and student
    private String dname;
    private Student student;

    // Constructor to initialize department name and student
    public Department(String dname, Student student) {
        this.dname = dname;
        this.student = student;
    }

    // Method to display department and student details
    public void show() {
        System.out.println("Department Name: " + dname);
        System.out.println("Student: " + student);
    }
}

// Main class to test the functionality
public class Sir_code_aggregation {
    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student(121, "Sneha");
        Student s2 = new Student(122, "Sakshi");

        // Create Department objects with the Student objects
        Department d = new Department("Computer Science", s1);
        Department d1 = new Department("Polytechnic", s2);

        // Display the department and student details
        d.show();
        d1.show();
    }
}
