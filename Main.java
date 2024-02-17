// Name: Rhea Chainani
// PRN: 22070126086
// Batch: AIML-B1

package assignment_3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StudentManagement studentManagement = new StudentManagement();
		Scanner scan = new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("\n----- Menu -----");
			System.out.println("1. Add Student");
            		System.out.println("2. Display Students");
		        System.out.println("3. Search by PRN");
		        System.out.println("4. Search by Name");
		        System.out.println("5. Search by Position");
		        System.out.println("6. Update Student");
		        System.out.println("7. Delete Student");
		        System.out.println("0. Exit");
		        System.out.print("Enter your choice: ");
		        choice = scan.nextInt();
            
	            switch(choice) {
	            case 1:
	            	System.out.println("Enter student details: ");
	            	System.out.print("PRN: ");
	            	int prn = scan.nextInt();
	            	System.out.print("Name: ");
	            	String name = scan.next();
	            	System.out.print("DOB: ");
	            	String dob = scan.next();
	            	System.out.print("Marks: ");
	            	double marks = scan.nextDouble();
	            	Student student = new Student(prn,name,dob,marks);
	            	studentManagement.addStudent(student);
	            	break;
	            case 2:
	            	studentManagement.displayStudents();
	            	break;
	            case 3:
	            	System.out.println("Enter PRN to search: ");
	            	int searchPRN = scan.nextInt();
	            	Student studentFound = studentManagement.searchByPRN(searchPRN);
	            	if (studentFound != null) {
	            		System.out.println("Student found: ");
	            		studentFound.printStudentDetails();
	            	}
	            	else
	            		System.out.println("Student with PRN " + searchPRN + " not found");
	            	break;
	            case 4:
	            	System.out.println("Enter Name to search: ");
	            	String searchName = scan.next();
	            	studentFound = studentManagement.searchByName(searchName);
	            	if (studentFound != null) {
	            		System.out.println("Student found: ");
	            		studentFound.printStudentDetails();
	            	}
	            	else
	            		System.out.println("Student with Name " + searchName + " not found");
	            	break;
	            case 5:
	            	System.out.println("Enter position: ");
	            	int searchPos = scan.nextInt();
	            	studentManagement.searchByPosition(searchPos);
	            	break;
	            case 6:
	            	System.out.println("Enter PRN of student you would like to update details of : ");
	            	int updatePRN = scan.nextInt();
	            	studentFound = studentManagement.searchByPRN(updatePRN);
	            	if (studentFound != null) {
	            		studentManagement.updateStudent(studentFound);
	            	}
	            	else
	            		System.out.println("Student with PRN " + updatePRN + " not found");
	            	break;
	            case 7:
	            	System.out.println("Enter PRN of student you would like to delete : ");
	            	int deletePRN = scan.nextInt();
	            	studentFound = studentManagement.searchByPRN(deletePRN);
	            	if (studentFound != null) {
	            		studentManagement.deleteStudent(studentFound);
	            	}
	            	else
	            		System.out.println("Student with PRN " + deletePRN + " not found");
	            	break;
	            case 0:
	            	System.out.println("Exiting...");
	            	break;
	            default:
	            	System.out.println("Invalid choice");
	            	break;
	            } 
		} while (choice != 0);
		
		scan.close();
	}
}
