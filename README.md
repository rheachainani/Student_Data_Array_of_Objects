# Student Management System

## Overview
The Student Management System is a Java program designed to manage student information. It comprises three main files:

### Student.java
- Represents the `Student` class with attributes such as PRN, name, date of birth, and marks.
- Provides methods for updating student information and printing student details.

  #### Methods
  - `public Student(int PRN, String name, String DOB, double marks)`
    - Constructor for the `Student` class.
  
  - `public int getPRN()`
    - Getter method for PRN.
  
  - `public String getName()`
    - Getter method for name.
  
  - `public String getDOB()`
    - Getter method for date of birth.
  
  - `public double getMarks()`
    - Getter method for marks.
  
  - `public void updatePRN(int PRN)`
    - Method to update PRN.
  
  - `public void updateName(String name)`
    - Method to update name.
  
  - `public void updateDOB(String DOB)`
    - Method to update date of birth.
  
  - `public void updateMarks(double marks)`
    - Method to update marks.
  
  - `public void printStudentDetails()`
    - Method to print student details.

### StudentManagement.java
- Manages a list of students using an `ArrayList<Student>`.
- Includes functions for adding, displaying, searching (by PRN, name, position), updating, and deleting students.

  #### Methods
  - `public StudentManagement()`
    - Constructor for the `StudentManagement` class.
  
  - `public void addStudent(Student student)`
    - Method to add a student to the list.
  
  - `public void displayStudents()`
    - Method to display all students in the list.
  
  - `public Student searchByPRN(int prn)`
    - Method to search for a student by PRN.
  
  - `public Student searchByName(String name)`
    - Method to search for a student by name.
  
  - `public Student searchByPosition(int pos)`
    - Method to search for a student by position (index).
  
  - `public void updateStudent(Student student)`
    - Method to update student information.
  
  - `public void deleteStudent(Student student)`
    - Method to delete a student from the list.

### Main.java
- Implements the main program that interacts with the user through a console-based menu.
- Allows users to perform operations like adding, displaying, searching, updating, and deleting student records.

  #### Methods
  - `public static void main(String[] args)`
    - Main method responsible for the program execution.
    - Displays a menu for user interaction.
