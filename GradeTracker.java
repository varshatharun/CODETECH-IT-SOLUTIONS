package sgt;
import java.util.*;
class StudentGradeTracker{
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		//initialization of variables
		String stud_name,grade;
		int sub_number;
		
		// user input students name 
		System.out.println("enter the student name");
		stud_name=sc.nextLine();
		
		// number of subjects to be entered 
		System.out.println("enter the number of subjects: ");
		sub_number=sc.nextInt();
		
		
		if(sub_number<=0) {
			System.out.println("Invalid Input: Number of subjects must be greater than 0");
		}
		
		int totalMarks=0;
		int MaxMarksPerSubjects=100;
		
		// to get user marks input of different subjects
		for(int i=1; i<=sub_number; i++) {
			System.out.print("Students marks in subject " + i + " (out of 100): ");
			int marks=sc.nextInt();
			
			if(marks < 0 || marks > MaxMarksPerSubjects) {
				System.out.print("Invalid Marks");
				i--;
			}
			else {
				totalMarks+=marks;
			}
		}
		System.out.println();
		
		// to calculate the average marks
	   double avgMarks=(double) totalMarks/(sub_number* MaxMarksPerSubjects)*100;
	    
	   // Grade calculation 
	   
	    if ( avgMarks >=90 && avgMarks<=100  ) {
	    	grade="A";
	    }
	    else if( avgMarks >= 70 && avgMarks<90 ) {
	    	grade="B";
	    }
	    else if (avgMarks>=40 && avgMarks<70 ){
	    	grade="C";
	    }
	    else if(avgMarks <40 && avgMarks>=30) {
	    	grade="D";	
	    }
	    else {
	    	grade="E";
	    }
	    
	    // to calculate GPA
	    double gpa=avgMarks/10;

// output
	    System.out.println("Student Name: "+ stud_name +"\n"+ "Average Marks: " + avgMarks +"\n"+ "Grade: " + grade +"\n"+ "GPA: " + gpa);
	}
}
