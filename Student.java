package Session3.assignment4;

import java.awt.DisplayMode;
import java.util.Scanner;

/*Create a class Student which has some private data like name, phone number, roll
number, class, use getter and setters to access this private data.

4
 Create a method result which accepts marks in three subjects along with the student roll
number and return the result of that student as pass or fails.
 Create another class StudentResultProcesing and extend this class from the student class
and it will print the result of a student.

Note: - The user has to give the input as student name, phone number, roll number, class along
with the marks in three subjects. And the output should contain all the information of the
student as his/her name, roll number, class, result.*/


public class Student {
	
	 private  String Name;
	 private long phoneNumber;
	 private int rollNumber;
	 private double g1, g2,g3;
	 private double overallG;
	  
	 Scanner sc = new Scanner(System.in);
	  
	 
	 public void StudentRecord() {
			System.out.print("Enter Student Name: ");
			Name = sc.next();
			System.out.print("Enter Student Number: ");
			phoneNumber =  sc.nextLong();
			System.out.print("Enter Student RollNumbre: ");
			rollNumber = sc.nextInt();
		}
	 
	 public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;

	}
	
	public void gradeCalulator(){
		
		System.out.print("Enter Grade for Physcis: ");
		g1 = sc.nextDouble();
		System.out.print("Enter Grade for Chemistry: ");
		g2 = sc.nextDouble();
		System.out.print("Enter Grade for Math: ");
		g3 = sc.nextDouble();
		
		overallG =  ((g1+g2+g3)/3);
		
		
		
	}
	
	public void Display() {
		System.out.println();
		System.out.println("Student " + Name + " roll number is " + rollNumber + ". You can contact him at " + phoneNumber);
		
		System.out.println("If grade is below 70% student fails the class");
		if(overallG >= 70) {
			System.out.println("Your over all grade is " + overallG + " Congrats you passed the class");
		
		}
		else {
			System.out.println("Your over all grade is " + overallG + " Sorry! You didnt pass. see you next year");
		}
		
	}

	 

}
