package assignment_3;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
	// create ArrayList to store students
	private ArrayList<Student> students;
	
	// constructor
	public StudentManagement() {
		students = new ArrayList<>();
	}
	
	// function to add student
	public void addStudent(Student student) {
		students.add(student);
	}
	
	// function to display all students
	public void displayStudents() {
		if (students.size() == 0)
			System.out.println("No students");
		System.out.println();
		for (Student student: students) {
			student.printStudentDetails();
		}
		System.out.println();
	}
	
	// function to search for a student by PRN
	public Student searchByPRN(int prn) {
		for (Student student: students)
			if (student.getPRN() == prn)
				return student;
		return null;
	}
	
	// function to search for a student by name
	public Student searchByName(String name) {
		for (Student student: students)
			if (student.getName().equals(name))
				return student;
		return null;
	}
	
	// function to search by position (index+1 in array)
	public Student searchByPosition(int pos) {
		int i = 1;
		if (pos > 0 && pos <= students.size()) {
			for (Student student: students) {
				if (i == pos) {
					System.out.println("Student found at position " + pos);
					student.printStudentDetails();
					return student;
				}
				i++;
			}
		}
		else
			System.out.println("Position out of range");
		return null;
	}
	
	// function to update student info
	public void updateStudent(Student student) {
		System.out.println("What would you like to update ? ");
		System.out.println("1. PRN 2. Name 3. DOB 4. Marks");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt(); 
		switch(choice) {
		case 1:
			System.out.println("Enter new PRN: ");
			int prn = scan.nextInt();
			System.out.println("Student PRN updated from " + student.getPRN() + " to " + prn);
			student.updatePRN(prn);
			break;
		case 2:
			System.out.println("Enter new Name: ");
			String name = scan.next();
			System.out.println("Student Name updated from " + student.getName() + " to " + name);
			student.updateName(name);
			break;
		case 3:
			System.out.println("Enter new DOB: ");
			String dob = scan.next();
			System.out.println("Student DOB updated from " + student.getDOB() + " to " + dob);
			student.updateDOB(dob);
			break;
		case 4:
			System.out.println("Enter new Marks: ");
			double marks = scan.nextDouble();
			System.out.println("Student Marks updated from " + student.getMarks() + " to " + marks);
			student.updateMarks(marks);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		scan.close();
	}
	
	// function to delete a student
	public void deleteStudent(Student student) {
		students.remove(student);
		System.out.println("Student deleted");
	}
}
