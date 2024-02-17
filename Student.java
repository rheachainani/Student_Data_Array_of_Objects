package assignment_3;

public class Student {
	// instance variables
	private int PRN;
	private String name, DOB;
	private double marks;
	
	// constructor 
	public Student(int PRN, String name, String DOB, double marks) {
		this.PRN = PRN;
		this.name = name;
		this.DOB = DOB;
		this.marks = marks;
	}
	
	// getter methods
	public int getPRN() {
		return PRN;
	}
	public String getName() {
		return name;
	}
	public String getDOB() {
		return DOB;
	}
	public double getMarks() {
		return marks;
	}
	
	// functions to update student information
	public void updatePRN(int PRN) {
		this.PRN = PRN;
	}
	public void updateName(String name) {
		this.name = name;
	}
	public void updateDOB(String DOB) {
		this.DOB = DOB; 
	}
	public void updateMarks(double marks) {
		this.marks = marks;
	}
	
	// function to print student details
	public void printStudentDetails() {
		System.out.println("PRN: " + PRN
		+ " Name: " + name
		+ " DOB: " + DOB
		+ " Marks: " + marks);
	}
}
