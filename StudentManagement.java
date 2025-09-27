import java.util.ArrayList;
import java.util.Scanner;

// Superclass: Person
class Person {
    protected String name;
}

// Subclass: Student (inherits from Person)
class Student extends Person {
    private int rollNo;
    private String course;
    private double marks;
    private char grade;

    // Default Constructor
    public Student() {
        this.rollNo = 0;
        this.name = "";
        this.course = "";
        this.marks = 0.0;
        this.grade = 'F';
    }

    // Parameterized Constructor
    public Student(int rollNo, String name, String course, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.marks = marks;
        calculateGrade();
    }

    // Method to input student details
    public void inputDetails(Scanner sc) {
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        while (true) {
            System.out.print("Enter Marks (0 - 100): ");
            marks = sc.nextDouble();
            if (marks >= 0 && marks <= 100) break;
            else System.out.println("Invalid marks. Please enter between 0 and 100.");
        }

        calculateGrade();
    }

    // Method to calculate grade based on marks
    public void calculateGrade() {
        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= 60)
            grade = 'C';
        else if (marks >= 40)
            grade = 'D';
        else
            grade = 'F';
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------------");
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        int choice;

        do {
            System.out.println("===== Student Record Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Student s = new Student();
                    s.inputDetails(sc);
                    studentList.add(s);
                    break;
                case 2:
                    if (studentList.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        for (Student student : studentList) {
                            student.displayDetails();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}