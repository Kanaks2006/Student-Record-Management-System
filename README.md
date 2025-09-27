Introduction to Java – Lab Assignment 1
Student Details
Name: Kanak Sharma
Course: B.Sc. Computer Science
Semester: 3rd Semester
Roll No: 2401720010
Learning Outcomes

By completing and understanding this Java-based Student Record Management System, the following learning objectives are achieved:

Understanding Object-Oriented Programming (OOP) Concepts

Implemented inheritance through the Person and Student class hierarchy.

Demonstrated encapsulation using private and protected access modifiers.

Used constructors and instance methods to manipulate object state.

Working with User Input and Output

Used the Scanner class to take input from the user in a controlled manner.

Displayed output using standard console output commands.

Applying Control Structures and Validation

Implemented conditional logic to calculate grades based on marks.

Used loops and switch-case constructs to manage menu-based interaction.

Performed input validation to ensure data integrity (marks between 0 and 100).

Using Collections for Data Management

Used ArrayList to dynamically manage multiple student records.

Demonstrated dynamic addition of student objects and iteration for display.

Modular Programming and Code Organization

Segregated functionality using well-defined methods.

Maintained separation between data (fields) and behavior (methods).

Code Structure

The project follows a modular, object-oriented code structure. The key components are outlined below:

1. Class: Person

Role: Acts as a base class for common personal attributes.

Fields:

protected String name: Name of the person.

Used for: Demonstrating inheritance by allowing Student to extend Person.

2. Class: Student (inherits from Person)

Fields:

int rollNo: Unique identifier for the student.

String course: Name of the course.

double marks: Marks obtained.

char grade: Grade calculated based on marks.

Constructors:

Default constructor: Initializes all fields with default values.

Parameterized constructor: Accepts values for all fields and calls the calculateGrade() method automatically.

Methods:

void inputDetails(Scanner sc):

Takes input from the user for roll number, name, course, and marks.

Performs input validation for marks.

void calculateGrade():

Calculates the grade character based on the mark range.

Grade mapping:

A: 90–100

B: 75–89

C: 60–74

D: 40–59

F: Below 40

void displayDetails():

Prints all student details in a readable format.

3. Main Class: StudentManagement

Method: public static void main(String[] args)

Responsibilities:

Acts as the entry point for the program.

Manages the menu-driven user interface.

Handles user interaction through a continuous loop.

Allows adding new student records and displaying all stored students.

Uses an ArrayList<Student> to store and manage multiple student records in memory.

4. Java Standard Library Classes Used

java.util.Scanner: For capturing user input.

java.util.ArrayList: For dynamic storage of student objects


OUTPUT
![alt text](image.png)
![alt text](image-1.png)

View the File